package o;

import java.util.Locale;

/* renamed from: o.Zl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4923Zl implements InterfaceC7064iY0 {
    public static final long e = 1000000000000L;
    public static final int f = 1000000000;
    public static final int g = 1000000;
    public static final int h = 1000;

    @Override // o.InterfaceC7064iY0
    @InterfaceC5670cr1
    public String a(float f2) {
        if (f2 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f2 / 1.0E12f));
        }
        if (f2 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f2 / 1.0E9f));
        }
        if (f2 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f2 / 1000000.0f));
        }
        if (f2 >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", Float.valueOf(f2 / 1000.0f));
        }
        return String.format(Locale.US, "%.0f", Float.valueOf(f2));
    }
}
