package o;

import android.os.Build;

/* loaded from: classes.dex */
public class YF2 implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }
}
