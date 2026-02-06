package o;

import java.util.concurrent.atomic.AtomicReference;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n351#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
/* renamed from: o.tc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9776tc2 extends AbstractC6202f3<C9290rc2<?>> {
    @NotNull
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // o.AbstractC6202f3
    /* renamed from: d */
    public boolean a(@NotNull C9290rc2<?> c9290rc2) {
        C7592kj2 c7592kj2;
        if (BJ.a(this.a) != null) {
            return false;
        }
        AtomicReference<Object> atomicReference = this.a;
        c7592kj2 = C9533sc2.a;
        BJ.d(atomicReference, c7592kj2);
        return true;
    }

    @Nullable
    public final Object e(@NotNull HM<? super C7458kA2> hm) {
        C7592kj2 c7592kj2;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        AtomicReference atomicReference = this.a;
        c7592kj2 = C9533sc2.a;
        if (!C6515gH1.a(atomicReference, c7592kj2, c8883py)) {
            PT1.a aVar = PT1.Y;
            c8883py.q(PT1.b(C7458kA2.a));
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        if (A == C7289jT0.l()) {
            return A;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC6202f3
    @NotNull
    /* renamed from: f */
    public HM<C7458kA2>[] b(@NotNull C9290rc2<?> c9290rc2) {
        BJ.d(this.a, null);
        return C5959e3.a;
    }

    public final void g() {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C7592kj2 c7592kj23;
        C7592kj2 c7592kj24;
        AtomicReference<Object> atomicReference = this.a;
        while (true) {
            Object a = BJ.a(atomicReference);
            if (a != null) {
                c7592kj2 = C9533sc2.b;
                if (a != c7592kj2) {
                    c7592kj22 = C9533sc2.a;
                    if (a == c7592kj22) {
                        AtomicReference<Object> atomicReference2 = this.a;
                        c7592kj23 = C9533sc2.b;
                        if (C6515gH1.a(atomicReference2, a, c7592kj23)) {
                            return;
                        }
                    } else {
                        AtomicReference<Object> atomicReference3 = this.a;
                        c7592kj24 = C9533sc2.a;
                        if (C6515gH1.a(atomicReference3, a, c7592kj24)) {
                            PT1.a aVar = PT1.Y;
                            ((C8883py) a).q(PT1.b(C7458kA2.a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        AtomicReference<Object> atomicReference = this.a;
        c7592kj2 = C9533sc2.a;
        Object andSet = atomicReference.getAndSet(c7592kj2);
        C6562gT0.m(andSet);
        c7592kj22 = C9533sc2.b;
        if (andSet == c7592kj22) {
            return true;
        }
        return false;
    }
}
