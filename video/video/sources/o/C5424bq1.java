package o;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5424bq1 implements InterfaceC10688xL1 {
    public static final List<String> a = Arrays.asList("NEXUS 4");

    public static boolean e() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int d() {
        return 2;
    }
}
