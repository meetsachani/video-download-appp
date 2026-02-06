package o;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class E6 {
    public static final b a = new b(null);

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final E6 a(Context context) {
            C6562gT0.p(context, "context");
            if (C7443k7.a.a() >= 4) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final E6 b(Context context) {
        return a.a(context);
    }

    public abstract Object a(HM<? super C10383w6> hm);

    /* loaded from: classes.dex */
    public static final class a extends E6 {
        public final AdIdManager b;

        @FV(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", i = {}, l = {62}, m = "getAdId", n = {}, s = {})
        /* renamed from: o.E6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0179a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int b1;

            public C0179a(HM<? super C0179a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        public a(AdIdManager adIdManager) {
            C6562gT0.p(adIdManager, "mAdIdManager");
            this.b = adIdManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // o.E6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(HM<? super C10383w6> hm) {
            C0179a c0179a;
            int i;
            a aVar;
            if (hm instanceof C0179a) {
                c0179a = (C0179a) hm;
                int i2 = c0179a.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0179a.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = c0179a.Z0;
                    Object l = C7289jT0.l();
                    i = c0179a.b1;
                    if (i == 0) {
                        if (i == 1) {
                            aVar = (a) c0179a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        c0179a.Y0 = this;
                        c0179a.b1 = 1;
                        obj = f(c0179a);
                        if (obj == l) {
                            return l;
                        }
                        aVar = this;
                    }
                    return aVar.e(C11112z6.a(obj));
                }
            }
            c0179a = new C0179a(hm);
            Object obj2 = c0179a.Z0;
            Object l2 = C7289jT0.l();
            i = c0179a.b1;
            if (i == 0) {
            }
            return aVar.e(C11112z6.a(obj2));
        }

        public final C10383w6 e(AdId adId) {
            String adId2;
            boolean isLimitAdTrackingEnabled;
            adId2 = adId.getAdId();
            C6562gT0.o(adId2, "response.adId");
            isLimitAdTrackingEnabled = adId.isLimitAdTrackingEnabled();
            return new C10383w6(adId2, isLimitAdTrackingEnabled);
        }

        public final Object f(HM<? super AdId> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.getAdId(new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            this(B6.a(r2));
            C6562gT0.p(context, "context");
            Object systemService = context.getSystemService(A6.a());
            C6562gT0.o(systemService, "context.getSystemService…:class.java\n            )");
        }
    }
}
