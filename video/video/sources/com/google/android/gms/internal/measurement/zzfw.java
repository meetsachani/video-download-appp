package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import o.ES1;
import o.InterfaceC8710pF0;
import o.TB;

/* loaded from: classes3.dex */
public class zzfw {
    @InterfaceC8710pF0("DirectBootUtils.class")
    public static UserManager a;
    public static volatile boolean b = !a();
    @InterfaceC8710pF0("DirectBootUtils.class")
    public static boolean c = false;

    private zzfw() {
    }

    @TB(api = 24)
    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        if (a() && !d(context)) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (a() && !d(context)) {
            return false;
        }
        return true;
    }

    @ES1(24)
    @TargetApi(24)
    public static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (zzfw.class) {
            try {
                if (b) {
                    return true;
                }
                boolean e = e(context);
                if (e) {
                    b = e;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC8710pF0("DirectBootUtils.class")
    @ES1(24)
    @TargetApi(24)
    public static boolean e(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }
}
