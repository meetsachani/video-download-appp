package o;

import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: o.h90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6725h90 {
    public static final String c = "cubic(0.4, 0.0, 0.2, 1)";
    public static final String d = "cubic(0.4, 0.05, 0.8, 0.7)";
    public static final String e = "cubic(0.0, 0.0, 0.2, 0.95)";
    public static final String f = "cubic(1, 1, 0, 0)";
    public static final String g = "cubic(0.36, 0, 0.66, -0.56)";
    public static final String h = "cubic(0.34, 1.56, 0.64, 1)";
    public static final String m = "anticipate";
    public static final String n = "overshoot";
    public String a = XH0.S;
    public static C6725h90 b = new C6725h90();
    public static final String k = "standard";
    public static final String j = "accelerate";
    public static final String i = "decelerate";
    public static final String l = "linear";

    /* renamed from: o  reason: collision with root package name */
    public static String[] f755o = {k, j, i, l};

    public static C6725h90 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new C4589Wc2(str);
        }
        if (str.startsWith("Schlick")) {
            return new KY1(str);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(j)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(i)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(m)) {
                    c2 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(l)) {
                    c2 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(n)) {
                    c2 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(k)) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a(d);
            case 1:
                return new a(e);
            case 2:
                return new a(g);
            case 3:
                return new a(f);
            case 4:
                return new a(h);
            case 5:
                return new a(c);
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f755o));
                return b;
        }
    }

    public double b(double d2) {
        return 1.0d;
    }

    public String toString() {
        return this.a;
    }

    /* renamed from: o.h90$a */
    /* loaded from: classes.dex */
    public static class a extends C6725h90 {
        public static double t = 0.01d;
        public static double u = 1.0E-4d;
        public double p;
        public double q;
        public double r;
        public double s;

        public a(String str) {
            this.a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.q = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.r = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.s = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // o.C6725h90
        public double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > t) {
                d2 *= 0.5d;
                if (f(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double f = f(d4);
            double d5 = d3 + d2;
            double f2 = f(d5);
            double g = g(d4);
            return (((g(d5) - g) * (d - f)) / (f2 - f)) + g;
        }

        @Override // o.C6725h90
        public double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > u) {
                d2 *= 0.5d;
                if (f(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double f = f(d4);
            double d5 = d3 + d2;
            return (g(d5) - g(d4)) / (f(d5) - f);
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = this.p;
            double d4 = this.r;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        public final double e(double d) {
            double d2 = 1.0d - d;
            double d3 = this.q;
            double d4 = this.s;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        public final double f(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.p * d2 * d3 * d) + (this.r * d3 * d * d) + (d * d * d);
        }

        public final double g(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.q * d2 * d3 * d) + (this.s * d3 * d * d) + (d * d * d);
        }

        public void h(double d, double d2, double d3, double d4) {
            this.p = d;
            this.q = d2;
            this.r = d3;
            this.s = d4;
        }

        public a(double d, double d2, double d3, double d4) {
            h(d, d2, d3, d4);
        }
    }

    public double a(double d2) {
        return d2;
    }
}
