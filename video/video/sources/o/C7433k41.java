package o;

import android.os.Build;
import android.util.Log;

/* renamed from: o.k41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7433k41 {
    public static final int a = 23;
    public static final int b = 3;
    public static int c = 3;

    public static void a(String str, String str2) {
        String o2 = o(str);
        if (k(o2, 3)) {
            Log.d(o2, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String o2 = o(str);
        if (k(o2, 3)) {
            Log.d(o2, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String o2 = o(str);
        if (k(o2, 6)) {
            Log.e(o2, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String o2 = o(str);
        if (k(o2, 6)) {
            Log.e(o2, str2, th);
        }
    }

    public static int e() {
        return c;
    }

    public static void f(String str, String str2) {
        String o2 = o(str);
        if (k(o2, 4)) {
            Log.i(o2, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        String o2 = o(str);
        if (k(o2, 4)) {
            Log.i(o2, str2, th);
        }
    }

    public static boolean h(String str) {
        return k(o(str), 3);
    }

    public static boolean i(String str) {
        return k(o(str), 6);
    }

    public static boolean j(String str) {
        return k(o(str), 4);
    }

    public static boolean k(String str, int i) {
        if (c > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        return k(o(str), 5);
    }

    public static void m() {
        c = 3;
    }

    public static void n(int i) {
        c = i;
    }

    public static String o(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static void p(String str, String str2) {
        String o2 = o(str);
        if (k(o2, 5)) {
            Log.w(o2, str2);
        }
    }

    public static void q(String str, String str2, Throwable th) {
        String o2 = o(str);
        if (k(o2, 5)) {
            Log.w(o2, str2, th);
        }
    }
}
