package o;

import android.os.Build;

/* renamed from: o.Gg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3040Gg implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return d();
    }
}
