package o;

import android.util.Log;

/* renamed from: o.lc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7807lc2 {
    public static final String a = "StartupLogger";
    public static final boolean b = false;

    public static void a(String str, Throwable th) {
        Log.e(a, str, th);
    }

    public static void b(String str) {
        Log.i(a, str);
    }

    public static void c(String str) {
        Log.w(a, str);
    }
}
