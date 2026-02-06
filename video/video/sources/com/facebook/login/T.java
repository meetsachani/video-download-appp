package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import com.facebook.login.I;
import com.facebook.login.w;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.HT1;
import o.InterfaceC5056aJ2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public abstract class T extends I {
    @NotNull
    public static final a c1 = new a(null);
    @NotNull
    public static final String d1 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    @NotNull
    public static final String e1 = "TOKEN";
    @Nullable
    public String b1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
    }

    @NotNull
    public Bundle A(@NotNull Bundle bundle, @NotNull w.e eVar) {
        String name;
        String str;
        C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
        C6562gT0.p(eVar, "request");
        bundle.putString(c0.w, n());
        if (eVar.w()) {
            bundle.putString("app_id", eVar.a());
        } else {
            bundle.putString("client_id", eVar.a());
        }
        bundle.putString("e2e", w.h1.a());
        if (eVar.w()) {
            bundle.putString(c0.x, c0.M);
        } else {
            if (eVar.s().contains("openid")) {
                bundle.putString("nonce", eVar.q());
            }
            bundle.putString(c0.x, c0.O);
        }
        bundle.putString(c0.k, eVar.d());
        EnumC2385b e = eVar.e();
        if (e == null) {
            name = null;
        } else {
            name = e.name();
        }
        bundle.putString(c0.l, name);
        bundle.putString(c0.y, "true");
        bundle.putString(c0.h, eVar.c());
        bundle.putString("login_behavior", eVar.m().name());
        com.facebook.M m = com.facebook.M.a;
        bundle.putString("sdk", C6562gT0.C("android-", com.facebook.M.I()));
        if (C() != null) {
            bundle.putString(c0.A, C());
        }
        String str2 = "0";
        if (!com.facebook.M.L) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString(c0.n, str);
        if (eVar.v()) {
            bundle.putString(c0.J, eVar.n().toString());
        }
        if (eVar.L()) {
            bundle.putString(c0.K, "true");
        }
        if (eVar.o() != null) {
            bundle.putString(c0.G, eVar.o());
            if (eVar.t()) {
                str2 = "1";
            }
            bundle.putString(c0.H, str2);
        }
        return bundle;
    }

    @NotNull
    public Bundle B(@NotNull w.e eVar) {
        String x;
        C6562gT0.p(eVar, "request");
        Bundle bundle = new Bundle();
        l0 l0Var = l0.a;
        if (!l0.g0(eVar.s())) {
            String join = TextUtils.join(",", eVar.s());
            bundle.putString("scope", join);
            a("scope", join);
        }
        EnumC2389f g = eVar.g();
        if (g == null) {
            g = EnumC2389f.NONE;
        }
        bundle.putString("default_audience", g.g());
        bundle.putString("state", g(eVar.b()));
        C0376a i = C0376a.g1.i();
        if (i == null) {
            x = null;
        } else {
            x = i.x();
        }
        String str = "0";
        if (x != null && C6562gT0.g(x, E())) {
            bundle.putString("access_token", x);
            a("access_token", "1");
        } else {
            ActivityC4864Yy0 m = h().m();
            if (m != null) {
                l0.i(m);
            }
            a("access_token", "0");
        }
        bundle.putString(c0.i, String.valueOf(System.currentTimeMillis()));
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.s()) {
            str = "1";
        }
        bundle.putString(c0.s, str);
        return bundle;
    }

    @Nullable
    public String C() {
        return null;
    }

    @NotNull
    public abstract EnumC2354h D();

    public final String E() {
        Context m = h().m();
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            m = com.facebook.M.n();
        }
        return m.getSharedPreferences(d1, 0).getString(e1, "");
    }

    @InterfaceC5056aJ2(otherwise = 4)
    public void I(@NotNull w.e eVar, @Nullable Bundle bundle, @Nullable C2416z c2416z) {
        String message;
        String str;
        w.f d;
        C6562gT0.p(eVar, "request");
        w h = h();
        this.b1 = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.b1 = bundle.getString("e2e");
            }
            try {
                I.a aVar = I.Z;
                C0376a b = aVar.b(eVar.s(), bundle, D(), eVar.a());
                d = w.f.d1.b(h.C(), b, aVar.d(bundle, eVar.q()));
                if (h.m() != null) {
                    try {
                        CookieSyncManager.createInstance(h.m()).sync();
                    } catch (Exception unused) {
                    }
                    if (b != null) {
                        J(b.x());
                    }
                }
            } catch (C2416z e) {
                d = w.f.c.e(w.f.d1, h.C(), null, e.getMessage(), null, 8, null);
            }
        } else if (c2416z instanceof com.facebook.B) {
            d = w.f.d1.a(h.C(), I.Y0);
        } else {
            this.b1 = null;
            if (c2416z == null) {
                message = null;
            } else {
                message = c2416z.getMessage();
            }
            if (c2416z instanceof com.facebook.P) {
                com.facebook.C c = ((com.facebook.P) c2416z).c();
                str = String.valueOf(c.g());
                message = c.toString();
            } else {
                str = null;
            }
            d = w.f.d1.d(h.C(), null, message, str);
        }
        l0 l0Var = l0.a;
        if (!l0.f0(this.b1)) {
            q(this.b1);
        }
        h.h(d);
    }

    public final void J(String str) {
        Context m = h().m();
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            m = com.facebook.M.n();
        }
        m.getSharedPreferences(d1, 0).edit().putString(e1, str).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
    }
}
