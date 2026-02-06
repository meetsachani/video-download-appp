package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzja extends zzhg<Integer> implements zzjd, zzkv, RandomAccess {
    public static final zzja Y0 = new zzja(new int[0], 0, false);
    public int[] Y;
    public int Z;

    public zzja() {
        this(new int[10], 0, true);
    }

    public static zzja f() {
        return Y0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    /* renamed from: C */
    public final zzjd u(int i) {
        if (i >= this.Z) {
            return new zzja(Arrays.copyOf(this.Y, i), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i >= 0 && i <= (i2 = this.Z)) {
            int[] iArr = this.Y;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.Y, i, iArr2, i + 1, this.Z - i);
                this.Y = iArr2;
            }
            this.Y[i] = intValue;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        zziz.e(collection);
        if (!(collection instanceof zzja)) {
            return super.addAll(collection);
        }
        zzja zzjaVar = (zzja) collection;
        int i = zzjaVar.Z;
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
            System.arraycopy(zzjaVar.Y, 0, this.Y, this.Z, zzjaVar.Z);
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

    public final int e(int i) {
        j(i);
        return this.Y[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzja)) {
            return super.equals(obj);
        }
        zzja zzjaVar = (zzja) obj;
        if (this.Z != zzjaVar.Z) {
            return false;
        }
        int[] iArr = zzjaVar.Y;
        for (int i = 0; i < this.Z; i++) {
            if (this.Y[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(e(i));
    }

    public final void h(int i) {
        d();
        int i2 = this.Z;
        int[] iArr = this.Y;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.Y = iArr2;
        }
        int[] iArr3 = this.Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.Collection, java.util.List
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
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.Y[i] == intValue) {
                return i;
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

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
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

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        j(i);
        int[] iArr = this.Y;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    public zzja(int[] iArr, int i, boolean z) {
        super(z);
        this.Y = iArr;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
