package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class NM0 implements InterfaceC8460oD2 {
    public static final List<String> a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    public static boolean d(C7641kw c7641kw) {
        if (a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
