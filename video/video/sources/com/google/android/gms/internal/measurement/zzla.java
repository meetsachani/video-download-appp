package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzla<E> extends zzhg<E> implements RandomAccess {
    public static final zzla<Object> Y0 = new zzla<>(new Object[0], 0, false);
    public E[] Y;
    public int Z;

    public zzla() {
        this(new Object[10], 0, true);
    }

    private final String e(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void f(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    public static <E> zzla<E> h() {
        return (zzla<E>) Y0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            E[] eArr = this.Y;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.Y, i, eArr2, i + 1, this.Z - i);
                this.Y = eArr2;
            }
            this.Y[i] = e;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        f(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        d();
        f(i);
        E[] eArr = this.Y;
        E e = eArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        d();
        f(i);
        E[] eArr = this.Y;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf u(int i) {
        if (i >= this.Z) {
            return new zzla(Arrays.copyOf(this.Y, i), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    public zzla(E[] eArr, int i, boolean z) {
        super(z);
        this.Y = eArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        d();
        int i = this.Z;
        E[] eArr = this.Y;
        if (i == eArr.length) {
            this.Y = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
