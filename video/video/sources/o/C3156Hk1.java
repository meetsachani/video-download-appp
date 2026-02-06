package o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: o.Hk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3156Hk1 extends AS {
    public static final String i = "MonotonicCurveFit";
    public double[] d;
    public double[][] e;
    public double[][] f;
    public boolean g = true;
    public double[] h;

    public C3156Hk1(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.h = new double[length2];
        int i2 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance(cls, i2, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(cls, length, length2);
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                double d = dArr[i5] - dArr[i4];
                double[] dArr5 = dArr3[i4];
                double d2 = (dArr2[i5][i3] - dArr2[i4][i3]) / d;
                dArr5[i3] = d2;
                if (i4 == 0) {
                    dArr4[i4][i3] = d2;
                } else {
                    dArr4[i4][i3] = (dArr3[i4 - 1][i3] + d2) * 0.5d;
                }
                i4 = i5;
            }
            dArr4[i2][i3] = dArr3[length - 2][i3];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                double d3 = dArr3[i6][i7];
                if (d3 == 0.0d) {
                    dArr4[i6][i7] = 0.0d;
                    dArr4[i6 + 1][i7] = 0.0d;
                } else {
                    double d4 = dArr4[i6][i7] / d3;
                    int i8 = i6 + 1;
                    double d5 = dArr4[i8][i7] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i6];
                        double[] dArr7 = dArr3[i6];
                        dArr6[i7] = d4 * d6 * dArr7[i7];
                        dArr4[i8][i7] = d6 * d5 * dArr7[i7];
                    }
                }
            }
        }
        this.d = dArr;
        this.e = dArr2;
        this.f = dArr4;
    }

    public static C3156Hk1 i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i2 = 0;
        while (indexOf2 != -1) {
            dArr[i2] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i2++;
        }
        dArr[i2] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return j(Arrays.copyOf(dArr, i2 + 1));
    }

    public static C3156Hk1 j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            double d2 = dArr[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d2;
            double d3 = i2 * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 1.0d) - d;
            }
        }
        return new C3156Hk1(dArr3, dArr2);
    }

    public static double k(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return ((((((((((-6.0d) * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    public static double l(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return (((((((((((-2.0d) * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d * 2.0d) * d5) * d7)) + (d11 * d2);
    }

    @Override // o.AS
    public double c(double d, int i2) {
        double d2;
        double d3;
        double f;
        double[] dArr = this.d;
        int length = dArr.length;
        int i3 = 0;
        if (this.g) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.e[0][i2];
                d3 = d - d4;
                f = f(d4, i2);
            } else {
                int i4 = length - 1;
                double d5 = dArr[i4];
                if (d >= d5) {
                    d2 = this.e[i4][i2];
                    d3 = d - d5;
                    f = f(d5, i2);
                }
            }
            return d2 + (d3 * f);
        } else if (d <= dArr[0]) {
            return this.e[0][i2];
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                return this.e[i5][i2];
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.d;
            double d6 = dArr2[i3];
            if (d == d6) {
                return this.e[i3][i2];
            }
            int i6 = i3 + 1;
            double d7 = dArr2[i6];
            if (d < d7) {
                double d8 = d7 - d6;
                double d9 = (d - d6) / d8;
                double[][] dArr3 = this.e;
                double d10 = dArr3[i3][i2];
                double d11 = dArr3[i6][i2];
                double[][] dArr4 = this.f;
                return l(d8, d9, d10, d11, dArr4[i3][i2], dArr4[i6][i2]);
            }
            i3 = i6;
        }
        return 0.0d;
    }

    @Override // o.AS
    public void d(double d, double[] dArr) {
        double[] dArr2 = this.d;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.e[0].length;
        if (this.g) {
            double d2 = dArr2[0];
            if (d <= d2) {
                g(d2, this.h);
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = this.e[0][i3] + ((d - this.d[0]) * this.h[i3]);
                }
                return;
            }
            int i4 = length - 1;
            double d3 = dArr2[i4];
            if (d >= d3) {
                g(d3, this.h);
                while (i2 < length2) {
                    dArr[i2] = this.e[i4][i2] + ((d - this.d[i4]) * this.h[i2]);
                    i2++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                dArr[i5] = this.e[0][i5];
            }
            return;
        } else {
            int i6 = length - 1;
            if (d >= dArr2[i6]) {
                while (i2 < length2) {
                    dArr[i2] = this.e[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d == this.d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.e[i7][i8];
                }
            }
            double[] dArr3 = this.d;
            int i9 = i7 + 1;
            double d4 = dArr3[i9];
            if (d < d4) {
                double d5 = dArr3[i7];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i2 < length2) {
                    double[][] dArr4 = this.e;
                    double d8 = dArr4[i7][i2];
                    double d9 = dArr4[i9][i2];
                    double[][] dArr5 = this.f;
                    dArr[i2] = l(d6, d7, d8, d9, dArr5[i7][i2], dArr5[i9][i2]);
                    i2++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // o.AS
    public void e(double d, float[] fArr) {
        double[] dArr = this.d;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.e[0].length;
        if (this.g) {
            double d2 = dArr[0];
            if (d <= d2) {
                g(d2, this.h);
                for (int i3 = 0; i3 < length2; i3++) {
                    fArr[i3] = (float) (this.e[0][i3] + ((d - this.d[0]) * this.h[i3]));
                }
                return;
            }
            int i4 = length - 1;
            double d3 = dArr[i4];
            if (d >= d3) {
                g(d3, this.h);
                while (i2 < length2) {
                    fArr[i2] = (float) (this.e[i4][i2] + ((d - this.d[i4]) * this.h[i2]));
                    i2++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = (float) this.e[0][i5];
            }
            return;
        } else {
            int i6 = length - 1;
            if (d >= dArr[i6]) {
                while (i2 < length2) {
                    fArr[i2] = (float) this.e[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d == this.d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.e[i7][i8];
                }
            }
            double[] dArr2 = this.d;
            int i9 = i7 + 1;
            double d4 = dArr2[i9];
            if (d < d4) {
                double d5 = dArr2[i7];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i2 < length2) {
                    double[][] dArr3 = this.e;
                    double d8 = dArr3[i7][i2];
                    double d9 = dArr3[i9][i2];
                    double[][] dArr4 = this.f;
                    fArr[i2] = (float) l(d6, d7, d8, d9, dArr4[i7][i2], dArr4[i9][i2]);
                    i2++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // o.AS
    public double f(double d, int i2) {
        double[] dArr = this.d;
        int length = dArr.length;
        int i3 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.d;
            int i4 = i3 + 1;
            double d3 = dArr2[i4];
            if (d2 <= d3) {
                double d4 = dArr2[i3];
                double d5 = d3 - d4;
                double[][] dArr3 = this.e;
                double d6 = dArr3[i3][i2];
                double d7 = dArr3[i4][i2];
                double[][] dArr4 = this.f;
                return k(d5, (d2 - d4) / d5, d6, d7, dArr4[i3][i2], dArr4[i4][i2]) / d5;
            }
            i3 = i4;
        }
        return 0.0d;
    }

    @Override // o.AS
    public void g(double d, double[] dArr) {
        double[] dArr2 = this.d;
        int length = dArr2.length;
        int length2 = this.e[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.d;
            int i3 = i2 + 1;
            double d3 = dArr3[i3];
            if (d2 <= d3) {
                double d4 = dArr3[i2];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.e;
                    double d7 = dArr4[i2][i4];
                    double d8 = dArr4[i3][i4];
                    double[][] dArr5 = this.f;
                    dArr[i4] = k(d5, d6, d7, d8, dArr5[i2][i4], dArr5[i3][i4]) / d5;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // o.AS
    public double[] h() {
        return this.d;
    }
}
