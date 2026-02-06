package o;

import android.graphics.Color;
import java.util.Objects;

/* renamed from: o.rG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9205rG {
    public static final double a = 95.047d;
    public static final double b = 100.0d;
    public static final double c = 108.883d;
    public static final double d = 0.008856d;
    public static final double e = 903.3d;
    public static final int f = 10;
    public static final int g = 1;
    public static final ThreadLocal<double[]> h = new ThreadLocal<>();

    /* renamed from: o.rG$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Color a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                float f = alpha + alpha2;
                components2[componentCount] = f;
                if (f > 0.0f) {
                    alpha /= f;
                    alpha2 /= f;
                }
                for (int i = 0; i < componentCount; i++) {
                    components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + C9811tl1.d);
        }
    }

    public static double A(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static double[] B() {
        ThreadLocal<double[]> threadLocal = h;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    public static double C(double d2) {
        if (d2 > 0.008856d) {
            return Math.pow(d2, 0.3333333333333333d);
        }
        return ((d2 * 903.3d) + 16.0d) / 116.0d;
    }

    public static int D(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & C6516gH2.x) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int a(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float abs = (1.0f - Math.abs((f4 * 2.0f) - 1.0f)) * f3;
        float f5 = f4 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f2) / 60) {
            case 0:
                round = Math.round((abs + f5) * 255.0f);
                round2 = Math.round((abs2 + f5) * 255.0f);
                round3 = Math.round(f5 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f5) * 255.0f);
                round2 = Math.round((abs + f5) * 255.0f);
                round3 = Math.round(f5 * 255.0f);
                break;
            case 2:
                round = Math.round(f5 * 255.0f);
                round2 = Math.round((abs + f5) * 255.0f);
                round3 = Math.round((abs2 + f5) * 255.0f);
                break;
            case 3:
                round = Math.round(f5 * 255.0f);
                round2 = Math.round((abs2 + f5) * 255.0f);
                round3 = Math.round((abs + f5) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f5) * 255.0f);
                round2 = Math.round(f5 * 255.0f);
                round3 = Math.round((abs + f5) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f5) * 255.0f);
                round2 = Math.round(f5 * 255.0f);
                round3 = Math.round((abs2 + f5) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(z(round, 0, 255), z(round2, 0, 255), z(round3, 0, 255));
    }

    public static int b(double d2, double d3, double d4) {
        double[] B = B();
        c(d2, d3, d4, B);
        return h(B[0], B[1], B[2]);
    }

    public static void c(double d2, double d3, double d4, double[] dArr) {
        double d5;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = (d3 / 500.0d) + d6;
        double d8 = d6 - (d4 / 200.0d);
        double pow = Math.pow(d7, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d7 * 116.0d) - 16.0d) / 903.3d;
        }
        if (d2 > 7.9996247999999985d) {
            d5 = Math.pow(d6, 3.0d);
        } else {
            d5 = d2 / 903.3d;
        }
        double pow2 = Math.pow(d8, 3.0d);
        if (pow2 <= 0.008856d) {
            pow2 = ((d8 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = d5 * 100.0d;
        dArr[2] = pow2 * 108.883d;
    }

    public static int d(float f2, float f3, float f4) {
        return C4557Vt.q(f2, f3, f4);
    }

    public static void e(int i, int i2, int i3, float[] fArr) {
        float f2;
        float abs;
        float f3 = i / 255.0f;
        float f4 = i2 / 255.0f;
        float f5 = i3 / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f3) {
                f2 = ((f4 - f5) / f6) % 6.0f;
            } else if (max == f4) {
                f2 = ((f5 - f3) / f6) + 2.0f;
            } else {
                f2 = 4.0f + ((f3 - f4) / f6);
            }
            abs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = y(f8, 0.0f, 360.0f);
        fArr[1] = y(abs, 0.0f, 1.0f);
        fArr[2] = y(f7, 0.0f, 1.0f);
    }

    public static void f(int i, int i2, int i3, double[] dArr) {
        g(i, i2, i3, dArr);
        i(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void g(int i, int i2, int i3, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d2 = i / 255.0d;
            if (d2 < 0.04045d) {
                pow = d2 / 12.92d;
            } else {
                pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = i2 / 255.0d;
            if (d3 < 0.04045d) {
                pow2 = d3 / 12.92d;
            } else {
                pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            double d4 = i3 / 255.0d;
            if (d4 < 0.04045d) {
                pow3 = d4 / 12.92d;
            } else {
                pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int h(double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8 = (((3.2406d * d2) + ((-1.5372d) * d3)) + ((-0.4986d) * d4)) / 100.0d;
        double d9 = ((((-0.9689d) * d2) + (1.8758d * d3)) + (0.0415d * d4)) / 100.0d;
        double d10 = (((0.0557d * d2) + ((-0.204d) * d3)) + (1.057d * d4)) / 100.0d;
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        return Color.rgb(z((int) Math.round(d5 * 255.0d), 0, 255), z((int) Math.round(d6 * 255.0d), 0, 255), z((int) Math.round(d7 * 255.0d), 0, 255));
    }

    public static void i(double d2, double d3, double d4, double[] dArr) {
        if (dArr.length == 3) {
            double C = C(d2 / 95.047d);
            double C2 = C(d3 / 100.0d);
            double C3 = C(d4 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * C2) - 16.0d);
            dArr[1] = (C - C2) * 500.0d;
            dArr[2] = (C2 - C3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    public static int j(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i) * f3) + (Color.alpha(i2) * f2)), (int) ((Color.red(i) * f3) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f3) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f3) + (Color.blue(i2) * f2)));
    }

    public static void k(float[] fArr, float[] fArr2, float f2, float[] fArr3) {
        if (fArr3.length == 3) {
            float f3 = 1.0f - f2;
            fArr3[0] = p(fArr[0], fArr2[0], f2);
            fArr3[1] = (fArr[1] * f3) + (fArr2[1] * f2);
            fArr3[2] = (fArr[2] * f3) + (fArr2[2] * f2);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void l(double[] dArr, double[] dArr2, double d2, double[] dArr3) {
        if (dArr3.length == 3) {
            double d3 = 1.0d - d2;
            dArr3[0] = (dArr[0] * d3) + (dArr2[0] * d2);
            dArr3[1] = (dArr[1] * d3) + (dArr2[1] * d2);
            dArr3[2] = (dArr[2] * d3) + (dArr2[2] * d2);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double m(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = v(i, i2);
            }
            double n = n(i) + 0.05d;
            double n2 = n(i2) + 0.05d;
            return Math.max(n, n2) / Math.min(n, n2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static double n(int i) {
        double[] B = B();
        t(i, B);
        return B[1] / 100.0d;
    }

    public static int o(int i, int i2, float f2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d2 = f2;
            if (m(D(i, 255), i2) < d2) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m(D(i, i6), i2) < d2) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static float p(float f2, float f3, float f4) {
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > f2) {
                f2 += 360.0f;
            } else {
                f3 += 360.0f;
            }
        }
        return (f2 + ((f3 - f2) * f4)) % 360.0f;
    }

    public static void q(int i, float[] fArr) {
        e(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void r(int i, double[] dArr) {
        f(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void s(int i, float[] fArr) {
        C4557Vt.n(i, fArr);
    }

    public static void t(int i, double[] dArr) {
        g(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static int u(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int v(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int u = u(alpha2, alpha);
        return Color.argb(u, x(Color.red(i), alpha2, Color.red(i2), alpha, u), x(Color.green(i), alpha2, Color.green(i2), alpha, u), x(Color.blue(i), alpha2, Color.blue(i2), alpha, u));
    }

    public static Color w(Color color, Color color2) {
        return a.a(color, color2);
    }

    public static int x(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static float y(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        return Math.min(f2, f4);
    }

    public static int z(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return Math.min(i, i3);
    }
}
