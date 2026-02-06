package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgxz extends zzgww implements RandomAccess, zzgyv, zzham {
    public static final double[] Y0;
    public static final zzgxz Z0;
    public double[] Y;
    public int Z;

    static {
        double[] dArr = new double[0];
        Y0 = dArr;
        Z0 = new zzgxz(dArr, 0, false);
    }

    public zzgxz() {
        this(Y0, 0, true);
    }

    public static zzgxz f() {
        return Z0;
    }

    public static int i(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    /* renamed from: A */
    public final zzgyv S(int i) {
        double[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzgxz(copyOf, this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    public final void N(int i) {
        int length = this.Y.length;
        if (i <= length) {
            return;
        }
        if (length != 0) {
            while (length < i) {
                length = i(length);
            }
            this.Y = Arrays.copyOf(this.Y, length);
            return;
        }
        this.Y = new double[Math.max(i, 10)];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            double[] dArr = this.Y;
            int length = dArr.length;
            if (i2 < length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                double[] dArr2 = new double[i(length)];
                System.arraycopy(this.Y, 0, dArr2, 0, i);
                System.arraycopy(this.Y, i, dArr2, i3, this.Z - i);
                this.Y = dArr2;
            }
            this.Y[i] = doubleValue;
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
        if (!(collection instanceof zzgxz)) {
            return super.addAll(collection);
        }
        zzgxz zzgxzVar = (zzgxz) collection;
        int i = zzgxzVar.Z;
        if (i == 0) {
            return false;
        }
        int i2 = this.Z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.Y;
            if (i3 > dArr.length) {
                this.Y = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzgxzVar.Y, 0, this.Y, this.Z, zzgxzVar.Z);
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

    public final double e(int i) {
        k(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxz)) {
            return super.equals(obj);
        }
        zzgxz zzgxzVar = (zzgxz) obj;
        if (this.Z != zzgxzVar.Z) {
            return false;
        }
        double[] dArr = zzgxzVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (Double.doubleToLongBits(this.Y[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Double.valueOf(this.Y[i]);
    }

    public final void h(double d) {
        d();
        int i = this.Z;
        int length = this.Y.length;
        if (i == length) {
            double[] dArr = new double[i(length)];
            System.arraycopy(this.Y, 0, dArr, 0, this.Z);
            this.Y = dArr;
        }
        double[] dArr2 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        dArr2[i2] = d;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.Y[i2]);
            byte[] bArr = zzgzf.b;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Y[i2] == doubleValue) {
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
        double[] dArr = this.Y;
        double d = dArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            double[] dArr = this.Y;
            System.arraycopy(dArr, i2, dArr, i, this.Z - i2);
            this.Z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        k(i);
        double[] dArr = this.Y;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzgxz(double[] dArr, int i, boolean z) {
        super(z);
        this.Y = dArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
