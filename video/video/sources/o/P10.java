package o;

import o.InterfaceC5809dQ;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n351#2,11:160\n351#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
/* loaded from: classes3.dex */
public final class P10 {

    @FV(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class a extends KM {
        public /* synthetic */ Object Y0;
        public int Z0;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Y0 = obj;
            this.Z0 |= Integer.MIN_VALUE;
            return P10.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull HM<?> hm) {
        a aVar;
        int i;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.Z0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.Z0 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.Y0;
                Object l = C7289jT0.l();
                i = aVar.Z0;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RT1.n(obj);
                } else {
                    RT1.n(obj);
                    aVar.Z0 = 1;
                    C8883py c8883py = new C8883py(C7048iT0.e(aVar), 1);
                    c8883py.Z();
                    Object A = c8883py.A();
                    if (A == C7289jT0.l()) {
                        MV.c(aVar);
                    }
                    if (A == l) {
                        return l;
                    }
                }
                throw new SX0();
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.Y0;
        Object l2 = C7289jT0.l();
        i = aVar.Z0;
        if (i == 0) {
        }
        throw new SX0();
    }

    @Nullable
    public static final Object b(long j, @NotNull HM<? super C7458kA2> hm) {
        if (j <= 0) {
            return C7458kA2.a;
        }
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        if (j < Long.MAX_VALUE) {
            d(c8883py.getContext()).E(j, c8883py);
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

    @Nullable
    public static final Object c(long j, @NotNull HM<? super C7458kA2> hm) {
        Object b = b(e(j), hm);
        if (b == C7289jT0.l()) {
            return b;
        }
        return C7458kA2.a;
    }

    @NotNull
    public static final O10 d(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        O10 o10;
        InterfaceC5809dQ.b f = interfaceC5809dQ.f(LM.y);
        if (f instanceof O10) {
            o10 = (O10) f;
        } else {
            o10 = null;
        }
        if (o10 == null) {
            return UY.a();
        }
        return o10;
    }

    public static final long e(long j) {
        boolean T = Y70.T(j);
        if (T) {
            Y70.a aVar = Y70.Y;
            return Y70.A(Y70.V(j, C6223f80.x(999999L, EnumC6964i80.Y)));
        } else if (!T) {
            return 0L;
        } else {
            throw new C3865Oq1();
        }
    }
}
