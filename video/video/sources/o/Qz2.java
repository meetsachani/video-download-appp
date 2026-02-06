package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,310:1\n1#2:311\n103#3,13:312\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:312,13\n*E\n"})
/* loaded from: classes3.dex */
public final class Qz2<T> extends MY1<T> {
    @NotNull
    public final ThreadLocal<C4180Rx1<InterfaceC5809dQ, Object>> Z0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Qz2(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull HM<? super T> hm) {
        super(r0, hm);
        InterfaceC5809dQ interfaceC5809dQ2;
        Sz2 sz2 = Sz2.X;
        if (interfaceC5809dQ.f(sz2) == null) {
            interfaceC5809dQ2 = interfaceC5809dQ.M(sz2);
        } else {
            interfaceC5809dQ2 = interfaceC5809dQ;
        }
        this.Z0 = new ThreadLocal<>();
        if (!(hm.getContext().f(LM.y) instanceof AbstractC7762lQ)) {
            Object i = C10795xn2.i(interfaceC5809dQ, null);
            C10795xn2.f(interfaceC5809dQ, i);
            U1(interfaceC5809dQ, i);
        }
    }

    @Override // o.MY1, o.AbstractC9384s0
    public void O1(@Nullable Object obj) {
        if (this.threadLocalIsSet) {
            C4180Rx1<InterfaceC5809dQ, Object> c4180Rx1 = this.Z0.get();
            if (c4180Rx1 != null) {
                C10795xn2.f(c4180Rx1.a(), c4180Rx1.b());
            }
            this.Z0.remove();
        }
        Object a = TH.a(obj, this.Y0);
        HM<T> hm = this.Y0;
        InterfaceC5809dQ context = hm.getContext();
        Qz2<?> qz2 = null;
        Object i = C10795xn2.i(context, null);
        if (i != C10795xn2.a) {
            qz2 = C7035iQ.m(hm, context, i);
        }
        try {
            this.Y0.q(a);
            C7458kA2 c7458kA2 = C7458kA2.a;
            if (qz2 != null && !qz2.T1()) {
                return;
            }
            C10795xn2.f(context, i);
        } catch (Throwable th) {
            if (qz2 == null || qz2.T1()) {
                C10795xn2.f(context, i);
            }
            throw th;
        }
    }

    public final boolean T1() {
        boolean z;
        if (this.threadLocalIsSet && this.Z0.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.Z0.remove();
        return !z;
    }

    public final void U1(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.Z0.set(C6670gv2.a(interfaceC5809dQ, obj));
    }
}
