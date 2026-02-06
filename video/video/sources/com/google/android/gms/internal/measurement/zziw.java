package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zziw extends zzhg<Float> implements zzjf<Float>, zzkv, RandomAccess {
    public static final zziw Y0 = new zziw(new float[0], 0, false);
    public float[] Y;
    public int Z;

    public zziw() {
        this(new float[10], 0, true);
    }

    private final String f(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void h(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            float[] fArr = this.Y;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.Y, i, fArr2, i + 1, this.Z - i);
                this.Y = fArr2;
            }
            this.Y[i] = floatValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        zziz.e(collection);
        if (!(collection instanceof zziw)) {
            return super.addAll(collection);
        }
        zziw zziwVar = (zziw) collection;
        int i = zziwVar.Z;
        if (i == 0) {
            return false;
        }
        int i2 = this.Z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.Y;
            if (i3 > fArr.length) {
                this.Y = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zziwVar.Y, 0, this.Y, this.Z, zziwVar.Z);
            this.Z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(float f) {
        d();
        int i = this.Z;
        float[] fArr = this.Y;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.Y = fArr2;
        }
        float[] fArr3 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziw)) {
            return super.equals(obj);
        }
        zziw zziwVar = (zziw) obj;
        if (this.Z != zziwVar.Z) {
            return false;
        }
        float[] fArr = zziwVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (Float.floatToIntBits(this.Y[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Float.valueOf(this.Y[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.Y[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.Y[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        d();
        h(i);
        float[] fArr = this.Y;
        float f = fArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            float[] fArr = this.Y;
            System.arraycopy(fArr, i2, fArr, i, this.Z - i2);
            this.Z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        h(i);
        float[] fArr = this.Y;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf<Float> u(int i) {
        if (i >= this.Z) {
            return new zziw(Arrays.copyOf(this.Y, i), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    public zziw(float[] fArr, int i, boolean z) {
        super(z);
        this.Y = fArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
