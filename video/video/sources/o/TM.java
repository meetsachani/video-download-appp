package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class TM {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public TM(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public double a(double d) {
        if (d <= -1.0d) {
            return this.a;
        }
        if (d < 0.0d) {
            return C8558od1.d(this.a, this.b, (d - (-1.0d)) / 1.0d);
        }
        if (d < 0.5d) {
            return C8558od1.d(this.b, this.c, (d - 0.0d) / 0.5d);
        }
        if (d < 1.0d) {
            return C8558od1.d(this.c, this.d, (d - 0.5d) / 0.5d);
        }
        return this.d;
    }
}
