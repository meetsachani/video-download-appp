package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.t62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9654t62<K, V> {
    public int[] X;
    public Object[] Y;
    public int Z;

    public C9654t62() {
        this(0, 1, null);
    }

    public final int a(V v) {
        int i = this.Z * 2;
        Object[] objArr = this.Y;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (C6562gT0.g(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void b(int i) {
        int i2 = this.Z;
        int[] iArr = this.X;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.X = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Y, i * 2);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Y = copyOf2;
        }
        if (this.Z == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V> T c(Object obj, T t) {
        int e = e(obj);
        if (e >= 0) {
            return (T) this.Y[(e << 1) + 1];
        }
        return t;
    }

    public void clear() {
        if (this.Z > 0) {
            this.X = BL.a;
            this.Y = BL.c;
            this.Z = 0;
        }
        if (this.Z <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(K k) {
        if (e(k) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(V v) {
        if (a(v) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(K k, int i) {
        int i2 = this.Z;
        if (i2 == 0) {
            return -1;
        }
        int a = BL.a(this.X, i2, i);
        if (a < 0 || C6562gT0.g(k, this.Y[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.X[i3] == i) {
            if (C6562gT0.g(k, this.Y[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.X[i4] == i; i4--) {
            if (C6562gT0.g(k, this.Y[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public int e(K k) {
        if (k == null) {
            return f();
        }
        return d(k, k.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C9654t62) {
                if (size() != ((C9654t62) obj).size()) {
                    return false;
                }
                C9654t62 c9654t62 = (C9654t62) obj;
                int i = this.Z;
                for (int i2 = 0; i2 < i; i2++) {
                    K g = g(i2);
                    V l = l(i2);
                    Object obj2 = c9654t62.get(g);
                    if (l == null) {
                        if (obj2 != null || !c9654t62.containsKey(g)) {
                            return false;
                        }
                    } else if (!C6562gT0.g(l, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.Z;
                for (int i4 = 0; i4 < i3; i4++) {
                    K g2 = g(i4);
                    V l2 = l(i4);
                    Object obj3 = ((Map) obj).get(g2);
                    if (l2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(g2)) {
                            return false;
                        }
                    } else if (!C6562gT0.g(l2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.Z;
        if (i == 0) {
            return -1;
        }
        int a = BL.a(this.X, i, 0);
        if (a < 0 || this.Y[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.X[i2] == 0) {
            if (this.Y[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.X[i3] == 0; i3--) {
            if (this.Y[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public K g(int i) {
        if (i >= 0 && i < this.Z) {
            return (K) this.Y[i << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public V get(K k) {
        int e = e(k);
        if (e >= 0) {
            return (V) this.Y[(e << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v) {
        int e = e(obj);
        if (e >= 0) {
            return (V) this.Y[(e << 1) + 1];
        }
        return v;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.X;
        Object[] objArr = this.Y;
        int i2 = this.Z;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public void i(C9654t62<? extends K, ? extends V> c9654t62) {
        C6562gT0.p(c9654t62, "map");
        int i = c9654t62.Z;
        b(this.Z + i);
        if (this.Z == 0) {
            if (i > 0) {
                C4788Ye.z0(c9654t62.X, this.X, 0, 0, i);
                C4788Ye.B0(c9654t62.Y, this.Y, 0, 0, i << 1);
                this.Z = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(c9654t62.g(i2), c9654t62.l(i2));
        }
    }

    public boolean isEmpty() {
        if (this.Z <= 0) {
            return true;
        }
        return false;
    }

    public V j(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.Z)) {
            Object[] objArr = this.Y;
            int i3 = i << 1;
            V v = (V) objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return v;
            }
            int i4 = i2 - 1;
            int[] iArr = this.X;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                C6562gT0.o(copyOf, "copyOf(this, newSize)");
                this.X = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.Y, i5 << 1);
                C6562gT0.o(copyOf2, "copyOf(this, newSize)");
                this.Y = copyOf2;
                if (i2 == this.Z) {
                    if (i > 0) {
                        C4788Ye.z0(iArr, this.X, 0, 0, i);
                        C4788Ye.B0(objArr, this.Y, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        C4788Ye.z0(iArr, this.X, i, i6, i2);
                        C4788Ye.B0(objArr, this.Y, i3, i6 << 1, i2 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    C4788Ye.z0(iArr, iArr, i, i7, i2);
                    Object[] objArr2 = this.Y;
                    C4788Ye.B0(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                }
                Object[] objArr3 = this.Y;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.Z) {
                this.Z = i4;
                return v;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public V k(int i, V v) {
        if (i >= 0 && i < this.Z) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.Y;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public V l(int i) {
        if (i >= 0 && i < this.Z) {
            return (V) this.Y[(i << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public V put(K k, V v) {
        int i;
        int f;
        int i2 = this.Z;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        if (k != null) {
            f = d(k, i);
        } else {
            f = f();
        }
        if (f >= 0) {
            int i3 = (f << 1) + 1;
            Object[] objArr = this.Y;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~f;
        int[] iArr = this.X;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.X = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Y, i5 << 1);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Y = copyOf2;
            if (i2 != this.Z) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.X;
            int i6 = i4 + 1;
            C4788Ye.z0(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.Y;
            C4788Ye.B0(objArr2, objArr2, i6 << 1, i4 << 1, this.Z << 1);
        }
        int i7 = this.Z;
        if (i2 == i7) {
            int[] iArr3 = this.X;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.Y;
                int i8 = i4 << 1;
                objArr3[i8] = k;
                objArr3[i8 + 1] = v;
                this.Z = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(K k) {
        int e = e(k);
        if (e >= 0) {
            return j(e);
        }
        return null;
    }

    public V replace(K k, V v) {
        int e = e(k);
        if (e >= 0) {
            return k(e, v);
        }
        return null;
    }

    public int size() {
        return this.Z;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Z * 28);
        sb.append('{');
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(C6566gU0.h);
            }
            K g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l = l(i2);
            if (l != sb) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C9654t62(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = BL.a;
        } else {
            iArr = new int[i];
        }
        this.X = iArr;
        if (i == 0) {
            objArr = BL.c;
        } else {
            objArr = new Object[i << 1];
        }
        this.Y = objArr;
    }

    public boolean remove(K k, V v) {
        int e = e(k);
        if (e < 0 || !C6562gT0.g(v, l(e))) {
            return false;
        }
        j(e);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int e = e(k);
        if (e < 0 || !C6562gT0.g(v, l(e))) {
            return false;
        }
        k(e, v2);
        return true;
    }

    public /* synthetic */ C9654t62(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public C9654t62(C9654t62<? extends K, ? extends V> c9654t62) {
        this(0, 1, null);
        if (c9654t62 != null) {
            i(c9654t62);
        }
    }
}
