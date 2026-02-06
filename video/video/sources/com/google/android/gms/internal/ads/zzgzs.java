package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgzs extends zzgww implements RandomAccess, zzgzd, zzham {
    public static final long[] Y0;
    public static final zzgzs Z0;
    public long[] Y;
    public int Z;

    static {
        long[] jArr = new long[0];
        Y0 = jArr;
        Z0 = new zzgzs(jArr, 0, false);
    }

    public zzgzs() {
        this(Y0, 0, true);
    }

    public static zzgzs e() {
        return Z0;
    }

    private static int f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String h(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void i(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    /* renamed from: E */
    public final zzgzd S(int i) {
        long[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzgzs(copyOf, this.Z, true);
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
                length = f(length);
            }
            this.Y = Arrays.copyOf(this.Y, length);
            return;
        }
        this.Y = new long[Math.max(i, 10)];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            long[] jArr = this.Y;
            int length = jArr.length;
            if (i2 < length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[f(length)];
                System.arraycopy(this.Y, 0, jArr2, 0, i);
                System.arraycopy(this.Y, i, jArr2, i3, this.Z - i);
                this.Y = jArr2;
            }
            this.Y[i] = longValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = zzgzf.b;
        collection.getClass();
        if (!(collection instanceof zzgzs)) {
            return super.addAll(collection);
        }
        zzgzs zzgzsVar = (zzgzs) collection;
        int i = zzgzsVar.Z;
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
            System.arraycopy(zzgzsVar.Y, 0, this.Y, this.Z, zzgzsVar.Z);
            this.Z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final long c0(int i, long j) {
        d();
        i(i);
        long[] jArr = this.Y;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
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
        if (!(obj instanceof zzgzs)) {
            return super.equals(obj);
        }
        zzgzs zzgzsVar = (zzgzs) obj;
        if (this.Z != zzgzsVar.Z) {
            return false;
        }
        long[] jArr = zzgzsVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Long.valueOf(this.Y[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            long j = this.Y[i2];
            byte[] bArr = zzgzf.b;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Y[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
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

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(c0(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final void t(long j) {
        d();
        int i = this.Z;
        int length = this.Y.length;
        if (i == length) {
            long[] jArr = new long[f(length)];
            System.arraycopy(this.Y, 0, jArr, 0, this.Z);
            this.Y = jArr;
        }
        long[] jArr2 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final long u(int i) {
        i(i);
        return this.Y[i];
    }

    public zzgzs(long[] jArr, int i, boolean z) {
        super(z);
        this.Y = jArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        t(((Long) obj).longValue());
        return true;
    }
}
