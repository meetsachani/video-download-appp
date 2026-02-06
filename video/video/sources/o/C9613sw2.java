package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.sw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9613sw2 extends C10588ww2 {
    public static final String d = "TypefaceCompatApi24Impl";
    public static final String e = "android.graphics.FontFamily";
    public static final String f = "addFontWeightStyle";
    public static final String g = "createFromFamiliesWithDefault";
    public static final Class<?> h;
    public static final Constructor<?> i;
    public static final Method j;
    public static final Method k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(d, e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    public static boolean p(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean r() {
        Method method = j;
        if (method == null) {
            Log.w(d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    private static Object s() {
        try {
            return i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // o.C10588ww2
    public Typeface b(Context context, C5693cx0.d dVar, Resources resources, int i2) {
        C5693cx0.e[] a;
        Object s = s();
        if (s == null) {
            return null;
        }
        for (C5693cx0.e eVar : dVar.a()) {
            ByteBuffer b = C10831xw2.b(context, resources, eVar.b());
            if (b == null || !p(s, b, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return q(s);
    }

    @Override // o.C10588ww2
    public Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i2) {
        Object s = s();
        if (s == null) {
            return null;
        }
        C9654t62 c9654t62 = new C9654t62();
        for (C5935dx0.c cVar : cVarArr) {
            Uri d2 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) c9654t62.get(d2);
            if (byteBuffer == null) {
                byteBuffer = C10831xw2.f(context, cancellationSignal, d2);
                c9654t62.put(d2, byteBuffer);
            }
            if (byteBuffer == null || !p(s, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface q = q(s);
        if (q == null) {
            return null;
        }
        return Typeface.create(q, i2);
    }

    @Override // o.C10588ww2
    public Typeface h(Context context, Typeface typeface, int i2, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = HK2.b(typeface, i2, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.h(context, typeface, i2, z);
        }
        return typeface2;
    }
}
