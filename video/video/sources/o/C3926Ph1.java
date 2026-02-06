package o;

import android.os.Build;

/* renamed from: o.Ph1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3926Ph1 implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (!e() && !d()) {
            return false;
        }
        return true;
    }
}
