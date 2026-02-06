package o;

import java.lang.reflect.Constructor;
import java.util.Hashtable;

/* renamed from: o.c41  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5480c41 {
    public static boolean b;
    public static boolean c;
    public static Hashtable a = new Hashtable();
    public static Constructor d = null;

    static {
        b = false;
        c = false;
        String str = null;
        try {
            Class.forName("org.apache.log4j.Logger");
            b = true;
        } catch (Throwable unused) {
            b = false;
        }
        try {
            Class.forName("java.util.logging.Logger");
            Class.forName("o.KU0");
            c = true;
        } catch (Throwable unused2) {
            c = false;
        }
        try {
            str = System.getProperty(Y31.I);
            if (str == null) {
                str = System.getProperty(Y31.H);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (str != null) {
                f(str);
            } else if (b) {
                f(Y31.B);
            } else if (c) {
                f(Y31.C);
            } else {
                f("org.apache.commons.logging.impl.NoOpLog");
            }
        } catch (Throwable unused4) {
        }
    }

    public static J31 a(Class cls) {
        return b(cls.getName());
    }

    public static J31 b(String str) {
        J31 j31 = (J31) a.get(str);
        if (j31 == null) {
            J31 d2 = d(str);
            a.put(str, d2);
            return d2;
        }
        return j31;
    }

    public static String[] c() {
        return (String[]) a.keySet().toArray(new String[a.size()]);
    }

    public static J31 d(String str) {
        J31 j31;
        try {
            j31 = (J31) d.newInstance(str);
        } catch (Throwable unused) {
            j31 = null;
        }
        if (j31 == null) {
            return new C3278Iq1(str);
        }
        return j31;
    }

    public static void e(Class cls) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        d = cls.getConstructor("".getClass());
    }

    public static void f(String str) throws LinkageError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            d = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable unused) {
            d = null;
        }
    }
}
