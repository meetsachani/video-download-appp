package o;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaqg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: o.hJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6767hJ2 {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable(zzaqg.a, 2);
    public static final String c = C6767hJ2.class.getName();

    /* renamed from: o.hJ2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final boolean c = C6767hJ2.b;
        public static final long d = 0;
        public final List<C0286a> a = new ArrayList();
        public boolean b = false;

        /* renamed from: o.hJ2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0286a {
            public final String a;
            public final long b;
            public final long c;

            public C0286a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        public synchronized void a(String str, long j) {
            if (!this.b) {
                this.a.add(new C0286a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.b = true;
            long c2 = c();
            if (c2 <= 0) {
                return;
            }
            long j = this.a.get(0).c;
            C6767hJ2.b("(%-4d ms) %s", Long.valueOf(c2), str);
            for (C0286a c0286a : this.a) {
                long j2 = c0286a.c;
                C6767hJ2.b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c0286a.b), c0286a.a);
                j = j2;
            }
        }

        public final long c() {
            if (this.a.size() == 0) {
                return 0L;
            }
            long j = this.a.get(0).c;
            List<C0286a> list = this.a;
            return list.get(list.size() - 1).c - j;
        }

        public void finalize() throws Throwable {
            if (!this.b) {
                b("Request on the loose");
                C6767hJ2.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(c)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + UE.h + stackTrace[i].getMethodName();
                    break;
                }
                i++;
            } else {
                str2 = InterfaceC6420fx.b;
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(a, a(str, objArr), th);
    }

    public static void e(String str) {
        b("Changing log tag to %s", str);
        a = str;
        b = Log.isLoggable(str, 2);
    }

    public static void f(String str, Object... objArr) {
        if (b) {
            Log.v(a, a(str, objArr));
        }
    }

    public static void g(String str, Object... objArr) {
        Log.wtf(a, a(str, objArr));
    }

    public static void h(Throwable th, String str, Object... objArr) {
        Log.wtf(a, a(str, objArr), th);
    }
}
