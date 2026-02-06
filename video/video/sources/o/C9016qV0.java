package o;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.qV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9016qV0 implements F92 {
    public static final Set<String> a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    public static boolean d(C7641kw c7641kw) {
        return a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
