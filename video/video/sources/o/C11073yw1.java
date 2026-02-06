package o;

import java.util.Arrays;

/* renamed from: o.yw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11073yw1 {
    public static String i = "Oscillator";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f924o = 5;
    public static final int p = 6;
    public static final int q = 7;
    public double[] c;
    public String d;
    public C3156Hk1 e;
    public int f;
    public float[] a = new float[0];
    public double[] b = new double[0];
    public double g = 6.283185307179586d;
    public boolean h = false;

    public void a(double d, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d;
        this.a[binarySearch] = f;
        this.h = false;
    }

    public double b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.a;
        float f = fArr[binarySearch];
        int i2 = binarySearch - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.b;
        double d3 = dArr[binarySearch];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return (d * d5) + (f2 - (d5 * d4));
    }

    public double c(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.a;
        float f = fArr[binarySearch];
        int i2 = binarySearch - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.b;
        double d3 = dArr[binarySearch];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return this.c[i2] + ((f2 - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    public double d(double d, double d2, double d3) {
        double c = d2 + c(d);
        double b = b(d) + d3;
        switch (this.f) {
            case 1:
                return 0.0d;
            case 2:
                return b * 4.0d * Math.signum((((c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b * 2.0d;
            case 4:
                return (-b) * 2.0d;
            case 5:
                double d4 = this.g;
                return (-d4) * b * Math.sin(d4 * c);
            case 6:
                return b * 4.0d * ((((c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.e.f(c % 1.0d, 0);
            default:
                double d5 = this.g;
                return b * d5 * Math.cos(d5 * c);
        }
    }

    public double e(double d, double d2) {
        double abs;
        double c = c(d) + d2;
        switch (this.f) {
            case 1:
                return Math.signum(0.5d - (c % 1.0d));
            case 2:
                abs = Math.abs((((c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.g * (d2 + c));
            case 6:
                double abs2 = 1.0d - Math.abs(((c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.e.c(c % 1.0d, 0);
            default:
                return Math.sin(this.g * c);
        }
        return 1.0d - abs;
    }

    public void f() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i2;
        double d = 0.0d;
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.length) {
                break;
            }
            d += fArr[i3];
            i3++;
        }
        double d2 = 0.0d;
        int i4 = 1;
        while (true) {
            if (i4 >= this.a.length) {
                break;
            }
            double[] dArr = this.b;
            d2 += (dArr[i4] - dArr[i4 - 1]) * ((fArr2[i2] + fArr2[i4]) / 2.0f);
            i4++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr4 = this.a;
            if (i5 >= fArr4.length) {
                break;
            }
            fArr4[i5] = fArr4[i5] * ((float) (d / d2));
            i5++;
        }
        this.c[0] = 0.0d;
        int i6 = 1;
        while (true) {
            if (i6 < this.a.length) {
                int i7 = i6 - 1;
                double[] dArr2 = this.b;
                double d3 = dArr2[i6] - dArr2[i7];
                double[] dArr3 = this.c;
                dArr3[i6] = dArr3[i7] + (d3 * ((fArr3[i7] + fArr3[i6]) / 2.0f));
                i6++;
            } else {
                this.h = true;
                return;
            }
        }
    }

    public void g(int i2, String str) {
        this.f = i2;
        this.d = str;
        if (str != null) {
            this.e = C3156Hk1.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}
