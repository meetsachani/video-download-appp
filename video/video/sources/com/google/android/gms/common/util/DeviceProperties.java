package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class DeviceProperties {
    @InterfaceC11300zs1
    public static Boolean a;
    @InterfaceC11300zs1
    public static Boolean b;
    @InterfaceC11300zs1
    public static Boolean c;
    @InterfaceC11300zs1
    public static Boolean d;
    @InterfaceC11300zs1
    public static Boolean e;
    @InterfaceC11300zs1
    public static Boolean f;
    @InterfaceC11300zs1
    public static Boolean g;
    @InterfaceC11300zs1
    public static Boolean h;
    @InterfaceC11300zs1
    public static Boolean i;
    @InterfaceC11300zs1
    public static Boolean j;
    @InterfaceC11300zs1
    public static Boolean k;
    @InterfaceC11300zs1
    public static Boolean l;
    @InterfaceC11300zs1
    public static Boolean m;
    @InterfaceC11300zs1
    public static Boolean n;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(@InterfaceC5670cr1 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (j == null) {
            boolean z = false;
            if (PlatformVersion.n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            j = Boolean.valueOf(z);
        }
        return j.booleanValue();
    }

    @KeepForSdk
    public static boolean b(@InterfaceC5670cr1 Context context) {
        if (m == null) {
            boolean z = false;
            if (PlatformVersion.q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            m = Boolean.valueOf(z);
        }
        return m.booleanValue();
    }

    @KeepForSdk
    public static boolean c(@InterfaceC5670cr1 Context context) {
        if (c == null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            boolean z = false;
            if (PlatformVersion.q() && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    @KeepForSdk
    public static boolean d(@InterfaceC5670cr1 Context context) {
        if (g == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            g = Boolean.valueOf(z);
        }
        return g.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (n(r4) == false) goto L30;
     */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(@InterfaceC5670cr1 Context context) {
        if (a == null) {
            boolean z = true;
            if (!c(context)) {
                if (!h(context) && !l(context) && !p(context)) {
                    if (i == null) {
                        i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if (!i.booleanValue() && !a(context) && !j(context)) {
                        if (l == null) {
                            l = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (!l.booleanValue()) {
                            if (!b(context)) {
                            }
                        }
                    }
                }
                z = false;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @KeepForSdk
    public static boolean f(@InterfaceC5670cr1 Context context) {
        return q(context.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean g(@InterfaceC5670cr1 Context context) {
        return o(context);
    }

    @KeepForSdk
    public static boolean h(@InterfaceC5670cr1 Context context) {
        return i(context.getResources());
    }

    @KeepForSdk
    public static boolean i(@InterfaceC5670cr1 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (b == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || q(resources)) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    @KeepForSdk
    public static boolean j(@InterfaceC5670cr1 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (k == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            k = Boolean.valueOf(z);
        }
        return k.booleanValue();
    }

    @KeepForSdk
    public static boolean k() {
        int i2 = GooglePlayServicesUtilLight.a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean l(@InterfaceC5670cr1 Context context) {
        return r(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean m(@InterfaceC5670cr1 Context context) {
        if (!l(context) || PlatformVersion.m()) {
            if (o(context)) {
                if (!PlatformVersion.n() || PlatformVersion.q()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @KeepForSdk
    public static boolean n(@InterfaceC5670cr1 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (n == null) {
            n = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return n.booleanValue();
    }

    @TargetApi(21)
    public static boolean o(@InterfaceC5670cr1 Context context) {
        if (f == null) {
            boolean z = false;
            if (PlatformVersion.j() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean p(@InterfaceC5670cr1 Context context) {
        if (h == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            h = Boolean.valueOf(z);
        }
        return h.booleanValue();
    }

    public static boolean q(@InterfaceC5670cr1 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean r(@InterfaceC5670cr1 PackageManager packageManager) {
        if (e == null) {
            boolean z = false;
            if (PlatformVersion.i() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            e = Boolean.valueOf(z);
        }
        return e.booleanValue();
    }
}
