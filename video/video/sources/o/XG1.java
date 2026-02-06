package o;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class XG1 implements InterfaceC10688xL1 {
    public static final Set<String> a = new HashSet(Arrays.asList("HWELE", "HW-02L", "HWVOG", "HWYAL", "HWLYA", "HWCOL", "HWPAR"));
    public static final Set<String> b = new HashSet(Arrays.asList("ELS-AN00", "ELS-TN00", "ELS-NX9", "ELS-N04"));

    public static boolean d() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            Set<String> set = a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (set.contains(str.toUpperCase(locale)) || b.contains(Build.MODEL.toUpperCase(locale))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
