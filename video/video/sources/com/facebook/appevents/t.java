package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.appevents.C2327q;
import com.facebook.appevents.t;
import com.facebook.b0;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2375u;
import com.facebook.internal.C2378x;
import com.facebook.internal.Q;
import com.facebook.internal.V;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C10307vo;
import o.C10763xf2;
import o.C3542Lj;
import o.C4465Uu1;
import o.C6475g71;
import o.C6562gT0;
import o.C7458kA2;
import o.C8912q5;
import o.C9516sY;
import o.C9545sf2;
import o.C9998uW1;
import o.FK;
import o.InterfaceC9511sW0;
import o.PJ1;
import o.RO0;
import o.SO0;
import o.SQ;
import o.UE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t {
    @NotNull
    public static final a c = new a(null);
    @NotNull
    public static final String d;
    public static final int e = 86400;
    @NotNull
    public static final String f = "fb_push_payload";
    @NotNull
    public static final String g = "campaign";
    @NotNull
    public static final String h = "fb_mobile_push_opened";
    @NotNull
    public static final String i = "fb_push_campaign";
    @NotNull
    public static final String j = "fb_push_action";
    @NotNull
    public static final String k = "fb_ak";
    @Nullable
    public static ScheduledThreadPoolExecutor l = null;
    @NotNull
    public static C2327q.b m = null;
    @NotNull
    public static final Object n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public static String f76o = null;
    public static boolean p = false;
    @Nullable
    public static String q = null;
    @NotNull
    public static final String r = "com.facebook.sdk.appEventPreferences";
    @NotNull
    public static final String s = "app_events_killswitch";
    @NotNull
    public final String a;
    @NotNull
    public C2311a b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.facebook.appevents.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0072a implements Q.a {
            @Override // com.facebook.internal.Q.a
            public void a(@Nullable String str) {
                t.c.w(str);
            }
        }

        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final void p(Context context, t tVar) {
            C6562gT0.p(context, "$context");
            C6562gT0.p(tVar, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", RO0.B, SO0.l};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                String str = strArr[i];
                String str2 = strArr2[i];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i2 |= 1 << i;
                } catch (ClassNotFoundException unused) {
                }
                if (i3 > 10) {
                    break;
                }
                i = i3;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                tVar.F(C2356a.z0, null, bundle);
            }
        }

        public static final void r() {
            HashSet<String> hashSet = new HashSet();
            C2324n c2324n = C2324n.a;
            for (C2311a c2311a : C2324n.p()) {
                hashSet.add(c2311a.b());
            }
            for (String str : hashSet) {
                com.facebook.internal.C c = com.facebook.internal.C.a;
                com.facebook.internal.C.q(str, true);
            }
        }

        @InterfaceC9511sW0
        public final void f(@NotNull Application application, @Nullable String str) {
            C6562gT0.p(application, "application");
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.N()) {
                C2314d c2314d = C2314d.a;
                C2314d.e();
                Q q = Q.a;
                Q.j();
                if (str == null) {
                    str = com.facebook.M.o();
                }
                com.facebook.M.S(application, str);
                C8912q5 c8912q5 = C8912q5.a;
                C8912q5.y(application, str);
                return;
            }
            throw new C2416z("The Facebook sdk must be initialized before calling activateApp");
        }

        @InterfaceC9511sW0
        public final void g(@NotNull WebView webView, @Nullable Context context) {
            boolean z;
            int i;
            C6562gT0.p(webView, "webView");
            String str = Build.VERSION.RELEASE;
            C6562gT0.o(str, "RELEASE");
            int i2 = 0;
            Object[] array = C10763xf2.o5(str, new String[]{UE.h}, false, 0, 6, null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = Integer.parseInt(strArr[0]);
                } else {
                    i = 0;
                }
                if (strArr.length > 1) {
                    i2 = Integer.parseInt(strArr[1]);
                }
                if (i >= 4 && (i != 4 || i2 > 1)) {
                    G g = new G(context);
                    com.facebook.M m = com.facebook.M.a;
                    webView.addJavascriptInterface(g, C6562gT0.C("fbmq_", com.facebook.M.o()));
                    return;
                }
                V.e.d(b0.DEVELOPER_ERRORS, t.f(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final void h() {
            if (l() != C2327q.b.EXPLICIT_ONLY) {
                C2324n c2324n = C2324n.a;
                C2324n.l(H.EAGER_FLUSHING_EVENT);
            }
        }

        @InterfaceC9511sW0
        public final void i(@NotNull String str) {
            C6562gT0.p(str, "extraMsg");
            Log.w(t.f(), C6562gT0.C("This function is deprecated. ", str));
        }

        @InterfaceC9511sW0
        @NotNull
        public final Executor j() {
            if (t.b() == null) {
                q();
            }
            ScheduledThreadPoolExecutor b = t.b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @InterfaceC9511sW0
        @NotNull
        public final String k(@NotNull Context context) {
            C6562gT0.p(context, "context");
            if (t.a() == null) {
                synchronized (t.e()) {
                    try {
                        if (t.a() == null) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            a aVar = t.c;
                            t.i(sharedPreferences.getString("anonymousAppDeviceGUID", null));
                            if (t.a() == null) {
                                UUID randomUUID = UUID.randomUUID();
                                C6562gT0.o(randomUUID, "randomUUID()");
                                t.i(C6562gT0.C("XZ", randomUUID));
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", t.a()).apply();
                            }
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String a = t.a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2327q.b l() {
            C2327q.b c;
            synchronized (t.e()) {
                c = t.c();
            }
            return c;
        }

        @InterfaceC9511sW0
        @Nullable
        public final String m() {
            com.facebook.internal.Q q = com.facebook.internal.Q.a;
            com.facebook.internal.Q.d(new C0072a());
            com.facebook.M m = com.facebook.M.a;
            return com.facebook.M.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(ReferrerDetails.b, null);
        }

        @InterfaceC9511sW0
        @Nullable
        public final String n() {
            String d;
            synchronized (t.e()) {
                d = t.d();
            }
            return d;
        }

        @InterfaceC9511sW0
        public final void o(@NotNull final Context context, @Nullable String str) {
            C6562gT0.p(context, "context");
            com.facebook.M m = com.facebook.M.a;
            if (!com.facebook.M.s()) {
                return;
            }
            final t tVar = new t(context, str, (C0376a) null);
            ScheduledThreadPoolExecutor b = t.b();
            if (b != null) {
                b.execute(new Runnable() { // from class: com.facebook.appevents.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.p(context, tVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final void q() {
            synchronized (t.e()) {
                if (t.b() != null) {
                    return;
                }
                a aVar = t.c;
                t.j(new ScheduledThreadPoolExecutor(1));
                C7458kA2 c7458kA2 = C7458kA2.a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.r();
                    }
                };
                ScheduledThreadPoolExecutor b = t.b();
                if (b != null) {
                    b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final void s(C2315e c2315e, C2311a c2311a) {
            C2324n c2324n = C2324n.a;
            C2324n.g(c2311a, c2315e);
            C2375u c2375u = C2375u.a;
            if (C2375u.g(C2375u.b.OnDevicePostInstallEventProcessing)) {
                C4465Uu1 c4465Uu1 = C4465Uu1.a;
                if (C4465Uu1.d()) {
                    C4465Uu1.e(c2311a.b(), c2315e);
                }
            }
            if (!c2315e.c() && !t.g()) {
                if (C6562gT0.g(c2315e.g(), C2326p.b)) {
                    t.h(true);
                } else {
                    V.e.d(b0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        public final void t(String str) {
            V.e.d(b0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        @InterfaceC9511sW0
        public final void u() {
            C2324n c2324n = C2324n.a;
            C2324n.s();
        }

        @InterfaceC9511sW0
        public final void v(@NotNull C2327q.b bVar) {
            C6562gT0.p(bVar, "flushBehavior");
            synchronized (t.e()) {
                a aVar = t.c;
                t.k(bVar);
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
        }

        @InterfaceC9511sW0
        public final void w(@Nullable String str) {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString(ReferrerDetails.b, str).apply();
            }
        }

        @InterfaceC9511sW0
        public final void x(@Nullable String str) {
            synchronized (t.e()) {
                try {
                    l0 l0Var = l0.a;
                    if (!l0.T0(t.d(), str)) {
                        a aVar = t.c;
                        t.l(str);
                        com.facebook.M m = com.facebook.M.a;
                        t tVar = new t(com.facebook.M.n(), (String) null, (C0376a) null);
                        tVar.y(C2326p.k);
                        if (aVar.l() != C2327q.b.EXPLICIT_ONLY) {
                            tVar.o();
                        }
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public a() {
        }
    }

    static {
        String canonicalName = t.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        d = canonicalName;
        m = C2327q.b.AUTO;
        n = new Object();
    }

    public t(@NotNull String str, @Nullable String str2, @Nullable C0376a c0376a) {
        C6562gT0.p(str, "activityName");
        m0 m0Var = m0.a;
        m0.w();
        this.a = str;
        c0376a = c0376a == null ? C0376a.g1.i() : c0376a;
        if (c0376a == null || c0376a.C() || !(str2 == null || C6562gT0.g(str2, c0376a.h()))) {
            if (str2 == null) {
                l0 l0Var = l0.a;
                com.facebook.M m2 = com.facebook.M.a;
                str2 = l0.K(com.facebook.M.n());
            }
            if (str2 != null) {
                this.b = new C2311a(null, str2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            this.b = new C2311a(c0376a);
        }
        c.q();
    }

    public static /* synthetic */ void D(t tVar, String str, Bundle bundle, int i2, Object obj) {
        if (SQ.e(t.class)) {
            return;
        }
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        try {
            tVar.B(str, bundle);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static /* synthetic */ void L(t tVar, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i2, Object obj) {
        if (SQ.e(t.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        try {
            tVar.J(bigDecimal, currency, bundle);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void P() {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.u();
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void Q(@NotNull C2327q.b bVar) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.v(bVar);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void R(@Nullable String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.w(str);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void S(@Nullable String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.x(str);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static final /* synthetic */ String a() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return f76o;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return l;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ C2327q.b c() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return m;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return q;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return n;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ String f() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean g() {
        if (SQ.e(t.class)) {
            return false;
        }
        try {
            return p;
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return false;
        }
    }

    public static final /* synthetic */ void h(boolean z) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            p = z;
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static final /* synthetic */ void i(String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            f76o = str;
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static final /* synthetic */ void j(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            l = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static final /* synthetic */ void k(C2327q.b bVar) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            m = bVar;
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public static final /* synthetic */ void l(String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            q = str;
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void m(@NotNull Application application, @Nullable String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.f(application, str);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void n(@NotNull WebView webView, @Nullable Context context) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.g(webView, context);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    public static final void p(@NotNull String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.i(str);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Executor q() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return c.j();
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String r(@NotNull Context context) {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return c.k(context);
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2327q.b t() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return c.l();
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String u() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return c.m();
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String v() {
        if (SQ.e(t.class)) {
            return null;
        }
        try {
            return c.n();
        } catch (Throwable th) {
            SQ.c(th, t.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void w(@NotNull Context context, @Nullable String str) {
        if (SQ.e(t.class)) {
            return;
        }
        try {
            c.o(context, str);
        } catch (Throwable th) {
            SQ.c(th, t.class);
        }
    }

    public final void A(@Nullable String str, double d2, @Nullable Bundle bundle) {
        Double valueOf;
        if (SQ.e(this)) {
            return;
        }
        try {
            valueOf = Double.valueOf(d2);
            C8912q5 c8912q5 = C8912q5.a;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C(str, valueOf, bundle, false, C8912q5.m());
        } catch (Throwable th2) {
            th = th2;
            SQ.c(th, this);
        }
    }

    public final void B(@Nullable String str, @Nullable Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C8912q5 c8912q5 = C8912q5.a;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C(str, null, bundle, false, C8912q5.m());
        } catch (Throwable th2) {
            th = th2;
            SQ.c(th, this);
        }
    }

    public final void C(@Nullable String str, @Nullable Double d2, @Nullable Bundle bundle, boolean z, @Nullable UUID uuid) {
        if (!SQ.e(this) && str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                C2378x c2378x = C2378x.a;
                com.facebook.M m2 = com.facebook.M.a;
                if (C2378x.d(s, com.facebook.M.o(), false)) {
                    V.e.e(b0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                    return;
                }
                C10307vo c10307vo = C10307vo.a;
                if (!C10307vo.c(str)) {
                    try {
                        C6475g71 c6475g71 = C6475g71.a;
                        C6475g71.h(bundle, str);
                        PJ1 pj1 = PJ1.a;
                        PJ1.f(bundle);
                        String str2 = this.a;
                        C8912q5 c8912q5 = C8912q5.a;
                        c.s(new C2315e(str2, str, d2, bundle, z, C8912q5.o(), uuid), this.b);
                    } catch (C2416z e2) {
                        V.e.e(b0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
                    } catch (JSONException e3) {
                        V.e.e(b0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void E(@Nullable String str, @Nullable String str2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            B(str, bundle);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void F(@Nullable String str, @Nullable Double d2, @Nullable Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C8912q5 c8912q5 = C8912q5.a;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C(str, d2, bundle, true, C8912q5.m());
        } catch (Throwable th2) {
            th = th2;
            SQ.c(th, this);
        }
    }

    public final void G(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        Throwable th;
        if (SQ.e(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    try {
                        bundle = new Bundle();
                    } catch (Throwable th2) {
                        th = th2;
                        SQ.c(th, this);
                        return;
                    }
                }
                Bundle bundle2 = bundle;
                try {
                    bundle2.putString(C2326p.N, currency.getCurrencyCode());
                    Double valueOf = Double.valueOf(bigDecimal.doubleValue());
                    C8912q5 c8912q5 = C8912q5.a;
                    C(str, valueOf, bundle2, true, C8912q5.m());
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    SQ.c(th, this);
                    return;
                }
            }
            l0 l0Var = l0.a;
            l0.m0(d, "purchaseAmount and currency cannot be null");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void H(@Nullable String str, @Nullable C2327q.c cVar, @Nullable C2327q.d dVar, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            if (str == null) {
                c.t("itemID cannot be null");
            } else if (cVar == null) {
                c.t("availability cannot be null");
            } else if (dVar == null) {
                c.t("condition cannot be null");
            } else if (str2 == null) {
                c.t("description cannot be null");
            } else if (str3 == null) {
                c.t("imageLink cannot be null");
            } else if (str4 == null) {
                c.t("link cannot be null");
            } else if (str5 == null) {
                c.t("title cannot be null");
            } else if (bigDecimal == null) {
                c.t("priceAmount cannot be null");
            } else if (currency == null) {
                c.t("currency cannot be null");
            } else if (str6 == null && str7 == null && str8 == null) {
                c.t("Either gtin, mpn or brand is required");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString(FK.s, str);
                bundle.putString(FK.t, cVar.name());
                bundle.putString(FK.u, dVar.name());
                bundle.putString(FK.v, str2);
                bundle.putString(FK.w, str3);
                bundle.putString(FK.x, str4);
                bundle.putString(FK.y, str5);
                bundle.putString(FK.C, bigDecimal.setScale(3, 4).toString());
                bundle.putString(FK.D, currency.getCurrencyCode());
                if (str6 != null) {
                    bundle.putString(FK.z, str6);
                }
                if (str7 != null) {
                    bundle.putString(FK.A, str7);
                }
                if (str8 != null) {
                    bundle.putString(FK.B, str8);
                }
                B(C2326p.J, bundle);
                c.h();
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void I(@Nullable BigDecimal bigDecimal, @Nullable Currency currency) {
        if (SQ.e(this)) {
            return;
        }
        try {
            J(bigDecimal, currency, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void J(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C3542Lj c3542Lj = C3542Lj.a;
            if (C3542Lj.c()) {
                Log.w(d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            }
            K(bigDecimal, currency, bundle, false);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void K(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle, boolean z) {
        Throwable th;
        Double valueOf;
        if (SQ.e(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                c.t("purchaseAmount cannot be null");
            } else if (currency == null) {
                c.t("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                try {
                    bundle2.putString(C2326p.N, currency.getCurrencyCode());
                    valueOf = Double.valueOf(bigDecimal.doubleValue());
                    C8912q5 c8912q5 = C8912q5.a;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    C(C2326p.p, valueOf, bundle2, z, C8912q5.m());
                    c.h();
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    SQ.c(th, this);
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void M(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            K(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void N(@NotNull Bundle bundle, @Nullable String str) {
        String str2;
        String string;
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(bundle, "payload");
                try {
                    string = bundle.getString(f);
                    l0 l0Var = l0.a;
                } catch (JSONException unused) {
                    str2 = null;
                }
                if (!l0.f0(string)) {
                    str2 = new JSONObject(string).getString("campaign");
                    if (str2 == null) {
                        V.e.d(b0.DEVELOPER_ERRORS, d, "Malformed payload specified for logging a push notification open.");
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(i, str2);
                    if (str != null) {
                        bundle2.putString(j, str);
                    }
                    B(h, bundle2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void O(@NotNull String str, @Nullable Double d2, @Nullable Bundle bundle) {
        Throwable th;
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(str, "eventName");
                if (!C9545sf2.J2(str, k, false, 2, null)) {
                    try {
                        Log.e(d, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        SQ.c(th, this);
                    }
                }
                com.facebook.M m2 = com.facebook.M.a;
                if (com.facebook.M.s()) {
                    C8912q5 c8912q5 = C8912q5.a;
                    try {
                        C(str, d2, bundle, true, C8912q5.m());
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        SQ.c(th, this);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void o() {
        if (SQ.e(this)) {
            return;
        }
        try {
            C2324n c2324n = C2324n.a;
            C2324n.l(H.EXPLICIT);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @NotNull
    public final String s() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.b.b();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean x(@NotNull C0376a c0376a) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(c0376a, C9998uW1.m);
            return C6562gT0.g(this.b, new C2311a(c0376a));
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final void y(@Nullable String str) {
        if (SQ.e(this)) {
            return;
        }
        try {
            B(str, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void z(@Nullable String str, double d2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            A(str, d2, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@Nullable Context context, @Nullable String str, @Nullable C0376a c0376a) {
        this(l0.u(context), str, c0376a);
        l0 l0Var = l0.a;
    }
}
