package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class OM0 implements InterfaceC8460oD2 {
    public static final List<String> a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    public static boolean d(C7641kw c7641kw) {
        if (a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
