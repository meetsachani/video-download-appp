package o;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class RO0 {
    @NotNull
    public static final String A = "packageName";
    @NotNull
    public static final String B = "com.android.billingclient.api.BillingClient";
    @NotNull
    public static final String C = "com.android.billingclient.api.Purchase";
    @NotNull
    public static final String D = "com.android.billingclient.api.Purchase$PurchasesResult";
    @NotNull
    public static final String E = "com.android.billingclient.api.SkuDetails";
    @NotNull
    public static final String F = "com.android.billingclient.api.PurchaseHistoryRecord";
    @NotNull
    public static final String G = "com.android.billingclient.api.SkuDetailsResponseListener";
    @NotNull
    public static final String H = "com.android.billingclient.api.PurchaseHistoryResponseListener";
    @NotNull
    public static final String I = "com.android.billingclient.api.BillingClient$Builder";
    @NotNull
    public static final String J = "com.android.billingclient.api.PurchasesUpdatedListener";
    @NotNull
    public static final String K = "com.android.billingclient.api.BillingClientStateListener";
    @NotNull
    public static final String L = "queryPurchases";
    @NotNull
    public static final String M = "getPurchasesList";
    @NotNull
    public static final String N = "getOriginalJson";
    @NotNull
    public static final String O = "querySkuDetailsAsync";
    @NotNull
    public static final String P = "queryPurchaseHistoryAsync";
    @NotNull
    public static final String Q = "newBuilder";
    @NotNull
    public static final String R = "enablePendingPurchases";
    @NotNull
    public static final String S = "setListener";
    @NotNull
    public static final String T = "build";
    @NotNull
    public static final String U = "startConnection";
    @NotNull
    public static final String V = "onBillingSetupFinished";
    @NotNull
    public static final String W = "onBillingServiceDisconnected";
    @NotNull
    public static final String X = "onPurchaseHistoryResponse";
    @NotNull
    public static final String Y = "onSkuDetailsResponse";
    @Nullable
    public static RO0 u = null;
    @NotNull
    public static final String y = "inapp";
    @NotNull
    public static final String z = "productId";
    @NotNull
    public final Context a;
    @NotNull
    public final Object b;
    @NotNull
    public final Class<?> c;
    @NotNull
    public final Class<?> d;
    @NotNull
    public final Class<?> e;
    @NotNull
    public final Class<?> f;
    @NotNull
    public final Class<?> g;
    @NotNull
    public final Class<?> h;
    @NotNull
    public final Class<?> i;
    @NotNull
    public final Method j;
    @NotNull
    public final Method k;
    @NotNull
    public final Method l;
    @NotNull
    public final Method m;
    @NotNull
    public final Method n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final Method f598o;
    @NotNull
    public final Method p;
    @NotNull
    public final WO0 q;
    @NotNull
    public final Set<String> r;
    @NotNull
    public static final b s = new b(null);
    @NotNull
    public static final AtomicBoolean t = new AtomicBoolean(false);
    @NotNull
    public static final AtomicBoolean v = new AtomicBoolean(false);
    @NotNull
    public static final Map<String, JSONObject> w = new ConcurrentHashMap();
    @NotNull
    public static final Map<String, JSONObject> x = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            if (SQ.e(this)) {
                return null;
            }
            try {
                C6562gT0.p(obj, "proxy");
                C6562gT0.p(method, "m");
                if (C6562gT0.g(method.getName(), RO0.V)) {
                    RO0.s.f().set(true);
                } else {
                    String name = method.getName();
                    C6562gT0.o(name, "m.name");
                    if (C9545sf2.b2(name, RO0.W, false, 2, null)) {
                        RO0.s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public final Object a(Context context, Class<?> cls) {
            Object e;
            Object e2;
            Object e3;
            XO0 xo0 = XO0.a;
            Class<?> a = XO0.a(RO0.I);
            Class<?> a2 = XO0.a(RO0.J);
            if (a != null && a2 != null) {
                Method d = XO0.d(cls, "newBuilder", Context.class);
                Method d2 = XO0.d(a, RO0.R, new Class[0]);
                Method d3 = XO0.d(a, RO0.S, a2);
                Method d4 = XO0.d(a, "build", new Class[0]);
                if (d == null || d2 == null || d3 == null || d4 == null || (e = XO0.e(cls, d, null, context)) == null || (e2 = XO0.e(a, d3, e, Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new d()))) == null || (e3 = XO0.e(a, d2, e2, new Object[0])) == null) {
                    return null;
                }
                return XO0.e(a, d4, e3, new Object[0]);
            }
            return null;
        }

        public final void b(Context context) {
            WO0 b = WO0.g.b();
            if (b != null) {
                XO0 xo0 = XO0.a;
                Class<?> a = XO0.a(RO0.B);
                Class<?> a2 = XO0.a("com.android.billingclient.api.Purchase");
                Class<?> a3 = XO0.a(RO0.D);
                Class<?> a4 = XO0.a(RO0.E);
                Class<?> a5 = XO0.a(RO0.F);
                Class<?> a6 = XO0.a(RO0.G);
                Class<?> a7 = XO0.a(RO0.H);
                if (a != null && a3 != null && a2 != null && a4 != null && a6 != null && a5 != null && a7 != null) {
                    Method d = XO0.d(a, RO0.L, String.class);
                    Method d2 = XO0.d(a3, RO0.M, new Class[0]);
                    Method d3 = XO0.d(a2, RO0.N, new Class[0]);
                    Method d4 = XO0.d(a4, RO0.N, new Class[0]);
                    Method d5 = XO0.d(a5, RO0.N, new Class[0]);
                    Method d6 = XO0.d(a, RO0.O, b.f(), a6);
                    Method d7 = XO0.d(a, RO0.P, String.class, a7);
                    if (d != null && d2 != null && d3 != null && d4 != null && d5 != null && d6 != null && d7 != null) {
                        Object a8 = a(context, a);
                        if (a8 != null) {
                            RO0.m(new RO0(context, a8, a, a3, a2, a4, a5, a6, a7, d, d2, d3, d4, d5, d6, d7, b, null));
                            RO0 g = RO0.g();
                            if (g != null) {
                                RO0.n(g);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                        }
                    }
                }
            }
        }

        @InterfaceC9511sW0
        @Nullable
        public final synchronized RO0 c(@NotNull Context context) {
            C6562gT0.p(context, "context");
            if (RO0.f().get()) {
                return RO0.g();
            }
            b(context);
            RO0.f().set(true);
            return RO0.g();
        }

        @NotNull
        public final Map<String, JSONObject> d() {
            return RO0.h();
        }

        @NotNull
        public final Map<String, JSONObject> e() {
            return RO0.k();
        }

        @NotNull
        public final AtomicBoolean f() {
            return RO0.l();
        }

        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements InvocationHandler {
        @NotNull
        public Runnable a;
        public final /* synthetic */ RO0 b;

        public c(@NotNull RO0 ro0, Runnable runnable) {
            C6562gT0.p(ro0, "this$0");
            C6562gT0.p(runnable, "runnable");
            this.b = ro0;
            this.a = runnable;
        }

        public final void a(List<?> list) {
            String str;
            if (!SQ.e(this)) {
                try {
                    for (Object obj : list) {
                        try {
                            XO0 xo0 = XO0.a;
                            Object e = XO0.e(RO0.i(this.b), RO0.c(this.b), obj, new Object[0]);
                            if (e instanceof String) {
                                str = (String) e;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                jSONObject.put("packageName", RO0.b(this.b).getPackageName());
                                if (jSONObject.has(RO0.z)) {
                                    String string = jSONObject.getString(RO0.z);
                                    RO0.e(this.b).add(string);
                                    Map<String, JSONObject> d = RO0.s.d();
                                    C6562gT0.o(string, "skuID");
                                    d.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.a.run();
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        @NotNull
        public final Runnable b() {
            if (SQ.e(this)) {
                return null;
            }
            try {
                return this.a;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        public final void c(@NotNull Runnable runnable) {
            if (SQ.e(this)) {
                return;
            }
            try {
                C6562gT0.p(runnable, "<set-?>");
                this.a = runnable;
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            Object obj2;
            if (SQ.e(this)) {
                return null;
            }
            try {
                C6562gT0.p(obj, "proxy");
                C6562gT0.p(method, "method");
                if (C6562gT0.g(method.getName(), RO0.X)) {
                    if (objArr == null) {
                        obj2 = null;
                    } else {
                        obj2 = objArr[1];
                    }
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            if (SQ.e(this)) {
                return null;
            }
            try {
                C6562gT0.p(obj, "proxy");
                C6562gT0.p(method, "m");
                return null;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements InvocationHandler {
        @NotNull
        public Runnable a;
        public final /* synthetic */ RO0 b;

        public e(@NotNull RO0 ro0, Runnable runnable) {
            C6562gT0.p(ro0, "this$0");
            C6562gT0.p(runnable, "runnable");
            this.b = ro0;
            this.a = runnable;
        }

        @NotNull
        public final Runnable a() {
            if (SQ.e(this)) {
                return null;
            }
            try {
                return this.a;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        public final void b(@NotNull List<?> list) {
            String str;
            if (!SQ.e(this)) {
                try {
                    C6562gT0.p(list, "skuDetailsObjectList");
                    for (Object obj : list) {
                        try {
                            XO0 xo0 = XO0.a;
                            Object e = XO0.e(RO0.j(this.b), RO0.d(this.b), obj, new Object[0]);
                            if (e instanceof String) {
                                str = (String) e;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has(RO0.z)) {
                                    String string = jSONObject.getString(RO0.z);
                                    Map<String, JSONObject> e2 = RO0.s.e();
                                    C6562gT0.o(string, "skuID");
                                    e2.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.a.run();
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        public final void c(@NotNull Runnable runnable) {
            if (SQ.e(this)) {
                return;
            }
            try {
                C6562gT0.p(runnable, "<set-?>");
                this.a = runnable;
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            Object obj2;
            if (SQ.e(this)) {
                return null;
            }
            try {
                C6562gT0.p(obj, "proxy");
                C6562gT0.p(method, "m");
                if (C6562gT0.g(method.getName(), RO0.Y)) {
                    if (objArr == null) {
                        obj2 = null;
                    } else {
                        obj2 = objArr[1];
                    }
                    if (obj2 != null && (obj2 instanceof List)) {
                        b((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }
    }

    public /* synthetic */ RO0(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, WO0 wo0, C9516sY c9516sY) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, wo0);
    }

    public static final /* synthetic */ Context b(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.a;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.n;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.m;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.r;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return t;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ RO0 g() {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return w;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.g;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return ro0.f;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return x;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (SQ.e(RO0.class)) {
            return null;
        }
        try {
            return v;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return;
        }
        try {
            u = ro0;
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
        }
    }

    public static final /* synthetic */ void n(RO0 ro0) {
        if (SQ.e(RO0.class)) {
            return;
        }
        try {
            ro0.u();
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final synchronized RO0 o(@NotNull Context context) {
        synchronized (RO0.class) {
            if (SQ.e(RO0.class)) {
                return null;
            }
            return s.c(context);
        }
    }

    public static final void r(RO0 ro0, Runnable runnable) {
        if (SQ.e(RO0.class)) {
            return;
        }
        try {
            C6562gT0.p(ro0, "this$0");
            C6562gT0.p(runnable, "$queryPurchaseHistoryRunnable");
            ro0.t("inapp", new ArrayList(ro0.r), runnable);
        } catch (Throwable th) {
            SQ.c(th, RO0.class);
        }
    }

    public final void p(@NotNull String str, @NotNull Runnable runnable) {
        List list;
        String str2;
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(str, "skuType");
                C6562gT0.p(runnable, "querySkuRunnable");
                XO0 xo0 = XO0.a;
                Object e2 = XO0.e(this.d, this.k, XO0.e(this.c, this.j, this.b, "inapp"), new Object[0]);
                if (e2 instanceof List) {
                    list = (List) e2;
                } else {
                    list = null;
                }
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            XO0 xo02 = XO0.a;
                            Object e3 = XO0.e(this.e, this.l, obj, new Object[0]);
                            if (e3 instanceof String) {
                                str2 = (String) e3;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.has(z)) {
                                    String string = jSONObject.getString(z);
                                    arrayList.add(string);
                                    Map<String, JSONObject> map = w;
                                    C6562gT0.o(string, "skuID");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                        t(str, arrayList, runnable);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void q(@NotNull String str, @NotNull final Runnable runnable) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(str, "skuType");
            C6562gT0.p(runnable, "queryPurchaseHistoryRunnable");
            s(str, new Runnable() { // from class: o.QO0
                @Override // java.lang.Runnable
                public final void run() {
                    RO0.r(RO0.this, runnable);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void s(String str, Runnable runnable) {
        if (SQ.e(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.i.getClassLoader(), new Class[]{this.i}, new c(this, runnable));
            XO0 xo0 = XO0.a;
            XO0.e(this.c, this.p, this.b, str, newProxyInstance);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void t(String str, List<String> list, Runnable runnable) {
        if (SQ.e(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.h.getClassLoader(), new Class[]{this.h}, new e(this, runnable));
            Object e2 = this.q.e(str, list);
            XO0 xo0 = XO0.a;
            XO0.e(this.c, this.f598o, this.b, e2, newProxyInstance);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void u() {
        Method d2;
        if (!SQ.e(this)) {
            try {
                XO0 xo0 = XO0.a;
                Class<?> a2 = XO0.a(K);
                if (a2 == null || (d2 = XO0.d(this.c, U, a2)) == null) {
                    return;
                }
                XO0.e(this.c, d2, this.b, Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new a()));
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public RO0(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, WO0 wo0) {
        this.a = context;
        this.b = obj;
        this.c = cls;
        this.d = cls2;
        this.e = cls3;
        this.f = cls4;
        this.g = cls5;
        this.h = cls6;
        this.i = cls7;
        this.j = method;
        this.k = method2;
        this.l = method3;
        this.m = method4;
        this.n = method5;
        this.f598o = method6;
        this.p = method7;
        this.q = wo0;
        this.r = new CopyOnWriteArraySet();
    }
}
