package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.vx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10346vx implements InterfaceC8460oD2 {
    public static final List<String> a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    public static boolean d(C7641kw c7641kw) {
        if (a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c7641kw.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
