package o;

import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Ut  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4460Ut {
    public static final double[][] k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final double[][] l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double[] j = {0.0d, 0.0d, 0.0d};

    public C4460Ut(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
    }

    public static C4460Ut b(int i) {
        return c(i, OI2.k);
    }

    public static C4460Ut c(int i, OI2 oi2) {
        double n = C9448sG.n((16711680 & i) >> 16);
        double n2 = C9448sG.n((65280 & i) >> 8);
        double n3 = C9448sG.n(i & 255);
        return h((0.41233895d * n) + (0.35762064d * n2) + (0.18051042d * n3), (0.2126d * n) + (0.7152d * n2) + (0.0722d * n3), (n * 0.01932141d) + (n2 * 0.11916382d) + (n3 * 0.95034478d), oi2);
    }

    public static C4460Ut d(double d, double d2, double d3) {
        return e(d, d2, d3, OI2.k);
    }

    public static C4460Ut e(double d, double d2, double d3, OI2 oi2) {
        double d4 = d / 100.0d;
        double c = (4.0d / oi2.c()) * Math.sqrt(d4) * (oi2.b() + 4.0d) * oi2.e();
        double e = d2 * oi2.e();
        double sqrt = Math.sqrt(((d2 / Math.sqrt(d4)) * oi2.c()) / (oi2.b() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double log1p = Math.log1p(0.0228d * e) * 43.859649122807014d;
        return new C4460Ut(d3, d2, d, c, e, sqrt, d5, log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    public static C4460Ut f(double d, double d2, double d3) {
        return g(d, d2, d3, OI2.k);
    }

    public static C4460Ut g(double d, double d2, double d3, OI2 oi2) {
        double expm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / oi2.e();
        double atan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return e(d / (1.0d - ((d - 100.0d) * 0.007d)), expm1, atan2, oi2);
    }

    public static C4460Ut h(double d, double d2, double d3, OI2 oi2) {
        double d4;
        double[][] dArr = k;
        double[] dArr2 = dArr[0];
        double d5 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        double d7 = oi2.j()[0] * d5;
        double d8 = oi2.j()[1] * d6;
        double d9 = oi2.j()[2] * ((dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3));
        double pow = Math.pow((oi2.d() * Math.abs(d7)) / 100.0d, 0.42d);
        double pow2 = Math.pow((oi2.d() * Math.abs(d8)) / 100.0d, 0.42d);
        double pow3 = Math.pow((oi2.d() * Math.abs(d9)) / 100.0d, 0.42d);
        double signum = ((Math.signum(d7) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d8) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d9) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d10 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d11 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d12 = signum2 * 20.0d;
        double d13 = (((signum * 20.0d) + d12) + (21.0d * signum3)) / 20.0d;
        double d14 = (((signum * 40.0d) + d12) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d11, d10));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d15 = degrees;
        double radians = Math.toRadians(d15);
        double pow4 = Math.pow((d14 * oi2.g()) / oi2.b(), oi2.c() * oi2.k()) * 100.0d;
        double d16 = pow4 / 100.0d;
        double e = oi2.e() * (4.0d / oi2.c()) * Math.sqrt(d16) * (oi2.b() + 4.0d);
        if (d15 < 20.14d) {
            d4 = d15 + 360.0d;
        } else {
            d4 = d15;
        }
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, oi2.f()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d4) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * oi2.h()) * oi2.i()) * Math.hypot(d10, d11)) / (d13 + 0.305d), 0.9d);
        double sqrt = pow5 * Math.sqrt(d16);
        double e2 = sqrt * oi2.e();
        double sqrt2 = Math.sqrt((pow5 * oi2.c()) / (oi2.b() + 4.0d)) * 50.0d;
        double d17 = (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d);
        double log1p = Math.log1p(0.0228d * e2) * 43.859649122807014d;
        return new C4460Ut(d15, sqrt, pow4, e, e2, sqrt2, d17, log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    public double a(@InterfaceC5670cr1 C4460Ut c4460Ut) {
        double n = n() - c4460Ut.n();
        double i = i() - c4460Ut.i();
        double j = j() - c4460Ut.j();
        return Math.pow(Math.sqrt((n * n) + (i * i) + (j * j)), 0.63d) * 1.41d;
    }

    public double i() {
        return this.h;
    }

    public double j() {
        return this.i;
    }

    public double k() {
        return this.b;
    }

    public double l() {
        return this.a;
    }

    public double m() {
        return this.c;
    }

    public double n() {
        return this.g;
    }

    public double o() {
        return this.e;
    }

    public double p() {
        return this.d;
    }

    public double q() {
        return this.f;
    }

    public int r() {
        return s(OI2.k);
    }

    public int s(OI2 oi2) {
        double[] t = t(oi2, this.j);
        return C9448sG.f(t[0], t[1], t[2]);
    }

    public double[] t(OI2 oi2, double[] dArr) {
        double d;
        if (k() != 0.0d && m() != 0.0d) {
            d = k() / Math.sqrt(m() / 100.0d);
        } else {
            d = 0.0d;
        }
        double pow = Math.pow(d / Math.pow(1.64d - Math.pow(0.29d, oi2.f()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(l());
        double b = oi2.b() * Math.pow(m() / 100.0d, (1.0d / oi2.c()) / oi2.k());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d * 3846.153846153846d * oi2.h() * oi2.i();
        double g = b / oi2.g();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d2 = (((0.305d + g) * 23.0d) * pow) / (((cos * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d3 = cos2 * d2;
        double d4 = d2 * sin;
        double d5 = g * 460.0d;
        double d6 = (((451.0d * d3) + d5) + (288.0d * d4)) / 1403.0d;
        double d7 = ((d5 - (891.0d * d3)) - (261.0d * d4)) / 1403.0d;
        double d8 = ((d5 - (d3 * 220.0d)) - (d4 * 6300.0d)) / 1403.0d;
        double signum = Math.signum(d6) * (100.0d / oi2.d()) * Math.pow(Math.max(0.0d, (Math.abs(d6) * 27.13d) / (400.0d - Math.abs(d6))), 2.380952380952381d);
        double signum2 = Math.signum(d7) * (100.0d / oi2.d()) * Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d);
        double signum3 = Math.signum(d8) * (100.0d / oi2.d()) * Math.pow(Math.max(0.0d, (Math.abs(d8) * 27.13d) / (400.0d - Math.abs(d8))), 2.380952380952381d);
        double d9 = signum / oi2.j()[0];
        double d10 = signum2 / oi2.j()[1];
        double d11 = signum3 / oi2.j()[2];
        double[][] dArr2 = l;
        double[] dArr3 = dArr2[0];
        double d12 = (dArr3[0] * d9) + (dArr3[1] * d10) + (dArr3[2] * d11);
        double[] dArr4 = dArr2[1];
        double d13 = (dArr4[0] * d9) + (dArr4[1] * d10) + (dArr4[2] * d11);
        double[] dArr5 = dArr2[2];
        double d14 = (d9 * dArr5[0]) + (d10 * dArr5[1]) + (d11 * dArr5[2]);
        if (dArr != null) {
            dArr[0] = d12;
            dArr[1] = d13;
            dArr[2] = d14;
            return dArr;
        }
        return new double[]{d12, d13, d14};
    }
}
