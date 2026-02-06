package o;

@InterfaceC10420wF0
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class SE2 {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new UE2();
    }

    public static void b(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Character.valueOf(c)));
    }

    public static void c(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static void d(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static void e(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static void f(boolean z, String str, char c, @MB Object obj) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Character.valueOf(c), obj));
    }

    public static void g(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Integer.valueOf(i)));
    }

    public static void h(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static void i(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void j(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static void k(boolean z, String str, int i, @MB Object obj) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Integer.valueOf(i), obj));
    }

    public static void l(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Long.valueOf(j)));
    }

    public static void m(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static void n(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static void o(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void p(boolean z, String str, long j, @MB Object obj) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, Long.valueOf(j), obj));
    }

    public static void q(boolean z, String str, @MB Object obj) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj));
    }

    public static void r(boolean z, String str, @MB Object obj, char c) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, Character.valueOf(c)));
    }

    public static void s(boolean z, String str, @MB Object obj, int i) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, Integer.valueOf(i)));
    }

    public static void t(boolean z, String str, @MB Object obj, long j) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, Long.valueOf(j)));
    }

    public static void u(boolean z, String str, @MB Object obj, @MB Object obj2) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, obj2));
    }

    public static void v(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, obj2, obj3));
    }

    public static void w(boolean z, String str, @MB Object obj, @MB Object obj2, @MB Object obj3, @MB Object obj4) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, obj, obj2, obj3, obj4));
    }

    public static void x(boolean z, String str, @MB Object... objArr) {
        if (z) {
            return;
        }
        throw new UE2(C6108ef2.e(str, objArr));
    }

    @InterfaceC6181ey
    public static <T> T y(@MB T t) {
        return (T) z(t, "expected a non-null reference", new Object[0]);
    }

    @InterfaceC6181ey
    public static <T> T z(@MB T t, String str, @MB Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new UE2(C6108ef2.e(str, objArr));
    }
}
