package o;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class IK2 {
    public static final String a = "WeightTypeface";
    public static final String b = "native_instance";
    public static final String c = "nativeCreateFromTypefaceWithExactStyle";
    public static final Field d;
    public static final Method e;
    public static final Constructor<Typeface> f;
    public static final C5484c51<SparseArray<Typeface>> g;
    public static final Object h;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod(c, cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
            constructor = null;
            method = null;
        }
        d = field;
        e = method;
        f = constructor;
        g = new C5484c51<>(3);
        h = new Object();
    }

    public static Typeface a(long j) {
        try {
            return f.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Typeface b(Typeface typeface, int i, boolean z) {
        if (!d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (h) {
            try {
                long c2 = c(typeface);
                C5484c51<SparseArray<Typeface>> c5484c51 = g;
                SparseArray<Typeface> h2 = c5484c51.h(c2);
                if (h2 == null) {
                    h2 = new SparseArray<>(4);
                    c5484c51.n(c2, h2);
                } else {
                    Typeface typeface2 = h2.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface a2 = a(e(c2, i, z));
                h2.put(i2, a2);
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(Typeface typeface) {
        try {
            return d.getLong(typeface);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean d() {
        if (d != null) {
            return true;
        }
        return false;
    }

    public static long e(long j, int i, boolean z) {
        try {
            return ((Long) e.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
