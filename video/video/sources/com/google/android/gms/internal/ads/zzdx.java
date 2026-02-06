package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import o.InterfaceC11300zs1;
import o.JK1;
import o.M82;

/* loaded from: classes2.dex */
public final class zzdx {
    public static final Object a = new Object();

    @JK1
    public static String a(String str, @InterfaceC11300zs1 Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            String replace2 = replace.replace("\n", "\n  ");
            return str + "\n  " + replace2 + "\n";
        }
        return str;
    }

    @JK1
    public static void b(@M82(max = 23) String str, String str2) {
        synchronized (a) {
            Log.d(str, a(str2, null));
        }
    }

    @JK1
    public static void c(@M82(max = 23) String str, String str2) {
        synchronized (a) {
            Log.e(str, a(str2, null));
        }
    }

    @JK1
    public static void d(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        synchronized (a) {
            Log.e(str, a(str2, th));
        }
    }

    @JK1
    public static void e(@M82(max = 23) String str, String str2) {
        synchronized (a) {
            Log.i(str, a(str2, null));
        }
    }

    @JK1
    public static void f(@M82(max = 23) String str, String str2) {
        synchronized (a) {
            Log.w(str, a(str2, null));
        }
    }

    @JK1
    public static void g(@M82(max = 23) String str, String str2, @InterfaceC11300zs1 Throwable th) {
        synchronized (a) {
            Log.w(str, a(str2, th));
        }
    }
}
