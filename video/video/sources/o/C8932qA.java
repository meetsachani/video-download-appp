package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@InterfaceC8303na2({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* renamed from: o.qA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8932qA<T, R> extends AbstractC8445oA<T, R> {
    @NotNull
    public final XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> Z0;

    @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qA$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C8932qA<T, R> b1;
        public final /* synthetic */ InterfaceC4076Qv0<R> c1;

        /* renamed from: o.qA$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0326a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ RP1.h<RU0> X;
            public final /* synthetic */ InterfaceC9974uQ Y;
            public final /* synthetic */ InterfaceC4076Qv0<R> Y0;
            public final /* synthetic */ C8932qA<T, R> Z;

            @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: o.qA$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0327a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
                public int Z0;
                public final /* synthetic */ C8932qA<T, R> a1;
                public final /* synthetic */ InterfaceC4076Qv0<R> b1;
                public final /* synthetic */ T c1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0327a(C8932qA<T, R> c8932qA, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T t, HM<? super C0327a> hm) {
                    super(2, hm);
                    this.a1 = c8932qA;
                    this.b1 = interfaceC4076Qv0;
                    this.c1 = t;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    Object l = C7289jT0.l();
                    int i = this.Z0;
                    if (i != 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        XA0 xa0 = this.a1.Z0;
                        InterfaceC4076Qv0<R> interfaceC4076Qv0 = this.b1;
                        T t = this.c1;
                        this.Z0 = 1;
                        if (xa0.P(interfaceC4076Qv0, t, this) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }

                public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                    return ((C0327a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
                }

                @Override // o.VA0
                public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                    return U(interfaceC9974uQ, hm);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                    return new C0327a(this.a1, this.b1, this.c1, hm);
                }
            }

            @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: o.qA$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends KM {
                public Object Y0;
                public Object Z0;
                public Object a1;
                public /* synthetic */ Object b1;
                public final /* synthetic */ C0326a<T> c1;
                public int d1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0326a<? super T> c0326a, HM<? super b> hm) {
                    super(hm);
                    this.c1 = c0326a;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.b1 = obj;
                    this.d1 |= Integer.MIN_VALUE;
                    return this.c1.c(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0326a(RP1.h<RU0> hVar, InterfaceC9974uQ interfaceC9974uQ, C8932qA<T, R> c8932qA, InterfaceC4076Qv0<? super R> interfaceC4076Qv0) {
                this.X = hVar;
                this.Y = interfaceC9974uQ;
                this.Z = c8932qA;
                this.Y0 = interfaceC4076Qv0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                b bVar;
                int i;
                C0326a<T> c0326a;
                RU0 f;
                if (hm instanceof b) {
                    bVar = (b) hm;
                    int i2 = bVar.d1;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.d1 = i2 - Integer.MIN_VALUE;
                        Object obj = bVar.b1;
                        Object l = C7289jT0.l();
                        i = bVar.d1;
                        if (i == 0) {
                            if (i == 1) {
                                RU0 ru0 = (RU0) bVar.a1;
                                t = (T) bVar.Z0;
                                c0326a = (C0326a) bVar.Y0;
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj);
                            RU0 ru02 = this.X.X;
                            if (ru02 != null) {
                                ru02.i(new XB());
                                bVar.Y0 = this;
                                bVar.Z0 = t;
                                bVar.a1 = ru02;
                                bVar.d1 = 1;
                                if (ru02.T(bVar) == l) {
                                    return l;
                                }
                            }
                            c0326a = this;
                        }
                        RP1.h<RU0> hVar = c0326a.X;
                        f = C5910dr.f(c0326a.Y, null, EnumC10949yQ.Y0, new C0327a(c0326a.Z, c0326a.Y0, t, null), 1, null);
                        hVar.X = (T) f;
                        return C7458kA2.a;
                    }
                }
                bVar = new b(this, hm);
                Object obj2 = bVar.b1;
                Object l2 = C7289jT0.l();
                i = bVar.d1;
                if (i == 0) {
                }
                RP1.h<RU0> hVar2 = c0326a.X;
                f = C5910dr.f(c0326a.Y, null, EnumC10949yQ.Y0, new C0327a(c0326a.Z, c0326a.Y0, t, null), 1, null);
                hVar2.X = (T) f;
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C8932qA<T, R> c8932qA, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = c8932qA;
            this.c1 = interfaceC4076Qv0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                RP1.h hVar = new RP1.h();
                C8932qA<T, R> c8932qA = this.b1;
                InterfaceC3882Ov0<S> interfaceC3882Ov0 = c8932qA.Y0;
                C0326a c0326a = new C0326a(hVar, (InterfaceC9974uQ) this.a1, c8932qA, this.c1);
                this.Z0 = 1;
                if (interfaceC3882Ov0.a(c0326a, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return U(interfaceC9974uQ, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, this.c1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    public /* synthetic */ C8932qA(XA0 xa0, InterfaceC3882Ov0 interfaceC3882Ov0, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(xa0, interfaceC3882Ov0, (i2 & 4) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<R> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C8932qA(this.Z0, this.Y0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC8445oA
    @Nullable
    public Object u(@NotNull InterfaceC4076Qv0<? super R> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        Object g = C10217vQ.g(new a(this, interfaceC4076Qv0, null), hm);
        if (g == C7289jT0.l()) {
            return g;
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8932qA(@NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC3882Ov0, interfaceC5809dQ, i, enumC7132iq);
        this.Z0 = xa0;
    }
}
