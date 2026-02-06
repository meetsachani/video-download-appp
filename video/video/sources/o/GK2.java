package o;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import o.C5693cx0;

/* loaded from: classes.dex */
public final class GK2 {
    public static final String a = "WeightTypeface";
    public static final String b = "native_instance";
    public static final Field c;
    public static final C5484c51<SparseArray<Typeface>> d;
    public static final Object e;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
        }
        c = field;
        d = new C5484c51<>(3);
        e = new Object();
    }

    public static Typeface a(C10588ww2 c10588ww2, Context context, Typeface typeface, int i, boolean z) {
        if (!d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (e) {
            try {
                long c2 = c(typeface);
                C5484c51<SparseArray<Typeface>> c5484c51 = d;
                SparseArray<Typeface> h = c5484c51.h(c2);
                if (h == null) {
                    h = new SparseArray<>(4);
                    c5484c51.n(c2, h);
                } else {
                    Typeface typeface2 = h.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface b2 = b(c10588ww2, context, typeface, i, z);
                if (b2 == null) {
                    b2 = e(typeface, i, z);
                }
                h.put(i2, b2);
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(C10588ww2 c10588ww2, Context context, Typeface typeface, int i, boolean z) {
        C5693cx0.d n = c10588ww2.n(typeface);
        if (n == null) {
            return null;
        }
        return c10588ww2.c(context, n, context.getResources(), i, z);
    }

    public static long c(Typeface typeface) {
        try {
            return ((Number) c.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean d() {
        if (c != null) {
            return true;
        }
        return false;
    }

    public static Typeface e(Typeface typeface, int i, boolean z) {
        boolean z2;
        int i2 = 0;
        if (i >= 600) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            if (!z2) {
                i2 = 2;
            } else if (!z) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        return Typeface.create(typeface, i2);
    }
}
