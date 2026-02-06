package o;

import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.sG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9448sG {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final double[] c = {95.047d, 100.0d, 108.883d};

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    public static int b(double d, double d2, double d3) {
        double[] dArr = c;
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = d4 - (d3 / 200.0d);
        return f(m((d2 / 500.0d) + d4) * dArr[0], m(d4) * dArr[1], m(d5) * dArr[2]);
    }

    public static int c(double[] dArr) {
        return e(h(dArr[0]), h(dArr[1]), h(dArr[2]));
    }

    public static int d(double d) {
        int h = h(t(d));
        return e(h, h, h);
    }

    public static int e(int i, int i2, int i3) {
        return ((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255);
    }

    public static int f(double d, double d2, double d3) {
        double[][] dArr = b;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double[] dArr4 = dArr[2];
        return e(h(d4), h((dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3)), h((dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3)));
    }

    public static int g(int i) {
        return i & 255;
    }

    public static int h(double d) {
        double pow;
        double d2 = d / 100.0d;
        if (d2 <= 0.0031308d) {
            pow = d2 * 12.92d;
        } else {
            pow = (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return C8558od1.b(0, 255, (int) Math.round(pow * 255.0d));
    }

    public static int i(int i) {
        return (i >> 8) & 255;
    }

    public static boolean j(int i) {
        if (a(i) >= 255) {
            return true;
        }
        return false;
    }

    public static double k(double d) {
        if (d > 0.008856451679035631d) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] l(int i) {
        double n = n(q(i));
        double n2 = n(i(i));
        double n3 = n(g(i));
        double[][] dArr = a;
        double[] dArr2 = dArr[0];
        double d = (dArr2[0] * n) + (dArr2[1] * n2) + (dArr2[2] * n3);
        double[] dArr3 = dArr[1];
        double d2 = (dArr3[0] * n) + (dArr3[1] * n2) + (dArr3[2] * n3);
        double[] dArr4 = dArr[2];
        double d3 = (dArr4[0] * n) + (dArr4[1] * n2) + (dArr4[2] * n3);
        double[] dArr5 = c;
        double d4 = d / dArr5[0];
        double d5 = d2 / dArr5[1];
        double k = k(d4);
        double k2 = k(d5);
        return new double[]{(116.0d * k2) - 16.0d, (k - k2) * 500.0d, (k2 - k(d3 / dArr5[2])) * 200.0d};
    }

    public static double m(double d) {
        double d2 = d * d * d;
        if (d2 > 0.008856451679035631d) {
            return d2;
        }
        return ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double n(int i) {
        double pow;
        double d = i / 255.0d;
        if (d <= 0.040449936d) {
            pow = d / 12.92d;
        } else {
            pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        return pow * 100.0d;
    }

    public static double o(int i) {
        return (k(s(i)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double p(double d) {
        return (k(d / 100.0d) * 116.0d) - 16.0d;
    }

    public static int q(int i) {
        return (i >> 16) & 255;
    }

    public static double[] r() {
        return c;
    }

    public static double[] s(int i) {
        return C8558od1.e(new double[]{n(q(i)), n(i(i)), n(g(i))}, a);
    }

    public static double t(double d) {
        return m((d + 16.0d) / 116.0d) * 100.0d;
    }
}
