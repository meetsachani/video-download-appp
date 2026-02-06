package o;

import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes.dex */
public class YG1 implements InterfaceC10688xL1 {
    public static boolean d(C7641kw c7641kw) {
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
