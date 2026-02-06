package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgxa extends zzgww implements RandomAccess, zzgyu, zzham {
    public static final boolean[] Y0;
    public static final zzgxa Z0;
    public boolean[] Y;
    public int Z;

    static {
        boolean[] zArr = new boolean[0];
        Y0 = zArr;
        Z0 = new zzgxa(zArr, 0, false);
    }

    public zzgxa() {
        this(Y0, 0, true);
    }

    public static zzgxa e() {
        return Z0;
    }

    public static int i(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    /* renamed from: E */
    public final zzgyu S(int i) {
        boolean[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzgxa(copyOf, this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            boolean[] zArr = this.Y;
            int length = zArr.length;
            if (i2 < length) {
                System.arraycopy(zArr, i, zArr, i3, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[i(length)];
                System.arraycopy(this.Y, 0, zArr2, 0, i);
                System.arraycopy(this.Y, i, zArr2, i3, this.Z - i);
                this.Y = zArr2;
            }
            this.Y[i] = booleanValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = zzgzf.b;
        collection.getClass();
        if (!(collection instanceof zzgxa)) {
            return super.addAll(collection);
        }
        zzgxa zzgxaVar = (zzgxa) collection;
        int i = zzgxaVar.Z;
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
            System.arraycopy(zzgxaVar.Y, 0, this.Y, this.Z, zzgxaVar.Z);
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

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxa)) {
            return super.equals(obj);
        }
        zzgxa zzgxaVar = (zzgxa) obj;
        if (this.Z != zzgxaVar.Z) {
            return false;
        }
        boolean[] zArr = zzgxaVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z) {
        d();
        int i = this.Z;
        int length = this.Y.length;
        if (i == length) {
            boolean[] zArr = new boolean[i(length)];
            System.arraycopy(this.Y, 0, zArr, 0, this.Z);
            this.Y = zArr;
        }
        boolean[] zArr2 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        zArr2[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Boolean.valueOf(this.Y[i]);
    }

    public final boolean h(int i) {
        k(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            i = (i * 31) + zzgzf.a(this.Y[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Y[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final String j(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    public final void k(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(j(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        k(i);
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

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        k(i);
        boolean[] zArr = this.Y;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzgxa(boolean[] zArr, int i, boolean z) {
        super(z);
        this.Y = zArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
