package o;

import android.hardware.camera2.CameraCharacteristics;

/* renamed from: o.dz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5942dz implements InterfaceC10688xL1 {
    public static boolean d(C7641kw c7641kw) {
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
