package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.yc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10992yc0 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("SM-N9208", "SM-G920V");

    public static boolean d() {
        if (a.contains(Build.MODEL.toUpperCase())) {
            return true;
        }
        return false;
    }
}
