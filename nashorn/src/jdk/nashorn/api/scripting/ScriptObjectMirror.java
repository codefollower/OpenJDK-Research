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

package jdk.nashorn.api.scripting;

import java.nio.ByteBuffer;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permissions;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.script.Bindings;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.runtime.ConsString;
import jdk.nashorn.internal.runtime.Context;
import jdk.nashorn.internal.runtime.JSType;
import jdk.nashorn.internal.runtime.ScriptFunction;
import jdk.nashorn.internal.runtime.ScriptObject;
import jdk.nashorn.internal.runtime.ScriptRuntime;
import jdk.nashorn.internal.runtime.arrays.ArrayData;
import jdk.nashorn.internal.runtime.linker.NashornCallSiteDescriptor;

/**
 * Mirror object that wraps a given Nashorn Script object.
 */
public final class ScriptObjectMirror extends AbstractJSObject implements Bindings {
    private static AccessControlContext getContextAccCtxt() {
        final Permissions perms = new Permissions();
        perms.add(new RuntimePermission(Context.NASHORN_GET_CONTEXT));
        return new AccessControlContext(new ProtectionDomain[] { new ProtectionDomain(null, perms) });
    }

    private static final AccessControlContext GET_CONTEXT_ACC_CTXT = getContextAccCtxt();

    private final ScriptObject sobj;
    private final Global  global;
    private final boolean strict;

    @Override
    public boolean equals(final Object other) {
        if (other instanceof ScriptObjectMirror) {
            return sobj.equals(((ScriptObjectMirror)other).sobj);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return sobj.hashCode();
    }

    @Override
    public String toString() {
        return inGlobal(new Callable<String>() {
            @Override
            public String call() {
                return ScriptRuntime.safeToString(sobj);
            }
        });
    }

    // JSObject methods

    @Override
    public Object call(final Object thiz, final Object... args) {
        final Global oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);

        try {
            if (globalChanged) {
                Context.setGlobal(global);
            }

            if (sobj instanceof ScriptFunction) {
                final Object[] modArgs = globalChanged? wrapArray(args, oldGlobal) : args;
                final Object self = globalChanged? wrap(thiz, oldGlobal) : thiz;
                return wrap(ScriptRuntime.apply((ScriptFunction)sobj, unwrap(self, global), unwrapArray(modArgs, global)), global);
            }

            throw new RuntimeException("not a function: " + toString());
        } catch (final NashornException ne) {
            throw ne.initEcmaError(global);
        } catch (final RuntimeException | Error e) {
            throw e;
        } catch (final Throwable t) {
            throw new RuntimeException(t);
        } finally {
            if (globalChanged) {
                Context.setGlobal(oldGlobal);
            }
        }
    }

    @Override
    public Object newObject(final Object... args) {
        final Global oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);

        try {
            if (globalChanged) {
                Context.setGlobal(global);
            }

            if (sobj instanceof ScriptFunction) {
                final Object[] modArgs = globalChanged? wrapArray(args, oldGlobal) : args;
                return wrap(ScriptRuntime.construct((ScriptFunction)sobj, unwrapArray(modArgs, global)), global);
            }

            throw new RuntimeException("not a constructor: " + toString());
        } catch (final NashornException ne) {
            throw ne.initEcmaError(global);
        } catch (final RuntimeException | Error e) {
            throw e;
        } catch (final Throwable t) {
            throw new RuntimeException(t);
        } finally {
            if (globalChanged) {
                Context.setGlobal(oldGlobal);
            }
        }
    }

    @Override
    public Object eval(final String s) {
        return inGlobal(new Callable<Object>() {
            @Override
            public Object call() {
                final Context context = AccessController.doPrivileged(
                        new PrivilegedAction<Context>() {
                            @Override
                            public Context run() {
                                return Context.getContext();
                            }
                        }, GET_CONTEXT_ACC_CTXT);
                return wrap(context.eval(global, s, sobj, null, false), global);
            }
        });
    }

    /**
     * Call member function
     * @param functionName function name
     * @param args         arguments
     * @return return value of function
     */
    public Object callMember(final String functionName, final Object... args) {
        functionName.getClass(); // null check
        final Global oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);

        try {
            if (globalChanged) {
                Context.setGlobal(global);
            }

            final Object val = sobj.get(functionName);
            if (val instanceof ScriptFunction) {
                final Object[] modArgs = globalChanged? wrapArray(args, oldGlobal) : args;
                return wrap(ScriptRuntime.apply((ScriptFunction)val, sobj, unwrapArray(modArgs, global)), global);
            } else if (val instanceof JSObject && ((JSObject)val).isFunction()) {
                return ((JSObject)val).call(sobj, args);
            }

            throw new NoSuchMethodException("No such function " + functionName);
        } catch (final NashornException ne) {
            throw ne.initEcmaError(global);
        } catch (final RuntimeException | Error e) {
            throw e;
        } catch (final Throwable t) {
            throw new RuntimeException(t);
        } finally {
            if (globalChanged) {
                Context.setGlobal(oldGlobal);
            }
        }
    }

    @Override
    public Object getMember(final String name) {
        name.getClass();
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return wrap(sobj.get(name), global);
            }
        });
    }

    @Override
    public Object getSlot(final int index) {
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return wrap(sobj.get(index), global);
            }
        });
    }

    @Override
    public boolean hasMember(final String name) {
        name.getClass();
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.has(name);
            }
        });
    }

    @Override
    public boolean hasSlot(final int slot) {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.has(slot);
            }
        });
    }

    @Override
    public void removeMember(final String name) {
        name.getClass();
        remove(name);
    }

    @Override
    public void setMember(final String name, final Object value) {
        name.getClass();
        put(name, value);
    }

    @Override
    public void setSlot(final int index, final Object value) {
        inGlobal(new Callable<Void>() {
            @Override public Void call() {
                sobj.set(index, unwrap(value, global), getCallSiteFlags());
                return null;
            }
        });
    }

    /**
     * Nashorn extension: setIndexedPropertiesToExternalArrayData.
     * set indexed properties be exposed from a given nio ByteBuffer.
     *
     * @param buf external buffer - should be a nio ByteBuffer
     */
    public void setIndexedPropertiesToExternalArrayData(final ByteBuffer buf) {
        inGlobal(new Callable<Void>() {
            @Override public Void call() {
                sobj.setArray(ArrayData.allocate(buf));
                return null;
            }
        });
    }


    @Override
    public boolean isInstance(final Object obj) {
        if (! (obj instanceof ScriptObjectMirror)) {
            return false;
        }

        final ScriptObjectMirror instance = (ScriptObjectMirror)obj;
        // if not belongs to my global scope, return false
        if (global != instance.global) {
            return false;
        }

        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.isInstance(instance.sobj);
            }
        });
    }

    @Override
    public String getClassName() {
        return sobj.getClassName();
    }

    @Override
    public boolean isFunction() {
        return sobj instanceof ScriptFunction;
    }

    @Override
    public boolean isStrictFunction() {
        return isFunction() && ((ScriptFunction)sobj).isStrict();
    }

    @Override
    public boolean isArray() {
        return sobj.isArray();
    }

    // javax.script.Bindings methods

    @Override
    public void clear() {
        inGlobal(new Callable<Object>() {
            @Override public Object call() {
                sobj.clear(strict);
                return null;
            }
        });
    }

    @Override
    public boolean containsKey(final Object key) {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.containsKey(unwrap(key, global));
            }
        });
    }

    @Override
    public boolean containsValue(final Object value) {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.containsValue(unwrap(value, global));
            }
        });
    }

    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        return inGlobal(new Callable<Set<Map.Entry<String, Object>>>() {
            @Override public Set<Map.Entry<String, Object>> call() {
                final Iterator<String>               iter    = sobj.propertyIterator();
                final Set<Map.Entry<String, Object>> entries = new LinkedHashSet<>();

                while (iter.hasNext()) {
                    final String key   = iter.next();
                    final Object value = translateUndefined(wrap(sobj.get(key), global));
                    entries.add(new AbstractMap.SimpleImmutableEntry<>(key, value));
                }

                return Collections.unmodifiableSet(entries);
            }
        });
    }

    @Override
    public Object get(final Object key) {
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return translateUndefined(wrap(sobj.get(key), global));
            }
        });
    }

    @Override
    public boolean isEmpty() {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.isEmpty();
            }
        });
    }

    @Override
    public Set<String> keySet() {
        return inGlobal(new Callable<Set<String>>() {
            @Override public Set<String> call() {
                final Iterator<String> iter   = sobj.propertyIterator();
                final Set<String>      keySet = new LinkedHashSet<>();

                while (iter.hasNext()) {
                    keySet.add(iter.next());
                }

                return Collections.unmodifiableSet(keySet);
            }
        });
    }

    @Override
    public Object put(final String key, final Object value) {
        final ScriptObject oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                final Object modValue = globalChanged? wrap(value, oldGlobal) : value;
                return translateUndefined(wrap(sobj.put(key, unwrap(modValue, global), strict), global));
            }
        });
    }

    @Override
    public void putAll(final Map<? extends String, ? extends Object> map) {
        final ScriptObject oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);
        inGlobal(new Callable<Object>() {
            @Override public Object call() {
                for (final Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
                    final Object value = entry.getValue();
                    final Object modValue = globalChanged? wrap(value, oldGlobal) : value;
                    sobj.set(entry.getKey(), unwrap(modValue, global), getCallSiteFlags());
                }
                return null;
            }
        });
    }

    @Override
    public Object remove(final Object key) {
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return wrap(sobj.remove(unwrap(key, global), strict), global);
            }
        });
    }

    /**
     * Delete a property from this object.
     *
     * @param key the property to be deleted
     *
     * @return if the delete was successful or not
     */
    public boolean delete(final Object key) {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.delete(unwrap(key, global), strict);
            }
        });
    }

    @Override
    public int size() {
        return inGlobal(new Callable<Integer>() {
            @Override public Integer call() {
                return sobj.size();
            }
        });
    }

    @Override
    public Collection<Object> values() {
        return inGlobal(new Callable<Collection<Object>>() {
            @Override public Collection<Object> call() {
                final List<Object>     values = new ArrayList<>(size());
                final Iterator<Object> iter   = sobj.valueIterator();

                while (iter.hasNext()) {
                    values.add(translateUndefined(wrap(iter.next(), global)));
                }

                return Collections.unmodifiableList(values);
            }
        });
    }

    // Support for ECMAScript Object API on mirrors

    /**
     * Return the __proto__ of this object.
     * @return __proto__ object.
     */
    public Object getProto() {
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return wrap(sobj.getProto(), global);
            }
        });
    }

    /**
     * Set the __proto__ of this object.
     * @param proto new proto for this object
     */
    public void setProto(final Object proto) {
        inGlobal(new Callable<Void>() {
            @Override public Void call() {
                sobj.setPrototypeOf(unwrap(proto, global));
                return null;
            }
        });
    }

    /**
     * ECMA 8.12.1 [[GetOwnProperty]] (P)
     *
     * @param key property key
     *
     * @return Returns the Property Descriptor of the named own property of this
     * object, or undefined if absent.
     */
    public Object getOwnPropertyDescriptor(final String key) {
        return inGlobal(new Callable<Object>() {
            @Override public Object call() {
                return wrap(sobj.getOwnPropertyDescriptor(key), global);
            }
        });
    }

    /**
     * return an array of own property keys associated with the object.
     *
     * @param all True if to include non-enumerable keys.
     * @return Array of keys.
     */
    public String[] getOwnKeys(final boolean all) {
        return inGlobal(new Callable<String[]>() {
            @Override public String[] call() {
                return sobj.getOwnKeys(all);
            }
        });
    }

    /**
     * Flag this script object as non extensible
     *
     * @return the object after being made non extensible
     */
    public ScriptObjectMirror preventExtensions() {
        return inGlobal(new Callable<ScriptObjectMirror>() {
            @Override public ScriptObjectMirror call() {
                sobj.preventExtensions();
                return ScriptObjectMirror.this;
            }
        });
    }

    /**
     * Check if this script object is extensible
     * @return true if extensible
     */
    public boolean isExtensible() {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.isExtensible();
            }
        });
    }

    /**
     * ECMAScript 15.2.3.8 - seal implementation
     * @return the sealed script object
     */
    public ScriptObjectMirror seal() {
        return inGlobal(new Callable<ScriptObjectMirror>() {
            @Override public ScriptObjectMirror call() {
                sobj.seal();
                return ScriptObjectMirror.this;
            }
        });
    }

    /**
     * Check whether this script object is sealed
     * @return true if sealed
     */
    public boolean isSealed() {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.isSealed();
            }
        });
    }

    /**
     * ECMA 15.2.39 - freeze implementation. Freeze this script object
     * @return the frozen script object
     */
    public ScriptObjectMirror freeze() {
        return inGlobal(new Callable<ScriptObjectMirror>() {
            @Override public ScriptObjectMirror call() {
                sobj.freeze();
                return ScriptObjectMirror.this;
            }
        });
    }

    /**
     * Check whether this script object is frozen
     * @return true if frozen
     */
    public boolean isFrozen() {
        return inGlobal(new Callable<Boolean>() {
            @Override public Boolean call() {
                return sobj.isFrozen();
            }
        });
    }

    /**
     * Utility to check if given object is ECMAScript undefined value
     *
     * @param obj object to check
     * @return true if 'obj' is ECMAScript undefined value
     */
    public static boolean isUndefined(final Object obj) {
        return obj == ScriptRuntime.UNDEFINED;
    }

    /**
     * Utilitity to convert this script object to the given type.
     *
     * @param <T> destination type to convert to
     * @param type destination type to convert to
     * @return converted object
     */
    public <T> T to(final Class<T> type) {
        return inGlobal(new Callable<T>() {
            @Override
            public T call() {
                return type.cast(ScriptUtils.convert(sobj, type));
            }
        });
    }

    /**
     * Make a script object mirror on given object if needed. Also converts ConsString instances to Strings.
     *
     * @param obj object to be wrapped/converted
     * @param homeGlobal global to which this object belongs. Not used for ConsStrings.
     * @return wrapped/converted object
     */
    public static Object wrap(final Object obj, final Object homeGlobal) {
        if(obj instanceof ScriptObject) {
            return homeGlobal instanceof Global ? new ScriptObjectMirror((ScriptObject)obj, (Global)homeGlobal) : obj;
        }
        if(obj instanceof ConsString) {
            return obj.toString();
        }
        return obj;
    }

    /**
     * Unwrap a script object mirror if needed.
     *
     * @param obj object to be unwrapped
     * @param homeGlobal global to which this object belongs
     * @return unwrapped object
     */
    public static Object unwrap(final Object obj, final Object homeGlobal) {
        if (obj instanceof ScriptObjectMirror) {
            final ScriptObjectMirror mirror = (ScriptObjectMirror)obj;
            return (mirror.global == homeGlobal)? mirror.sobj : obj;
        }

        return obj;
    }

    /**
     * Wrap an array of object to script object mirrors if needed.
     *
     * @param args array to be unwrapped
     * @param homeGlobal global to which this object belongs
     * @return wrapped array
     */
    public static Object[] wrapArray(final Object[] args, final Object homeGlobal) {
        if (args == null || args.length == 0) {
            return args;
        }

        final Object[] newArgs = new Object[args.length];
        int index = 0;
        for (final Object obj : args) {
            newArgs[index] = wrap(obj, homeGlobal);
            index++;
        }
        return newArgs;
    }

    /**
     * Unwrap an array of script object mirrors if needed.
     *
     * @param args array to be unwrapped
     * @param homeGlobal global to which this object belongs
     * @return unwrapped array
     */
    public static Object[] unwrapArray(final Object[] args, final Object homeGlobal) {
        if (args == null || args.length == 0) {
            return args;
        }

        final Object[] newArgs = new Object[args.length];
        int index = 0;
        for (final Object obj : args) {
            newArgs[index] = unwrap(obj, homeGlobal);
            index++;
        }
        return newArgs;
    }

    /**
     * Are the given objects mirrors to same underlying object?
     *
     * @param obj1 first object
     * @param obj2 second object
     * @return true if obj1 and obj2 are identical script objects or mirrors of it.
     */
    public static boolean identical(final Object obj1, final Object obj2) {
        final Object o1 = (obj1 instanceof ScriptObjectMirror)?
            ((ScriptObjectMirror)obj1).sobj : obj1;

        final Object o2 = (obj2 instanceof ScriptObjectMirror)?
            ((ScriptObjectMirror)obj2).sobj : obj2;

        return o1 == o2;
    }

    // package-privates below this.

    ScriptObjectMirror(final ScriptObject sobj, final Global global) {
        assert sobj != null : "ScriptObjectMirror on null!";
        assert global != null : "home Global is null";

        this.sobj = sobj;
        this.global = global;
        this.strict = global.isStrictContext();
    }

    // accessors for script engine
    ScriptObject getScriptObject() {
        return sobj;
    }

    Global getHomeGlobal() {
        return global;
    }

    static Object translateUndefined(final Object obj) {
        return (obj == ScriptRuntime.UNDEFINED)? null : obj;
    }

    private int getCallSiteFlags() {
        return strict ? NashornCallSiteDescriptor.CALLSITE_STRICT : 0;
    }

    // internals only below this.
    private <V> V inGlobal(final Callable<V> callable) {
        final Global oldGlobal = Context.getGlobal();
        final boolean globalChanged = (oldGlobal != global);
        if (globalChanged) {
            Context.setGlobal(global);
        }
        try {
            return callable.call();
        } catch (final NashornException ne) {
            throw ne.initEcmaError(global);
        } catch (final RuntimeException e) {
            throw e;
        } catch (final Exception e) {
            throw new AssertionError("Cannot happen", e);
        } finally {
            if (globalChanged) {
                Context.setGlobal(oldGlobal);
            }
        }
    }

    @Override
    public double toNumber() {
        return inGlobal(new Callable<Double>() {
            @Override public Double call() {
                return JSType.toNumber(sobj);
            }
        });
    }
}
