package o;

import android.os.Build;

/* renamed from: o.Nh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3729Nh implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return d();
    }
}
