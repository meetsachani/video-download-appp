package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.sT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9501sT0 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    public static boolean d() {
        if (!i() && !h()) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        if (f() && d()) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        return a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean g() {
        if (D71.b.equalsIgnoreCase(Build.BRAND) && i()) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    public static boolean i() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    public static boolean j() {
        if (!g() && !e()) {
            return false;
        }
        return true;
    }
}
