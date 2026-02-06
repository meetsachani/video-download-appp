package o;

import android.os.Build;

/* renamed from: o.Pi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3931Pi2 implements InterfaceC10688xL1 {
    public static final String a = "SAMSUNG";
    public static final String b = "F2Q";
    public static final String c = "Q2Q";
    public static final String d = "OPPO";
    public static final String e = "OP4E75L1";
    public static final String f = "LENOVO";
    public static final String g = "Q706F";

    public static boolean d() {
        if (f.equalsIgnoreCase(Build.MANUFACTURER) && g.equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (d.equalsIgnoreCase(Build.MANUFACTURER) && e.equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (a.equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if (b.equalsIgnoreCase(str) || c.equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT < 33) {
            if (f() || e() || d()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
