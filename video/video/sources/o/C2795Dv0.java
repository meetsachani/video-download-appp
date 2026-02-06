package o;

/* renamed from: o.Dv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2795Dv0 {
    public static final C5169an1 a = new C5169an1(0);
    public static final float[] b = new float[0];

    public static final AbstractC2697Cv0 a() {
        return a;
    }

    public static final AbstractC2697Cv0 b() {
        return a;
    }

    public static final AbstractC2697Cv0 c(float f) {
        return j(f);
    }

    public static final AbstractC2697Cv0 d(float f, float f2) {
        return k(f, f2);
    }

    public static final AbstractC2697Cv0 e(float f, float f2, float f3) {
        return l(f, f2, f3);
    }

    public static final AbstractC2697Cv0 f(float... fArr) {
        C6562gT0.p(fArr, "elements");
        C5169an1 c5169an1 = new C5169an1(fArr.length);
        c5169an1.V(fArr);
        return c5169an1;
    }

    public static final float[] g() {
        return b;
    }

    public static final int h(float f) {
        int hashCode = Float.hashCode(f) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    public static final C5169an1 i() {
        return new C5169an1(0, 1, null);
    }

    public static final C5169an1 j(float f) {
        C5169an1 c5169an1 = new C5169an1(1);
        c5169an1.T(f);
        return c5169an1;
    }

    public static final C5169an1 k(float f, float f2) {
        C5169an1 c5169an1 = new C5169an1(2);
        c5169an1.T(f);
        c5169an1.T(f2);
        return c5169an1;
    }

    public static final C5169an1 l(float f, float f2, float f3) {
        C5169an1 c5169an1 = new C5169an1(3);
        c5169an1.T(f);
        c5169an1.T(f2);
        c5169an1.T(f3);
        return c5169an1;
    }

    public static final C5169an1 m(float... fArr) {
        C6562gT0.p(fArr, "elements");
        C5169an1 c5169an1 = new C5169an1(fArr.length);
        c5169an1.V(fArr);
        return c5169an1;
    }
}
