package o;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class Q61 implements InterfaceC10688xL1 {
    public static final Set<String> a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean d() {
        return a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
