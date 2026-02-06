package o;

import java.util.concurrent.CancellationException;
import o.PT1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n277#1,5:305\n282#1,12:311\n294#1:379\n281#1:381\n282#1,12:383\n294#1:412\n207#2,7:298\n214#2,23:326\n237#2,2:359\n239#2:363\n217#2:364\n219#2:380\n1#3:310\n1#3:382\n1#3:413\n186#4,3:323\n189#4,14:365\n186#4,17:395\n186#4,17:414\n103#5,10:349\n114#5,2:361\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n262#1:305,5\n262#1:311,12\n262#1:379\n267#1:381\n267#1:383,12\n267#1:412\n262#1:298,7\n262#1:326,23\n262#1:359,2\n262#1:363\n262#1:364\n262#1:380\n262#1:310\n267#1:382\n262#1:323,3\n262#1:365,14\n267#1:395,17\n293#1:414,17\n262#1:349,10\n262#1:361,2\n*E\n"})
/* renamed from: o.k40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7432k40 {
    @NotNull
    public static final C7592kj2 a = new C7592kj2("UNDEFINED");
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 b = new C7592kj2("REUSABLE_CLAIMED");

    public static final boolean b(C7189j40<?> c7189j40, Object obj, int i, boolean z, FA0<C7458kA2> fa0) {
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (z && b2.r0()) {
            return false;
        }
        if (b2.q0()) {
            c7189j40.a1 = obj;
            c7189j40.Z = i;
            b2.k0(c7189j40);
            return true;
        }
        b2.m0(true);
        try {
            fa0.invoke();
            do {
            } while (b2.A0());
            UP0.d(1);
        } catch (Throwable th) {
            try {
                c7189j40.f(th);
                UP0.d(1);
            } catch (Throwable th2) {
                UP0.d(1);
                b2.b0(true);
                UP0.c(1);
                throw th2;
            }
        }
        b2.b0(true);
        UP0.c(1);
        return false;
    }

    public static /* synthetic */ boolean c(C7189j40 c7189j40, Object obj, int i, boolean z, FA0 fa0, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (z && b2.r0()) {
            return false;
        }
        if (b2.q0()) {
            c7189j40.a1 = obj;
            c7189j40.Z = i;
            b2.k0(c7189j40);
            return true;
        }
        b2.m0(true);
        try {
            fa0.invoke();
            do {
            } while (b2.A0());
            UP0.d(1);
        } catch (Throwable th) {
            try {
                c7189j40.f(th);
                UP0.d(1);
            } catch (Throwable th2) {
                UP0.d(1);
                b2.b0(true);
                UP0.c(1);
                throw th2;
            }
        }
        b2.b0(true);
        UP0.c(1);
        return false;
    }

    @InterfaceC10472wS0
    public static final <T> void d(@NotNull HM<? super T> hm, @NotNull Object obj) {
        Qz2<?> qz2;
        if (hm instanceof C7189j40) {
            C7189j40 c7189j40 = (C7189j40) hm;
            Object b2 = TH.b(obj);
            if (c7189j40.Y0.U(c7189j40.getContext())) {
                c7189j40.a1 = b2;
                c7189j40.Z = 1;
                c7189j40.Y0.I(c7189j40.getContext(), c7189j40);
                return;
            }
            AbstractC3327Je0 b3 = C2472An2.a.b();
            if (b3.q0()) {
                c7189j40.a1 = b2;
                c7189j40.Z = 1;
                b3.k0(c7189j40);
                return;
            }
            b3.m0(true);
            try {
                RU0 ru0 = (RU0) c7189j40.getContext().f(RU0.W);
                if (ru0 != null && !ru0.h()) {
                    CancellationException u = ru0.u();
                    c7189j40.a(b2, u);
                    PT1.a aVar = PT1.Y;
                    c7189j40.q(PT1.b(RT1.a(u)));
                } else {
                    HM<T> hm2 = c7189j40.Z0;
                    Object obj2 = c7189j40.b1;
                    InterfaceC5809dQ context = hm2.getContext();
                    Object i = C10795xn2.i(context, obj2);
                    if (i != C10795xn2.a) {
                        qz2 = C7035iQ.m(hm2, context, i);
                    } else {
                        qz2 = null;
                    }
                    c7189j40.Z0.q(obj);
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    if (qz2 == null || qz2.T1()) {
                        C10795xn2.f(context, i);
                    }
                }
                do {
                } while (b3.A0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        hm.q(obj);
    }

    public static final boolean e(@NotNull C7189j40<? super C7458kA2> c7189j40) {
        C7458kA2 c7458kA2 = C7458kA2.a;
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (b2.r0()) {
            return false;
        }
        if (b2.q0()) {
            c7189j40.a1 = c7458kA2;
            c7189j40.Z = 1;
            b2.k0(c7189j40);
            return true;
        }
        b2.m0(true);
        try {
            c7189j40.run();
            do {
            } while (b2.A0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
