package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.facebook.C0376a;
import com.facebook.C2381j;
import com.facebook.C2408q;
import com.facebook.C2416z;
import com.facebook.FacebookActivity;
import com.facebook.InterfaceC2407p;
import com.facebook.InterfaceC2411u;
import com.facebook.Y;
import com.facebook.d0;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2364i;
import com.facebook.internal.Z;
import com.facebook.internal.a0;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import com.facebook.login.G;
import com.facebook.login.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.ActivityC4864Yy0;
import o.B22;
import o.C10662xF;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.C9545sf2;
import o.C9743tT;
import o.C9998uW1;
import o.H5;
import o.HT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5486c6;
import o.InterfaceC8289nW0;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.O5;
import o.X5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class G {
    @NotNull
    public static final c j;
    @NotNull
    public static final String k = "publish";
    @NotNull
    public static final String l = "manage";
    @NotNull
    public static final String m = "express_login_allowed";
    @NotNull
    public static final String n = "com.facebook.loginManager";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final Set<String> f130o;
    @NotNull
    public static final String p;
    public static volatile G q;
    @NotNull
    public final SharedPreferences c;
    @Nullable
    public String e;
    public boolean f;
    public boolean h;
    public boolean i;
    @NotNull
    public v a = v.NATIVE_WITH_FALLBACK;
    @NotNull
    public EnumC2389f b = EnumC2389f.FRIENDS;
    @NotNull
    public String d = c0.I;
    @NotNull
    public L g = L.FACEBOOK;

    /* loaded from: classes2.dex */
    public static final class a implements S {
        @NotNull
        public final Activity a;

        public a(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            this.a = activity;
        }

        @Override // com.facebook.login.S
        @NotNull
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.login.S
        public void startActivityForResult(@NotNull Intent intent, int i) {
            C6562gT0.p(intent, C9998uW1.R);
            a().startActivityForResult(intent, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements S {
        @NotNull
        public final InterfaceC5486c6 a;
        @NotNull
        public final InterfaceC2407p b;

        /* loaded from: classes2.dex */
        public static final class a extends O5<Intent, Pair<Integer, Intent>> {
            @Override // o.O5
            @NotNull
            /* renamed from: d */
            public Intent a(@NotNull Context context, @NotNull Intent intent) {
                C6562gT0.p(context, "context");
                C6562gT0.p(intent, "input");
                return intent;
            }

            @Override // o.O5
            @NotNull
            /* renamed from: e */
            public Pair<Integer, Intent> c(int i, @Nullable Intent intent) {
                Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i), intent);
                C6562gT0.o(create, "create(resultCode, intent)");
                return create;
            }
        }

        /* renamed from: com.facebook.login.G$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0086b {
            @Nullable
            public X5<Intent> a;

            @Nullable
            public final X5<Intent> a() {
                return this.a;
            }

            public final void b(@Nullable X5<Intent> x5) {
                this.a = x5;
            }
        }

        public b(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p) {
            C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
            C6562gT0.p(interfaceC2407p, "callbackManager");
            this.a = interfaceC5486c6;
            this.b = interfaceC2407p;
        }

        public static final void c(b bVar, C0086b c0086b, Pair pair) {
            C6562gT0.p(bVar, "this$0");
            C6562gT0.p(c0086b, "$launcherHolder");
            InterfaceC2407p interfaceC2407p = bVar.b;
            int g = C2361f.c.Login.g();
            Object obj = pair.first;
            C6562gT0.o(obj, "result.first");
            interfaceC2407p.onActivityResult(g, ((Number) obj).intValue(), (Intent) pair.second);
            X5<Intent> a2 = c0086b.a();
            if (a2 != null) {
                a2.d();
            }
            c0086b.b(null);
        }

        @Override // com.facebook.login.S
        @Nullable
        public Activity a() {
            InterfaceC5486c6 interfaceC5486c6 = this.a;
            if (interfaceC5486c6 instanceof Activity) {
                return (Activity) interfaceC5486c6;
            }
            return null;
        }

        @Override // com.facebook.login.S
        public void startActivityForResult(@NotNull Intent intent, int i) {
            C6562gT0.p(intent, C9998uW1.R);
            final C0086b c0086b = new C0086b();
            c0086b.b(this.a.x().n("facebook-login", new a(), new H5() { // from class: com.facebook.login.H
                @Override // o.H5
                public final void a(Object obj) {
                    G.b.c(G.b.this, c0086b, (Pair) obj);
                }
            }));
            X5<Intent> a2 = c0086b.a();
            if (a2 == null) {
                return;
            }
            a2.b(intent);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @InterfaceC5056aJ2(otherwise = 2)
        @NotNull
        public final J c(@NotNull w.e eVar, @NotNull C0376a c0376a, @Nullable C2381j c2381j) {
            C6562gT0.p(eVar, "request");
            C6562gT0.p(c0376a, "newToken");
            Set<String> s = eVar.s();
            Set c6 = C10662xF.c6(C10662xF.v2(c0376a.u()));
            if (eVar.x()) {
                c6.retainAll(s);
            }
            Set c62 = C10662xF.c6(C10662xF.v2(s));
            c62.removeAll(c6);
            return new J(c0376a, c2381j, c6, c62);
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y})
        @Nullable
        public final Map<String, String> d(@Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(w.f.class.getClassLoader());
            w.f fVar = (w.f) intent.getParcelableExtra(A.n2);
            if (fVar == null) {
                return null;
            }
            return fVar.c1;
        }

        @InterfaceC9511sW0
        @NotNull
        public G e() {
            if (G.q == null) {
                synchronized (this) {
                    c cVar = G.j;
                    G.q = new G();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
            }
            G g = G.q;
            if (g != null) {
                return g;
            }
            C6562gT0.S("instance");
            throw null;
        }

        public final Set<String> f() {
            return B22.u("ads_management", "create_event", "rsvp_event");
        }

        public final void g(String str, String str2, String str3, C c, com.facebook.c0 c0Var) {
            C2416z c2416z = new C2416z(str + ": " + ((Object) str2));
            c.q(str3, c2416z);
            c0Var.c(c2416z);
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y})
        public final boolean h(@Nullable String str) {
            if (str == null || (!C9545sf2.J2(str, G.k, false, 2, null) && !C9545sf2.J2(str, G.l, false, 2, null) && !G.f130o.contains(str))) {
                return false;
            }
            return true;
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements S {
        @NotNull
        public final com.facebook.internal.I a;
        @Nullable
        public final Activity b;

        public e(@NotNull com.facebook.internal.I i) {
            C6562gT0.p(i, "fragment");
            this.a = i;
            this.b = i.a();
        }

        @Override // com.facebook.login.S
        @Nullable
        public Activity a() {
            return this.b;
        }

        @Override // com.facebook.login.S
        public void startActivityForResult(@NotNull Intent intent, int i) {
            C6562gT0.p(intent, C9998uW1.R);
            this.a.d(intent, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        @NotNull
        public static final f a = new f();
        @Nullable
        public static C b;

        @Nullable
        public final synchronized C a(@Nullable Context context) {
            if (context == null) {
                com.facebook.M m = com.facebook.M.a;
                context = com.facebook.M.n();
            }
            if (context == null) {
                return null;
            }
            if (b == null) {
                com.facebook.M m2 = com.facebook.M.a;
                b = new C(context, com.facebook.M.o());
            }
            return b;
        }
    }

    static {
        c cVar = new c(null);
        j = cVar;
        f130o = cVar.f();
        String cls = G.class.toString();
        C6562gT0.o(cls, "LoginManager::class.java.toString()");
        p = cls;
    }

    public G() {
        m0 m0Var = m0.a;
        m0.w();
        com.facebook.M m2 = com.facebook.M.a;
        SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(n, 0);
        C6562gT0.o(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.c = sharedPreferences;
        if (com.facebook.M.L) {
            C2364i c2364i = C2364i.a;
            if (C2364i.a() != null) {
                C9743tT.b(com.facebook.M.n(), "com.android.chrome", new C2388e());
                C9743tT.d(com.facebook.M.n(), com.facebook.M.n().getPackageName());
            }
        }
    }

    public static final void B0(String str, C c2, com.facebook.c0 c0Var, String str2, Bundle bundle) {
        String str3;
        C6562gT0.p(str, "$loggerRef");
        C6562gT0.p(c2, "$logger");
        C6562gT0.p(c0Var, "$responseCallback");
        C6562gT0.p(str2, "$applicationId");
        if (bundle != null) {
            String string = bundle.getString(Z.K0);
            String string2 = bundle.getString(Z.L0);
            if (string != null) {
                j.g(string, string2, str, c2, c0Var);
                return;
            }
            String string3 = bundle.getString(Z.y0);
            l0 l0Var = l0.a;
            Date y = l0.y(bundle, Z.z0, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(Z.q0);
            String string4 = bundle.getString(Z.E0);
            String string5 = bundle.getString("graph_domain");
            Date y2 = l0.y(bundle, Z.A0, new Date(0L));
            if (string4 != null && string4.length() != 0) {
                str3 = I.Z.e(string4);
            } else {
                str3 = null;
            }
            String str4 = str3;
            if (string3 != null && string3.length() != 0 && stringArrayList != null && !stringArrayList.isEmpty() && str4 != null && str4.length() != 0) {
                C0376a c0376a = new C0376a(string3, str2, str4, stringArrayList, null, null, null, y, null, y2, string5);
                C0376a.g1.p(c0376a);
                d0.c1.a();
                c2.t(str);
                c0Var.b(c0376a);
                return;
            }
            c2.r(str);
            c0Var.a();
            return;
        }
        c2.r(str);
        c0Var.a();
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    public static final boolean D(@Nullable String str) {
        return j.h(str);
    }

    public static final boolean M0(G g, int i, Intent intent) {
        C6562gT0.p(g, "this$0");
        return l0(g, i, intent, null, 4, null);
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public static final J j(@NotNull w.e eVar, @NotNull C0376a c0376a, @Nullable C2381j c2381j) {
        return j.c(eVar, c0376a, c2381j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean l0(G g, int i, Intent intent, InterfaceC2411u interfaceC2411u, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                interfaceC2411u = null;
            }
            return g.k0(i, intent, interfaceC2411u);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
    }

    public static /* synthetic */ d n(G g, InterfaceC2407p interfaceC2407p, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                interfaceC2407p = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return g.m(interfaceC2407p, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
    }

    public static final boolean q0(G g, InterfaceC2411u interfaceC2411u, int i, Intent intent) {
        C6562gT0.p(g, "this$0");
        return g.k0(i, intent, interfaceC2411u);
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    @Nullable
    public static final Map<String, String> v(@Nullable Intent intent) {
        return j.d(intent);
    }

    @InterfaceC9511sW0
    @NotNull
    public static G x() {
        return j.e();
    }

    public final boolean A() {
        return this.i;
    }

    public final void A0(Context context, final com.facebook.c0 c0Var, long j2) {
        Context context2;
        com.facebook.M m2 = com.facebook.M.a;
        final String o2 = com.facebook.M.o();
        final String uuid = UUID.randomUUID().toString();
        C6562gT0.o(uuid, "randomUUID().toString()");
        if (context == null) {
            context2 = com.facebook.M.n();
        } else {
            context2 = context;
        }
        final C c2 = new C(context2, o2);
        if (!B()) {
            c2.r(uuid);
            c0Var.a();
            return;
        }
        K a2 = K.i1.a(context, o2, uuid, com.facebook.M.B(), j2, null);
        a2.h(new a0.b() { // from class: com.facebook.login.E
            @Override // com.facebook.internal.a0.b
            public final void a(Bundle bundle) {
                G.B0(uuid, c2, c0Var, o2, bundle);
            }
        });
        c2.s(uuid);
        if (!a2.i()) {
            c2.r(uuid);
            c0Var.a();
        }
    }

    public final boolean B() {
        return this.c.getBoolean(m, true);
    }

    public final boolean C() {
        return this.h;
    }

    @NotNull
    public final G C0(@NotNull String str) {
        C6562gT0.p(str, "authType");
        this.d = str;
        return this;
    }

    @NotNull
    public final G D0(@NotNull EnumC2389f enumC2389f) {
        C6562gT0.p(enumC2389f, "defaultAudience");
        this.b = enumC2389f;
        return this;
    }

    public final void E(Context context, w.f.a aVar, Map<String, String> map, Exception exc, boolean z, w.e eVar) {
        String str;
        String str2;
        C a2 = f.a.a(context);
        if (a2 == null) {
            return;
        }
        if (eVar == null) {
            C.z(a2, C.j, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(C.B, str);
        String b2 = eVar.b();
        if (eVar.v()) {
            str2 = C.s;
        } else {
            str2 = C.j;
        }
        a2.m(b2, hashMap, aVar, map, exc, str2);
    }

    public final void E0(boolean z) {
        SharedPreferences.Editor edit = this.c.edit();
        edit.putBoolean(m, z);
        edit.apply();
    }

    public final void F(@NotNull Activity activity, @NotNull x xVar) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(xVar, "loginConfig");
        if (activity instanceof InterfaceC5486c6) {
            Log.w(p, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        L0(new a(activity), q(xVar));
    }

    @NotNull
    public final G F0(boolean z) {
        this.h = z;
        return this;
    }

    public final void G(@NotNull Activity activity, @Nullable Collection<String> collection) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        F(activity, new x(collection, null, 2, null));
    }

    @NotNull
    public final G G0(@NotNull v vVar) {
        C6562gT0.p(vVar, "loginBehavior");
        this.a = vVar;
        return this;
    }

    public final void H(@NotNull Activity activity, @Nullable Collection<String> collection, @Nullable String str) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        w.e q2 = q(new x(collection, null, 2, null));
        if (str != null) {
            q2.y(str);
        }
        L0(new a(activity), q2);
    }

    @NotNull
    public final G H0(@NotNull L l2) {
        C6562gT0.p(l2, "targetApp");
        this.g = l2;
        return this;
    }

    public final void I(@NotNull Fragment fragment, @Nullable Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        N(new com.facebook.internal.I(fragment), collection);
    }

    @NotNull
    public final G I0(@Nullable String str) {
        this.e = str;
        return this;
    }

    public final void J(@NotNull Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        C6562gT0.p(fragment, "fragment");
        O(new com.facebook.internal.I(fragment), collection, str);
    }

    @NotNull
    public final G J0(boolean z) {
        this.f = z;
        return this;
    }

    public final void K(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        N(new com.facebook.internal.I(fragment), collection);
    }

    @NotNull
    public final G K0(boolean z) {
        this.i = z;
        return this;
    }

    public final void L(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        C6562gT0.p(fragment, "fragment");
        O(new com.facebook.internal.I(fragment), collection, str);
    }

    public final void L0(S s, w.e eVar) throws C2416z {
        g0(s.a(), eVar);
        C2361f.b.c(C2361f.c.Login.g(), new C2361f.a() { // from class: com.facebook.login.F
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i, Intent intent) {
                boolean M0;
                M0 = G.M0(G.this, i, intent);
                return M0;
            }
        });
        if (N0(s, eVar)) {
            return;
        }
        C2416z c2416z = new C2416z("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        E(s.a(), w.f.a.ERROR, null, c2416z, false, eVar);
        throw c2416z;
    }

    public final void M(@NotNull com.facebook.internal.I i, @NotNull x xVar) {
        C6562gT0.p(i, "fragment");
        C6562gT0.p(xVar, "loginConfig");
        L0(new e(i), q(xVar));
    }

    public final void N(@NotNull com.facebook.internal.I i, @Nullable Collection<String> collection) {
        C6562gT0.p(i, "fragment");
        M(i, new x(collection, null, 2, null));
    }

    public final boolean N0(S s, w.e eVar) {
        Intent w = w(eVar);
        if (!x0(w)) {
            return false;
        }
        try {
            s.startActivityForResult(w, w.h1.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final void O(@NotNull com.facebook.internal.I i, @Nullable Collection<String> collection, @Nullable String str) {
        C6562gT0.p(i, "fragment");
        w.e q2 = q(new x(collection, null, 2, null));
        if (str != null) {
            q2.y(str);
        }
        L0(new e(i), q2);
    }

    public final void O0(@Nullable InterfaceC2407p interfaceC2407p) {
        if (interfaceC2407p instanceof C2361f) {
            ((C2361f) interfaceC2407p).d(C2361f.c.Login.g());
            return;
        }
        throw new C2416z("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void P(InterfaceC5486c6 interfaceC5486c6, InterfaceC2407p interfaceC2407p, x xVar) {
        L0(new b(interfaceC5486c6, interfaceC2407p), q(xVar));
    }

    public final void P0(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (!j.h(str)) {
                    throw new C2416z("Cannot pass a read permission (" + str + ") to a request for publish authorization");
                }
            }
        }
    }

    public final void Q(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection) {
        C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        P(interfaceC5486c6, interfaceC2407p, new x(collection, null, 2, null));
    }

    public final void Q0(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (j.h(str)) {
                    throw new C2416z("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
                }
            }
        }
    }

    public final void R(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection, @Nullable String str) {
        C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        w.e q2 = q(new x(collection, null, 2, null));
        if (str != null) {
            q2.y(str);
        }
        L0(new b(interfaceC5486c6, interfaceC2407p), q2);
    }

    public final void S(@NotNull androidx.fragment.app.Fragment fragment, @NotNull x xVar) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(xVar, "loginConfig");
        i0(new com.facebook.internal.I(fragment), xVar);
    }

    public final void T(@NotNull Activity activity, @Nullable Collection<String> collection) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        P0(collection);
        h0(activity, new x(collection, null, 2, null));
    }

    public final void U(@NotNull Fragment fragment, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(collection, "permissions");
        X(new com.facebook.internal.I(fragment), collection);
    }

    public final void V(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        ActivityC4864Yy0 o2 = fragment.o();
        if (o2 != null) {
            Y(o2, interfaceC2407p, collection);
            return;
        }
        throw new C2416z(C6562gT0.C("Cannot obtain activity context on the fragment ", fragment));
    }

    @InterfaceC9150r20(message = "")
    public final void W(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(collection, "permissions");
        X(new com.facebook.internal.I(fragment), collection);
    }

    public final void X(com.facebook.internal.I i, Collection<String> collection) {
        P0(collection);
        i0(i, new x(collection, null, 2, null));
    }

    public final void Y(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection) {
        C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        P0(collection);
        P(interfaceC5486c6, interfaceC2407p, new x(collection, null, 2, null));
    }

    public final void Z(@NotNull Activity activity, @Nullable Collection<String> collection) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        Q0(collection);
        F(activity, new x(collection, null, 2, null));
    }

    public final void a0(@NotNull Fragment fragment, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(collection, "permissions");
        d0(new com.facebook.internal.I(fragment), collection);
    }

    public final void b0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        ActivityC4864Yy0 o2 = fragment.o();
        if (o2 != null) {
            e0(o2, interfaceC2407p, collection);
            return;
        }
        throw new C2416z(C6562gT0.C("Cannot obtain activity context on the fragment ", fragment));
    }

    @InterfaceC9150r20(message = "")
    public final void c0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Collection<String> collection) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(collection, "permissions");
        d0(new com.facebook.internal.I(fragment), collection);
    }

    public final void d0(com.facebook.internal.I i, Collection<String> collection) {
        Q0(collection);
        M(i, new x(collection, null, 2, null));
    }

    public final void e0(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Collection<String> collection) {
        C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(collection, "permissions");
        Q0(collection);
        P(interfaceC5486c6, interfaceC2407p, new x(collection, null, 2, null));
    }

    public void f0() {
        C0376a.g1.p(null);
        C2381j.a1.b(null);
        d0.c1.c(null);
        E0(false);
    }

    public final void g0(Context context, w.e eVar) {
        String str;
        C a2 = f.a.a(context);
        if (a2 != null && eVar != null) {
            if (eVar.v()) {
                str = C.r;
            } else {
                str = C.i;
            }
            a2.v(eVar, str);
        }
    }

    public final void h0(@NotNull Activity activity, @NotNull x xVar) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(xVar, "loginConfig");
        F(activity, xVar);
    }

    public final void i0(com.facebook.internal.I i, x xVar) {
        M(i, xVar);
    }

    @InterfaceC5056aJ2(otherwise = 3)
    @InterfaceC8289nW0
    public final boolean j0(int i, @Nullable Intent intent) {
        return l0(this, i, intent, null, 4, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final d k() {
        return n(this, null, null, 3, null);
    }

    @InterfaceC5056aJ2(otherwise = 3)
    @InterfaceC8289nW0
    public boolean k0(int i, @Nullable Intent intent, @Nullable InterfaceC2411u<J> interfaceC2411u) {
        w.f.a aVar;
        boolean z;
        C0376a c0376a;
        C2381j c2381j;
        Map<String, String> map;
        w.e eVar;
        C2381j c2381j2;
        w.f.a aVar2 = w.f.a.ERROR;
        C2416z c2416z = null;
        boolean z2 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(w.f.class.getClassLoader());
            w.f fVar = (w.f) intent.getParcelableExtra(A.n2);
            if (fVar != null) {
                w.e eVar2 = fVar.a1;
                w.f.a aVar3 = fVar.X;
                if (i != -1) {
                    if (i == 0) {
                        z2 = true;
                    }
                    c0376a = null;
                    c2381j2 = null;
                } else if (aVar3 == w.f.a.SUCCESS) {
                    c0376a = fVar.Y;
                    c2381j2 = fVar.Z;
                } else {
                    c2381j2 = null;
                    c2416z = new C2408q(fVar.Y0);
                    c0376a = null;
                }
                map = fVar.b1;
                eVar = eVar2;
                z = z2;
                c2381j = c2381j2;
                aVar = aVar3;
            }
            aVar = aVar2;
            c0376a = null;
            c2381j = null;
            map = null;
            eVar = null;
            z = false;
        } else {
            if (i == 0) {
                aVar = w.f.a.CANCEL;
                z = true;
                c0376a = null;
                c2381j = null;
                map = null;
                eVar = null;
            }
            aVar = aVar2;
            c0376a = null;
            c2381j = null;
            map = null;
            eVar = null;
            z = false;
        }
        if (c2416z == null && c0376a == null && !z) {
            c2416z = new C2416z("Unexpected call to LoginManager.onActivityResult");
        }
        C2416z c2416z2 = c2416z;
        E(null, aVar, map, c2416z2, true, eVar);
        s(c0376a, c2381j, eVar, c2416z2, z, interfaceC2411u);
        return true;
    }

    @InterfaceC8289nW0
    @NotNull
    public final d l(@Nullable InterfaceC2407p interfaceC2407p) {
        return n(this, interfaceC2407p, null, 2, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final d m(@Nullable InterfaceC2407p interfaceC2407p, @Nullable String str) {
        return new d(this, interfaceC2407p, str);
    }

    public final void m0(@NotNull Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        L0(new a(activity), r());
    }

    public final void n0(@NotNull androidx.fragment.app.Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        o0(new com.facebook.internal.I(fragment));
    }

    @NotNull
    public w.e o(@Nullable Collection<String> collection) {
        Set d6;
        v vVar = this.a;
        if (collection == null) {
            d6 = null;
        } else {
            d6 = C10662xF.d6(collection);
        }
        Set set = d6;
        EnumC2389f enumC2389f = this.b;
        String str = this.d;
        com.facebook.M m2 = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        String uuid = UUID.randomUUID().toString();
        C6562gT0.o(uuid, "randomUUID().toString()");
        w.e eVar = new w.e(vVar, set, enumC2389f, str, o2, uuid, this.g, null, null, null, null, 1920, null);
        eVar.I(C0376a.g1.k());
        eVar.D(this.e);
        eVar.J(this.f);
        eVar.C(this.h);
        eVar.K(this.i);
        return eVar;
    }

    public final void o0(com.facebook.internal.I i) {
        L0(new e(i), r());
    }

    public final w.e p(Y y) {
        Set<String> u;
        C0376a y2 = y.m().y();
        List list = null;
        if (y2 != null && (u = y2.u()) != null) {
            list = C10662xF.v2(u);
        }
        return o(list);
    }

    public final void p0(@Nullable InterfaceC2407p interfaceC2407p, @Nullable final InterfaceC2411u<J> interfaceC2411u) {
        if (interfaceC2407p instanceof C2361f) {
            ((C2361f) interfaceC2407p).b(C2361f.c.Login.g(), new C2361f.a() { // from class: com.facebook.login.D
                @Override // com.facebook.internal.C2361f.a
                public final boolean a(int i, Intent intent) {
                    boolean q0;
                    q0 = G.q0(G.this, interfaceC2411u, i, intent);
                    return q0;
                }
            });
            return;
        }
        throw new C2416z("Unexpected CallbackManager, please use the provided Factory.");
    }

    @NotNull
    public w.e q(@NotNull x xVar) {
        String a2;
        C6562gT0.p(xVar, "loginConfig");
        EnumC2385b enumC2385b = EnumC2385b.S256;
        try {
            P p2 = P.a;
            a2 = P.b(xVar.a(), enumC2385b);
        } catch (C2416z unused) {
            enumC2385b = EnumC2385b.PLAIN;
            a2 = xVar.a();
        }
        EnumC2385b enumC2385b2 = enumC2385b;
        String str = a2;
        v vVar = this.a;
        Set d6 = C10662xF.d6(xVar.c());
        EnumC2389f enumC2389f = this.b;
        String str2 = this.d;
        com.facebook.M m2 = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        String uuid = UUID.randomUUID().toString();
        C6562gT0.o(uuid, "randomUUID().toString()");
        w.e eVar = new w.e(vVar, d6, enumC2389f, str2, o2, uuid, this.g, xVar.b(), xVar.a(), str, enumC2385b2);
        eVar.I(C0376a.g1.k());
        eVar.D(this.e);
        eVar.J(this.f);
        eVar.C(this.h);
        eVar.K(this.i);
        return eVar;
    }

    @NotNull
    public w.e r() {
        v vVar = v.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        EnumC2389f enumC2389f = this.b;
        com.facebook.M m2 = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        String uuid = UUID.randomUUID().toString();
        C6562gT0.o(uuid, "randomUUID().toString()");
        w.e eVar = new w.e(vVar, hashSet, enumC2389f, "reauthorize", o2, uuid, this.g, null, null, null, null, 1920, null);
        eVar.C(this.h);
        eVar.K(this.i);
        return eVar;
    }

    public final void r0(@NotNull Activity activity, @NotNull Y y) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(y, "response");
        L0(new a(activity), p(y));
    }

    public final void s(C0376a c0376a, C2381j c2381j, w.e eVar, C2416z c2416z, boolean z, InterfaceC2411u<J> interfaceC2411u) {
        J j2;
        if (c0376a != null) {
            C0376a.g1.p(c0376a);
            d0.c1.a();
        }
        if (c2381j != null) {
            C2381j.a1.b(c2381j);
        }
        if (interfaceC2411u != null) {
            if (c0376a != null && eVar != null) {
                j2 = j.c(eVar, c0376a, c2381j);
            } else {
                j2 = null;
            }
            if (!z && (j2 == null || !j2.j().isEmpty())) {
                if (c2416z != null) {
                    interfaceC2411u.b(c2416z);
                    return;
                } else if (c0376a != null && j2 != null) {
                    E0(true);
                    interfaceC2411u.a(j2);
                    return;
                } else {
                    return;
                }
            }
            interfaceC2411u.onCancel();
        }
    }

    public final void s0(@NotNull Fragment fragment, @NotNull Y y) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(y, "response");
        v0(new com.facebook.internal.I(fragment), y);
    }

    @NotNull
    public final String t() {
        return this.d;
    }

    public final void t0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Y y) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(y, "response");
        ActivityC4864Yy0 o2 = fragment.o();
        if (o2 != null) {
            w0(o2, interfaceC2407p, y);
            return;
        }
        throw new C2416z(C6562gT0.C("Cannot obtain activity context on the fragment ", fragment));
    }

    @NotNull
    public final EnumC2389f u() {
        return this.b;
    }

    @InterfaceC9150r20(message = "")
    public final void u0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Y y) {
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(y, "response");
        v0(new com.facebook.internal.I(fragment), y);
    }

    public final void v0(com.facebook.internal.I i, Y y) {
        L0(new e(i), p(y));
    }

    @NotNull
    public Intent w(@NotNull w.e eVar) {
        C6562gT0.p(eVar, "request");
        Intent intent = new Intent();
        com.facebook.M m2 = com.facebook.M.a;
        intent.setClass(com.facebook.M.n(), FacebookActivity.class);
        intent.setAction(eVar.m().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", eVar);
        intent.putExtra(A.o2, bundle);
        return intent;
    }

    public final void w0(@NotNull InterfaceC5486c6 interfaceC5486c6, @NotNull InterfaceC2407p interfaceC2407p, @NotNull Y y) {
        C6562gT0.p(interfaceC5486c6, "activityResultRegistryOwner");
        C6562gT0.p(interfaceC2407p, "callbackManager");
        C6562gT0.p(y, "response");
        L0(new b(interfaceC5486c6, interfaceC2407p), p(y));
    }

    public final boolean x0(Intent intent) {
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.n().getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }

    @NotNull
    public final v y() {
        return this.a;
    }

    public final void y0(@NotNull Context context, long j2, @NotNull com.facebook.c0 c0Var) {
        C6562gT0.p(context, "context");
        C6562gT0.p(c0Var, "responseCallback");
        A0(context, c0Var, j2);
    }

    @NotNull
    public final L z() {
        return this.g;
    }

    public final void z0(@NotNull Context context, @NotNull com.facebook.c0 c0Var) {
        C6562gT0.p(context, "context");
        C6562gT0.p(c0Var, "responseCallback");
        y0(context, 5000L, c0Var);
    }

    /* loaded from: classes2.dex */
    public final class d extends O5<Collection<? extends String>, InterfaceC2407p.a> {
        @Nullable
        public InterfaceC2407p a;
        @Nullable
        public String b;

        public d(@Nullable G g, @Nullable InterfaceC2407p interfaceC2407p, String str) {
            C6562gT0.p(g, "this$0");
            G.this = g;
            this.a = interfaceC2407p;
            this.b = str;
        }

        @Override // o.O5
        @NotNull
        /* renamed from: d */
        public Intent a(@NotNull Context context, @NotNull Collection<String> collection) {
            C6562gT0.p(context, "context");
            C6562gT0.p(collection, "permissions");
            w.e q = G.this.q(new x(collection, null, 2, null));
            String str = this.b;
            if (str != null) {
                q.y(str);
            }
            G.this.g0(context, q);
            Intent w = G.this.w(q);
            if (G.this.x0(w)) {
                return w;
            }
            C2416z c2416z = new C2416z("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            G.this.E(context, w.f.a.ERROR, null, c2416z, false, q);
            throw c2416z;
        }

        @Nullable
        public final InterfaceC2407p e() {
            return this.a;
        }

        @Nullable
        public final String f() {
            return this.b;
        }

        @Override // o.O5
        @NotNull
        /* renamed from: g */
        public InterfaceC2407p.a c(int i, @Nullable Intent intent) {
            G.l0(G.this, i, intent, null, 4, null);
            int g = C2361f.c.Login.g();
            InterfaceC2407p interfaceC2407p = this.a;
            if (interfaceC2407p != null) {
                interfaceC2407p.onActivityResult(g, i, intent);
            }
            return new InterfaceC2407p.a(g, i, intent);
        }

        public final void h(@Nullable InterfaceC2407p interfaceC2407p) {
            this.a = interfaceC2407p;
        }

        public final void i(@Nullable String str) {
            this.b = str;
        }

        public /* synthetic */ d(InterfaceC2407p interfaceC2407p, String str, int i, C9516sY c9516sY) {
            this(G.this, (i & 1) != 0 ? null : interfaceC2407p, (i & 2) != 0 ? null : str);
        }
    }
}
