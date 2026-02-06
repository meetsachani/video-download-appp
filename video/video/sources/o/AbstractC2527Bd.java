package o;

import android.content.Context;

/* renamed from: o.Bd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2527Bd {
    public static final b a = new b(null);

    /* renamed from: o.Bd$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2527Bd {
        public final AbstractC2429Ad b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1", f = "AppSetIdManagerFutures.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.Bd$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0162a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C9777td>, Object> {
            public int Z0;

            public C0162a(HM<? super C0162a> hm) {
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
                AbstractC2429Ad abstractC2429Ad = a.this.b;
                this.Z0 = 1;
                Object a = abstractC2429Ad.a(this);
                if (a == l) {
                    return l;
                }
                return a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C9777td> hm) {
                return ((C0162a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0162a(hm);
            }
        }

        public a(AbstractC2429Ad abstractC2429Ad) {
            C6562gT0.p(abstractC2429Ad, "mAppSetIdManager");
            this.b = abstractC2429Ad;
        }

        @Override // o.AbstractC2527Bd
        public InterfaceFutureC8411o11<C9777td> b() {
            J10 b;
            b = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new C0162a(null), 3, null);
            return C5324bQ.c(b, null, 1, null);
        }
    }

    /* renamed from: o.Bd$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC2527Bd a(Context context) {
            C6562gT0.p(context, "context");
            AbstractC2429Ad a = AbstractC2429Ad.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC2527Bd a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C9777td> b();
}
