package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.zzfvr;
import o.C7035iQ;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.S92;

/* loaded from: classes2.dex */
public class zzo {
    public static final zzfvr a = zzfvr.a(S92.y);

    @InterfaceC5056aJ2
    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + C7035iQ.a + lineNumber;
        }
        return str;
    }

    public static void b(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.d(str)) {
                if (z) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void c(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : a.d(str)) {
                    if (z) {
                        Log.e("Ads", str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.e("Ads", str);
        }
    }

    public static void e(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : a.d(str)) {
                    if (z) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.i("Ads", str);
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : a.d(str)) {
                    if (z) {
                        Log.w("Ads", str2);
                    } else {
                        Log.w("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.w("Ads", str);
        }
    }

    public static void h(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void i(String str, @InterfaceC11300zs1 Throwable th) {
        if (j(5)) {
            if (th != null) {
                h(a(str), th);
            } else {
                g(a(str));
            }
        }
    }

    public static boolean j(int i) {
        if (i < 5 && !Log.isLoggable("Ads", i)) {
            return false;
        }
        return true;
    }
}
