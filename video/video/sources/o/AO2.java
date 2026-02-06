package o;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public class AO2 implements InterfaceC10688xL1 {
    public static boolean d() {
        if (D71.b.equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936")) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ("xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8")) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (!d() && !e()) {
            return false;
        }
        return true;
    }
}
