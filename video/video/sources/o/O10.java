package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10472wS0
/* loaded from: classes3.dex */
public interface O10 {

    @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n351#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull O10 o10, long j, @NotNull HM<? super C7458kA2> hm) {
            if (j <= 0) {
                return C7458kA2.a;
            }
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            o10.E(j, c8883py);
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @NotNull
        public static B40 b(@NotNull O10 o10, long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return UY.a().o(j, runnable, interfaceC5809dQ);
        }
    }

    void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny);

    @NotNull
    B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ);

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object z(long j, @NotNull HM<? super C7458kA2> hm);
}
