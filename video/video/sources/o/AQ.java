package o;

import android.util.Pair;

/* loaded from: classes.dex */
public final class AQ {
    public static Pair<Double, Double> a(double d, double d2) {
        if (V20.a(C8362np1.class) != null) {
            d = b(d);
            d2 = b(d2);
        }
        return Pair.create(Double.valueOf(d), Double.valueOf(d2));
    }

    public static double b(double d) {
        if (d >= 0.0d) {
            return d;
        }
        return ((d * 10000.0d) - 1.0d) / 10000.0d;
    }
}
