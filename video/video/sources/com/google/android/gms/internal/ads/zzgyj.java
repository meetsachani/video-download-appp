package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgyj extends zzgww implements RandomAccess, zzgyz, zzham {
    public static final float[] Y0;
    public static final zzgyj Z0;
    public float[] Y;
    public int Z;

    static {
        float[] fArr = new float[0];
        Y0 = fArr;
        Z0 = new zzgyj(fArr, 0, false);
    }

    public zzgyj() {
        this(Y0, 0, true);
    }

    public static zzgyj f() {
        return Z0;
    }

    private static int i(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String j(int i) {
        int i2 = this.Z;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void k(int i) {
        if (i >= 0 && i < this.Z) {
            return;
        }
        throw new IndexOutOfBoundsException(j(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    /* renamed from: A */
    public final zzgyz S(int i) {
        float[] copyOf;
        if (i >= this.Z) {
            if (i == 0) {
                copyOf = Y0;
            } else {
                copyOf = Arrays.copyOf(this.Y, i);
            }
            return new zzgyj(copyOf, this.Z, true);
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
        this.Y = new float[Math.max(i, 10)];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int i3 = i + 1;
            float[] fArr = this.Y;
            int length = fArr.length;
            if (i2 < length) {
                System.arraycopy(fArr, i, fArr, i3, i2 - i);
            } else {
                float[] fArr2 = new float[i(length)];
                System.arraycopy(this.Y, 0, fArr2, 0, i);
                System.arraycopy(this.Y, i, fArr2, i3, this.Z - i);
                this.Y = fArr2;
            }
            this.Y[i] = floatValue;
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
        if (!(collection instanceof zzgyj)) {
            return super.addAll(collection);
        }
        zzgyj zzgyjVar = (zzgyj) collection;
        int i = zzgyjVar.Z;
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
            System.arraycopy(zzgyjVar.Y, 0, this.Y, this.Z, zzgyjVar.Z);
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

    public final float e(int i) {
        k(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyj)) {
            return super.equals(obj);
        }
        zzgyj zzgyjVar = (zzgyj) obj;
        if (this.Z != zzgyjVar.Z) {
            return false;
        }
        float[] fArr = zzgyjVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (Float.floatToIntBits(this.Y[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Float.valueOf(this.Y[i]);
    }

    public final void h(float f) {
        d();
        int i = this.Z;
        int length = this.Y.length;
        if (i == length) {
            float[] fArr = new float[i(length)];
            System.arraycopy(this.Y, 0, fArr, 0, this.Z);
            this.Y = fArr;
        }
        float[] fArr2 = this.Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        fArr2[i2] = f;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Y[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        k(i);
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

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        k(i);
        float[] fArr = this.Y;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzgyj(float[] fArr, int i, boolean z) {
        super(z);
        this.Y = fArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
