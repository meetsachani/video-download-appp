package o;

import android.content.Context;

/* renamed from: o.iT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7047iT {
    public static final b a = new b(null);

    /* renamed from: o.iT$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC7047iT {
        public final AbstractC6804hT b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.iT$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0291a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ C7539kV0 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0291a(C7539kV0 c7539kV0, HM<? super C0291a> hm) {
                super(2, hm);
                this.b1 = c7539kV0;
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
                    AbstractC6804hT abstractC6804hT = a.this.b;
                    C6562gT0.m(abstractC6804hT);
                    C7539kV0 c7539kV0 = this.b1;
                    this.Z0 = 1;
                    if (abstractC6804hT.a(c7539kV0, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((C0291a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0291a(this.b1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.iT$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ C7794lZ0 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C7794lZ0 c7794lZ0, HM<? super b> hm) {
                super(2, hm);
                this.b1 = c7794lZ0;
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
                    AbstractC6804hT abstractC6804hT = a.this.b;
                    C6562gT0.m(abstractC6804hT);
                    C7794lZ0 c7794lZ0 = this.b1;
                    this.Z0 = 1;
                    if (abstractC6804hT.b(c7794lZ0, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new b(this.b1, hm);
            }
        }

        public a(AbstractC6804hT abstractC6804hT) {
            this.b = abstractC6804hT;
        }

        @Override // o.AbstractC7047iT
        public InterfaceFutureC8411o11<C7458kA2> b(C7539kV0 c7539kV0) {
            J10 b2;
            C6562gT0.p(c7539kV0, "request");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new C0291a(c7539kV0, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC7047iT
        public InterfaceFutureC8411o11<C7458kA2> c(C7794lZ0 c7794lZ0) {
            J10 b2;
            C6562gT0.p(c7794lZ0, "request");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new b(c7794lZ0, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }
    }

    /* renamed from: o.iT$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC7047iT a(Context context) {
            C6562gT0.p(context, "context");
            AbstractC6804hT a = AbstractC6804hT.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC7047iT a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C7458kA2> b(C7539kV0 c7539kV0);

    public abstract InterfaceFutureC8411o11<C7458kA2> c(C7794lZ0 c7794lZ0);
}
