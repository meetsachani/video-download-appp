package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxl extends AbstractMap implements Serializable {
    public static final Object e1 = new Object();
    public transient Object X;
    public transient int[] Y;
    public transient Object[] Y0;
    public transient Object[] Z;
    public transient int Z0;
    public transient int a1;
    public transient Set b1;
    public transient Set c1;
    public transient Collection d1;

    public zzfxl() {
        w(3);
    }

    public static /* synthetic */ Object k(zzfxl zzfxlVar, int i) {
        return zzfxlVar.b()[i];
    }

    public static /* synthetic */ Object m(zzfxl zzfxlVar) {
        Object obj = zzfxlVar.X;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object n(zzfxl zzfxlVar, int i) {
        return zzfxlVar.c()[i];
    }

    public static /* synthetic */ void u(zzfxl zzfxlVar, int i, Object obj) {
        zzfxlVar.c()[i] = obj;
    }

    public final int C() {
        return (1 << (this.Z0 & 31)) - 1;
    }

    public final int D(Object obj) {
        if (y()) {
            return -1;
        }
        int b = zzfxu.b(obj);
        int C = C();
        Object obj2 = this.X;
        Objects.requireNonNull(obj2);
        int c = zzfxm.c(obj2, b & C);
        if (c == 0) {
            return -1;
        }
        int i = ~C;
        int i2 = b & i;
        do {
            int i3 = c - 1;
            int i4 = a()[i3];
            if ((i4 & i) == i2 && zzfuz.a(obj, b()[i3])) {
                return i3;
            }
            c = i4 & C;
        } while (c != 0);
        return -1;
    }

    public final int E(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object d = zzfxm.d(i2);
        if (i4 != 0) {
            zzfxm.e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.X;
        Objects.requireNonNull(obj);
        int[] a = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = zzfxm.c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = zzfxm.c(d, i10);
                zzfxm.e(d, i10, c);
                a[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.X = d;
        G(i5);
        return i5;
    }

    public final Object F(Object obj) {
        if (!y()) {
            int C = C();
            Object obj2 = this.X;
            Objects.requireNonNull(obj2);
            int b = zzfxm.b(obj, null, C, obj2, a(), b(), null);
            if (b != -1) {
                Object obj3 = c()[b];
                x(b, C);
                this.a1--;
                v();
                return obj3;
            }
        }
        return e1;
    }

    public final void G(int i) {
        this.Z0 = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.Z0 & (-32));
    }

    public final int[] a() {
        int[] iArr = this.Y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.Z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.Y0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (y()) {
            return;
        }
        v();
        Map r = r();
        if (r != null) {
            this.Z0 = zzgbf.c(size(), 3, 1073741823);
            r.clear();
            this.X = null;
            this.a1 = 0;
            return;
        }
        Arrays.fill(b(), 0, this.a1, (Object) null);
        Arrays.fill(c(), 0, this.a1, (Object) null);
        Object obj = this.X;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.a1, 0);
        this.a1 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map r = r();
        if (r != null) {
            return r.containsKey(obj);
        }
        if (D(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map r = r();
        if (r == null) {
            for (int i = 0; i < this.a1; i++) {
                if (zzfuz.a(obj, c()[i])) {
                    return true;
                }
            }
            return false;
        }
        return r.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.c1;
        if (set == null) {
            zzfxf zzfxfVar = new zzfxf(this);
            this.c1 = zzfxfVar;
            return zzfxfVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map r = r();
        if (r != null) {
            return r.get(obj);
        }
        int D = D(obj);
        if (D == -1) {
            return null;
        }
        return c()[D];
    }

    public final int i() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        int i2 = i + 1;
        if (i2 < this.a1) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.b1;
        if (set == null) {
            zzfxh zzfxhVar = new zzfxh(this);
            this.b1 = zzfxhVar;
            return zzfxhVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (y()) {
            zzfvc.m(y(), "Arrays already allocated");
            int i2 = this.Z0;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.X = zzfxm.d(max2);
            G(max2 - 1);
            this.Y = new int[i2];
            this.Z = new Object[i2];
            this.Y0 = new Object[i2];
        }
        Map r = r();
        if (r != null) {
            return r.put(obj, obj2);
        }
        int[] a = a();
        Object[] b = b();
        Object[] c = c();
        int i3 = this.a1;
        int i4 = i3 + 1;
        int b2 = zzfxu.b(obj);
        int C = C();
        int i5 = b2 & C;
        Object obj3 = this.X;
        Objects.requireNonNull(obj3);
        int c2 = zzfxm.c(obj3, i5);
        if (c2 == 0) {
            if (i4 > C) {
                C = E(C, zzfxm.a(C), b2, i3);
            } else {
                Object obj4 = this.X;
                Objects.requireNonNull(obj4);
                zzfxm.e(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~C;
            int i7 = b2 & i6;
            int i8 = 0;
            while (true) {
                int i9 = c2 - 1;
                int i10 = a[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && zzfuz.a(obj, b[i9])) {
                    Object obj5 = c[i9];
                    c[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & C;
                i8++;
                if (i12 == 0) {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C() + 1, 1.0f);
                        int i13 = i();
                        while (i13 >= 0) {
                            linkedHashMap.put(b()[i13], c()[i13]);
                            i13 = j(i13);
                        }
                        this.X = linkedHashMap;
                        this.Y = null;
                        this.Z = null;
                        this.Y0 = null;
                        v();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i4 > C) {
                        C = E(C, zzfxm.a(C), b2, i3);
                    } else {
                        a[i9] = (i4 & C) | i11;
                    }
                } else {
                    c2 = i12;
                }
            }
        }
        int length = a().length;
        if (i4 > length) {
            int i14 = i;
            int min = Math.min(1073741823, (Math.max(i14, length >>> 1) + length) | i14);
            if (min != length) {
                this.Y = Arrays.copyOf(a(), min);
                this.Z = Arrays.copyOf(b(), min);
                this.Y0 = Arrays.copyOf(c(), min);
            }
        }
        a()[i3] = (~C) & b2;
        b()[i3] = obj;
        c()[i3] = obj2;
        this.a1 = i4;
        v();
        return null;
    }

    public final Map r() {
        Object obj = this.X;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map r = r();
        if (r != null) {
            return r.remove(obj);
        }
        Object F = F(obj);
        if (F == e1) {
            return null;
        }
        return F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map r = r();
        if (r != null) {
            return r.size();
        }
        return this.a1;
    }

    public final void v() {
        this.Z0 += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.d1;
        if (collection == null) {
            zzfxj zzfxjVar = new zzfxj(this);
            this.d1 = zzfxjVar;
            return zzfxjVar;
        }
        return collection;
    }

    public final void w(int i) {
        this.Z0 = zzgbf.c(i, 1, 1073741823);
    }

    public final void x(int i, int i2) {
        Object obj = this.X;
        Objects.requireNonNull(obj);
        int[] a = a();
        Object[] b = b();
        Object[] c = c();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            int i4 = i + 1;
            Object obj2 = b[i3];
            b[i] = obj2;
            c[i] = c[i3];
            b[i3] = null;
            c[i3] = null;
            a[i] = a[i3];
            a[i3] = 0;
            int b2 = zzfxu.b(obj2) & i2;
            int c2 = zzfxm.c(obj, b2);
            if (c2 == size) {
                zzfxm.e(obj, b2, i4);
                return;
            }
            while (true) {
                int i5 = c2 - 1;
                int i6 = a[i5];
                int i7 = i6 & i2;
                if (i7 != size) {
                    c2 = i7;
                } else {
                    a[i5] = (i6 & (~i2)) | (i2 & i4);
                    return;
                }
            }
        } else {
            b[i] = null;
            c[i] = null;
            a[i] = 0;
        }
    }

    public final boolean y() {
        return this.X == null;
    }

    public zzfxl(int i) {
        w(8);
    }
}
