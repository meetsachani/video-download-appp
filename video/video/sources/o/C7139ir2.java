package o;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: o.ir2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7139ir2 {
    public static final String a = "TraceCompat";
    public static long b;
    public static Method c;
    public static Method d;
    public static Method e;
    public static Method f;

    /* renamed from: o.ir2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        public static void b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        public static boolean c() {
            return Trace.isEnabled();
        }

        public static void d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i(a, "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(str, i);
            return;
        }
        try {
            d.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(str, i);
            return;
        }
        try {
            e.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception unused) {
            Log.v(a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(str, i);
            return;
        }
        try {
            f.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
