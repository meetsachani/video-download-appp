package o;

import android.os.Build;

/* renamed from: o.Qf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4014Qf0 implements BG2 {
    public static boolean d() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean e() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    private static boolean f() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if (!d() && !f() && !e()) {
            return false;
        }
        return true;
    }

    @Override // o.BG2
    public boolean b(InterfaceC6918hx interfaceC6918hx, C5548cL1 c5548cL1) {
        if (d()) {
            if (c5548cL1 == C5548cL1.c || c5548cL1 == C5548cL1.d) {
                return true;
            }
            return false;
        } else if ((f() || e()) && c5548cL1 == C5548cL1.c) {
            return true;
        } else {
            return false;
        }
    }
}
