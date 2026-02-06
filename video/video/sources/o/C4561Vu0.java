package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.Vu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4561Vu0 implements InterfaceC8460oD2 {
    public static final List<String> a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320");

    public static boolean d() {
        for (String str : a) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(C7641kw c7641kw) {
        if (d() && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
