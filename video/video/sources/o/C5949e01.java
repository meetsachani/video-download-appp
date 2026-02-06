package o;

/* renamed from: o.e01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5949e01 extends AS {
    public static final String i = "LinearCurveFit";
    public double[] d;
    public double[][] e;
    public double f;
    public boolean g = true;
    public double[] h;

    public C5949e01(double[] dArr, double[][] dArr2) {
        this.f = Double.NaN;
        int length = dArr2[0].length;
        this.h = new double[length];
        this.d = dArr;
        this.e = dArr2;
        if (length > 2) {
            int i2 = 0;
            double d = 0.0d;
            while (true) {
                double d2 = d;
                if (i2 < dArr.length) {
                    double d3 = dArr2[i2][0];
                    if (i2 > 0) {
                        Math.hypot(d3 - d, d3 - d2);
                    }
                    i2++;
                    d = d3;
                } else {
                    this.f = 0.0d;
                    return;
                }
            }
        }
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
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.e;
                return (dArr3[i3][i2] * (1.0d - d8)) + (dArr3[i6][i2] * d8);
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
                double d6 = (d - d5) / (d4 - d5);
                while (i2 < length2) {
                    double[][] dArr4 = this.e;
                    dArr[i2] = (dArr4[i7][i2] * (1.0d - d6)) + (dArr4[i9][i2] * d6);
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
                double d6 = (d - d5) / (d4 - d5);
                while (i2 < length2) {
                    double[][] dArr3 = this.e;
                    fArr[i2] = (float) ((dArr3[i7][i2] * (1.0d - d6)) + (dArr3[i9][i2] * d6));
                    i2++;
                }
                return;
            }
            i7 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8 >= r3) goto L3;
     */
    @Override // o.AS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double f(double d, int i2) {
        double[] dArr = this.d;
        int length = dArr.length;
        int i3 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
        }
        d = d2;
        while (i3 < length - 1) {
            double[] dArr2 = this.d;
            int i4 = i3 + 1;
            double d3 = dArr2[i4];
            if (d <= d3) {
                double d4 = d3 - dArr2[i3];
                double[][] dArr3 = this.e;
                return (dArr3[i4][i2] - dArr3[i3][i2]) / d4;
            }
            i3 = i4;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r13 >= r4) goto L3;
     */
    @Override // o.AS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(double d, double[] dArr) {
        double[] dArr2 = this.d;
        int length = dArr2.length;
        int length2 = this.e[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
        }
        d = d2;
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.d;
            int i3 = i2 + 1;
            double d3 = dArr3[i3];
            if (d <= d3) {
                double d4 = d3 - dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.e;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d4;
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

    public final double i(double d) {
        if (Double.isNaN(this.f)) {
            return 0.0d;
        }
        double[] dArr = this.d;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return 0.0d;
        }
        int i2 = length - 1;
        if (d >= dArr[i2]) {
            return this.f;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i3 = 0;
        while (i3 < i2) {
            double[] dArr2 = this.e[i3];
            double d5 = dArr2[0];
            double d6 = dArr2[1];
            if (i3 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.d;
            double d7 = dArr3[i3];
            if (d == d7) {
                return d2;
            }
            int i4 = i3 + 1;
            double d8 = dArr3[i4];
            if (d < d8) {
                double d9 = (d - d7) / (d8 - d7);
                double[][] dArr4 = this.e;
                double[] dArr5 = dArr4[i3];
                double d10 = dArr5[0];
                double[] dArr6 = dArr4[i4];
                double d11 = 1.0d - d9;
                return d2 + Math.hypot(d6 - ((dArr5[1] * d11) + (dArr6[1] * d9)), d5 - ((d10 * d11) + (dArr6[0] * d9)));
            }
            i3 = i4;
            d3 = d5;
            d4 = d6;
        }
        return 0.0d;
    }
}
