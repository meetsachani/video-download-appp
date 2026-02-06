package o;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class KI0 {
    public int a;
    public a[][] b;
    public int c;
    public double[] d;
    public double e;
    public double[][] f;

    /* loaded from: classes.dex */
    public static class a {
        public double a;
        public double b;
        public double c;
        public double d;

        public a(double d, double d2, double d3, double d4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public double a(double d) {
            return (((((this.d * d) + this.c) * d) + this.b) * d) + this.a;
        }

        public double b(double d) {
            return (((this.d * 3.0d * d) + (this.c * 2.0d)) * d) + this.b;
        }
    }

    public KI0(double[][] dArr) {
        g(dArr);
    }

    public static a[] b(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i2 = i - 1;
        int i3 = 0;
        dArr2[0] = 0.5d;
        int i4 = 1;
        for (int i5 = 1; i5 < i2; i5++) {
            dArr2[i5] = 1.0d / (4.0d - dArr2[i5 - 1]);
        }
        int i6 = i - 2;
        dArr2[i2] = 1.0d / (2.0d - dArr2[i6]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i4 < i2) {
            int i7 = i4 + 1;
            int i8 = i4 - 1;
            dArr3[i4] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
            i4 = i7;
        }
        double d = (((dArr[i2] - dArr[i6]) * 3.0d) - dArr3[i6]) * dArr2[i2];
        dArr3[i2] = d;
        dArr4[i2] = d;
        while (i6 >= 0) {
            dArr4[i6] = dArr3[i6] - (dArr2[i6] * dArr4[i6 + 1]);
            i6--;
        }
        a[] aVarArr = new a[i2];
        while (i3 < i2) {
            double d2 = dArr[i3];
            double d3 = dArr4[i3];
            int i9 = i3 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            aVarArr[i3] = new a((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i3 = i9;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i;
        int length = aVarArr.length;
        double[] dArr = new double[length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < length) {
                double d5 = dArr[i];
                double a2 = aVarArr[i].a(d2);
                dArr[i] = a2;
                double d6 = d5 - a2;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < length) {
            double d7 = dArr[i];
            double a3 = aVarArr[i].a(1.0d);
            dArr[i] = a3;
            double d8 = d7 - a3;
            d += d8 * d8;
            i++;
        }
        return d3 + Math.sqrt(d);
    }

    public double c(double d, int i) {
        double[] dArr;
        double d2 = d * this.e;
        int i2 = 0;
        while (true) {
            dArr = this.d;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.b[i][i2].a(d2 / dArr[i2]);
    }

    public void d(double d, double[] dArr) {
        double d2 = d * this.e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.b[i2][i].a(d2 / this.d[i]);
        }
    }

    public void e(double d, float[] fArr) {
        double d2 = d * this.e;
        int i = 0;
        while (true) {
            double[] dArr = this.d;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.b[i2][i].a(d2 / this.d[i]);
        }
    }

    public void f(double d, double[] dArr) {
        double d2 = d * this.e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.b[i2][i].b(d2 / this.d[i]);
        }
    }

    public void g(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.c = length;
        int length2 = dArr.length;
        this.a = length2;
        this.f = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        this.b = new a[this.c];
        for (int i2 = 0; i2 < this.c; i2++) {
            for (int i3 = 0; i3 < this.a; i3++) {
                this.f[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.c;
            if (i4 >= i) {
                break;
            }
            a[][] aVarArr = this.b;
            double[] dArr2 = this.f[i4];
            aVarArr[i4] = b(dArr2.length, dArr2);
            i4++;
        }
        this.d = new double[this.a - 1];
        this.e = 0.0d;
        a[] aVarArr2 = new a[i];
        for (int i5 = 0; i5 < this.d.length; i5++) {
            for (int i6 = 0; i6 < this.c; i6++) {
                aVarArr2[i6] = this.b[i6][i5];
            }
            double d = this.e;
            double[] dArr3 = this.d;
            double a2 = a(aVarArr2);
            dArr3[i5] = a2;
            this.e = d + a2;
        }
    }

    public KI0() {
    }
}
