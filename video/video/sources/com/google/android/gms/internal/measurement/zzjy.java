package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjy extends zzhg<Long> implements zzjg, zzkv, RandomAccess {
    public static final zzjy Y0 = new zzjy(new long[0], 0, false);
    public long[] Y;
    public int Z;

    public zzjy() {
        this(new long[10], 0, true);
    }

    public static zzjy f() {
        return Y0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    /* renamed from: C */
    public final zzjg u(int i) {
        if (i >= this.Z) {
            return new zzjy(Arrays.copyOf(this.Y, i), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            long[] jArr = this.Y;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.Y, i, jArr2, i + 1, this.Z - i);
                this.Y = jArr2;
            }
            this.Y[i] = longValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        zziz.e(collection);
        if (!(collection instanceof zzjy)) {
            return super.addAll(collection);
        }
        zzjy zzjyVar = (zzjy) collection;
        int i = zzjyVar.Z;
        if (i == 0) {
            return false;
        }
        int i2 = this.Z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.Y;
            if (i3 > jArr.length) {
                this.Y = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzjyVar.Y, 0, this.Y, this.Z, zzjyVar.Z);
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

    public final void e(long j) {
        d();
        int i = this.Z;
        long[] jArr = this.Y;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.Y = jArr2;
        }
        long[] jArr3 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjy)) {
            return super.equals(obj);
        }
        zzjy zzjyVar = (zzjy) obj;
        if (this.Z != zzjyVar.Z) {
            return false;
        }
        long[] jArr = zzjyVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(z(i));
    }

    public final String h(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            i = (i * 31) + zziz.b(this.Y[i2]);
        }
        return i;
    }

    public final void i(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.Y[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        d();
        i(i);
        long[] jArr = this.Y;
        long j = jArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            long[] jArr = this.Y;
            System.arraycopy(jArr, i2, jArr, i, this.Z - i2);
            this.Z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        i(i);
        long[] jArr = this.Y;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final long z(int i) {
        i(i);
        return this.Y[i];
    }

    public zzjy(long[] jArr, int i, boolean z) {
        super(z);
        this.Y = jArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
