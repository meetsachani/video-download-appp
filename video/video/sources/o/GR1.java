package o;

import android.os.Build;

/* loaded from: classes.dex */
public class GR1 implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return d();
    }
}
