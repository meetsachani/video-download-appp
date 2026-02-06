package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n27#2:131\n27#2:133\n16#3:132\n16#3:134\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n124#1:131\n126#1:133\n124#1:132\n126#1:134\n*E\n"})
/* renamed from: o.Jg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3337Jg2 extends W32<Integer> implements InterfaceC9041qc2<Integer> {
    public C3337Jg2(int i) {
        super(1, Integer.MAX_VALUE, EnumC7132iq.Y);
        f(Integer.valueOf(i));
    }

    @Override // o.InterfaceC9041qc2
    @NotNull
    /* renamed from: f0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(R().intValue());
        }
        return valueOf;
    }

    public final boolean g0(int i) {
        boolean f;
        synchronized (this) {
            f = f(Integer.valueOf(R().intValue() + i));
        }
        return f;
    }
}
