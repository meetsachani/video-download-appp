package o;

/* renamed from: o.dE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5764dE2 {
    public static final float a = 1.0E-4f;
    public static final float b = 1.0E-6f;
    public static final long c = C7638kv0.d(0.0f, 0.0f);
    public static final float d = 3.1415927f;
    public static final float e = 6.2831855f;
    public static final boolean f = false;

    public static final float a(float f2, float f3) {
        float f4 = e;
        return (((float) Math.atan2(f3, f2)) + f4) % f4;
    }

    public static final void b(String str, FA0<String> fa0) {
        C6562gT0.p(str, "tag");
        C6562gT0.p(fa0, "messageFactory");
    }

    public static final long c(float f2) {
        double d2 = f2;
        return C7638kv0.d((float) Math.cos(d2), (float) Math.sin(d2));
    }

    public static final long d(float f2, float f3) {
        float e2 = e(f2, f3);
        if (e2 > 0.0f) {
            return C7638kv0.d(f2 / e2, f3 / e2);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float e(float f2, float f3) {
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    public static final float f(float f2, float f3) {
        return (f2 * f2) + (f3 * f3);
    }

    public static final float g(float f2, float f3, float f4, InterfaceC9842tt0 interfaceC9842tt0) {
        C6562gT0.p(interfaceC9842tt0, "f");
        while (f3 - f2 > f4) {
            float f5 = 2;
            float f6 = 3;
            float f7 = ((f5 * f2) + f3) / f6;
            float f8 = ((f5 * f3) + f2) / f6;
            if (interfaceC9842tt0.a(f7) < interfaceC9842tt0.a(f8)) {
                f3 = f8;
            } else {
                f2 = f7;
            }
        }
        return (f2 + f3) / 2;
    }

    public static /* synthetic */ float h(float f2, float f3, float f4, InterfaceC9842tt0 interfaceC9842tt0, int i, Object obj) {
        if ((i & 4) != 0) {
            f4 = 0.001f;
        }
        return g(f2, f3, f4, interfaceC9842tt0);
    }

    public static final float i() {
        return d;
    }

    public static final float j() {
        return e;
    }

    public static final long k() {
        return c;
    }

    public static final float l(float f2, float f3, float f4) {
        return ((1 - f4) * f2) + (f4 * f3);
    }

    public static final float m(float f2, float f3) {
        return ((f2 % f3) + f3) % f3;
    }

    public static final long n(float f2, float f3, long j) {
        return UD1.n(UD1.p(c(f3), f2), j);
    }

    public static /* synthetic */ long o(float f2, float f3, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = c;
        }
        return n(f2, f3, j);
    }

    public static final long p(long j) {
        return C7638kv0.d(-UD1.k(j), UD1.j(j));
    }

    public static final float q(float f2) {
        return f2 * f2;
    }
}
