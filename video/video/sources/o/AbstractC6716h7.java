package o;

import android.content.Context;

/* renamed from: o.h7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6716h7 {
    public static final b a = new b(null);

    /* renamed from: o.h7$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6716h7 {
        public final AbstractC6473g7 b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.h7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0285a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ RR1 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0285a(RR1 rr1, HM<? super C0285a> hm) {
                super(2, hm);
                this.b1 = rr1;
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
                    AbstractC6473g7 abstractC6473g7 = a.this.b;
                    C6562gT0.m(abstractC6473g7);
                    RR1 rr1 = this.b1;
                    this.Z0 = 1;
                    if (abstractC6473g7.b(rr1, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((C0285a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0285a(this.b1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.h7$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C6959i7>, Object> {
            public int Z0;
            public final /* synthetic */ L6 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(L6 l6, HM<? super b> hm) {
                super(2, hm);
                this.b1 = l6;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                Object l = C7289jT0.l();
                int i = this.Z0;
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
                AbstractC6473g7 abstractC6473g7 = a.this.b;
                C6562gT0.m(abstractC6473g7);
                L6 l6 = this.b1;
                this.Z0 = 1;
                Object c = abstractC6473g7.c(l6, this);
                if (c == l) {
                    return l;
                }
                return c;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C6959i7> hm) {
                return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new b(this.b1, hm);
            }
        }

        public a(AbstractC6473g7 abstractC6473g7) {
            this.b = abstractC6473g7;
        }

        @Override // o.AbstractC6716h7
        public InterfaceFutureC8411o11<C7458kA2> b(RR1 rr1) {
            J10 b2;
            C6562gT0.p(rr1, "reportImpressionRequest");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new C0285a(rr1, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC6716h7
        public InterfaceFutureC8411o11<C6959i7> c(L6 l6) {
            J10 b2;
            C6562gT0.p(l6, "adSelectionConfig");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new b(l6, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }
    }

    /* renamed from: o.h7$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC6716h7 a(Context context) {
            C6562gT0.p(context, "context");
            AbstractC6473g7 a = AbstractC6473g7.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC6716h7 a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C7458kA2> b(RR1 rr1);

    public abstract InterfaceFutureC8411o11<C6959i7> c(L6 l6);
}
