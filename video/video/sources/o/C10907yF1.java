package o;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: o.yF1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10907yF1 {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static float d(float f, String str) {
        if (!Float.isNaN(f)) {
            if (!Float.isInfinite(f)) {
                return f;
            }
            throw new IllegalArgumentException(str + " must not be infinite");
        }
        throw new IllegalArgumentException(str + " must not be NaN");
    }

    public static double e(double d, double d2, double d3, String str) {
        if (d >= d2) {
            if (d <= d3) {
                return d;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static float f(float f, float f2, float f3, String str) {
        if (f >= f2) {
            if (f <= f3) {
                return f;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static int g(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static long h(long j, long j2, long j3, String str) {
        if (j >= j2) {
            if (j <= j3) {
                return j;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static int i(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int j(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    public static <T> T l(T t) {
        t.getClass();
        return t;
    }

    public static <T> T m(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z) {
        o(z, null);
    }

    public static void o(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static <T extends CharSequence> T p(T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public static <T extends CharSequence> T q(T t, Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static <T extends CharSequence> T r(T t, String str, Object... objArr) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
