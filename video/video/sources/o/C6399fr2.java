package o;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.fr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6399fr2 {
    public static final String a = "Trace";
    public static final int b = 127;
    public static long c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static boolean h;

    public static void a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6897hr2.a(m(str), i);
        } else {
            b(m(str), i);
        }
    }

    public static void b(String str, int i) {
        try {
            if (e == null) {
                e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            e.invoke(null, Long.valueOf(c), str, Integer.valueOf(i));
        } catch (Exception e2) {
            h("asyncTraceBegin", e2);
        }
    }

    public static void c(String str) {
        C6654gr2.a(m(str));
    }

    public static void d(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6897hr2.b(m(str), i);
        } else {
            e(m(str), i);
        }
    }

    public static void e(String str, int i) {
        try {
            if (f == null) {
                f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f.invoke(null, Long.valueOf(c), str, Integer.valueOf(i));
        } catch (Exception e2) {
            h("asyncTraceEnd", e2);
        }
    }

    public static void f() {
        C6654gr2.b();
    }

    public static void g() {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (!h) {
                    h = true;
                    Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
                }
            } catch (Exception e2) {
                h("setAppTracingAllowed", e2);
            }
        }
    }

    public static void h(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v(a, "Unable to call " + str + " via reflection", exc);
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6897hr2.c();
        }
        return j();
    }

    public static boolean j() {
        try {
            if (d == null) {
                c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) d.invoke(null, Long.valueOf(c))).booleanValue();
        } catch (Exception e2) {
            h("isTagEnabled", e2);
            return false;
        }
    }

    public static void k(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6897hr2.d(m(str), i);
        } else {
            l(m(str), i);
        }
    }

    public static void l(String str, int i) {
        try {
            if (g == null) {
                g = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            g.invoke(null, Long.valueOf(c), str, Integer.valueOf(i));
        } catch (Exception e2) {
            h("traceCounter", e2);
        }
    }

    public static String m(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }
}
