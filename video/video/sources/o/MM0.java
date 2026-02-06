package o;

import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import o.HJ;

/* loaded from: classes.dex */
public final class MM0 implements InterfaceC10688xL1 {
    public static boolean d() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                if ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains(CommonUtils.c)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean e() {
        d();
        return false;
    }

    public static boolean f() {
        if ("HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (!g() && !f() && !e()) {
            return false;
        }
        return true;
    }

    public boolean h(HJ.a<?> aVar) {
        if (aVar != C3597Ly.j) {
            return true;
        }
        return false;
    }
}
