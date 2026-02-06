package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* renamed from: o.cr */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5668cr {
    public static final <T> T a(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0) throws InterruptedException {
        AbstractC3327Je0 abstractC3327Je0;
        AbstractC3327Je0 a;
        InterfaceC5809dQ k;
        Thread currentThread = Thread.currentThread();
        LM lm = (LM) interfaceC5809dQ.f(LM.y);
        if (lm == null) {
            a = C2472An2.a.b();
            k = C7035iQ.k(C6502gE0.X, interfaceC5809dQ.M(a));
        } else {
            AbstractC3327Je0 abstractC3327Je02 = null;
            if (lm instanceof AbstractC3327Je0) {
                abstractC3327Je0 = (AbstractC3327Je0) lm;
            } else {
                abstractC3327Je0 = null;
            }
            if (abstractC3327Je0 != null) {
                if (abstractC3327Je0.B0()) {
                    abstractC3327Je02 = abstractC3327Je0;
                }
                if (abstractC3327Je02 != null) {
                    a = abstractC3327Je02;
                    k = C7035iQ.k(C6502gE0.X, interfaceC5809dQ);
                }
            }
            a = C2472An2.a.a();
            k = C7035iQ.k(C6502gE0.X, interfaceC5809dQ);
        }
        C9821to c9821to = new C9821to(k, currentThread, a);
        c9821to.S1(EnumC10949yQ.X, c9821to, va0);
        return (T) c9821to.T1();
    }

    public static /* synthetic */ Object b(InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        return C5426br.f(interfaceC5809dQ, va0);
    }
}
