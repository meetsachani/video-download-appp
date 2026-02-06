package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,64:1\n45#1,6:65\n45#1,6:71\n45#1,6:77\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:65,6\n25#1:71,6\n34#1:77,6\n*E\n"})
/* renamed from: o.uy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10104uy {
    public static final void a(HM<?> hm, Throwable th) {
        PT1.a aVar = PT1.Y;
        hm.q(PT1.b(RT1.a(th)));
        throw th;
    }

    public static final void b(HM<?> hm, FA0<C7458kA2> fa0) {
        try {
            fa0.invoke();
        } catch (Throwable th) {
            a(hm, th);
        }
    }

    public static final void c(@NotNull HM<? super C7458kA2> hm, @NotNull HM<?> hm2) {
        try {
            HM e = C7048iT0.e(hm);
            PT1.a aVar = PT1.Y;
            C7432k40.d(e, PT1.b(C7458kA2.a));
        } catch (Throwable th) {
            a(hm2, th);
        }
    }

    @InterfaceC10472wS0
    public static final <T> void d(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0, @NotNull HM<? super T> hm) {
        try {
            HM e = C7048iT0.e(C7048iT0.b(ha0, hm));
            PT1.a aVar = PT1.Y;
            C7432k40.d(e, PT1.b(C7458kA2.a));
        } catch (Throwable th) {
            a(hm, th);
        }
    }

    public static final <R, T> void e(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        try {
            HM e = C7048iT0.e(C7048iT0.c(va0, r, hm));
            PT1.a aVar = PT1.Y;
            C7432k40.d(e, PT1.b(C7458kA2.a));
        } catch (Throwable th) {
            a(hm, th);
        }
    }
}
