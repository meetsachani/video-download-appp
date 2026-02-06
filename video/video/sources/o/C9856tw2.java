package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.tw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9856tw2 extends C9370rw2 {
    public static final int A = -1;
    public static final String t = "TypefaceCompatApi26Impl";
    public static final String u = "android.graphics.FontFamily";
    public static final String v = "addFontFromAssetManager";
    public static final String w = "addFontFromBuffer";
    public static final String x = "createFromFamiliesWithDefault";
    public static final String y = "freeze";
    public static final String z = "abortCreation";
    public final Class<?> m;
    public final Constructor<?> n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f879o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;

    public C9856tw2() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = D();
            constructor = E(cls);
            method = A(cls);
            method2 = B(cls);
            method3 = F(cls);
            method4 = z(cls);
            method5 = C(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(t, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.m = cls;
        this.n = constructor;
        this.f879o = method;
        this.p = method2;
        this.q = method3;
        this.r = method4;
        this.s = method5;
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod(v, AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> D() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> E(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    public Method F(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(y, null);
    }

    @Override // o.C9370rw2, o.C10588ww2
    public Typeface b(Context context, C5693cx0.d dVar, Resources resources, int i) {
        if (!y()) {
            return super.b(context, dVar, resources, i);
        }
        Object t2 = t();
        if (t2 == null) {
            return null;
        }
        C5693cx0.e[] a = dVar.a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C5693cx0.e eVar = a[i2];
            Context context2 = context;
            if (!v(context2, t2, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                u(t2);
                return null;
            }
            i2++;
            context = context2;
        }
        if (!x(t2)) {
            return null;
        }
        return q(t2);
    }

    @Override // o.C9370rw2, o.C10588ww2
    public Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i) {
        Typeface q;
        Object obj;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!y()) {
            C5935dx0.c m = m(cVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m.e()).setItalic(m.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h = C10831xw2.h(context, cVarArr, cancellationSignal);
        Object t2 = t();
        if (t2 == null) {
            return null;
        }
        int length = cVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            C5935dx0.c cVar = cVarArr[i2];
            ByteBuffer byteBuffer = h.get(cVar.d());
            if (byteBuffer == null) {
                obj = t2;
            } else {
                boolean w2 = w(t2, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0);
                obj = t2;
                if (!w2) {
                    u(obj);
                    return null;
                }
                z2 = true;
            }
            i2++;
            t2 = obj;
            z2 = z2;
        }
        Object obj2 = t2;
        if (!z2) {
            u(obj2);
            return null;
        } else if (!x(obj2) || (q = q(obj2)) == null) {
            return null;
        } else {
            return Typeface.create(q, i);
        }
    }

    @Override // o.C10588ww2
    public /* bridge */ /* synthetic */ Typeface e(Context context, CancellationSignal cancellationSignal, List list, int i) {
        return super.e(context, cancellationSignal, list, i);
    }

    @Override // o.C10588ww2
    public Typeface g(Context context, Resources resources, int i, String str, int i2) {
        if (!y()) {
            return super.g(context, resources, i, str, i2);
        }
        Object t2 = t();
        if (t2 == null) {
            return null;
        }
        if (!v(context, t2, str, 0, -1, -1, null)) {
            u(t2);
            return null;
        } else if (!x(t2)) {
            return null;
        } else {
            return q(t2);
        }
    }

    @Override // o.C9370rw2, o.C10588ww2
    public Typeface h(Context context, Typeface typeface, int i, boolean z2) {
        Typeface typeface2;
        try {
            typeface2 = IK2.b(typeface, i, z2);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.h(context, typeface, i, z2);
        }
        return typeface2;
    }

    public Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object t() {
        try {
            return this.n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void u(Object obj) {
        try {
            this.r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean v(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f879o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean w(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.p.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean x(Object obj) {
        try {
            return ((Boolean) this.q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean y() {
        if (this.f879o == null) {
            Log.w(t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f879o != null) {
            return true;
        }
        return false;
    }

    public Method z(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(z, null);
    }
}
