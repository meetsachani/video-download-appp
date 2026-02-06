package o;

import java.util.Arrays;

/* renamed from: o.za2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11229za2 {
    public static final Object a = new Object();

    public static final <E, T extends E> T A(C10986ya2<E> c10986ya2, int i, T t) {
        T t2;
        int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        if (a2 >= 0 && (t2 = (T) c10986ya2.Z[a2]) != a) {
            return t2;
        }
        return t;
    }

    public static final <E> void c(C10986ya2<E> c10986ya2, int i, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        int i2 = c10986ya2.Y0;
        if (i2 != 0 && i <= c10986ya2.Y[i2 - 1]) {
            c10986ya2.o(i, e);
            return;
        }
        if (c10986ya2.X && i2 >= c10986ya2.Y.length) {
            z(c10986ya2);
        }
        int i3 = c10986ya2.Y0;
        if (i3 >= c10986ya2.Y.length) {
            int e2 = BL.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(c10986ya2.Y, e2);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            c10986ya2.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c10986ya2.Z, e2);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            c10986ya2.Z = copyOf2;
        }
        c10986ya2.Y[i3] = i;
        c10986ya2.Z[i3] = e;
        c10986ya2.Y0 = i3 + 1;
    }

    public static final <E> void d(C10986ya2<E> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        int i = c10986ya2.Y0;
        Object[] objArr = c10986ya2.Z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c10986ya2.Y0 = 0;
        c10986ya2.X = false;
    }

    public static final <E> boolean e(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.k(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean f(C10986ya2<E> c10986ya2, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        int i = c10986ya2.Y0;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (c10986ya2.Z[i2] == e) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public static final <E> E g(C10986ya2<E> c10986ya2, int i) {
        E e;
        C6562gT0.p(c10986ya2, "<this>");
        int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        if (a2 >= 0 && (e = (E) c10986ya2.Z[a2]) != a) {
            return e;
        }
        return null;
    }

    public static final <E> E h(C10986ya2<E> c10986ya2, int i, E e) {
        E e2;
        C6562gT0.p(c10986ya2, "<this>");
        int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        if (a2 >= 0 && (e2 = (E) c10986ya2.Z[a2]) != a) {
            return e2;
        }
        return e;
    }

    public static final <E> int i(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        return BL.a(c10986ya2.Y, c10986ya2.Y0, i);
    }

    public static final <E> int j(C10986ya2<E> c10986ya2, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        int i = c10986ya2.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (c10986ya2.Z[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E> boolean k(C10986ya2<E> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.y() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> int l(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        return c10986ya2.Y[i];
    }

    public static final <E> void m(C10986ya2<E> c10986ya2, int i, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        if (a2 >= 0) {
            c10986ya2.Z[a2] = e;
            return;
        }
        int i2 = ~a2;
        if (i2 < c10986ya2.Y0 && c10986ya2.Z[i2] == a) {
            c10986ya2.Y[i2] = i;
            c10986ya2.Z[i2] = e;
            return;
        }
        if (c10986ya2.X && c10986ya2.Y0 >= c10986ya2.Y.length) {
            z(c10986ya2);
            i2 = ~BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        }
        int i3 = c10986ya2.Y0;
        if (i3 >= c10986ya2.Y.length) {
            int e2 = BL.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(c10986ya2.Y, e2);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            c10986ya2.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c10986ya2.Z, e2);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            c10986ya2.Z = copyOf2;
        }
        int i4 = c10986ya2.Y0;
        if (i4 - i2 != 0) {
            int[] iArr = c10986ya2.Y;
            int i5 = i2 + 1;
            C4788Ye.z0(iArr, iArr, i5, i2, i4);
            Object[] objArr = c10986ya2.Z;
            C4788Ye.B0(objArr, objArr, i5, i2, c10986ya2.Y0);
        }
        c10986ya2.Y[i2] = i;
        c10986ya2.Z[i2] = e;
        c10986ya2.Y0++;
    }

    public static final <E> void n(C10986ya2<E> c10986ya2, C10986ya2<? extends E> c10986ya22) {
        C6562gT0.p(c10986ya2, "<this>");
        C6562gT0.p(c10986ya22, "other");
        int y = c10986ya22.y();
        for (int i = 0; i < y; i++) {
            int n = c10986ya22.n(i);
            E z = c10986ya22.z(i);
            int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, n);
            if (a2 >= 0) {
                c10986ya2.Z[a2] = z;
            } else {
                int i2 = ~a2;
                if (i2 < c10986ya2.Y0 && c10986ya2.Z[i2] == a) {
                    c10986ya2.Y[i2] = n;
                    c10986ya2.Z[i2] = z;
                } else {
                    if (c10986ya2.X && c10986ya2.Y0 >= c10986ya2.Y.length) {
                        z(c10986ya2);
                        i2 = ~BL.a(c10986ya2.Y, c10986ya2.Y0, n);
                    }
                    int i3 = c10986ya2.Y0;
                    if (i3 >= c10986ya2.Y.length) {
                        int e = BL.e(i3 + 1);
                        int[] copyOf = Arrays.copyOf(c10986ya2.Y, e);
                        C6562gT0.o(copyOf, "copyOf(this, newSize)");
                        c10986ya2.Y = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(c10986ya2.Z, e);
                        C6562gT0.o(copyOf2, "copyOf(this, newSize)");
                        c10986ya2.Z = copyOf2;
                    }
                    int i4 = c10986ya2.Y0;
                    if (i4 - i2 != 0) {
                        int[] iArr = c10986ya2.Y;
                        int i5 = i2 + 1;
                        C4788Ye.z0(iArr, iArr, i5, i2, i4);
                        Object[] objArr = c10986ya2.Z;
                        C4788Ye.B0(objArr, objArr, i5, i2, c10986ya2.Y0);
                    }
                    c10986ya2.Y[i2] = n;
                    c10986ya2.Z[i2] = z;
                    c10986ya2.Y0++;
                }
            }
        }
    }

    public static final <E> E o(C10986ya2<E> c10986ya2, int i, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        E e2 = (E) g(c10986ya2, i);
        if (e2 == null) {
            int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
            if (a2 >= 0) {
                c10986ya2.Z[a2] = e;
                return e2;
            }
            int i2 = ~a2;
            if (i2 < c10986ya2.Y0 && c10986ya2.Z[i2] == a) {
                c10986ya2.Y[i2] = i;
                c10986ya2.Z[i2] = e;
                return e2;
            }
            if (c10986ya2.X && c10986ya2.Y0 >= c10986ya2.Y.length) {
                z(c10986ya2);
                i2 = ~BL.a(c10986ya2.Y, c10986ya2.Y0, i);
            }
            int i3 = c10986ya2.Y0;
            if (i3 >= c10986ya2.Y.length) {
                int e3 = BL.e(i3 + 1);
                int[] copyOf = Arrays.copyOf(c10986ya2.Y, e3);
                C6562gT0.o(copyOf, "copyOf(this, newSize)");
                c10986ya2.Y = copyOf;
                Object[] copyOf2 = Arrays.copyOf(c10986ya2.Z, e3);
                C6562gT0.o(copyOf2, "copyOf(this, newSize)");
                c10986ya2.Z = copyOf2;
            }
            int i4 = c10986ya2.Y0;
            if (i4 - i2 != 0) {
                int[] iArr = c10986ya2.Y;
                int i5 = i2 + 1;
                C4788Ye.z0(iArr, iArr, i5, i2, i4);
                Object[] objArr = c10986ya2.Z;
                C4788Ye.B0(objArr, objArr, i5, i2, c10986ya2.Y0);
            }
            c10986ya2.Y[i2] = i;
            c10986ya2.Z[i2] = e;
            c10986ya2.Y0++;
        }
        return e2;
    }

    public static final <E> void p(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        int a2 = BL.a(c10986ya2.Y, c10986ya2.Y0, i);
        if (a2 >= 0) {
            Object[] objArr = c10986ya2.Z;
            Object obj = objArr[a2];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a2] = obj2;
                c10986ya2.X = true;
            }
        }
    }

    public static final <E> boolean q(C10986ya2<E> c10986ya2, int i, Object obj) {
        C6562gT0.p(c10986ya2, "<this>");
        int k = c10986ya2.k(i);
        if (k >= 0 && C6562gT0.g(obj, c10986ya2.z(k))) {
            c10986ya2.t(k);
            return true;
        }
        return false;
    }

    public static final <E> void r(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.Z[i] != a) {
            c10986ya2.Z[i] = a;
            c10986ya2.X = true;
        }
    }

    public static final <E> void s(C10986ya2<E> c10986ya2, int i, int i2) {
        C6562gT0.p(c10986ya2, "<this>");
        int min = Math.min(i2, i + i2);
        while (i < min) {
            c10986ya2.t(i);
            i++;
        }
    }

    public static final <E> E t(C10986ya2<E> c10986ya2, int i, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        int k = c10986ya2.k(i);
        if (k >= 0) {
            Object[] objArr = c10986ya2.Z;
            E e2 = (E) objArr[k];
            objArr[k] = e;
            return e2;
        }
        return null;
    }

    public static final <E> boolean u(C10986ya2<E> c10986ya2, int i, E e, E e2) {
        C6562gT0.p(c10986ya2, "<this>");
        int k = c10986ya2.k(i);
        if (k >= 0 && C6562gT0.g(c10986ya2.Z[k], e)) {
            c10986ya2.Z[k] = e2;
            return true;
        }
        return false;
    }

    public static final <E> void v(C10986ya2<E> c10986ya2, int i, E e) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        c10986ya2.Z[i] = e;
    }

    public static final <E> int w(C10986ya2<E> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        return c10986ya2.Y0;
    }

    public static final <E> String x(C10986ya2<E> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.y() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(c10986ya2.Y0 * 28);
        sb.append('{');
        int i = c10986ya2.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(c10986ya2.n(i2));
            sb.append('=');
            E z = c10986ya2.z(i2);
            if (z != c10986ya2) {
                sb.append(z);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "buffer.toString()");
        return sb2;
    }

    public static final <E> E y(C10986ya2<E> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        if (c10986ya2.X) {
            z(c10986ya2);
        }
        return (E) c10986ya2.Z[i];
    }

    public static final <E> void z(C10986ya2<E> c10986ya2) {
        int i = c10986ya2.Y0;
        int[] iArr = c10986ya2.Y;
        Object[] objArr = c10986ya2.Z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c10986ya2.X = false;
        c10986ya2.Y0 = i2;
    }
}
