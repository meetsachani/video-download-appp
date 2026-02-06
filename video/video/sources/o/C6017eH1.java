package o;

import android.os.Build;

/* renamed from: o.eH1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6017eH1 implements InterfaceC10688xL1 {
    public static boolean d() {
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (C3931Pi2.d.equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if ("Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (!d() && !g() && !i() && !f() && !e() && !h()) {
            return false;
        }
        return true;
    }
}
