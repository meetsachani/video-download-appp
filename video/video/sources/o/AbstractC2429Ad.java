package o;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.content.Context;

/* renamed from: o.Ad  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2429Ad {
    public static final b a = new b(null);

    /* renamed from: o.Ad$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC2429Ad a(Context context) {
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
    public static final AbstractC2429Ad b(Context context) {
        return a.a(context);
    }

    public abstract Object a(HM<? super C9777td> hm);

    /* renamed from: o.Ad$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2429Ad {
        public final AppSetIdManager b;

        @FV(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl", f = "AppSetIdManager.kt", i = {}, l = {55}, m = "getAppSetId", n = {}, s = {})
        /* renamed from: o.Ad$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0152a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int b1;

            public C0152a(HM<? super C0152a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        public a(AppSetIdManager appSetIdManager) {
            C6562gT0.p(appSetIdManager, "mAppSetIdManager");
            this.b = appSetIdManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // o.AbstractC2429Ad
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(HM<? super C9777td> hm) {
            C0152a c0152a;
            int i;
            a aVar;
            if (hm instanceof C0152a) {
                c0152a = (C0152a) hm;
                int i2 = c0152a.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0152a.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = c0152a.Z0;
                    Object l = C7289jT0.l();
                    i = c0152a.b1;
                    if (i == 0) {
                        if (i == 1) {
                            aVar = (a) c0152a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        c0152a.Y0 = this;
                        c0152a.b1 = 1;
                        obj = f(c0152a);
                        if (obj == l) {
                            return l;
                        }
                        aVar = this;
                    }
                    return aVar.e(C10020ud.a(obj));
                }
            }
            c0152a = new C0152a(hm);
            Object obj2 = c0152a.Z0;
            Object l2 = C7289jT0.l();
            i = c0152a.b1;
            if (i == 0) {
            }
            return aVar.e(C10020ud.a(obj2));
        }

        public final C9777td e(AppSetId appSetId) {
            int scope;
            String id;
            String id2;
            scope = appSetId.getScope();
            if (scope == 1) {
                id2 = appSetId.getId();
                C6562gT0.o(id2, "response.id");
                return new C9777td(id2, 1);
            }
            id = appSetId.getId();
            C6562gT0.o(id, "response.id");
            return new C9777td(id, 2);
        }

        public final Object f(HM<? super AppSetId> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.getAppSetId(new D6(), C2799Dw1.a(c8883py));
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
            this(C10509wd.a(r2));
            C6562gT0.p(context, "context");
            Object systemService = context.getSystemService(C10263vd.a());
            C6562gT0.o(systemService, "context.getSystemService…:class.java\n            )");
        }
    }
}
