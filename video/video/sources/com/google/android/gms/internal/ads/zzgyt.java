package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgyt extends zzgww implements RandomAccess, zzgza, zzham {
    public static final int[] Y0;
    public static final zzgyt Z0;
    public int[] Y;
    public int Z;

    static {
        int[] iArr = new int[0];
        Y0 = iArr;
        Z0 = new zzgyt(iArr, 0, false);
    }

    public zzgyt() {
        this(Y0, 0, true);
    }

    public static zzgyt e() {
        return Z0;
    }

    public static int h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final int A0(int i) {
        j(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void N(int i) {
        d();
        int i2 = this.Z;
        int length = this.Y.length;
        if (i2 == length) {
            int[] iArr = new int[h(length)];
            System.arraycopy(this.Y, 0, iArr, 0, this.Z);
            this.Y = iArr;
        }
        int[] iArr2 = this.Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    /* renamed from: W */
    public final zzgza S(int i) {
        int[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzgyt(copyOf, this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            int[] iArr = this.Y;
            int length = iArr.length;
            if (i2 < length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[h(length)];
                System.arraycopy(this.Y, 0, iArr2, 0, i);
                System.arraycopy(this.Y, i, iArr2, i3, this.Z - i);
                this.Y = iArr2;
            }
            this.Y[i] = intValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = zzgzf.b;
        collection.getClass();
        if (!(collection instanceof zzgyt)) {
            return super.addAll(collection);
        }
        zzgyt zzgytVar = (zzgyt) collection;
        int i = zzgytVar.Z;
        if (i == 0) {
            return false;
        }
        int i2 = this.Z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.Y;
            if (i3 > iArr.length) {
                this.Y = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzgytVar.Y, 0, this.Y, this.Z, zzgytVar.Z);
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
        if (!(obj instanceof zzgyt)) {
            return super.equals(obj);
        }
        zzgyt zzgytVar = (zzgyt) obj;
        if (this.Z != zzgytVar.Z) {
            return false;
        }
        int[] iArr = zzgytVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != iArr[i]) {
                return false;
            }
        }
        return true;
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
        this.Y = new int[Math.max(i, 10)];
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final int g0(int i, int i2) {
        d();
        j(i);
        int[] iArr = this.Y;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Integer.valueOf(this.Y[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            i = (i * 31) + this.Y[i2];
        }
        return i;
    }

    public final String i(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Y[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void j(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        j(i);
        int[] iArr = this.Y;
        int i3 = iArr[i];
        if (i < this.Z - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            int[] iArr = this.Y;
            System.arraycopy(iArr, i2, iArr, i, this.Z - i2);
            this.Z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Integer.valueOf(g0(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzgyt(int[] iArr, int i, boolean z) {
        super(z);
        this.Y = iArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        N(((Integer) obj).intValue());
        return true;
    }
}
