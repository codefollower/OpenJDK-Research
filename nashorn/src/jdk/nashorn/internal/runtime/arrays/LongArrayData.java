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

package jdk.nashorn.internal.runtime.arrays;

import static jdk.nashorn.internal.codegen.CompilerConstants.specialCall;
import static jdk.nashorn.internal.lookup.Lookup.MH;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import jdk.nashorn.internal.runtime.JSType;
import jdk.nashorn.internal.runtime.ScriptRuntime;

/**
 * Implementation of {@link ArrayData} as soon as a long has been
 * written to the array
 */
final class LongArrayData extends ContinuousArrayData implements IntOrLongElements {
    /**
     * The wrapped array
     */
    private long[] array;

    /**
     * Constructor
     * @param array an int array
     * @param length a length, not necessarily array.length
     */
    LongArrayData(final long array[], final int length) {
        super(length);
        assert array.length >= length;
        this.array = array;
    }

    @Override
    public final Class<?> getElementType() {
        return long.class;
    }

    @Override
    public final Class<?> getBoxedElementType() {
        return Long.class;
    }

    @Override
    public final ContinuousArrayData widest(final ContinuousArrayData otherData) {
        return otherData instanceof IntElements ? this : otherData;
    }

    @Override
    public final int getElementWeight() {
        return 2;
    }

    @Override
    public LongArrayData copy() {
        return new LongArrayData(array.clone(), (int)length());
    }

    @Override
    public Object[] asObjectArray() {
        return toObjectArray(true);
    }

    private Object[] toObjectArray(final boolean trim) {
        assert length() <= array.length : "length exceeds internal array size";
        final int len = (int)length();
        final Object[] oarray = new Object[trim ? len : array.length];

        for (int index = 0; index < len; index++) {
            oarray[index] = Long.valueOf(array[index]);
        }

        return oarray;
    }

    @Override
    public Object asArrayOfType(final Class<?> componentType) {
        if (componentType == long.class) {
            final int len = (int)length();
            return array.length == len ? array.clone() : Arrays.copyOf(array, len);
        }
        return super.asArrayOfType(componentType);
    }

    private double[] toDoubleArray() {
        assert length() <= array.length : "length exceeds internal array size";
        final int len = (int)length();
        final double[] darray = new double[array.length];

        for (int index = 0; index < len; index++) {
            darray[index] = array[index];
        }

        return darray;
    }

    @Override
    public ContinuousArrayData convert(final Class<?> type) {
        if (type == Integer.class || type == Long.class) {
            return this;
        }
        final int len = (int)length();
        if (type == Double.class) {
            return new NumberArrayData(toDoubleArray(), len);
        }
        return new ObjectArrayData(toObjectArray(false), len);
    }

    @Override
    public void shiftLeft(final int by) {
        System.arraycopy(array, by, array, 0, array.length - by);
    }

    @Override
    public ArrayData shiftRight(final int by) {
        final ArrayData newData = ensure(by + length() - 1);
        if (newData != this) {
            newData.shiftRight(by);
            return newData;
        }
        System.arraycopy(array, 0, array, by, array.length - by);

        return this;
    }

    @Override
    public ArrayData ensure(final long safeIndex) {
        if (safeIndex >= SparseArrayData.MAX_DENSE_LENGTH) {
            return new SparseArrayData(this, safeIndex + 1);
        }
        final int alen = array.length;
        if (safeIndex >= alen) {
            final int newLength = ArrayData.nextSize((int)safeIndex);
            array = Arrays.copyOf(array, newLength);
        }
        setLength(safeIndex + 1);
        return this;
    }

    @Override
    public ArrayData shrink(final long newLength) {
        Arrays.fill(array, (int)newLength, array.length, 0L);
        return this;
    }

    @Override
    public ArrayData set(final int index, final Object value, final boolean strict) {
        if (value instanceof Long || value instanceof Integer) {
            return set(index, ((Number)value).longValue(), strict);
        } else if (value == ScriptRuntime.UNDEFINED) {
            return new UndefinedArrayFilter(this).set(index, value, strict);
        }

        final ArrayData newData = convert(value == null ? Object.class : value.getClass());
        return newData.set(index, value, strict);
    }

    @Override
    public ArrayData set(final int index, final int value, final boolean strict) {
        array[index] = value;
        setLength(Math.max(index + 1, length()));
        return this;
    }

    @Override
    public ArrayData set(final int index, final long value, final boolean strict) {
        array[index] = value;
        setLength(Math.max(index + 1, length()));
        return this;
    }

    @Override
    public ArrayData set(final int index, final double value, final boolean strict) {
        if (JSType.isRepresentableAsLong(value)) {
            array[index] = (long)value;
            setLength(Math.max(index + 1, length()));
            return this;
        }
        return convert(Double.class).set(index, value, strict);
    }

    private static final MethodHandle HAS_GET_ELEM = specialCall(MethodHandles.lookup(), LongArrayData.class, "getElem", long.class, int.class).methodHandle();
    private static final MethodHandle SET_ELEM     = specialCall(MethodHandles.lookup(), LongArrayData.class, "setElem", void.class, int.class, long.class).methodHandle();

    @SuppressWarnings("unused")
    private long getElem(final int index) {
        if (has(index)) {
            return array[index];
        }
        throw new ClassCastException();
    }

    @SuppressWarnings("unused")
    private void setElem(final int index, final long elem) {
        if (hasRoomFor(index)) {
            array[index] = elem;
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public MethodHandle getElementGetter(final Class<?> returnType, final int programPoint) {
        if (returnType == int.class) {
            return null;
        }
        return getContinuousElementGetter(HAS_GET_ELEM, returnType, programPoint);
    }

    @Override
    public MethodHandle getElementSetter(final Class<?> elementType) {
        return elementType == int.class || elementType == long.class ? getContinuousElementSetter(MH.asType(SET_ELEM, SET_ELEM.type().changeParameterType(2, elementType)), elementType) : null;
    }

    @Override
    public int getInt(final int index) {
        return (int)array[index];
    }

    @Override
    public long getLong(final int index) {
        return array[index];
    }

    @Override
    public long getLongOptimistic(final int index, final int programPoint) {
        return array[index];
    }

    @Override
    public double getDouble(final int index) {
        return array[index];
    }

    @Override
    public double getDoubleOptimistic(final int index, final int programPoint) {
        return array[index];
    }

    @Override
    public Object getObject(final int index) {
        return array[index];
    }

    @Override
    public boolean has(final int index) {
        return 0 <= index && index < length();
    }

    @Override
    public ArrayData delete(final int index) {
        return new DeletedRangeArrayFilter(this, index, index);
    }

    @Override
    public ArrayData delete(final long fromIndex, final long toIndex) {
        return new DeletedRangeArrayFilter(this, fromIndex, toIndex);
    }

    @Override
    public Object pop() {
        final int len = (int)length();
        if (len == 0) {
            return ScriptRuntime.UNDEFINED;
        }

        final int newLength = len - 1;
        final long elem = array[newLength];
        array[newLength] = 0;
        setLength(newLength);

        return elem;
    }

    @Override
    public ArrayData slice(final long from, final long to) {
        final long start     = from < 0 ? from + length() : from;
        final long newLength = to - start;
        return new LongArrayData(Arrays.copyOfRange(array, (int)from, (int)to), (int)newLength);
    }

    @Override
    public final ArrayData push(final boolean strict, final long item) {
        final long      len     = length();
        final ArrayData newData = ensure(len);
        if (newData == this) {
            array[(int)len] = item;
            return this;
        }
        return newData.set((int)len, item, strict);
    }

    @Override
    public ArrayData fastSplice(final int start, final int removed, final int added) throws UnsupportedOperationException {
        final long oldLength = length();
        final long newLength = oldLength - removed + added;
        if (newLength > SparseArrayData.MAX_DENSE_LENGTH && newLength > array.length) {
            throw new UnsupportedOperationException();
        }
        final ArrayData returnValue = removed == 0 ?
                EMPTY_ARRAY : new LongArrayData(Arrays.copyOfRange(array, start, start + removed), removed);

        if (newLength != oldLength) {
            final long[] newArray;

            if (newLength > array.length) {
                newArray = new long[ArrayData.nextSize((int)newLength)];
                System.arraycopy(array, 0, newArray, 0, start);
            } else {
                newArray = array;
            }

            System.arraycopy(array, start + removed, newArray, start + added, (int)(oldLength - start - removed));
            array = newArray;
            setLength(newLength);
        }

        return returnValue;
    }

    @Override
    public long fastPush(final int arg) {
        return fastPush((long)arg);
    }

    @Override
    public long fastPush(final long arg) {
        final int len = (int)length();
        if (len == array.length) {
            array = Arrays.copyOf(array, nextSize(len));
        }
        array[len] = arg;
        return increaseLength();
    }

    @Override
    public long fastPopLong() {
        if (length() == 0) {
            throw new ClassCastException(); //undefined result
        }
        final int newLength = (int)decreaseLength();
        final long elem = array[newLength];
        array[newLength] = 0;
        return elem;
    }

    @Override
    public double fastPopDouble() {
        return fastPopLong();
   }

    @Override
    public Object fastPopObject() {
        return fastPopLong();
    }

    @Override
    public ContinuousArrayData fastConcat(final ContinuousArrayData otherData) {
        final int   otherLength = (int)otherData.length();
        final int   thisLength  = (int)length();
        assert otherLength > 0 && thisLength > 0;

        final long[] otherArray  = ((LongArrayData)otherData).array;
        final int    newLength   = otherLength + thisLength;
        final long[] newArray   = new long[ArrayData.alignUp(newLength)];

        System.arraycopy(array, 0, newArray, 0, thisLength);
        System.arraycopy(otherArray, 0, newArray, thisLength, otherLength);

        return new LongArrayData(newArray, newLength);
    }

    @Override
    public String toString() {
        assert length() <= array.length : length() + " > " + array.length;

        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()).
                append(": [");
        final int len = (int)length();
        for (int i = 0; i < len; i++) {
            sb.append(array[i]).append('L'); //make sure L suffix is on elements, to discriminate this from IntArrayData.toString()
            if (i + 1 < len) {
                sb.append(", ");
            }
        }
        sb.append(']');

        return sb.toString();
    }
}
