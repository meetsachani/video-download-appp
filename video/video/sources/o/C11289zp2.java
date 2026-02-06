package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "TimingKt")
/* renamed from: o.zp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11289zp2 {
    public static final long a(@NotNull FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "block");
        long nanoTime = System.nanoTime();
        fa0.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@NotNull FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "block");
        long currentTimeMillis = System.currentTimeMillis();
        fa0.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
