package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class GM0 implements InterfaceC8460oD2 {
    public static final List<String> a = Arrays.asList("itel w6004");
    public static final List<String> b = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C7641kw c7641kw) {
        boolean z;
        List<String> list = b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (list.contains(str.toLowerCase(locale)) && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = a.contains(str.toLowerCase(locale));
        if (!z && !contains) {
            return false;
        }
        return true;
    }
}
