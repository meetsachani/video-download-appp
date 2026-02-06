package o;

import android.os.Build;

/* renamed from: o.Oi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3834Oi2 implements InterfaceC10688xL1 {
    public static final String a = "XIAOMI";
    public static final String b = "M2101K7AG";

    public static boolean d() {
        if (a.equalsIgnoreCase(Build.MANUFACTURER) && b.equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }
}
