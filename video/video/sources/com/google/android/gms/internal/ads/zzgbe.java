package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgbe extends AbstractList implements RandomAccess, Serializable {
    public final int[] X;
    public final int Y;
    public final int Z;

    public zzgbe(int[] iArr, int i, int i2) {
        this.X = iArr;
        this.Y = i;
        this.Z = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && zzgbf.a(this.X, ((Integer) obj).intValue(), this.Y, this.Z) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgbe) {
            zzgbe zzgbeVar = (zzgbe) obj;
            int i = this.Z;
            int i2 = this.Y;
            int i3 = zzgbeVar.Z;
            int i4 = zzgbeVar.Y;
            int i5 = i - i2;
            if (i3 - i4 != i5) {
                return false;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                if (this.X[i2 + i6] != zzgbeVar.X[i4 + i6]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.Z;
        int i3 = this.Y;
        zzfvc.a(i, i2 - i3, "index");
        return Integer.valueOf(this.X[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.Y; i2 < this.Z; i2++) {
            i = (i * 31) + this.X[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.X;
            int intValue = ((Integer) obj).intValue();
            int i = this.Y;
            int a = zzgbf.a(iArr, intValue, i, this.Z);
            if (a >= 0) {
                return a - i;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.X;
            int intValue = ((Integer) obj).intValue();
            int i = this.Y;
            int i2 = this.Z - 1;
            while (true) {
                if (i2 >= i) {
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.Z;
        int i3 = this.Y;
        Integer num = (Integer) obj;
        zzfvc.a(i, i2 - i3, "index");
        int[] iArr = this.X;
        int i4 = i3 + i;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z - this.Y;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.X, this.Y, this.Z, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.Z;
        int i4 = this.Y;
        zzfvc.k(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        return new zzgbe(this.X, i + i4, i4 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.Z;
        int i2 = this.Y;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.X;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 < i) {
                sb.append(C6566gU0.h);
                sb.append(iArr[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
