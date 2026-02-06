package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Build;
import o.C10898yD0;
import o.D71;

/* loaded from: classes2.dex */
public final class zzdo {
    public static void a(boolean z, String str) throws zzdn {
        if (z) {
            return;
        }
        throw new zzdn(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 33 && f(C10898yD0.h)) {
            return true;
        }
        return false;
    }

    public static boolean c(int i) {
        if (i == 6) {
            return b();
        }
        if (i == 7) {
            return f("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 || (!D71.b.equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) {
            if (i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                return false;
            }
            return f(C10898yD0.e);
        }
        return false;
    }

    public static boolean e() {
        return f(C10898yD0.f);
    }

    public static boolean f(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }
}
