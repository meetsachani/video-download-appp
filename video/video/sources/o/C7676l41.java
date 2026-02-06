package o;

import android.os.Build;
import android.util.Log;

/* renamed from: o.l41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7676l41 {
    public static final String a = "TRuntime.";
    public static final int b = 23;

    public static String a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    public static void b(String str, String str2) {
        String g = g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        String g = g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        String g = g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        String g = g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, objArr));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        String g = g(str);
        if (Log.isLoggable(g, 6)) {
            Log.e(g, str2, th);
        }
    }

    public static String g(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a(a, str);
        }
        return a + str;
    }

    public static void h(String str, String str2, Object obj) {
        String g = g(str);
        if (Log.isLoggable(g, 4)) {
            Log.i(g, String.format(str2, obj));
        }
    }

    public static void i(String str, String str2, Object obj) {
        String g = g(str);
        if (Log.isLoggable(g, 5)) {
            Log.w(g, String.format(str2, obj));
        }
    }
}
