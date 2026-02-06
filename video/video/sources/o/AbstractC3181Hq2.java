package o;

import android.content.Context;

/* renamed from: o.Hq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3181Hq2 {
    public static final b a = new b(null);

    /* renamed from: o.Hq2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3181Hq2 {
        public final AbstractC11050yq2 b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.Hq2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0188a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C5515cD0>, Object> {
            public int Z0;
            public final /* synthetic */ C5273bD0 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188a(C5273bD0 c5273bD0, HM<? super C0188a> hm) {
                super(2, hm);
                this.b1 = c5273bD0;
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
                AbstractC11050yq2 abstractC11050yq2 = a.this.b;
                C5273bD0 c5273bD0 = this.b1;
                this.Z0 = 1;
                Object a = abstractC11050yq2.a(c5273bD0, this);
                if (a == l) {
                    return l;
                }
                return a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C5515cD0> hm) {
                return ((C0188a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0188a(this.b1, hm);
            }
        }

        public a(AbstractC11050yq2 abstractC11050yq2) {
            C6562gT0.p(abstractC11050yq2, "mTopicsManager");
            this.b = abstractC11050yq2;
        }

        @Override // o.AbstractC3181Hq2
        public InterfaceFutureC8411o11<C5515cD0> b(C5273bD0 c5273bD0) {
            C6562gT0.p(c5273bD0, "request");
            return C5324bQ.c(C5426br.b(C10217vQ.a(C8909q40.e()), null, null, new C0188a(c5273bD0, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: o.Hq2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC3181Hq2 a(Context context) {
            C6562gT0.p(context, "context");
            AbstractC11050yq2 a = AbstractC11050yq2.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC3181Hq2 a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C5515cD0> b(C5273bD0 c5273bD0);
}
