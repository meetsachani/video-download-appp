package o;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Rx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4178Rx implements InterfaceC10688xL1 {
    public static final Set<String> a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final Set<String> b = new HashSet(Arrays.asList("sm4350", "sm6375"));
    public static final Set<String> c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean d() {
        return c.contains(Build.MODEL.toLowerCase());
    }

    public static boolean e() {
        if (C3931Pi2.a.equalsIgnoreCase(Build.BRAND) && a.contains(Build.HARDWARE.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (!g() && !e() && !d()) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            Set<String> set = b;
            str = Build.SOC_MODEL;
            if (set.contains(str.toLowerCase())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
