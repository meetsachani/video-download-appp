package o;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class HK2 {
    public static final String a = "WeightTypeface";
    public static final String b = "native_instance";
    public static final String c = "nativeCreateFromTypeface";
    public static final String d = "nativeCreateWeightAlias";
    public static final Field e;
    public static final Method f;
    public static final Method g;
    public static final Constructor<Typeface> h;
    public static final C5484c51<SparseArray<Typeface>> i;
    public static final Object j;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod(c, cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod(d, cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        e = field;
        f = method;
        g = method2;
        h = constructor;
        i = new C5484c51<>(3);
        j = new Object();
    }

    public static Typeface a(long j2) {
        try {
            return h.newInstance(Long.valueOf(j2));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Typeface b(Typeface typeface, int i2, boolean z) {
        Typeface a2;
        if (!d()) {
            return null;
        }
        int i3 = (i2 << 1) | z;
        synchronized (j) {
            try {
                long c2 = c(typeface);
                C5484c51<SparseArray<Typeface>> c5484c51 = i;
                SparseArray<Typeface> h2 = c5484c51.h(c2);
                if (h2 == null) {
                    h2 = new SparseArray<>(4);
                    c5484c51.n(c2, h2);
                } else {
                    Typeface typeface2 = h2.get(i3);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z == typeface.isItalic()) {
                    a2 = a(f(c2, i2));
                } else {
                    a2 = a(e(c2, i2, z));
                }
                h2.put(i3, a2);
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(Typeface typeface) {
        try {
            return e.getLong(typeface);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean d() {
        if (e != null) {
            return true;
        }
        return false;
    }

    public static long e(long j2, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        try {
            Long l = (Long) f.invoke(null, Long.valueOf(j2), Integer.valueOf(i3));
            l.longValue();
            return ((Long) g.invoke(null, l, Integer.valueOf(i2))).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static long f(long j2, int i2) {
        try {
            return ((Long) g.invoke(null, Long.valueOf(j2), Integer.valueOf(i2))).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
