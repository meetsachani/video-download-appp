package o;

import android.os.Build;

/* renamed from: o.Qj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4030Qj0 implements InterfaceC10688xL1 {
    private static boolean d() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return d();
    }
}
