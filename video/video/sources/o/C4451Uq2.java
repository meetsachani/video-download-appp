package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: o.Uq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4451Uq2 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi 6 pro");

    public static boolean d() {
        return a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
