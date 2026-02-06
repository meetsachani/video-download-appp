package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.aH1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5047aH1 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean d() {
        if ("Google".equals(Build.MANUFACTURER) && a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            return true;
        }
        return false;
    }
}
