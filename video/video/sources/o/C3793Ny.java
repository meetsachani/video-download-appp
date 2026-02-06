package o;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.Ny  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3793Ny implements InterfaceC10688xL1 {
    public static final Set<Pair<String, String>> a = new HashSet(Collections.singletonList(Pair.create(C3931Pi2.a, "SM-G981U1")));

    public static boolean e() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int d() {
        return 1;
    }
}
