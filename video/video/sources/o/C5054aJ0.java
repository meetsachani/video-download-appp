package o;

/* renamed from: o.aJ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5054aJ0 {
    public static double a(double d, double d2) {
        if (Double.isNaN(d)) {
            return d2;
        }
        if (Double.isNaN(d2)) {
            return d;
        }
        return Math.max(d, d2);
    }

    public static double b(double d, double d2, double d3) {
        return a(a(d, d2), d3);
    }

    public static double c(double... dArr) {
        boolean z;
        C11147zE2.V(dArr, "array", new Object[0]);
        if (dArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Array cannot be empty.", new Object[0]);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = a(dArr[i], d);
        }
        return d;
    }

    public static float d(float f, float f2) {
        if (Float.isNaN(f)) {
            return f2;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return Math.max(f, f2);
    }

    public static float e(float f, float f2, float f3) {
        return d(d(f, f2), f3);
    }

    public static float f(float... fArr) {
        boolean z;
        C11147zE2.V(fArr, "array", new Object[0]);
        if (fArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Array cannot be empty.", new Object[0]);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = d(fArr[i], f);
        }
        return f;
    }

    public static double g(double d, double d2) {
        if (Double.isNaN(d)) {
            return d2;
        }
        if (Double.isNaN(d2)) {
            return d;
        }
        return Math.min(d, d2);
    }

    public static double h(double d, double d2, double d3) {
        return g(g(d, d2), d3);
    }

    public static double i(double... dArr) {
        boolean z;
        C11147zE2.V(dArr, "array", new Object[0]);
        if (dArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Array cannot be empty.", new Object[0]);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = g(dArr[i], d);
        }
        return d;
    }

    public static float j(float f, float f2) {
        if (Float.isNaN(f)) {
            return f2;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return Math.min(f, f2);
    }

    public static float k(float f, float f2, float f3) {
        return j(j(f, f2), f3);
    }

    public static float l(float... fArr) {
        boolean z;
        C11147zE2.V(fArr, "array", new Object[0]);
        if (fArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Array cannot be empty.", new Object[0]);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = j(fArr[i], f);
        }
        return f;
    }
}
