package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.rw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9370rw2 extends C10588ww2 {
    public static final String d = "TypefaceCompatApi21Impl";
    public static final String e = "android.graphics.FontFamily";
    public static final String f = "addFontWeightStyle";
    public static final String g = "createFromFamiliesWithDefault";
    public static Class<?> h = null;
    public static Constructor<?> i = null;
    public static Method j = null;
    public static Method k = null;
    public static boolean l = false;

    public static boolean p(Object obj, String str, int i2, boolean z) {
        s();
        try {
            return ((Boolean) j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface q(Object obj) {
        s();
        try {
            Object newInstance = Array.newInstance(h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void s() {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(d, e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    private static Object t() {
        s();
        try {
            return i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.C10588ww2
    public Typeface b(Context context, C5693cx0.d dVar, Resources resources, int i2) {
        C5693cx0.e[] a;
        Object t = t();
        for (C5693cx0.e eVar : dVar.a()) {
            File e2 = C10831xw2.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!C10831xw2.c(e2, resources, eVar.b())) {
                    return null;
                }
                if (!p(t, e2.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return q(t);
    }

    @Override // o.C10588ww2
    public Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i2) {
        Typeface f2;
        if (cVarArr.length < 1) {
            return null;
        }
        C5935dx0.c m = m(cVarArr, i2);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File r = r(openFileDescriptor);
            if (r != null && r.canRead()) {
                f2 = Typeface.createFromFile(r);
                openFileDescriptor.close();
                return f2;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            f2 = super.f(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return f2;
        } catch (IOException unused) {
            return null;
        }
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

    public final File r(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
