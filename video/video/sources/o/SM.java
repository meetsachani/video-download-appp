package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class SM {
    public static final double a = 1.0d;
    public static final double b = 21.0d;
    public static final double c = 3.0d;
    public static final double d = 4.5d;
    public static final double e = 7.0d;
    public static final double f = 0.04d;
    public static final double g = 0.4d;

    public static double a(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double t = C9448sG.t(d2);
            double d4 = ((t + 5.0d) / d3) - 5.0d;
            if (d4 >= 0.0d && d4 <= 100.0d) {
                double f2 = f(t, d4);
                double abs = Math.abs(f2 - d3);
                if (f2 < d3 && abs > 0.04d) {
                    return -1.0d;
                }
                double p = C9448sG.p(d4) - 0.4d;
                if (p >= 0.0d && p <= 100.0d) {
                    return p;
                }
            }
        }
        return -1.0d;
    }

    public static double b(double d2, double d3) {
        return Math.max(0.0d, a(d2, d3));
    }

    public static double c(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double t = C9448sG.t(d2);
            double d4 = ((t + 5.0d) * d3) - 5.0d;
            if (d4 >= 0.0d && d4 <= 100.0d) {
                double f2 = f(d4, t);
                double abs = Math.abs(f2 - d3);
                if (f2 < d3 && abs > 0.04d) {
                    return -1.0d;
                }
                double p = C9448sG.p(d4) + 0.4d;
                if (p >= 0.0d && p <= 100.0d) {
                    return p;
                }
            }
        }
        return -1.0d;
    }

    public static double d(double d2, double d3) {
        double c2 = c(d2, d3);
        if (c2 < 0.0d) {
            return 100.0d;
        }
        return c2;
    }

    public static double e(double d2, double d3) {
        return f(C9448sG.t(d2), C9448sG.t(d3));
    }

    public static double f(double d2, double d3) {
        double max = Math.max(d2, d3);
        if (max != d3) {
            d2 = d3;
        }
        return (max + 5.0d) / (d2 + 5.0d);
    }
}
