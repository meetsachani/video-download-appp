package o;

import android.os.Build;

/* loaded from: classes.dex */
public class LF2 implements BG2 {
    private static boolean d() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return d();
    }

    @Override // o.BG2
    public boolean a() {
        return false;
    }

    @Override // o.BG2
    public boolean b(InterfaceC6918hx interfaceC6918hx, C5548cL1 c5548cL1) {
        if (!d() || interfaceC6918hx.g() != 0 || c5548cL1 != C5548cL1.a) {
            return false;
        }
        return true;
    }
}
