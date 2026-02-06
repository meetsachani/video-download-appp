package o;

import java.util.Arrays;

/* renamed from: o.fS */
/* loaded from: classes.dex */
public class C6302fS {
    public static final a b = new a(null);
    public final float[] a;

    /* renamed from: o.fS$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final C6302fS a(float f, float f2, float f3, float f4, float f5, float f6) {
            boolean z;
            float f7;
            float f8;
            float f9;
            float f10 = f3 - f;
            float f11 = f4 - f2;
            long d = C5764dE2.d(f10, f11);
            float f12 = f5 - f;
            float f13 = f6 - f2;
            long d2 = C5764dE2.d(f12, f13);
            long p = C5764dE2.p(d);
            long p2 = C5764dE2.p(d2);
            if (UD1.e(p, f12, f13) >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            float f14 = UD1.f(d, d2);
            if (f14 > 0.999f) {
                return b(f3, f4, f5, f6);
            }
            float e = (((C5764dE2.e(f10, f11) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * f8)) - ((float) Math.sqrt(f7 - (f14 * f14))))) / (1 - f14);
            if (z) {
                f9 = 1.0f;
            } else {
                f9 = -1.0f;
            }
            float f15 = e * f9;
            return C6800hS.a(f3, f4, f3 + (UD1.j(p) * f15), f4 + (UD1.k(p) * f15), f5 - (UD1.j(p2) * f15), f6 - (UD1.k(p2) * f15), f5, f6);
        }

        @InterfaceC9511sW0
        public final C6302fS b(float f, float f2, float f3, float f4) {
            return C6800hS.a(f, f2, C5764dE2.l(f, f3, 0.33333334f), C5764dE2.l(f2, f4, 0.33333334f), C5764dE2.l(f, f3, 0.6666667f), C5764dE2.l(f2, f4, 0.6666667f), f3, f4);
        }

        public a() {
        }
    }

    public C6302fS() {
        this(null, 1, null);
    }

    public static /* synthetic */ void b(C6302fS c6302fS, float[] fArr, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fArr = new float[4];
            }
            if ((i & 2) != 0) {
                z = false;
            }
            c6302fS.a(fArr, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
    }

    @InterfaceC9511sW0
    public static final C6302fS c(float f, float f2, float f3, float f4, float f5, float f6) {
        return b.a(f, f2, f3, f4, f5, f6);
    }

    @InterfaceC9511sW0
    public static final C6302fS s(float f, float f2, float f3, float f4) {
        return b.b(f, f2, f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c7, code lost:
        if (r3 > r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c9, code lost:
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0218, code lost:
        if (r3 > r9) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(float[] fArr, boolean z) {
        char c;
        char c2;
        char c3;
        float f;
        float k;
        float k2;
        float f2;
        C6562gT0.p(fArr, "bounds");
        if (x()) {
            fArr[0] = f();
            fArr[1] = g();
            fArr[2] = f();
            fArr[3] = g();
            return;
        }
        float min = Math.min(f(), h());
        float min2 = Math.min(g(), i());
        float max = Math.max(f(), h());
        float max2 = Math.max(g(), i());
        if (z) {
            fArr[0] = Math.min(min, Math.min(j(), l()));
            fArr[1] = Math.min(min2, Math.min(k(), m()));
            fArr[2] = Math.max(max, Math.max(j(), l()));
            fArr[3] = Math.max(max2, Math.max(k(), m()));
            return;
        }
        float f3 = 3;
        float j = (((-f()) + (j() * f3)) - (l() * f3)) + h();
        float f4 = 2;
        float f5 = 4;
        float f6 = ((f() * f4) - (j() * f5)) + (l() * f4);
        float j2 = (-f()) + j();
        if (w(j)) {
            if (f6 != 0.0f) {
                float f7 = (j2 * f4) / ((-2) * f6);
                if (0.0f <= f7 && f7 <= 1.0f) {
                    float j3 = UD1.j(p(f7));
                    if (j3 < min) {
                        min = j3;
                    }
                    if (j3 > max) {
                        max = j3;
                    }
                }
            }
        } else {
            float f8 = (f6 * f6) - ((f5 * j) * j2);
            if (f8 >= 0.0f) {
                float f9 = -f6;
                c = 0;
                c2 = 3;
                double d = f8;
                c3 = 2;
                f = min2;
                float f10 = j * f4;
                float sqrt = (((float) Math.sqrt(d)) + f9) / f10;
                if (0.0f <= sqrt && sqrt <= 1.0f) {
                    float j4 = UD1.j(p(sqrt));
                    if (j4 < min) {
                        min = j4;
                    }
                    if (j4 > max) {
                        max = j4;
                    }
                }
                float sqrt2 = (f9 - ((float) Math.sqrt(d))) / f10;
                if (0.0f <= sqrt2 && sqrt2 <= 1.0f) {
                    float j5 = UD1.j(p(sqrt2));
                    if (j5 < min) {
                        min = j5;
                    }
                    if (j5 > max) {
                        max = j5;
                    }
                }
                k = (((-g()) + (k() * f3)) - (f3 * m())) + i();
                float g = ((g() * f4) - (k() * f5)) + (m() * f4);
                float k3 = (-g()) + k();
                if (!w(k)) {
                    if (g != 0.0f) {
                        float f11 = (f4 * k3) / ((-2) * g);
                        if (0.0f <= f11 && f11 <= 1.0f) {
                            k2 = UD1.k(p(f11));
                            if (k2 < f) {
                                f2 = k2;
                            } else {
                                f2 = f;
                            }
                        }
                    }
                    f2 = f;
                } else {
                    float f12 = (g * g) - ((f5 * k) * k3);
                    if (f12 >= 0.0f) {
                        float f13 = -g;
                        double d2 = f12;
                        float f14 = f4 * k;
                        float sqrt3 = (((float) Math.sqrt(d2)) + f13) / f14;
                        if (0.0f <= sqrt3 && sqrt3 <= 1.0f) {
                            float k4 = UD1.k(p(sqrt3));
                            if (k4 < f) {
                                f = k4;
                            }
                            if (k4 > max2) {
                                max2 = k4;
                            }
                        }
                        float sqrt4 = (f13 - ((float) Math.sqrt(d2))) / f14;
                        if (0.0f <= sqrt4 && sqrt4 <= 1.0f) {
                            k2 = UD1.k(p(sqrt4));
                            if (k2 < f) {
                                f2 = k2;
                            } else {
                                f2 = f;
                            }
                        }
                    }
                    f2 = f;
                }
                fArr[c] = min;
                fArr[1] = f2;
                fArr[c3] = max;
                fArr[c2] = max2;
            }
        }
        c = 0;
        c2 = 3;
        c3 = 2;
        f = min2;
        k = (((-g()) + (k() * f3)) - (f3 * m())) + i();
        float g2 = ((g() * f4) - (k() * f5)) + (m() * f4);
        float k32 = (-g()) + k();
        if (!w(k)) {
        }
        fArr[c] = min;
        fArr[1] = f2;
        fArr[c3] = max;
        fArr[c2] = max2;
    }

    public final C6302fS d(float f) {
        return t(1.0f / f);
    }

    public final C6302fS e(int i) {
        return d(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6302fS)) {
            return false;
        }
        return Arrays.equals(this.a, ((C6302fS) obj).a);
    }

    public final float f() {
        return this.a[0];
    }

    public final float g() {
        return this.a[1];
    }

    public final float h() {
        return this.a[6];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final float i() {
        return this.a[7];
    }

    public final float j() {
        return this.a[2];
    }

    public final float k() {
        return this.a[3];
    }

    public final float l() {
        return this.a[4];
    }

    public final float m() {
        return this.a[5];
    }

    public final float[] n() {
        return this.a;
    }

    public final C6302fS o(C6302fS c6302fS) {
        C6562gT0.p(c6302fS, W12.e);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.a[i] + c6302fS.a[i];
        }
        return new C6302fS(fArr);
    }

    public final long p(float f) {
        float f2 = 1 - f;
        float f3 = f2 * f2 * f2;
        float f4 = 3 * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = f * f * f;
        return C7638kv0.d((f() * f3) + (j() * f5) + (l() * f6) + (h() * f7), (g() * f3) + (k() * f5) + (m() * f6) + (i() * f7));
    }

    public final C6302fS q() {
        return C6800hS.a(h(), i(), l(), m(), j(), k(), f(), g());
    }

    public final C4180Rx1<C6302fS, C6302fS> r(float f) {
        float f2 = 1 - f;
        long p = p(f);
        float f3 = f2 * f2;
        float f4 = 2 * f2 * f;
        float f5 = f * f;
        return C6670gv2.a(C6800hS.a(f(), g(), (f() * f2) + (j() * f), (g() * f2) + (k() * f), (f() * f3) + (j() * f4) + (l() * f5), (g() * f3) + (k() * f4) + (m() * f5), UD1.j(p), UD1.k(p)), C6800hS.a(UD1.j(p), UD1.k(p), (j() * f3) + (l() * f4) + (h() * f5), (k() * f3) + (m() * f4) + (i() * f5), (l() * f2) + (h() * f), (m() * f2) + (i() * f), h(), i()));
    }

    public final C6302fS t(float f) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.a[i] * f;
        }
        return new C6302fS(fArr);
    }

    public String toString() {
        return "anchor0: (" + f() + C6566gU0.h + g() + ") control0: (" + j() + C6566gU0.h + k() + "), control1: (" + l() + C6566gU0.h + m() + "), anchor1: (" + h() + C6566gU0.h + i() + ')';
    }

    public final C6302fS u(int i) {
        return t(i);
    }

    public final C6302fS v(YD1 yd1) {
        C6562gT0.p(yd1, "f");
        C4043Qm1 c4043Qm1 = new C4043Qm1();
        C4788Ye.H0(this.a, c4043Qm1.n(), 0, 0, 0, 14, null);
        c4043Qm1.z(yd1);
        return c4043Qm1;
    }

    public final boolean w(float f) {
        if (Math.abs(f) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (Math.abs(f() - h()) < 1.0E-4f && Math.abs(g() - i()) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C6302fS(long j, long j2, long j3, long j4, C9516sY c9516sY) {
        this(j, j2, j3, j4);
    }

    public C6302fS(float[] fArr) {
        C6562gT0.p(fArr, "points");
        this.a = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ C6302fS(float[] fArr, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? new float[8] : fArr);
    }

    public C6302fS(long j, long j2, long j3, long j4) {
        this(new float[]{UD1.j(j), UD1.k(j), UD1.j(j2), UD1.k(j2), UD1.j(j3), UD1.k(j3), UD1.j(j4), UD1.k(j4)});
    }
}
