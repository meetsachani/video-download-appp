package o;

import android.os.Build;
import java.util.Locale;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class D71 {
    public static final String a = "lge";
    public static final String b = "samsung";
    public static final String c = "meizu";

    @InterfaceC5670cr1
    public static String a() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static boolean b() {
        if (!c() && !e()) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        return a().equals(a);
    }

    public static boolean d() {
        return a().equals(c);
    }

    public static boolean e() {
        return a().equals(b);
    }
}
