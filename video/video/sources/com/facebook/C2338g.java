package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.C0376a;
import com.facebook.C2338g;
import com.facebook.S;
import com.facebook.X;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3771Nr1;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2338g {
    @NotNull
    public static final a f = new a(null);
    @NotNull
    public static final String g = "AccessTokenManager";
    @NotNull
    public static final String h = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    @NotNull
    public static final String i = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    @NotNull
    public static final String j = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    @NotNull
    public static final String k = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final int l = 86400;
    public static final int m = 3600;
    @NotNull
    public static final String n = "me/permissions";
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public static C2338g f98o;
    @NotNull
    public final C6200f21 a;
    @NotNull
    public final C2328b b;
    @Nullable
    public C0376a c;
    @NotNull
    public final AtomicBoolean d;
    @NotNull
    public Date e;

    /* renamed from: com.facebook.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final S c(C0376a c0376a, S.b bVar) {
            e f = f(c0376a);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f.a());
            bundle.putString("client_id", c0376a.h());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            S H = S.n.H(c0376a, f.b(), bVar);
            H.r0(bundle);
            H.q0(Z.GET);
            return H;
        }

        public final S d(C0376a c0376a, S.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            S H = S.n.H(c0376a, C2338g.n, bVar);
            H.r0(bundle);
            H.q0(Z.GET);
            return H;
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2338g e() {
            C2338g c2338g;
            C2338g c2338g2 = C2338g.f98o;
            if (c2338g2 == null) {
                synchronized (this) {
                    c2338g = C2338g.f98o;
                    if (c2338g == null) {
                        M m = M.a;
                        C6200f21 b = C6200f21.b(M.n());
                        C6562gT0.o(b, "getInstance(applicationContext)");
                        C2338g c2338g3 = new C2338g(b, new C2328b());
                        a aVar = C2338g.f;
                        C2338g.f98o = c2338g3;
                        c2338g = c2338g3;
                    }
                }
                return c2338g;
            }
            return c2338g2;
        }

        public final e f(C0376a c0376a) {
            String s = c0376a.s();
            if (s == null) {
                s = C0376a.m1;
            }
            if (C6562gT0.g(s, M.O)) {
                return new c();
            }
            return new b();
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.g$b */
    /* loaded from: classes2.dex */
    public static final class b implements e {
        @NotNull
        public final String a = "oauth/access_token";
        @NotNull
        public final String b = "fb_extend_sso_token";

        @Override // com.facebook.C2338g.e
        @NotNull
        public String a() {
            return this.b;
        }

        @Override // com.facebook.C2338g.e
        @NotNull
        public String b() {
            return this.a;
        }
    }

    /* renamed from: com.facebook.g$c */
    /* loaded from: classes2.dex */
    public static final class c implements e {
        @NotNull
        public final String a = "refresh_access_token";
        @NotNull
        public final String b = "ig_refresh_token";

        @Override // com.facebook.C2338g.e
        @NotNull
        public String a() {
            return this.b;
        }

        @Override // com.facebook.C2338g.e
        @NotNull
        public String b() {
            return this.a;
        }
    }

    /* renamed from: com.facebook.g$d */
    /* loaded from: classes2.dex */
    public static final class d {
        @Nullable
        public String a;
        public int b;
        public int c;
        @Nullable
        public Long d;
        @Nullable
        public String e;

        @Nullable
        public final String a() {
            return this.a;
        }

        @Nullable
        public final Long b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        @Nullable
        public final String e() {
            return this.e;
        }

        public final void f(@Nullable String str) {
            this.a = str;
        }

        public final void g(@Nullable Long l) {
            this.d = l;
        }

        public final void h(int i) {
            this.b = i;
        }

        public final void i(int i) {
            this.c = i;
        }

        public final void j(@Nullable String str) {
            this.e = str;
        }
    }

    /* renamed from: com.facebook.g$e */
    /* loaded from: classes2.dex */
    public interface e {
        @NotNull
        String a();

        @NotNull
        String b();
    }

    public C2338g(@NotNull C6200f21 c6200f21, @NotNull C2328b c2328b) {
        C6562gT0.p(c6200f21, "localBroadcastManager");
        C6562gT0.p(c2328b, "accessTokenCache");
        this.a = c6200f21;
        this.b = c2328b;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2338g j() {
        return f.e();
    }

    public static final void m(C2338g c2338g, C0376a.b bVar) {
        C6562gT0.p(c2338g, "this$0");
        c2338g.n(bVar);
    }

    public static final void o(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, Y y) {
        JSONArray optJSONArray;
        C6562gT0.p(atomicBoolean, "$permissionsCallSucceeded");
        C6562gT0.p(set, "$permissions");
        C6562gT0.p(set2, "$declinedPermissions");
        C6562gT0.p(set3, "$expiredPermissions");
        C6562gT0.p(y, "response");
        JSONObject k2 = y.k();
        if (k2 != null && (optJSONArray = k2.optJSONArray("data")) != null) {
            atomicBoolean.set(true);
            int length = optJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        if (!com.facebook.internal.l0.f0(optString) && !com.facebook.internal.l0.f0(optString2)) {
                            C6562gT0.o(optString2, "status");
                            Locale locale = Locale.US;
                            C6562gT0.o(locale, "US");
                            String lowerCase = optString2.toLowerCase(locale);
                            C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            C6562gT0.o(lowerCase, "status");
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        set2.add(optString);
                                    }
                                    Log.w(g, C6562gT0.C("Unexpected status: ", lowerCase));
                                } else {
                                    if (lowerCase.equals("granted")) {
                                        set.add(optString);
                                    }
                                    Log.w(g, C6562gT0.C("Unexpected status: ", lowerCase));
                                }
                            } else {
                                if (lowerCase.equals("expired")) {
                                    set3.add(optString);
                                }
                                Log.w(g, C6562gT0.C("Unexpected status: ", lowerCase));
                            }
                        }
                    }
                    if (i3 < length) {
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void p(d dVar, Y y) {
        C6562gT0.p(dVar, "$refreshResult");
        C6562gT0.p(y, "response");
        JSONObject k2 = y.k();
        if (k2 == null) {
            return;
        }
        dVar.f(k2.optString("access_token"));
        dVar.h(k2.optInt("expires_at"));
        dVar.i(k2.optInt(C0376a.i1));
        dVar.g(Long.valueOf(k2.optLong(C0376a.k1)));
        dVar.j(k2.optString("graph_domain", null));
    }

    public static final void q(d dVar, C0376a c0376a, C0376a.b bVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C2338g c2338g, X x) {
        C0376a c0376a2;
        String y;
        a aVar;
        Set<String> u;
        Set<String> n2;
        Set<String> o2;
        Date m2;
        C6562gT0.p(dVar, "$refreshResult");
        C6562gT0.p(atomicBoolean, "$permissionsCallSucceeded");
        C6562gT0.p(set, "$permissions");
        C6562gT0.p(set2, "$declinedPermissions");
        C6562gT0.p(set3, "$expiredPermissions");
        C6562gT0.p(c2338g, "this$0");
        C6562gT0.p(x, "it");
        String a2 = dVar.a();
        int c2 = dVar.c();
        Long b2 = dVar.b();
        String e2 = dVar.e();
        try {
            a aVar2 = f;
            if (aVar2.e().i() != null) {
                C0376a i2 = aVar2.e().i();
                if (i2 == null) {
                    y = null;
                } else {
                    y = i2.y();
                }
                if (y == c0376a.y()) {
                    if (!atomicBoolean.get() && a2 == null && c2 == 0) {
                        if (bVar != null) {
                            bVar.a(new C2416z("Failed to refresh access token"));
                        }
                        c2338g.d.set(false);
                        return;
                    }
                    Date q = c0376a.q();
                    if (dVar.c() != 0) {
                        aVar = aVar2;
                        q = new Date(dVar.c() * 1000);
                    } else {
                        aVar = aVar2;
                        if (dVar.d() != 0) {
                            q = new Date((dVar.d() * 1000) + new Date().getTime());
                        }
                    }
                    Date date = q;
                    if (a2 == null) {
                        a2 = c0376a.x();
                    }
                    String str = a2;
                    String h2 = c0376a.h();
                    String y2 = c0376a.y();
                    if (atomicBoolean.get()) {
                        u = set;
                    } else {
                        u = c0376a.u();
                    }
                    if (atomicBoolean.get()) {
                        n2 = set2;
                    } else {
                        n2 = c0376a.n();
                    }
                    if (atomicBoolean.get()) {
                        o2 = set3;
                    } else {
                        o2 = c0376a.o();
                    }
                    EnumC2354h w = c0376a.w();
                    Date date2 = new Date();
                    if (b2 != null) {
                        m2 = new Date(b2.longValue() * 1000);
                    } else {
                        m2 = c0376a.m();
                    }
                    Date date3 = m2;
                    if (e2 == null) {
                        e2 = c0376a.s();
                    }
                    c0376a2 = new C0376a(str, h2, y2, u, n2, o2, w, date, date2, date3, e2);
                    try {
                        aVar.e().s(c0376a2);
                        c2338g.d.set(false);
                        if (bVar != null) {
                            bVar.b(c0376a2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        c2338g.d.set(false);
                        if (bVar != null && c0376a2 != null) {
                            bVar.b(c0376a2);
                        }
                        throw th;
                    }
                }
            }
            if (bVar != null) {
                bVar.a(new C2416z("No current access token to refresh"));
            }
            c2338g.d.set(false);
        } catch (Throwable th2) {
            th = th2;
            c0376a2 = null;
        }
    }

    public final void g() {
        r(i(), i());
    }

    public final void h() {
        if (!v()) {
            return;
        }
        l(null);
    }

    @Nullable
    public final C0376a i() {
        return this.c;
    }

    public final boolean k() {
        C0376a f2 = this.b.f();
        if (f2 == null) {
            return false;
        }
        t(f2, false);
        return true;
    }

    public final void l(@Nullable final C0376a.b bVar) {
        if (C6562gT0.g(Looper.getMainLooper(), Looper.myLooper())) {
            n(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.f
                @Override // java.lang.Runnable
                public final void run() {
                    C2338g.m(C2338g.this, bVar);
                }
            });
        }
    }

    public final void n(final C0376a.b bVar) {
        final C0376a i2 = i();
        if (i2 == null) {
            if (bVar != null) {
                bVar.a(new C2416z("No current access token to refresh"));
            }
        } else if (!this.d.compareAndSet(false, true)) {
            if (bVar == null) {
                return;
            }
            bVar.a(new C2416z("Refresh already in progress"));
        } else {
            this.e = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final d dVar = new d();
            a aVar = f;
            X x = new X(aVar.d(i2, new S.b() { // from class: com.facebook.c
                @Override // com.facebook.S.b
                public final void a(Y y) {
                    C2338g.o(atomicBoolean, hashSet, hashSet2, hashSet3, y);
                }
            }), aVar.c(i2, new S.b() { // from class: com.facebook.d
                @Override // com.facebook.S.b
                public final void a(Y y) {
                    C2338g.p(C2338g.d.this, y);
                }
            }));
            x.f(new X.a() { // from class: com.facebook.e
                @Override // com.facebook.X.a
                public final void a(X x2) {
                    C2338g.q(C2338g.d.this, i2, bVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, x2);
                }
            });
            x.k();
        }
    }

    public final void r(C0376a c0376a, C0376a c0376a2) {
        M m2 = M.a;
        Intent intent = new Intent(M.n(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(h);
        intent.putExtra(i, c0376a);
        intent.putExtra(j, c0376a2);
        this.a.d(intent);
    }

    public final void s(@Nullable C0376a c0376a) {
        t(c0376a, true);
    }

    public final void t(C0376a c0376a, boolean z) {
        C0376a c0376a2 = this.c;
        this.c = c0376a;
        this.d.set(false);
        this.e = new Date(0L);
        if (z) {
            if (c0376a != null) {
                this.b.g(c0376a);
            } else {
                this.b.a();
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                M m2 = M.a;
                com.facebook.internal.l0.i(M.n());
            }
        }
        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.e(c0376a2, c0376a)) {
            r(c0376a2, c0376a);
            u();
        }
    }

    public final void u() {
        Date q;
        M m2 = M.a;
        Context n2 = M.n();
        C0376a.d dVar = C0376a.g1;
        C0376a i2 = dVar.i();
        AlarmManager alarmManager = (AlarmManager) n2.getSystemService(C3771Nr1.K0);
        if (dVar.k()) {
            if (i2 == null) {
                q = null;
            } else {
                q = i2.q();
            }
            if (q != null && alarmManager != null) {
                Intent intent = new Intent(n2, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction(h);
                try {
                    alarmManager.set(1, i2.q().getTime(), PendingIntent.getBroadcast(n2, 0, intent, 67108864));
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean v() {
        C0376a i2 = i();
        if (i2 == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!i2.w().g() || time - this.e.getTime() <= 3600000 || time - i2.t().getTime() <= 86400000) {
            return false;
        }
        return true;
    }
}
