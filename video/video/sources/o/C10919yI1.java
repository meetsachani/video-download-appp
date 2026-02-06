package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n351#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
/* renamed from: o.yI1 */
/* loaded from: classes3.dex */
public final class C10919yI1 {

    @FV(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* renamed from: o.yI1$a */
    /* loaded from: classes3.dex */
    public static final class a extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C10919yI1.b(null, null, this);
        }
    }

    /* renamed from: o.yI1$b */
    /* loaded from: classes3.dex */
    public static final class b implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ InterfaceC8396ny<C7458kA2> X;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
            this.X = interfaceC8396ny;
        }

        public final void c(Throwable th) {
            InterfaceC8396ny<C7458kA2> interfaceC8396ny = this.X;
            PT1.a aVar = PT1.Y;
            interfaceC8396ny.q(PT1.b(C7458kA2.a));
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(@NotNull AI1<?> ai1, @NotNull FA0<C7458kA2> fa0, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a1;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            fa0 = (FA0) aVar.Z0;
                            AI1 ai12 = (AI1) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        if (aVar.getContext().f(RU0.W) == ai1) {
                            aVar.Y0 = ai1;
                            aVar.Z0 = fa0;
                            aVar.b1 = 1;
                            C8883py c8883py = new C8883py(C7048iT0.e(aVar), 1);
                            c8883py.Z();
                            ai1.c(new b(c8883py));
                            Object A = c8883py.A();
                            if (A == C7289jT0.l()) {
                                MV.c(aVar);
                            }
                            if (A == l) {
                                return l;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                    }
                    fa0.invoke();
                    return C7458kA2.a;
                }
            }
            if (i == 0) {
            }
            fa0.invoke();
            return C7458kA2.a;
        } catch (Throwable th) {
            fa0.invoke();
            throw th;
        }
        aVar = new a(hm);
        Object obj2 = aVar.a1;
        Object l2 = C7289jT0.l();
        i = aVar.b1;
    }

    public static /* synthetic */ Object c(AI1 ai1, FA0 fa0, HM hm, int i, Object obj) {
        if ((i & 1) != 0) {
            fa0 = new FA0() { // from class: o.xI1
                @Override // o.FA0
                public final Object invoke() {
                    C7458kA2 d;
                    d = C10919yI1.d();
                    return d;
                }
            };
        }
        return b(ai1, fa0, hm);
    }

    public static final C7458kA2 d() {
        return C7458kA2.a;
    }

    @NotNull
    public static final <E> OO1<E> e(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq, @NotNull EnumC10949yQ enumC10949yQ, @Nullable HA0<? super Throwable, C7458kA2> ha0, @InterfaceC5183ar @NotNull VA0<? super AI1<? super E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C11162zI1 c11162zI1 = new C11162zI1(C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ), C9424sA.d(i, enumC7132iq, null, 4, null));
        if (ha0 != null) {
            c11162zI1.i0(ha0);
        }
        c11162zI1.S1(enumC10949yQ, c11162zI1, va0);
        return c11162zI1;
    }

    @InterfaceC10472wS0
    @NotNull
    public static final <E> OO1<E> f(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC10949yQ enumC10949yQ, @Nullable HA0<? super Throwable, C7458kA2> ha0, @InterfaceC5183ar @NotNull VA0<? super AI1<? super E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return e(interfaceC9974uQ, interfaceC5809dQ, i, EnumC7132iq.X, enumC10949yQ, ha0, va0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <E> OO1<E> g(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @InterfaceC5183ar @NotNull VA0<? super AI1<? super E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return e(interfaceC9974uQ, interfaceC5809dQ, i, EnumC7132iq.X, EnumC10949yQ.X, null, va0);
    }

    public static /* synthetic */ OO1 h(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, EnumC10949yQ enumC10949yQ, HA0 ha0, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            enumC7132iq = EnumC7132iq.X;
        }
        if ((i2 & 8) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        if ((i2 & 16) != 0) {
            ha0 = null;
        }
        HA0 ha02 = ha0;
        return e(interfaceC9974uQ, interfaceC5809dQ, i, enumC7132iq, enumC10949yQ, ha02, va0);
    }

    public static /* synthetic */ OO1 i(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC10949yQ enumC10949yQ, HA0 ha0, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        if ((i2 & 8) != 0) {
            ha0 = null;
        }
        EnumC10949yQ enumC10949yQ2 = enumC10949yQ;
        return f(interfaceC9974uQ, interfaceC5809dQ, i, enumC10949yQ2, ha0, va0);
    }

    public static /* synthetic */ OO1 j(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, int i, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return g(interfaceC9974uQ, interfaceC5809dQ, i, va0);
    }
}
