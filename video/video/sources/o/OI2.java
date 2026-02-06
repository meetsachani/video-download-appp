package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class OI2 {
    public static final OI2 k = a(50.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    public OI2(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }

    public static OI2 a(double d) {
        return l(C9448sG.r(), (C9448sG.t(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static OI2 l(double[] dArr, double d, double d2, double d3, boolean z) {
        double d4;
        double d5;
        double exp;
        double max = Math.max(0.1d, d2);
        double[][] dArr2 = C4460Ut.k;
        double d6 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d7 = dArr[1];
        double d8 = dArr[2];
        double d9 = (dArr3[0] * d6) + (dArr3[1] * d7) + (dArr3[2] * d8);
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[0] * d6) + (dArr4[1] * d7) + (dArr4[2] * d8);
        double[] dArr5 = dArr2[2];
        double d11 = (d6 * dArr5[0]) + (d7 * dArr5[1]) + (d8 * dArr5[2]);
        double d12 = (d3 / 10.0d) + 0.8d;
        if (d12 >= 0.9d) {
            d4 = C8558od1.d(0.59d, 0.69d, (d12 - 0.9d) * 10.0d);
        } else {
            d4 = C8558od1.d(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        }
        double d13 = d4;
        if (z) {
            d5 = 0.1d;
            exp = 1.0d;
        } else {
            d5 = 0.1d;
            exp = (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12;
        }
        double a = C8558od1.a(0.0d, 1.0d, exp);
        double[] dArr6 = {(((100.0d / d9) * a) + 1.0d) - a, (((100.0d / d10) * a) + 1.0d) - a, (((100.0d / d11) * a) + 1.0d) - a};
        double d14 = 5.0d * d;
        double d15 = 1.0d / (d14 + 1.0d);
        double d16 = d15 * d15 * d15 * d15;
        double d17 = 1.0d - d16;
        double cbrt = (d16 * d) + (d17 * d5 * d17 * Math.cbrt(d14));
        double t = C9448sG.t(max) / dArr[1];
        double sqrt = Math.sqrt(t) + 1.48d;
        double pow = 0.725d / Math.pow(t, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d10) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d11) / 100.0d, 0.42d)};
        double d18 = dArr7[0];
        double d19 = (d18 * 400.0d) / (d18 + 27.13d);
        double d20 = dArr7[1];
        double d21 = (d20 * 400.0d) / (d20 + 27.13d);
        double d22 = dArr7[2];
        double[] dArr8 = {d19, d21, (400.0d * d22) / (d22 + 27.13d)};
        return new OI2(t, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * pow, pow, pow, d13, d12, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double b() {
        return this.a;
    }

    public double c() {
        return this.d;
    }

    public double d() {
        return this.h;
    }

    public double e() {
        return this.i;
    }

    public double f() {
        return this.f;
    }

    public double g() {
        return this.b;
    }

    public double h() {
        return this.e;
    }

    public double i() {
        return this.c;
    }

    public double[] j() {
        return this.g;
    }

    public double k() {
        return this.j;
    }
}
