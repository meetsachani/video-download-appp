package o;

import android.os.Build;
import java.util.Locale;

/* renamed from: o.Xc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4686Xc2 implements InterfaceC10688xL1 {
    public static boolean d() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        if (C3931Pi2.a.equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            return true;
        }
        return false;
    }
}
