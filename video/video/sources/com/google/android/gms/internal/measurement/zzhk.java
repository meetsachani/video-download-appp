package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzhk extends zzhg<Boolean> implements zzjf<Boolean>, zzkv, RandomAccess {
    public static final zzhk Y0 = new zzhk(new boolean[0], 0, false);
    public boolean[] Y;
    public int Z;

    public zzhk() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            boolean[] zArr = this.Y;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.Y, i, zArr2, i + 1, this.Z - i);
                this.Y = zArr2;
            }
            this.Y[i] = booleanValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        zziz.e(collection);
        if (!(collection instanceof zzhk)) {
            return super.addAll(collection);
        }
        zzhk zzhkVar = (zzhk) collection;
        int i = zzhkVar.Z;
        if (i == 0) {
            return false;
        }
        int i2 = this.Z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.Y;
            if (i3 > zArr.length) {
                this.Y = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzhkVar.Y, 0, this.Y, this.Z, zzhkVar.Z);
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

    public final void e(boolean z) {
        d();
        int i = this.Z;
        boolean[] zArr = this.Y;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.Y = zArr2;
        }
        boolean[] zArr3 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhk)) {
            return super.equals(obj);
        }
        zzhk zzhkVar = (zzhk) obj;
        if (this.Z != zzhkVar.Z) {
            return false;
        }
        boolean[] zArr = zzhkVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Boolean.valueOf(this.Y[i]);
    }

    public final void h(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            i = (i * 31) + zziz.c(this.Y[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.Y[i] == booleanValue) {
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
        boolean[] zArr = this.Y;
        boolean z = zArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            boolean[] zArr = this.Y;
            System.arraycopy(zArr, i2, zArr, i, this.Z - i2);
            this.Z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        h(i);
        boolean[] zArr = this.Y;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf<Boolean> u(int i) {
        if (i >= this.Z) {
            return new zzhk(Arrays.copyOf(this.Y, i), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    public zzhk(boolean[] zArr, int i, boolean z) {
        super(z);
        this.Y = zArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
