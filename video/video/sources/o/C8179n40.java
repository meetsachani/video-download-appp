package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n186#1,17:226\n1#2:209\n236#3:210\n237#3,2:221\n239#3:225\n103#4,10:211\n114#4,2:223\n57#5,2:243\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n176#1:226,17\n164#1:210\n164#1:221,2\n164#1:225\n164#1:211,10\n164#1:223,2\n206#1:243,2\n*E\n"})
/* renamed from: o.n40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8179n40 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = -1;

    public static final <T> void a(@NotNull AbstractC7918m40<? super T> abstractC7918m40, int i) {
        boolean z;
        HM<? super T> b2 = abstractC7918m40.b();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (b2 instanceof C7189j40) && c(i) == c(abstractC7918m40.Z)) {
            C7189j40 c7189j40 = (C7189j40) b2;
            AbstractC7762lQ abstractC7762lQ = c7189j40.Y0;
            InterfaceC5809dQ context = c7189j40.getContext();
            if (abstractC7762lQ.U(context)) {
                abstractC7762lQ.I(context, abstractC7918m40);
                return;
            } else {
                f(abstractC7918m40);
                return;
            }
        }
        e(abstractC7918m40, b2, z);
    }

    public static final boolean c(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static final boolean d(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static final <T> void e(@NotNull AbstractC7918m40<? super T> abstractC7918m40, @NotNull HM<? super T> hm, boolean z) {
        Object e2;
        Qz2<?> qz2;
        Object j = abstractC7918m40.j();
        Throwable c2 = abstractC7918m40.c(j);
        if (c2 != null) {
            PT1.a aVar = PT1.Y;
            e2 = RT1.a(c2);
        } else {
            PT1.a aVar2 = PT1.Y;
            e2 = abstractC7918m40.e(j);
        }
        Object b2 = PT1.b(e2);
        if (z) {
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C7189j40 c7189j40 = (C7189j40) hm;
            HM<T> hm2 = c7189j40.Z0;
            Object obj = c7189j40.b1;
            InterfaceC5809dQ context = hm2.getContext();
            Object i = C10795xn2.i(context, obj);
            if (i != C10795xn2.a) {
                qz2 = C7035iQ.m(hm2, context, i);
            } else {
                qz2 = null;
            }
            try {
                c7189j40.Z0.q(b2);
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (qz2 != null && !qz2.T1()) {
                    return;
                }
                C10795xn2.f(context, i);
                return;
            } catch (Throwable th) {
                if (qz2 == null || qz2.T1()) {
                    C10795xn2.f(context, i);
                }
                throw th;
            }
        }
        hm.q(b2);
    }

    public static final void f(AbstractC7918m40<?> abstractC7918m40) {
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (b2.q0()) {
            b2.k0(abstractC7918m40);
            return;
        }
        b2.m0(true);
        try {
            e(abstractC7918m40, abstractC7918m40.b(), true);
            do {
            } while (b2.A0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@NotNull HM<?> hm, @NotNull Throwable th) {
        PT1.a aVar = PT1.Y;
        hm.q(PT1.b(RT1.a(th)));
    }

    public static final void h(@NotNull AbstractC7918m40<?> abstractC7918m40, @NotNull AbstractC3327Je0 abstractC3327Je0, @NotNull FA0<C7458kA2> fa0) {
        abstractC3327Je0.m0(true);
        try {
            fa0.invoke();
            do {
            } while (abstractC3327Je0.A0());
            UP0.d(1);
        } catch (Throwable th) {
            try {
                abstractC7918m40.f(th);
                UP0.d(1);
            } catch (Throwable th2) {
                UP0.d(1);
                abstractC3327Je0.b0(true);
                UP0.c(1);
                throw th2;
            }
        }
        abstractC3327Je0.b0(true);
        UP0.c(1);
    }

    @HK1
    public static /* synthetic */ void b() {
    }
}
