package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.nA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8202nA<T> extends AbstractC7455kA<T> {
    @NotNull
    public final InterfaceC3882Ov0<InterfaceC3882Ov0<T>> Y0;
    public final int Z0;

    /* renamed from: o.nA$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RU0 X;
        public final /* synthetic */ InterfaceC8652p02 Y;
        public final /* synthetic */ C10848y02<T> Y0;
        public final /* synthetic */ AI1<T> Z;

        @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.nA$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0310a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ InterfaceC3882Ov0<T> a1;
            public final /* synthetic */ C10848y02<T> b1;
            public final /* synthetic */ InterfaceC8652p02 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0310a(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, C10848y02<T> c10848y02, InterfaceC8652p02 interfaceC8652p02, HM<? super C0310a> hm) {
                super(2, hm);
                this.a1 = interfaceC3882Ov0;
                this.b1 = c10848y02;
                this.c1 = interfaceC8652p02;
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
                        InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.a1;
                        C10848y02<T> c10848y02 = this.b1;
                        this.Z0 = 1;
                        if (interfaceC3882Ov0.a(c10848y02, this) == l) {
                            return l;
                        }
                    }
                    this.c1.g();
                    return C7458kA2.a;
                } catch (Throwable th) {
                    this.c1.g();
                    throw th;
                }
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((C0310a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0310a(this.a1, this.b1, this.c1, hm);
            }
        }

        @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {62}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        /* renamed from: o.nA$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends KM {
            public Object Y0;
            public Object Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ a<T> b1;
            public int c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, HM<? super b> hm) {
                super(hm);
                this.b1 = aVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.a1 = obj;
                this.c1 |= Integer.MIN_VALUE;
                return this.b1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(RU0 ru0, InterfaceC8652p02 interfaceC8652p02, AI1<? super T> ai1, C10848y02<T> c10848y02) {
            this.X = ru0;
            this.Y = interfaceC8652p02;
            this.Z = ai1;
            this.Y0 = c10848y02;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // o.InterfaceC4076Qv0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super C7458kA2> hm) {
            b bVar;
            int i;
            a<T> aVar;
            if (hm instanceof b) {
                bVar = (b) hm;
                int i2 = bVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.c1 = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.a1;
                    Object l = C7289jT0.l();
                    i = bVar.c1;
                    if (i == 0) {
                        if (i == 1) {
                            interfaceC3882Ov0 = (InterfaceC3882Ov0) bVar.Z0;
                            aVar = (a) bVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        RU0 ru0 = this.X;
                        if (ru0 != null) {
                            C5829dV0.z(ru0);
                        }
                        InterfaceC8652p02 interfaceC8652p02 = this.Y;
                        bVar.Y0 = this;
                        bVar.Z0 = interfaceC3882Ov0;
                        bVar.c1 = 1;
                        if (interfaceC8652p02.b(bVar) == l) {
                            return l;
                        }
                        aVar = this;
                    }
                    C5910dr.f(aVar.Z, null, null, new C0310a(interfaceC3882Ov0, aVar.Y0, aVar.Y, null), 3, null);
                    return C7458kA2.a;
                }
            }
            bVar = new b(this, hm);
            Object obj2 = bVar.a1;
            Object l2 = C7289jT0.l();
            i = bVar.c1;
            if (i == 0) {
            }
            C5910dr.f(aVar.Z, null, null, new C0310a(interfaceC3882Ov0, aVar.Y0, aVar.Y, null), 3, null);
            return C7458kA2.a;
        }
    }

    public /* synthetic */ C8202nA(InterfaceC3882Ov0 interfaceC3882Ov0, int i, InterfaceC5809dQ interfaceC5809dQ, int i2, EnumC7132iq enumC7132iq, int i3, C9516sY c9516sY) {
        this(interfaceC3882Ov0, i, (i3 & 4) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public String e() {
        return "concurrency=" + this.Z0;
    }

    @Override // o.AbstractC7455kA
    @Nullable
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        Object a2 = this.Y0.a(new a((RU0) hm.getContext().f(RU0.W), C9630t02.b(this.Z0, 0, 2, null), ai1, new C10848y02(ai1)), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C8202nA(this.Y0, this.Z0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public OO1<T> o(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C10919yI1.g(interfaceC9974uQ, this.X, this.Y, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8202nA(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0, int i, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i2, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC5809dQ, i2, enumC7132iq);
        this.Y0 = interfaceC3882Ov0;
        this.Z0 = i;
    }
}
