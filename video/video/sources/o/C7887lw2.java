package o;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.lw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7887lw2 {
    public static final float a = 0.013888889f;
    public static final float b = 0.03937008f;

    /* renamed from: o.lw2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static float a(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.lw2$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static float a(int i, float f, DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(i, f, displayMetrics);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                float f4 = displayMetrics.xdpi;
                                if (f4 == 0.0f) {
                                    return 0.0f;
                                }
                                f2 = f / f4;
                                f3 = 0.03937008f;
                            } else {
                                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
                            }
                        } else {
                            float f5 = displayMetrics.xdpi;
                            if (f5 == 0.0f) {
                                return 0.0f;
                            }
                            return f / f5;
                        }
                    } else {
                        float f6 = displayMetrics.xdpi;
                        if (f6 == 0.0f) {
                            return 0.0f;
                        }
                        f2 = f / f6;
                        f3 = 0.013888889f;
                    }
                    return f2 / f3;
                }
                float f7 = displayMetrics.scaledDensity;
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f / f7;
            }
            float f8 = displayMetrics.density;
            if (f8 == 0.0f) {
                return 0.0f;
            }
            return f / f8;
        }
        return f;
    }

    public static float b(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static int c(int i) {
        return i & 15;
    }

    public static float d(float f, DisplayMetrics displayMetrics) {
        return a(1, f, displayMetrics);
    }

    public static float e(float f, DisplayMetrics displayMetrics) {
        return a(2, f, displayMetrics);
    }

    public static float f(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }
}
