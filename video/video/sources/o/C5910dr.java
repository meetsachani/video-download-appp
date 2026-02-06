package o;

import o.LM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,267:1\n91#2,5:268\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n163#1:268,5\n*E\n"})
/* renamed from: o.dr */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5910dr {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @NotNull
    public static final <T> J10<T> a(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull EnumC10949yQ enumC10949yQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0) {
        K10 k10;
        InterfaceC5809dQ k = C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ);
        if (enumC10949yQ.i()) {
            k10 = new JY0(k, va0);
        } else {
            k10 = new K10(k, true);
        }
        ((AbstractC9384s0) k10).S1(enumC10949yQ, k10, va0);
        return k10;
    }

    public static /* synthetic */ J10 b(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, EnumC10949yQ enumC10949yQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i & 2) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        return C5426br.a(interfaceC9974uQ, interfaceC5809dQ, enumC10949yQ, va0);
    }

    @Nullable
    public static final <T> Object c(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return C5426br.h(abstractC7762lQ, va0, hm);
    }

    public static final <T> Object d(AbstractC7762lQ abstractC7762lQ, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        UP0.e(0);
        Object h = C5426br.h(abstractC7762lQ, va0, hm);
        UP0.e(1);
        return h;
    }

    @NotNull
    public static final RU0 e(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull EnumC10949yQ enumC10949yQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        AbstractC9384s0 c2925Fb2;
        InterfaceC5809dQ k = C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ);
        if (enumC10949yQ.i()) {
            c2925Fb2 = new C6083eZ0(k, va0);
        } else {
            c2925Fb2 = new C2925Fb2(k, true);
        }
        c2925Fb2.S1(enumC10949yQ, c2925Fb2, va0);
        return c2925Fb2;
    }

    public static /* synthetic */ RU0 f(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, EnumC10949yQ enumC10949yQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i & 2) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        return C5426br.d(interfaceC9974uQ, interfaceC5809dQ, enumC10949yQ, va0);
    }

    @Nullable
    public static final <T> Object g(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        Object T1;
        InterfaceC5809dQ context = hm.getContext();
        InterfaceC5809dQ j = C7035iQ.j(context, interfaceC5809dQ);
        C5829dV0.y(j);
        if (j == context) {
            MY1 my1 = new MY1(j, hm);
            T1 = Rz2.b(my1, my1, va0);
        } else {
            LM.b bVar = LM.y;
            if (C6562gT0.g(j.f(bVar), context.f(bVar))) {
                Qz2 qz2 = new Qz2(j, hm);
                InterfaceC5809dQ context2 = qz2.getContext();
                Object i = C10795xn2.i(context2, null);
                try {
                    Object b2 = Rz2.b(qz2, qz2, va0);
                    C10795xn2.f(context2, i);
                    T1 = b2;
                } catch (Throwable th) {
                    C10795xn2.f(context2, i);
                    throw th;
                }
            } else {
                C7675l40 c7675l40 = new C7675l40(j, hm);
                C10104uy.e(va0, c7675l40, c7675l40);
                T1 = c7675l40.T1();
            }
        }
        if (T1 == C7289jT0.l()) {
            MV.c(hm);
        }
        return T1;
    }
}
