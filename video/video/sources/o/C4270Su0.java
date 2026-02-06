package o;

import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.Su0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4270Su0 implements InterfaceC10688xL1 {
    public static final Set<Pair<String, String>> a = new HashSet();

    static {
        d("sprd", "lemp");
        d("sprd", "DM20C");
    }

    public static void d(String str, String str2) {
        Set<Pair<String, String>> set = a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean e() {
        Set<Pair<String, String>> set = a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
