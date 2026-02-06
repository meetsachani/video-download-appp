package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GK {
    @NotNull
    public static final GK a = new GK();
    @InterfaceC7058iW0
    public static final double b = Math.log(2.0d);
    @InterfaceC7058iW0
    public static final double c;
    @InterfaceC7058iW0
    public static final double d;
    @InterfaceC7058iW0
    public static final double e;
    @InterfaceC7058iW0
    public static final double f;
    @InterfaceC7058iW0
    public static final double g;

    static {
        double ulp = Math.ulp(1.0d);
        c = ulp;
        double sqrt = Math.sqrt(ulp);
        d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        e = sqrt2;
        double d2 = 1;
        f = d2 / sqrt;
        g = d2 / sqrt2;
    }
}
