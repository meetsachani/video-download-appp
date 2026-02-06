package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,91:1\n61#1,4:99\n78#1,6:103\n84#1,5:111\n61#1,4:116\n78#1,6:120\n84#1,5:128\n8#2:92\n11#2,2:96\n91#3,3:93\n95#3:98\n57#4,2:109\n57#4,2:126\n57#4,2:133\n57#4,2:135\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n41#1:99,4\n41#1:103,6\n41#1:111,5\n52#1:116,4\n52#1:120,6\n52#1:128,5\n14#1:92\n19#1:96,2\n18#1:93,3\n18#1:98\n41#1:109,2\n52#1:126,2\n83#1:133,2\n84#1:135,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Rz2 {
    public static final <R, T> void a(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        Object i;
        HM a = MV.a(hm);
        try {
            InterfaceC5809dQ context = a.getContext();
            Object i2 = C10795xn2.i(context, null);
            MV.b(a);
            if (!(va0 instanceof AbstractC5644cl)) {
                i = C7048iT0.j(va0, r, a);
            } else {
                i = ((VA0) C11313zv2.q(va0, 2)).i(r, a);
            }
            C10795xn2.f(context, i2);
            if (i != C7289jT0.l()) {
                PT1.a aVar = PT1.Y;
                a.q(PT1.b(i));
            }
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            a.q(PT1.b(RT1.a(th)));
        }
    }

    @Nullable
    public static final <T, R> Object b(@NotNull MY1<? super T> my1, R r, @NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0) {
        Object qh;
        try {
            if (!(va0 instanceof AbstractC5644cl)) {
                qh = C7048iT0.j(va0, r, my1);
            } else {
                qh = ((VA0) C11313zv2.q(va0, 2)).i(r, my1);
            }
        } catch (Throwable th) {
            qh = new QH(th, false, 2, null);
        }
        if (qh == C7289jT0.l()) {
            return C7289jT0.l();
        }
        Object l1 = my1.l1(qh);
        if (l1 == C7055iV0.b) {
            return C7289jT0.l();
        }
        if (!(l1 instanceof QH)) {
            return C7055iV0.h(l1);
        }
        throw ((QH) l1).a;
    }

    @Nullable
    public static final <T, R> Object c(@NotNull MY1<? super T> my1, R r, @NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0) {
        Object qh;
        Object obj;
        try {
            if (!(va0 instanceof AbstractC5644cl)) {
                qh = C7048iT0.j(va0, r, my1);
            } else {
                qh = ((VA0) C11313zv2.q(va0, 2)).i(r, my1);
            }
        } catch (Throwable th) {
            qh = new QH(th, false, 2, null);
        }
        if (qh == C7289jT0.l()) {
            return C7289jT0.l();
        }
        Object l1 = my1.l1(qh);
        if (l1 == C7055iV0.b) {
            return C7289jT0.l();
        }
        if (l1 instanceof QH) {
            Throwable th2 = ((QH) l1).a;
            if ((th2 instanceof C8363np2) && ((C8363np2) th2).X == my1) {
                boolean z = qh instanceof QH;
                obj = qh;
                if (z) {
                    throw ((QH) qh).a;
                }
            } else {
                throw th2;
            }
        } else {
            obj = C7055iV0.h(l1);
        }
        return obj;
    }

    public static final <T> Object d(MY1<? super T> my1, HA0<? super Throwable, Boolean> ha0, FA0<? extends Object> fa0) {
        Object qh;
        try {
            qh = fa0.invoke();
        } catch (Throwable th) {
            qh = new QH(th, false, 2, null);
        }
        if (qh == C7289jT0.l()) {
            return C7289jT0.l();
        }
        Object l1 = my1.l1(qh);
        if (l1 == C7055iV0.b) {
            return C7289jT0.l();
        }
        if (l1 instanceof QH) {
            QH qh2 = (QH) l1;
            if (!ha0.invoke(qh2.a).booleanValue()) {
                if (qh instanceof QH) {
                    throw ((QH) qh).a;
                }
                return qh;
            }
            throw qh2.a;
        }
        return C7055iV0.h(l1);
    }
}
