package o;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* renamed from: o.zE2 */
/* loaded from: classes4.dex */
public class C11147zE2 {
    public static final String a = "The validated value is not a number";
    public static final String b = "The value is invalid: %f";
    public static final String c = "The value %s is not in the specified exclusive range of %s to %s";
    public static final String d = "The value %s is not in the specified inclusive range of %s to %s";
    public static final String e = "The string %s does not match the pattern %s";
    public static final String f = "The validated object is null";
    public static final String g = "The validated expression is false";
    public static final String h = "The validated array contains null element at index: %d";
    public static final String i = "The validated collection contains null element at index: %d";
    public static final String j = "The validated character sequence is blank";
    public static final String k = "The validated array is empty";
    public static final String l = "The validated character sequence is empty";
    public static final String m = "The validated collection is empty";
    public static final String n = "The validated map is empty";

    /* renamed from: o */
    public static final String f925o = "The validated array index is invalid: %d";
    public static final String p = "The validated character sequence index is invalid: %d";
    public static final String q = "The validated collection index is invalid: %d";
    public static final String r = "The validated state is false";
    public static final String s = "Cannot assign a %s to a %s";
    public static final String t = "Expected type: %s, actual: %s";

    public static void A(boolean z, String str, long j2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, Long.valueOf(j2)));
    }

    public static void B(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void C(CharSequence charSequence, String str) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        throw new IllegalArgumentException(String.format(e, charSequence, str));
    }

    public static void D(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str2, objArr));
    }

    public static <T extends Iterable<?>> T E(T t2) {
        return (T) F(t2, i, new Object[0]);
    }

    public static <T extends Iterable<?>> T F(T t2, String str, Object... objArr) {
        U(t2);
        int i2 = 0;
        for (Object obj : t2) {
            if (obj != null) {
                i2++;
            } else {
                throw new IllegalArgumentException(String.format(str, C4206Se.z(objArr, Integer.valueOf(i2))));
            }
        }
        return t2;
    }

    public static <T> T[] G(T[] tArr) {
        return (T[]) H(tArr, h, new Object[0]);
    }

    public static <T> T[] H(T[] tArr, String str, Object... objArr) {
        U(tArr);
        for (int i2 = 0; i2 < tArr.length; i2++) {
            if (tArr[i2] == null) {
                throw new IllegalArgumentException(String.format(str, C4206Se.o(objArr, Integer.valueOf(i2))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T I(T t2) {
        return (T) J(t2, j, new Object[0]);
    }

    public static <T extends CharSequence> T J(T t2, final String str, final Object... objArr) {
        Objects.requireNonNull(t2, new Supplier() { // from class: o.uE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.d(str, objArr);
            }
        });
        if (!C4500Ve2.H0(t2)) {
            return t2;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T K(T t2) {
        return (T) L(t2, l, new Object[0]);
    }

    public static <T extends CharSequence> T L(T t2, final String str, final Object... objArr) {
        Objects.requireNonNull(t2, new Supplier() { // from class: o.wE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.b(str, objArr);
            }
        });
        if (t2.length() != 0) {
            return t2;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T M(T t2) {
        return (T) N(t2, m, new Object[0]);
    }

    public static <T extends Collection<?>> T N(T t2, final String str, final Object... objArr) {
        Objects.requireNonNull(t2, new Supplier() { // from class: o.xE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.c(str, objArr);
            }
        });
        if (!t2.isEmpty()) {
            return t2;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T extends Map<?, ?>> T O(T t2) {
        return (T) P(t2, n, new Object[0]);
    }

    public static <T extends Map<?, ?>> T P(T t2, final String str, final Object... objArr) {
        Objects.requireNonNull(t2, new Supplier() { // from class: o.tE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.e(str, objArr);
            }
        });
        if (!t2.isEmpty()) {
            return t2;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T> T[] Q(T[] tArr) {
        return (T[]) R(tArr, k, new Object[0]);
    }

    public static <T> T[] R(T[] tArr, final String str, final Object... objArr) {
        Objects.requireNonNull(tArr, new Supplier() { // from class: o.yE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.f(str, objArr);
            }
        });
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void S(double d2) {
        T(d2, a, new Object[0]);
    }

    public static void T(double d2, String str, Object... objArr) {
        if (!Double.isNaN(d2)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T> T U(T t2) {
        return (T) V(t2, f, new Object[0]);
    }

    public static <T> T V(T t2, final String str, final Object... objArr) {
        Objects.requireNonNull(t2, new Supplier() { // from class: o.vE2
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11147zE2.a(str, objArr);
            }
        });
        return t2;
    }

    public static <T extends CharSequence> T W(T t2, int i2) {
        return (T) X(t2, i2, p, Integer.valueOf(i2));
    }

    public static <T extends CharSequence> T X(T t2, int i2, String str, Object... objArr) {
        U(t2);
        if (i2 >= 0 && i2 < t2.length()) {
            return t2;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T Y(T t2, int i2) {
        return (T) Z(t2, i2, q, Integer.valueOf(i2));
    }

    public static <T extends Collection<?>> T Z(T t2, int i2, String str, Object... objArr) {
        U(t2);
        if (i2 >= 0 && i2 < t2.size()) {
            return t2;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ String a(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static <T> T[] a0(T[] tArr, int i2) {
        return (T[]) b0(tArr, i2, f925o, Integer.valueOf(i2));
    }

    public static /* synthetic */ String b(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static <T> T[] b0(T[] tArr, int i2, String str, Object... objArr) {
        U(tArr);
        if (i2 >= 0 && i2 < tArr.length) {
            return tArr;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ String c(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static void c0(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException(r);
    }

    public static /* synthetic */ String d(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static void d0(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static /* synthetic */ String e(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static /* synthetic */ String f(String str, Object[] objArr) {
        return String.format(str, objArr);
    }

    public static void g(double d2, double d3, double d4) {
        if (d4 > d2 && d4 < d3) {
            return;
        }
        throw new IllegalArgumentException(String.format(c, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static void h(double d2, double d3, double d4, String str) {
        if (d4 > d2 && d4 < d3) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void i(long j2, long j3, long j4) {
        if (j4 > j2 && j4 < j3) {
            return;
        }
        throw new IllegalArgumentException(String.format(c, Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void j(long j2, long j3, long j4, String str) {
        if (j4 > j2 && j4 < j3) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> void k(T t2, T t3, Comparable<T> comparable) {
        if (comparable.compareTo(t2) > 0 && comparable.compareTo(t3) < 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(c, comparable, t2, t3));
    }

    public static <T> void l(T t2, T t3, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t2) > 0 && comparable.compareTo(t3) < 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void m(double d2) {
        n(d2, b, Double.valueOf(d2));
    }

    public static void n(double d2, String str, Object... objArr) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void o(double d2, double d3, double d4) {
        if (d4 >= d2 && d4 <= d3) {
            return;
        }
        throw new IllegalArgumentException(String.format(d, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static void p(double d2, double d3, double d4, String str) {
        if (d4 >= d2 && d4 <= d3) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void q(long j2, long j3, long j4) {
        if (j4 >= j2 && j4 <= j3) {
            return;
        }
        throw new IllegalArgumentException(String.format(d, Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void r(long j2, long j3, long j4, String str) {
        if (j4 >= j2 && j4 <= j3) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> void s(T t2, T t3, Comparable<T> comparable) {
        if (comparable.compareTo(t2) >= 0 && comparable.compareTo(t3) <= 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(d, comparable, t2, t3));
    }

    public static <T> void t(T t2, T t3, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t2) >= 0 && comparable.compareTo(t3) <= 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void u(Class<?> cls, Class<?> cls2) {
        String name;
        if (!cls.isAssignableFrom(cls2)) {
            if (cls2 == null) {
                name = "null";
            } else {
                name = cls2.getName();
            }
            throw new IllegalArgumentException(String.format(s, name, cls.getName()));
        }
    }

    public static void v(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void w(Class<?> cls, Object obj) {
        String name;
        if (!cls.isInstance(obj)) {
            String name2 = cls.getName();
            if (obj == null) {
                name = "null";
            } else {
                name = obj.getClass().getName();
            }
            throw new IllegalArgumentException(String.format(t, name2, name));
        }
    }

    public static void x(Class<?> cls, Object obj, String str, Object... objArr) {
        if (cls.isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void y(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(g);
    }

    public static void z(boolean z, String str, double d2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, Double.valueOf(d2)));
    }
}
