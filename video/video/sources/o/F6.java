package o;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class F6 {
    public static final b a = new b(null);

    /* loaded from: classes.dex */
    public static final class a extends F6 {
        public final E6 b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.F6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0184a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C10383w6>, Object> {
            public int Z0;

            public C0184a(HM<? super C0184a> hm) {
                super(2, hm);
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
                E6 e6 = a.this.b;
                this.Z0 = 1;
                Object a = e6.a(this);
                if (a == l) {
                    return l;
                }
                return a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C10383w6> hm) {
                return ((C0184a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0184a(hm);
            }
        }

        public a(E6 e6) {
            C6562gT0.p(e6, "mAdIdManager");
            this.b = e6;
        }

        @Override // o.F6
        public InterfaceFutureC8411o11<C10383w6> b() {
            J10 b;
            b = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new C0184a(null), 3, null);
            return C5324bQ.c(b, null, 1, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final F6 a(Context context) {
            C6562gT0.p(context, "context");
            E6 a = E6.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final F6 a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C10383w6> b();
}
