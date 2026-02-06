package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhao extends zzgww implements RandomAccess {
    public static final Object[] Y0;
    public static final zzhao Z0;
    public Object[] Y;
    public int Z;

    static {
        Object[] objArr = new Object[0];
        Y0 = objArr;
        Z0 = new zzhao(objArr, 0, false);
    }

    public zzhao() {
        this(Y0, 0, true);
    }

    private final void N(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    public static zzhao e() {
        return Z0;
    }

    public static int h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final /* bridge */ /* synthetic */ zzgze S(int i) {
        Object[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzhao(copyOf, this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            Object[] objArr = this.Y;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[h(length)];
                System.arraycopy(this.Y, 0, objArr2, 0, i);
                System.arraycopy(this.Y, i, objArr2, i3, this.Z - i);
                this.Y = objArr2;
            }
            this.Y[i] = obj;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    public final void f(int i) {
        int length = this.Y.length;
        if (i <= length) {
            return;
        }
        if (length != 0) {
            while (length < i) {
                length = h(length);
            }
            this.Y = Arrays.copyOf(this.Y, length);
            return;
        }
        this.Y = new Object[Math.max(i, 10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        N(i);
        return this.Y[i];
    }

    public final String i(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        d();
        N(i);
        Object[] objArr = this.Y;
        Object obj = objArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        N(i);
        Object[] objArr = this.Y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzhao(Object[] objArr, int i, boolean z) {
        super(z);
        this.Y = objArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.Z;
        int length = this.Y.length;
        if (i == length) {
            this.Y = Arrays.copyOf(this.Y, h(length));
        }
        Object[] objArr = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
