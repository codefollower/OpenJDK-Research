/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.nashorn.internal.runtime.linker;

import static jdk.nashorn.internal.lookup.Lookup.MH;
import static jdk.nashorn.internal.runtime.ECMAErrors.typeError;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import jdk.internal.dynalink.CallSiteDescriptor;
import jdk.internal.dynalink.beans.BeansLinker;
import jdk.internal.dynalink.linker.ConversionComparator.Comparison;
import jdk.internal.dynalink.linker.GuardedInvocation;
import jdk.internal.dynalink.linker.GuardingDynamicLinker;
import jdk.internal.dynalink.linker.LinkRequest;
import jdk.internal.dynalink.linker.LinkerServices;
import jdk.internal.dynalink.support.Guards;
import jdk.internal.dynalink.support.Lookup;
import jdk.nashorn.api.scripting.ScriptUtils;
import jdk.nashorn.internal.objects.NativeArray;
import jdk.nashorn.internal.runtime.ConsString;
import jdk.nashorn.internal.runtime.Context;
import jdk.nashorn.internal.runtime.ScriptObject;
import jdk.nashorn.internal.runtime.ScriptRuntime;
import jdk.nashorn.internal.runtime.options.Options;

/**
 * This linker delegates to a {@code BeansLinker} but passes it a special linker services object that has a modified
 * {@code asType} method that will ensure that we never pass internal engine objects that should not be externally
 * observable (currently ConsString and ScriptObject) to Java APIs, but rather that we flatten it into a String. We can't just add
 * this functionality as custom converters via {@code GuaardingTypeConverterFactory}, since they are not consulted when
 * the target method handle parameter signature is {@code Object}.
 */
public class NashornBeansLinker implements GuardingDynamicLinker {
    // System property to control whether to wrap ScriptObject->ScriptObjectMirror for
    // Object type arguments of Java method calls, field set and array set.
    private static final boolean MIRROR_ALWAYS = Options.getBooleanProperty("nashorn.mirror.always", true);

    private static final MethodHandle EXPORT_ARGUMENT;
    private static final MethodHandle EXPORT_NATIVE_ARRAY;
    private static final MethodHandle EXPORT_SCRIPT_OBJECT;
    private static final MethodHandle IMPORT_RESULT;
    private static final MethodHandle FILTER_CONSSTRING;

    static {
        final Lookup lookup  = new Lookup(MethodHandles.lookup());
        EXPORT_ARGUMENT      = lookup.findOwnStatic("exportArgument", Object.class, Object.class);
        EXPORT_NATIVE_ARRAY  = lookup.findOwnStatic("exportNativeArray", Object.class, NativeArray.class);
        EXPORT_SCRIPT_OBJECT = lookup.findOwnStatic("exportScriptObject", Object.class, ScriptObject.class);
        IMPORT_RESULT        = lookup.findOwnStatic("importResult", Object.class, Object.class);
        FILTER_CONSSTRING    = lookup.findOwnStatic("consStringFilter", Object.class, Object.class);
    }

    // cache of @FunctionalInterface method of implementor classes
    private static final ClassValue<Method> FUNCTIONAL_IFACE_METHOD = new ClassValue<Method>() {
        @Override
        protected Method computeValue(final Class<?> type) {
            return findFunctionalInterfaceMethod(type);
        }
    };

    private final BeansLinker beansLinker = new BeansLinker();

    @Override
    public GuardedInvocation getGuardedInvocation(final LinkRequest linkRequest, final LinkerServices linkerServices) throws Exception {
        final Object self = linkRequest.getReceiver();
        final CallSiteDescriptor desc = linkRequest.getCallSiteDescriptor();
        if (self instanceof ConsString) {
            // In order to treat ConsString like a java.lang.String we need a link request with a string receiver.
            final Object[] arguments = linkRequest.getArguments();
            arguments[0] = "";
            final LinkRequest forgedLinkRequest = linkRequest.replaceArguments(desc, arguments);
            final GuardedInvocation invocation = getGuardedInvocation(beansLinker, forgedLinkRequest, linkerServices);
            // If an invocation is found we add a filter that makes it work for both Strings and ConsStrings.
            return invocation == null ? null : invocation.filterArguments(0, FILTER_CONSSTRING);
        }

        if (self != null && "call".equals(desc.getNameToken(CallSiteDescriptor.OPERATOR))) {
            // Support dyn:call on any object that supports some @FunctionalInterface
            // annotated interface. This way Java method, constructor references or
            // implementations of java.util.function.* interfaces can be called as though
            // those are script functions.
            final Method m = getFunctionalInterfaceMethod(self.getClass());
            if (m != null) {
                final MethodType callType = desc.getMethodType();
                // 'callee' and 'thiz' passed from script + actual arguments
                if (callType.parameterCount() != m.getParameterCount() + 2) {
                    throw typeError("no.method.matches.args", ScriptRuntime.safeToString(self));
                }
                return new GuardedInvocation(
                        // drop 'thiz' passed from the script.
                        MH.dropArguments(desc.getLookup().unreflect(m), 1, callType.parameterType(1)),
                        Guards.getInstanceOfGuard(m.getDeclaringClass())).asTypeSafeReturn(
                                new NashornBeansLinkerServices(linkerServices), callType);
            }
        }
        return getGuardedInvocation(beansLinker, linkRequest, linkerServices);
    }

    /**
     * Delegates to the specified linker but injects its linker services wrapper so that it will apply all special
     * conversions that this class does.
     * @param delegateLinker the linker to which the actual work is delegated to.
     * @param linkRequest the delegated link request
     * @param linkerServices the original link services that will be augmented with special conversions
     * @return the guarded invocation from the delegate, possibly augmented with special conversions
     * @throws Exception if the delegate throws an exception
     */
    public static GuardedInvocation getGuardedInvocation(final GuardingDynamicLinker delegateLinker, final LinkRequest linkRequest, final LinkerServices linkerServices) throws Exception {
        return delegateLinker.getGuardedInvocation(linkRequest, new NashornBeansLinkerServices(linkerServices));
    }

    @SuppressWarnings("unused")
    private static Object exportArgument(final Object arg) {
        return exportArgument(arg, MIRROR_ALWAYS);
    }

    @SuppressWarnings("unused")
    private static Object exportNativeArray(final NativeArray arg) {
        return exportArgument(arg, MIRROR_ALWAYS);
    }

    @SuppressWarnings("unused")
    private static Object exportScriptObject(final ScriptObject arg) {
        return exportArgument(arg, MIRROR_ALWAYS);
    }

    @SuppressWarnings("unused")
    private static Object exportScriptArray(final NativeArray arg) {
        return exportArgument(arg, MIRROR_ALWAYS);
    }

    static Object exportArgument(final Object arg, final boolean mirrorAlways) {
        if (arg instanceof ConsString) {
            return arg.toString();
        } else if (mirrorAlways && arg instanceof ScriptObject) {
            return ScriptUtils.wrap((ScriptObject)arg);
        } else {
            return arg;
        }
    }

    @SuppressWarnings("unused")
    private static Object importResult(final Object arg) {
        return ScriptUtils.unwrap(arg);
    }

    @SuppressWarnings("unused")
    private static Object consStringFilter(final Object arg) {
        return arg instanceof ConsString ? arg.toString() : arg;
    }

    private static Method findFunctionalInterfaceMethod(final Class<?> clazz) {
        if (clazz == null) {
            return null;
        }

        for (final Class<?> iface : clazz.getInterfaces()) {
            // check accessiblity up-front
            if (! Context.isAccessibleClass(iface)) {
                continue;
            }

            // check for @FunctionalInterface
            if (iface.isAnnotationPresent(FunctionalInterface.class)) {
                // return the first abstract method
                for (final Method m : iface.getMethods()) {
                    if (Modifier.isAbstract(m.getModifiers())) {
                        return m;
                    }
                }
            }
        }

        // did not find here, try super class
        return findFunctionalInterfaceMethod(clazz.getSuperclass());
    }

    // Returns @FunctionalInterface annotated interface's single abstract
    // method. If not found, returns null.
    static Method getFunctionalInterfaceMethod(final Class<?> clazz) {
        return FUNCTIONAL_IFACE_METHOD.get(clazz);
    }

    private static class NashornBeansLinkerServices implements LinkerServices {
        private final LinkerServices linkerServices;

        NashornBeansLinkerServices(final LinkerServices linkerServices) {
            this.linkerServices = linkerServices;
        }

        @Override
        public MethodHandle asType(final MethodHandle handle, final MethodType fromType) {
            final MethodType handleType = handle.type();
            final int paramCount = handleType.parameterCount();
            assert fromType.parameterCount() == handleType.parameterCount();

            MethodType newFromType = fromType;
            MethodHandle[] filters = null;
            for(int i = 0; i < paramCount; ++i) {
                final MethodHandle filter = argConversionFilter(handleType.parameterType(i), fromType.parameterType(i));
                if (filter != null) {
                    if (filters == null) {
                        filters = new MethodHandle[paramCount];
                    }
                    // "erase" specific type with Object type or else we'll get filter mismatch
                    newFromType = newFromType.changeParameterType(i, Object.class);
                    filters[i] = filter;
                }
            }

            final MethodHandle typed = linkerServices.asType(handle, newFromType);
            MethodHandle result = filters != null ? MethodHandles.filterArguments(typed, 0, filters) : typed;
            // Filter Object typed return value for possible ScriptObjectMirror. We convert
            // ScriptObjectMirror as ScriptObject (if it is mirror from current global).
            if (MIRROR_ALWAYS && areBothObjects(handleType.returnType(), fromType.returnType())) {
                result = MethodHandles.filterReturnValue(result, IMPORT_RESULT);
            }

            return result;
        }

        private static MethodHandle argConversionFilter(final Class<?> handleType, final Class<?> fromType) {
            if (handleType == Object.class) {
                if (fromType == Object.class) {
                    return EXPORT_ARGUMENT;
                } else if (fromType == NativeArray.class) {
                    return EXPORT_NATIVE_ARRAY;
                } else if (fromType == ScriptObject.class) {
                    return EXPORT_SCRIPT_OBJECT;
                }
            }
            return null;
        }

        private static boolean areBothObjects(final Class<?> handleType, final Class<?> fromType) {
            return handleType == Object.class && fromType == Object.class;
        }

        @Override
        public MethodHandle asTypeLosslessReturn(final MethodHandle handle, final MethodType fromType) {
            return Implementation.asTypeLosslessReturn(this, handle, fromType);
        }

        @Override
        public MethodHandle getTypeConverter(final Class<?> sourceType, final Class<?> targetType) {
            return linkerServices.getTypeConverter(sourceType, targetType);
        }

        @Override
        public boolean canConvert(final Class<?> from, final Class<?> to) {
            return linkerServices.canConvert(from, to);
        }

        @Override
        public GuardedInvocation getGuardedInvocation(final LinkRequest linkRequest) throws Exception {
            return linkerServices.getGuardedInvocation(linkRequest);
        }

        @Override
        public Comparison compareConversion(final Class<?> sourceType, final Class<?> targetType1, final Class<?> targetType2) {
            if (sourceType == ConsString.class) {
                if (String.class == targetType1 || CharSequence.class == targetType1) {
                    return Comparison.TYPE_1_BETTER;
                }

                if (String.class == targetType2 || CharSequence.class == targetType2) {
                    return Comparison.TYPE_2_BETTER;
                }
            }
            return linkerServices.compareConversion(sourceType, targetType1, targetType2);
        }
    }
}
