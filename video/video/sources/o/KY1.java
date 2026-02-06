package o;

/* loaded from: classes.dex */
public class KY1 extends C6725h90 {
    public static final boolean s = false;
    public double p;
    public double q;
    public double r;

    public KY1(String str) {
        this.a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.q = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // o.C6725h90
    public double a(double d) {
        return e(d);
    }

    @Override // o.C6725h90
    public double b(double d) {
        return d(d);
    }

    public final double d(double d) {
        double d2 = this.q;
        if (d < d2) {
            double d3 = this.p;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.p;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    public final double e(double d) {
        double d2 = this.q;
        if (d < d2) {
            return (d2 * d) / (d + (this.p * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.p * (d2 - d)));
    }
}
