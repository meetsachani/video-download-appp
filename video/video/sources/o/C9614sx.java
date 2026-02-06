package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.sx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9614sx {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.sx$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                return "DEFAULT";
            }
            return "ULTRA_HIGH_RESOLUTION_CAMERA";
        }
        return "CONCURRENT_CAMERA";
    }
}
