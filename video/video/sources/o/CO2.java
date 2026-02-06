package o;

import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes.dex */
public final class CO2 {
    public static boolean a(C7641kw c7641kw, int i) {
        int[] iArr = (int[]) c7641kw.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
