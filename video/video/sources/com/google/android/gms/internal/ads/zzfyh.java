package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class zzfyh extends zzfxx implements Set {
    public transient zzfyc Y;

    public static zzfyh B(Collection collection) {
        if ((collection instanceof zzfyh) && !(collection instanceof SortedSet)) {
            zzfyh zzfyhVar = (zzfyh) collection;
            if (!zzfyhVar.j()) {
                return zzfyhVar;
            }
        }
        Object[] array = collection.toArray();
        return U(array.length, array);
    }

    public static zzfyh D(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return U(length, (Object[]) objArr.clone());
            }
            return new zzgaf(objArr[0]);
        }
        return zzfzu.d1;
    }

    public static zzfyh F() {
        return zzfzu.d1;
    }

    public static zzfyh G(Object obj) {
        return new zzgaf(obj);
    }

    public static zzfyh H(Object obj, Object obj2) {
        return U(2, obj, obj2);
    }

    public static zzfyh J(Object obj, Object obj2, Object obj3) {
        return U(3, obj, obj2, obj3);
    }

    public static zzfyh K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return U(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfyh L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return U(9, objArr2);
    }

    public static zzfyh U(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int l = l(i);
                Object[] objArr2 = new Object[l];
                int i2 = l - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zzfzm.a(obj, i5);
                    int hashCode = obj.hashCode();
                    int a = zzfxu.a(hashCode);
                    while (true) {
                        int i6 = a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzgaf(obj3);
                }
                if (l(i4) < l / 2) {
                    return U(i4, objArr);
                }
                if (V(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzfzu(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgaf(obj4);
        }
        return zzfzu.d1;
    }

    public static boolean V(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static int l(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.f(z, "collection too large");
        return 1073741824;
    }

    public static zzfyg r(int i) {
        return new zzfyg(i, true);
    }

    public boolean Q() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfyh) && Q() && ((zzfyh) obj).Q() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgae.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public zzfyc h() {
        zzfyc zzfycVar = this.Y;
        if (zzfycVar == null) {
            zzfyc p = p();
            this.Y = p;
            return p;
        }
        return zzfycVar;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgae.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i */
    public abstract zzgai iterator();

    public zzfyc p() {
        Object[] array = toArray();
        int i = zzfyc.Z;
        return zzfyc.r(array, array.length);
    }
}
