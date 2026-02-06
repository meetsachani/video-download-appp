package o;

import android.os.Build;

/* loaded from: classes.dex */
public class FM0 implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ("itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if ("vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (!d() && !e() && !g() && !f()) {
            return false;
        }
        return true;
    }
}
