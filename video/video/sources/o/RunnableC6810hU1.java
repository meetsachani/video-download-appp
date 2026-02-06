package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* renamed from: o.hU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC6810hU1 implements Runnable {
    @NotNull
    public final AbstractC7762lQ X;
    @NotNull
    public final InterfaceC8396ny<C7458kA2> Y;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC6810hU1(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        this.X = abstractC7762lQ;
        this.Y = interfaceC8396ny;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.Y.E(this.X, C7458kA2.a);
    }
}
