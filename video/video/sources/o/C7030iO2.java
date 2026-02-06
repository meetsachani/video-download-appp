package o;

import android.os.Build;

/* renamed from: o.iO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7030iO2 implements InterfaceC10094uv1 {
    public static boolean d() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (D71.b.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (D71.b.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean g(C7641kw c7641kw) {
        if (!d() && !e() && !f()) {
            return false;
        }
        return true;
    }
}
