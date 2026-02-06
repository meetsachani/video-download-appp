package o;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class YR1 implements BG2 {
    public static boolean d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
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

    @Override // o.BG2
    public boolean a() {
        if (!d() && !e() && !f()) {
            return false;
        }
        return true;
    }

    @Override // o.BG2
    public boolean b(InterfaceC6918hx interfaceC6918hx, C5548cL1 c5548cL1) {
        if (!d() && !e()) {
            if (g()) {
                if (c5548cL1 == C5548cL1.b || c5548cL1 == C5548cL1.c) {
                    return true;
                }
                return false;
            } else if (f() && interfaceC6918hx.g() == 0 && (c5548cL1 == C5548cL1.c || c5548cL1 == C5548cL1.b)) {
                return true;
            } else {
                return false;
            }
        } else if (c5548cL1 == C5548cL1.d) {
            return true;
        } else {
            return false;
        }
    }
}
