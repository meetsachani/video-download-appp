package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
/* renamed from: o.mA */
/* loaded from: classes4.dex */
public final class C7959mA {
    public static final /* synthetic */ InterfaceC4076Qv0 a(InterfaceC4076Qv0 interfaceC4076Qv0, InterfaceC5809dQ interfaceC5809dQ) {
        return e(interfaceC4076Qv0, interfaceC5809dQ);
    }

    @NotNull
    public static final <T> AbstractC7455kA<T> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        AbstractC7455kA<T> abstractC7455kA;
        if (interfaceC3882Ov0 instanceof AbstractC7455kA) {
            abstractC7455kA = (AbstractC7455kA) interfaceC3882Ov0;
        } else {
            abstractC7455kA = null;
        }
        if (abstractC7455kA == null) {
            return new C8689pA(interfaceC3882Ov0, null, 0, null, 14, null);
        }
        return abstractC7455kA;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull InterfaceC5809dQ interfaceC5809dQ, V v, @NotNull Object obj, @NotNull VA0<? super V, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        Object i;
        Object i2 = C10795xn2.i(interfaceC5809dQ, obj);
        try {
            C2424Ab2 c2424Ab2 = new C2424Ab2(hm, interfaceC5809dQ);
            if (!(va0 instanceof AbstractC5644cl)) {
                i = C7048iT0.j(va0, v, c2424Ab2);
            } else {
                i = ((VA0) C11313zv2.q(va0, 2)).i(v, c2424Ab2);
            }
            C10795xn2.f(interfaceC5809dQ, i2);
            if (i == C7289jT0.l()) {
                MV.c(hm);
            }
            return i;
        } catch (Throwable th) {
            C10795xn2.f(interfaceC5809dQ, i2);
            throw th;
        }
    }

    public static /* synthetic */ Object d(InterfaceC5809dQ interfaceC5809dQ, Object obj, Object obj2, VA0 va0, HM hm, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C10795xn2.g(interfaceC5809dQ);
        }
        return c(interfaceC5809dQ, obj, obj2, va0, hm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC4076Qv0<T> e(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, InterfaceC5809dQ interfaceC5809dQ) {
        if (!(interfaceC4076Qv0 instanceof C10848y02)) {
            if (interfaceC4076Qv0 instanceof C8370nr1) {
                return interfaceC4076Qv0;
            }
            return new Pz2(interfaceC4076Qv0, interfaceC5809dQ);
        }
        return interfaceC4076Qv0;
    }
}
