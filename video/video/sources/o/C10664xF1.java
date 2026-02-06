package o;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.xF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10664xF1 {
    public static void A(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3, @MB Object obj4) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, obj2, obj3, obj4));
    }

    public static void A0(boolean z, String str, @MB Object obj, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, Long.valueOf(j)));
    }

    public static void B(boolean z, String str, @MB Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, objArr));
    }

    public static void B0(boolean z, String str, @MB Object obj, @MB Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, obj2));
    }

    @InterfaceC6181ey
    public static int C(int i, int i2) {
        return D(i, i2, "index");
    }

    public static void C0(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, obj2, obj3));
    }

    @InterfaceC6181ey
    public static int D(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(a(i, i2, str));
    }

    public static void D0(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3, @MB Object obj4) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, obj2, obj3, obj4));
    }

    @InterfaceC6181ey
    public static <T> T E(@MB T t) {
        t.getClass();
        return t;
    }

    public static void E0(boolean z, @MB String str, @MB Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, objArr));
    }

    @InterfaceC6181ey
    public static <T> T F(@MB T t, @MB Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @InterfaceC6181ey
    public static <T> T G(@MB T t, String str, char c) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Character.valueOf(c)));
    }

    @InterfaceC6181ey
    public static <T> T H(@MB T t, String str, char c, char c2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    @InterfaceC6181ey
    public static <T> T I(@MB T t, String str, char c, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    @InterfaceC6181ey
    public static <T> T J(@MB T t, String str, char c, long j) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Character.valueOf(c), Long.valueOf(j)));
    }

    @InterfaceC6181ey
    public static <T> T K(@MB T t, String str, char c, @MB Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Character.valueOf(c), obj));
    }

    @InterfaceC6181ey
    public static <T> T L(@MB T t, String str, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Integer.valueOf(i)));
    }

    @InterfaceC6181ey
    public static <T> T M(@MB T t, String str, int i, char c) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    @InterfaceC6181ey
    public static <T> T N(@MB T t, String str, int i, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @InterfaceC6181ey
    public static <T> T O(@MB T t, String str, int i, long j) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    @InterfaceC6181ey
    public static <T> T P(@MB T t, String str, int i, @MB Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Integer.valueOf(i), obj));
    }

    @InterfaceC6181ey
    public static <T> T Q(@MB T t, String str, long j) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Long.valueOf(j)));
    }

    @InterfaceC6181ey
    public static <T> T R(@MB T t, String str, long j, char c) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Long.valueOf(j), Character.valueOf(c)));
    }

    @InterfaceC6181ey
    public static <T> T S(@MB T t, String str, long j, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    @InterfaceC6181ey
    public static <T> T T(@MB T t, String str, long j, long j2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    @InterfaceC6181ey
    public static <T> T U(@MB T t, String str, long j, @MB Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, Long.valueOf(j), obj));
    }

    @InterfaceC6181ey
    public static <T> T V(@MB T t, String str, @MB Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj));
    }

    @InterfaceC6181ey
    public static <T> T W(@MB T t, String str, @MB Object obj, char c) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, Character.valueOf(c)));
    }

    @InterfaceC6181ey
    public static <T> T X(@MB T t, String str, @MB Object obj, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, Integer.valueOf(i)));
    }

    @InterfaceC6181ey
    public static <T> T Y(@MB T t, String str, @MB Object obj, long j) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, Long.valueOf(j)));
    }

    @InterfaceC6181ey
    public static <T> T Z(@MB T t, String str, @MB Object obj, @MB Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, obj2));
    }

    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return C6108ef2.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C6108ef2.e("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @InterfaceC6181ey
    public static <T> T a0(@MB T t, String str, @MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, obj2, obj3));
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return C6108ef2.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C6108ef2.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @InterfaceC6181ey
    public static <T> T b0(@MB T t, String str, @MB Object obj, @MB Object obj2, @MB Object obj3, @MB Object obj4) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, obj, obj2, obj3, obj4));
    }

    public static String c(int i, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                return C6108ef2.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            return b(i2, i3, "end index");
        }
        return b(i, i3, "start index");
    }

    @InterfaceC6181ey
    public static <T> T c0(@MB T t, String str, @MB Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6108ef2.e(str, objArr));
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @InterfaceC6181ey
    public static int d0(int i, int i2) {
        return e0(i, i2, "index");
    }

    public static void e(boolean z, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @InterfaceC6181ey
    public static int e0(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(b(i, i2, str));
    }

    public static void f(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Character.valueOf(c)));
    }

    public static void f0(int i, int i2, int i3) {
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException(c(i, i2, i3));
    }

    public static void g(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static void g0(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void h(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static void h0(boolean z, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void i(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static void i0(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Character.valueOf(c)));
    }

    public static void j(boolean z, String str, char c, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Character.valueOf(c), obj));
    }

    public static void j0(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static void k(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Integer.valueOf(i)));
    }

    public static void k0(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static void l(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static void l0(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static void m(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void m0(boolean z, String str, char c, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Character.valueOf(c), obj));
    }

    public static void n(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static void n0(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Integer.valueOf(i)));
    }

    public static void o(boolean z, String str, int i, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Integer.valueOf(i), obj));
    }

    public static void o0(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static void p(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Long.valueOf(j)));
    }

    public static void p0(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void q(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static void q0(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static void r(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static void r0(boolean z, String str, int i, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Integer.valueOf(i), obj));
    }

    public static void s(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void s0(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Long.valueOf(j)));
    }

    public static void t(boolean z, String str, long j, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, Long.valueOf(j), obj));
    }

    public static void t0(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static void u(boolean z, String str, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj));
    }

    public static void u0(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static void v(boolean z, String str, @MB Object obj, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, Character.valueOf(c)));
    }

    public static void v0(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void w(boolean z, String str, @MB Object obj, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, Integer.valueOf(i)));
    }

    public static void w0(boolean z, String str, long j, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, Long.valueOf(j), obj));
    }

    public static void x(boolean z, String str, @MB Object obj, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, Long.valueOf(j)));
    }

    public static void x0(boolean z, String str, @MB Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj));
    }

    public static void y(boolean z, String str, @MB Object obj, @MB Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, obj2));
    }

    public static void y0(boolean z, String str, @MB Object obj, char c) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, Character.valueOf(c)));
    }

    public static void z(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C6108ef2.e(str, obj, obj2, obj3));
    }

    public static void z0(boolean z, String str, @MB Object obj, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C6108ef2.e(str, obj, Integer.valueOf(i)));
    }
}
