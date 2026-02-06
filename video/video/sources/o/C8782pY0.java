package o;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.pY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8782pY0 implements InterfaceC10688xL1 {
    public static final Set<String> a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A725F", "SM-A725M", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    public static boolean d() {
        return a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
