package o;

/* renamed from: o.pd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8801pd1 {
    public static final float a = 1.0E-4f;

    public static boolean a(@InterfaceC5670cr1 float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float c(float f, float f2, float f3, float f4, float f5, float f6) {
        return h(b(f, f2, f3, f4), b(f, f2, f5, f4), b(f, f2, f5, f6), b(f, f2, f3, f6));
    }

    public static float d(float f, int i) {
        float f2 = i;
        int i2 = (int) (f / f2);
        if (Math.signum(f) * f2 < 0.0f && i2 * i != f) {
            i2--;
        }
        return f - (i2 * i);
    }

    public static int e(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    public static boolean f(float f, float f2, float f3) {
        if (f + f3 >= f2) {
            return true;
        }
        return false;
    }

    public static float g(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float h(float f, float f2, float f3, float f4) {
        if (f > f2 && f > f3 && f > f4) {
            return f;
        }
        if (f2 > f3 && f2 > f4) {
            return f2;
        }
        if (f3 > f4) {
            return f3;
        }
        return f4;
    }
}
