package o;

import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

@Deprecated
/* loaded from: classes2.dex */
public final class I31 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = Integer.MAX_VALUE;
    @InterfaceC8710pF0("lock")
    public static int g = 0;
    @InterfaceC8710pF0("lock")
    public static boolean h = true;
    public static final Object f = new Object();
    @InterfaceC8710pF0("lock")
    public static b i = b.a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new a();

        /* loaded from: classes2.dex */
        public class a implements b {
            @Override // o.I31.b
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // o.I31.b
            public void b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // o.I31.b
            public void c(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // o.I31.b
            public void d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    @JK1
    public static String a(String str, @InterfaceC11300zs1 Throwable th) {
        String g2 = g(th);
        if (!TextUtils.isEmpty(g2)) {
            return str + "\n  " + g2.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    @JK1
    public static void b(@M82(max = 23) String str, String str2) {
        synchronized (f) {
            try {
                if (g == 0) {
                    i.c(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JK1
    public static void c(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        b(str, a(str2, th));
    }

    @JK1
    public static void d(@M82(max = 23) String str, String str2) {
        synchronized (f) {
            try {
                if (g <= 3) {
                    i.b(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JK1
    public static void e(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        d(str, a(str2, th));
    }

    @JK1
    public static int f() {
        int i2;
        synchronized (f) {
            i2 = g;
        }
        return i2;
    }

    @InterfaceC11300zs1
    @JK1
    public static String g(@InterfaceC11300zs1 Throwable th) {
        synchronized (f) {
            try {
                if (th == null) {
                    return null;
                }
                if (j(th)) {
                    return "UnknownHostException (no network)";
                }
                if (!h) {
                    return th.getMessage();
                }
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JK1
    public static void h(@M82(max = 23) String str, String str2) {
        synchronized (f) {
            try {
                if (g <= 1) {
                    i.d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JK1
    public static void i(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        h(str, a(str2, th));
    }

    @JK1
    public static boolean j(@InterfaceC11300zs1 Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void k(int i2) {
        synchronized (f) {
            g = i2;
        }
    }

    public static void l(boolean z) {
        synchronized (f) {
            h = z;
        }
    }

    public static void m(b bVar) {
        synchronized (f) {
            i = bVar;
        }
    }

    @JK1
    public static void n(@M82(max = 23) String str, String str2) {
        synchronized (f) {
            try {
                if (g <= 2) {
                    i.a(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JK1
    public static void o(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        n(str, a(str2, th));
    }
}
