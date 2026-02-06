package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class EM0 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C7641kw c7641kw) {
        if (a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
