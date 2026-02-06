package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* loaded from: classes.dex */
public class T7 implements InterfaceC10688xL1 {
    public static boolean d(C7641kw c7641kw) {
        if (Build.BRAND.equalsIgnoreCase(C3931Pi2.a) && Build.VERSION.SDK_INT < 33 && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
