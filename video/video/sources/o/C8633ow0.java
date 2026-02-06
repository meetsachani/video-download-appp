package o;

import o.InterfaceC7677l42;
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
@InterfaceC8303na2({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
/* renamed from: o.ow0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8633ow0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, C10997yd1.z1, 221}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.ow0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ InterfaceC7677l42 a1;
        public final /* synthetic */ InterfaceC3882Ov0<T> b1;
        public final /* synthetic */ InterfaceC3950Pn1<T> c1;
        public final /* synthetic */ T d1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ow0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0315a extends AbstractC4225Si2 implements VA0<Integer, HM<? super Boolean>, Object> {
            public int Z0;
            public /* synthetic */ int a1;

            public C0315a(HM<? super C0315a> hm) {
                super(2, hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                boolean z;
                C7289jT0.l();
                if (this.Z0 == 0) {
                    RT1.n(obj);
                    if (this.a1 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return C10557wp.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object U(int i, HM<? super Boolean> hm) {
                return ((C0315a) t(Integer.valueOf(i), hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(Integer num, HM<? super Boolean> hm) {
                return U(num.intValue(), hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                C0315a c0315a = new C0315a(hm);
                c0315a.a1 = ((Number) obj).intValue();
                return c0315a;
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ow0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<EnumC7191j42, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ InterfaceC3882Ov0<T> b1;
            public final /* synthetic */ InterfaceC3950Pn1<T> c1;
            public final /* synthetic */ T d1;

            /* renamed from: o.ow0$a$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0316a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnumC7191j42.values().length];
                    try {
                        iArr[EnumC7191j42.X.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC7191j42.Y.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC7191j42.Z.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, InterfaceC3950Pn1<T> interfaceC3950Pn1, T t, HM<? super b> hm) {
                super(2, hm);
                this.b1 = interfaceC3882Ov0;
                this.c1 = interfaceC3950Pn1;
                this.d1 = t;
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
                    int i2 = C0316a.a[((EnumC7191j42) this.a1).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                T t = this.d1;
                                if (t == X32.a) {
                                    this.c1.p();
                                } else {
                                    C10557wp.a(this.c1.f(t));
                                }
                            } else {
                                throw new C3865Oq1();
                            }
                        }
                    } else {
                        InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
                        V32 v32 = this.c1;
                        this.Z0 = 1;
                        if (interfaceC3882Ov0.a(v32, this) == l) {
                            return l;
                        }
                    }
                }
                return C7458kA2.a;
            }

            public final Object U(EnumC7191j42 enumC7191j42, HM<? super C7458kA2> hm) {
                return ((b) t(enumC7191j42, hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(EnumC7191j42 enumC7191j42, HM<? super C7458kA2> hm) {
                return U(enumC7191j42, hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                b bVar = new b(this.b1, this.c1, this.d1, hm);
                bVar.a1 = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC7677l42 interfaceC7677l42, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, InterfaceC3950Pn1<T> interfaceC3950Pn1, T t, HM<? super a> hm) {
            super(2, hm);
            this.a1 = interfaceC7677l42;
            this.b1 = interfaceC3882Ov0;
            this.c1 = interfaceC3950Pn1;
            this.d1 = t;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x003c, code lost:
            if (r8.a(r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
            if (o.C4467Uv0.v0(r8, r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
            if (r8.a(r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
            if (o.C4467Uv0.A(r8, r1, r7) == r0) goto L15;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
                        V32 v32 = this.c1;
                        this.Z0 = 3;
                    }
                }
                RT1.n(obj);
                return C7458kA2.a;
            }
            RT1.n(obj);
            InterfaceC7677l42 interfaceC7677l42 = this.a1;
            InterfaceC7677l42.a aVar = InterfaceC7677l42.a;
            if (interfaceC7677l42 == aVar.c()) {
                InterfaceC3882Ov0<T> interfaceC3882Ov02 = this.b1;
                V32 v322 = this.c1;
                this.Z0 = 1;
            } else if (this.a1 == aVar.d()) {
                InterfaceC9041qc2<Integer> m = this.c1.m();
                C0315a c0315a = new C0315a(null);
                this.Z0 = 2;
            } else {
                InterfaceC3882Ov0 g0 = C4467Uv0.g0(this.a1.a(this.c1.m()));
                b bVar = new b(this.b1, this.c1, this.d1, null);
                this.Z0 = 4;
            }
            return l;
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
            return new a(this.a1, this.b1, this.c1, this.d1, hm);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.ow0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T> b1;
        public final /* synthetic */ HH<InterfaceC9041qc2<T>> c1;

        @InterfaceC8303na2({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
        /* renamed from: o.ow0$b$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ RP1.h<InterfaceC4144Rn1<T>> X;
            public final /* synthetic */ InterfaceC9974uQ Y;
            public final /* synthetic */ HH<InterfaceC9041qc2<T>> Z;

            public a(RP1.h<InterfaceC4144Rn1<T>> hVar, InterfaceC9974uQ interfaceC9974uQ, HH<InterfaceC9041qc2<T>> hh) {
                this.X = hVar;
                this.Y = interfaceC9974uQ;
                this.Z = hh;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [o.qc2, o.Rn1, T] */
            @Override // o.InterfaceC4076Qv0
            public final Object c(T t, HM<? super C7458kA2> hm) {
                RP1.h<InterfaceC4144Rn1<T>> hVar = this.X;
                InterfaceC4144Rn1<T> interfaceC4144Rn1 = hVar.X;
                if (interfaceC4144Rn1 != null) {
                    interfaceC4144Rn1.setValue(t);
                } else {
                    InterfaceC9974uQ interfaceC9974uQ = this.Y;
                    HH<InterfaceC9041qc2<T>> hh = this.Z;
                    ?? r4 = (T) C9533sc2.a(t);
                    hh.C(new KO1(r4, C5829dV0.A(interfaceC9974uQ.a0())));
                    hVar.X = r4;
                }
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HH<InterfaceC9041qc2<T>> hh, HM<? super b> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0;
            this.c1 = hh;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            try {
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.a1;
                    RP1.h hVar = new RP1.h();
                    InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
                    a aVar = new a(hVar, interfaceC9974uQ, this.c1);
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(aVar, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            } catch (Throwable th) {
                this.c1.k(th);
                throw th;
            }
        }

        public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return U(interfaceC9974uQ, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, this.c1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    @NotNull
    public static final <T> V32<T> a(@NotNull InterfaceC3950Pn1<T> interfaceC3950Pn1) {
        return new JO1(interfaceC3950Pn1, null);
    }

    @NotNull
    public static final <T> InterfaceC9041qc2<T> b(@NotNull InterfaceC4144Rn1<T> interfaceC4144Rn1) {
        return new KO1(interfaceC4144Rn1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> C7434k42<T> c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        AbstractC7455kA abstractC7455kA;
        InterfaceC3882Ov0<T> j;
        int u = C5075aO1.u(i, InterfaceC6728hA.r.a()) - i;
        if ((interfaceC3882Ov0 instanceof AbstractC7455kA) && (j = (abstractC7455kA = (AbstractC7455kA) interfaceC3882Ov0).j()) != null) {
            int i2 = abstractC7455kA.Y;
            if (i2 != -3 && i2 != -2 && i2 != 0) {
                u = i2;
            } else if (abstractC7455kA.Z != EnumC7132iq.X) {
                if (i == 0) {
                    u = 1;
                }
                u = 0;
            }
            return new C7434k42<>(j, u, abstractC7455kA.Z, abstractC7455kA.X);
        }
        return new C7434k42<>(interfaceC3882Ov0, u, EnumC7132iq.X, C3897Pa0.X);
    }

    public static final <T> RU0 d(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, InterfaceC3950Pn1<T> interfaceC3950Pn1, InterfaceC7677l42 interfaceC7677l42, T t) {
        EnumC10949yQ enumC10949yQ;
        if (C6562gT0.g(interfaceC7677l42, InterfaceC7677l42.a.c())) {
            enumC10949yQ = EnumC10949yQ.X;
        } else {
            enumC10949yQ = EnumC10949yQ.Y0;
        }
        return C5426br.d(interfaceC9974uQ, interfaceC5809dQ, enumC10949yQ, new a(interfaceC7677l42, interfaceC3882Ov0, interfaceC3950Pn1, t, null));
    }

    public static final <T> void e(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HH<InterfaceC9041qc2<T>> hh) {
        C5910dr.f(interfaceC9974uQ, interfaceC5809dQ, null, new b(interfaceC3882Ov0, hh, null), 2, null);
    }

    @NotNull
    public static final <T> V32<T> f(@NotNull V32<? extends T> v32, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new C2738Dg2(v32, va0);
    }

    @NotNull
    public static final <T> V32<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC7677l42 interfaceC7677l42, int i) {
        C7434k42 c = c(interfaceC3882Ov0, i);
        InterfaceC3950Pn1 a2 = X32.a(i, c.b, c.c);
        return new JO1(a2, d(interfaceC9974uQ, c.d, c.a, a2, interfaceC7677l42, X32.a));
    }

    public static /* synthetic */ V32 h(InterfaceC3882Ov0 interfaceC3882Ov0, InterfaceC9974uQ interfaceC9974uQ, InterfaceC7677l42 interfaceC7677l42, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C4467Uv0.F1(interfaceC3882Ov0, interfaceC9974uQ, interfaceC7677l42, i);
    }

    @Nullable
    public static final <T> Object i(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull HM<? super InterfaceC9041qc2<? extends T>> hm) {
        C7434k42 c = c(interfaceC3882Ov0, 1);
        HH c2 = JH.c(null, 1, null);
        e(interfaceC9974uQ, c.d, c.a, c2);
        return c2.v(hm);
    }

    @NotNull
    public static final <T> InterfaceC9041qc2<T> j(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC7677l42 interfaceC7677l42, T t) {
        C7434k42 c = c(interfaceC3882Ov0, 1);
        InterfaceC4144Rn1 a2 = C9533sc2.a(t);
        return new KO1(a2, d(interfaceC9974uQ, c.d, c.a, a2, interfaceC7677l42, t));
    }
}
