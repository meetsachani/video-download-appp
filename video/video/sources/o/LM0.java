package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class LM0 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean d() {
        if (a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }
}
