package o;

/* renamed from: o.Vt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4557Vt {
    public static final float j = 0.2f;
    public static final float k = 1.0f;
    public static final float l = 0.4f;
    public static final float m = 0.01f;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public C4557Vt(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static C4557Vt b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C4557Vt c4557Vt = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int t = e(f8, f2, f).t();
            float b = C4654Wt.b(t);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C4557Vt c = c(t);
                float a = c.a(e(c.k(), c.i(), f));
                if (a <= 1.0f) {
                    c4557Vt = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                return c4557Vt;
            }
            if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return c4557Vt;
    }

    public static C4557Vt c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i, PI2.k, fArr, fArr2);
        return new C4557Vt(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i, PI2 pi2, float[] fArr, float[] fArr2) {
        float f;
        float pow;
        C4654Wt.f(i, fArr2);
        float[][] fArr3 = C4654Wt.a;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        float f5 = (fArr4[0] * f2) + (fArr4[1] * f3) + (fArr4[2] * f4);
        float[] fArr5 = fArr3[1];
        float f6 = (fArr5[0] * f2) + (fArr5[1] * f3) + (fArr5[2] * f4);
        float[] fArr6 = fArr3[2];
        float f7 = pi2.i()[0] * f5;
        float f8 = pi2.i()[1] * f6;
        float f9 = pi2.i()[2] * ((f2 * fArr6[0]) + (f3 * fArr6[1]) + (f4 * fArr6[2]));
        float pow2 = (float) Math.pow((pi2.c() * Math.abs(f7)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((pi2.c() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((pi2.c() * Math.abs(f9)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f9) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f10 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f11 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f12 = signum2 * 20.0f;
        float f13 = (((signum * 20.0f) + f12) + (21.0f * signum3)) / 20.0f;
        float f14 = (((signum * 40.0f) + f12) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f11, f10)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f15 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f14 * pi2.f()) / pi2.a(), pi2.b() * pi2.j())) * 100.0f;
        float b = (4.0f / pi2.b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (pi2.a() + 4.0f) * pi2.d();
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float sqrt = ((float) Math.sqrt(pow5 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, pi2.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pi2.g()) * pi2.h()) * ((float) Math.sqrt((f10 * f10) + (f11 * f11)))) / (f13 + 0.305f), 0.9d));
        float d2 = pi2.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((pow * pi2.b()) / (pi2.a() + 4.0f))) * 50.0f;
        float f16 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d2) + 1.0f)) * 43.85965f;
        double d3 = f15;
        float cos = ((float) Math.cos(d3)) * log;
        float sin = log * ((float) Math.sin(d3));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow5;
            fArr[1] = b;
            fArr[2] = d2;
            fArr[3] = sqrt2;
            fArr[4] = f16;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static C4557Vt e(float f, float f2, float f3) {
        return f(f, f2, f3, PI2.k);
    }

    public static C4557Vt f(float f, float f2, float f3, PI2 pi2) {
        double d;
        float b = (4.0f / pi2.b()) * ((float) Math.sqrt(f / 100.0d)) * (pi2.a() + 4.0f) * pi2.d();
        float d2 = pi2.d() * f2;
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * pi2.b()) / (pi2.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new C4557Vt(f3, f2, f, b, d2, sqrt, f4, ((float) Math.cos(d3)) * log, log * ((float) Math.sin(d3)));
    }

    public static void n(int i, float[] fArr) {
        d(i, PI2.k, null, fArr);
        fArr[2] = C4654Wt.b(i);
    }

    public static int q(float f, float f2, float f3) {
        return r(f, f2, f3, PI2.k);
    }

    public static int r(float f, float f2, float f3, PI2 pi2) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            C4557Vt c4557Vt = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4f) {
                C4557Vt b = b(min, f5, f3);
                if (z) {
                    if (b != null) {
                        return b.s(pi2);
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                    z = false;
                } else {
                    if (b == null) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                        c4557Vt = b;
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                }
            }
            if (c4557Vt == null) {
                return C4654Wt.a(f3);
            }
            return c4557Vt.s(pi2);
        }
        return C4654Wt.a(f3);
    }

    public float a(C4557Vt c4557Vt) {
        float l2 = l() - c4557Vt.l();
        float g = g() - c4557Vt.g();
        float h = h() - c4557Vt.h();
        return (float) (Math.pow(Math.sqrt((l2 * l2) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public float m() {
        return this.e;
    }

    public float o() {
        return this.d;
    }

    public float p() {
        return this.f;
    }

    public int s(PI2 pi2) {
        float f;
        float f2;
        if (i() != 0.0d && k() != 0.0d) {
            f = i() / ((float) Math.sqrt(k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, pi2.e()), 0.73d), 1.1111111111111112d);
        double j2 = (j() * 3.1415927f) / 180.0f;
        float a = pi2.a() * ((float) Math.pow(k() / 100.0d, (1.0d / pi2.b()) / pi2.j()));
        float cos = ((float) (Math.cos(2.0d + j2) + 3.8d)) * 0.25f * 3846.1538f * pi2.g() * pi2.h();
        float f3 = a / pi2.f();
        float sin = (float) Math.sin(j2);
        float cos2 = (float) Math.cos(j2);
        float f4 = (((0.305f + f3) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f5 = cos2 * f4;
        float f6 = f4 * sin;
        float f7 = f3 * 460.0f;
        float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
        float signum = Math.signum(f8) * (100.0f / pi2.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum2 = Math.signum(f9) * (100.0f / pi2.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float signum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / pi2.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f10 = signum / pi2.i()[0];
        float f11 = signum2 / pi2.i()[1];
        float f12 = signum3 / pi2.i()[2];
        float[][] fArr = C4654Wt.b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C9205rG.h(f13, (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12), (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    public int t() {
        return s(PI2.k);
    }
}
