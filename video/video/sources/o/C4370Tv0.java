package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Tv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4370Tv0 {
    @HK1
    public static final int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@NotNull H h, @NotNull Object obj) {
        if (h.X == obj) {
            return;
        }
        throw h;
    }
}
