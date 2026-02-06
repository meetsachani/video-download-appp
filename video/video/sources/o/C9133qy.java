package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.qy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9133qy {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 29;
    public static final int e = 536870911;
    public static final int f = 536870911;
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 g = new C7592kj2("RESUME_TOKEN");

    public static final int a(int i, int i2) {
        return (i << 29) + i2;
    }

    public static final int b(int i) {
        return i >> 29;
    }

    public static final int c(int i) {
        return i & 536870911;
    }
}
