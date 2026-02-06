package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.C2358c;
import com.facebook.internal.C2379y;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6562gT0;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p0 {
    public static final long f = 604800000;
    @NotNull
    public static final String g = "advertiser_id";
    @NotNull
    public static final String h = "fields";
    @NotNull
    public static final String n = "com.facebook.sdk.USER_SETTINGS";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f147o = "com.facebook.sdk.USER_SETTINGS_BITMASK";
    public static SharedPreferences p = null;
    @NotNull
    public static final String q = "last_timestamp";
    @NotNull
    public static final String r = "value";
    @NotNull
    public static final String s = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    @NotNull
    public static final String t = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
    @NotNull
    public static final String u = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
    @NotNull
    public static final p0 a = new p0();
    public static final String b = p0.class.getName();
    @NotNull
    public static final AtomicBoolean c = new AtomicBoolean(false);
    @NotNull
    public static final AtomicBoolean d = new AtomicBoolean(false);
    @NotNull
    public static final a i = new a(true, M.C);
    @NotNull
    public static final a j = new a(true, M.D);
    @NotNull
    public static final a k = new a(true, M.F);
    @NotNull
    public static final String e = "auto_event_setup_enabled";
    @NotNull
    public static final a l = new a(false, e);
    @NotNull
    public static final a m = new a(true, M.H);

    /* loaded from: classes2.dex */
    public static final class a {
        public boolean a;
        @NotNull
        public String b;
        @Nullable
        public Boolean c;
        public long d;

        public a(boolean z, @NotNull String str) {
            C6562gT0.p(str, "key");
            this.a = z;
            this.b = str;
        }

        public final boolean a() {
            return this.a;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        public final long c() {
            return this.d;
        }

        @Nullable
        public final Boolean d() {
            return this.c;
        }

        public final boolean e() {
            Boolean bool = this.c;
            if (bool == null) {
                return this.a;
            }
            return bool.booleanValue();
        }

        public final void f(boolean z) {
            this.a = z;
        }

        public final void g(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.b = str;
        }

        public final void h(long j) {
            this.d = j;
        }

        public final void i(@Nullable Boolean bool) {
            this.c = bool;
        }
    }

    @InterfaceC9511sW0
    public static final boolean d() {
        if (SQ.e(p0.class)) {
            return false;
        }
        try {
            a.k();
            return k.e();
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean e() {
        if (SQ.e(p0.class)) {
            return false;
        }
        try {
            a.k();
            return i.e();
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        if (SQ.e(p0.class)) {
            return false;
        }
        try {
            p0 p0Var = a;
            p0Var.k();
            return p0Var.b();
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean g() {
        if (SQ.e(p0.class)) {
            return false;
        }
        try {
            a.k();
            return l.e();
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean h() {
        if (SQ.e(p0.class)) {
            return false;
        }
        try {
            a.k();
            return m.e();
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return false;
        }
    }

    public static final void j(long j2) {
        String str;
        if (SQ.e(p0.class)) {
            return;
        }
        try {
            if (k.e()) {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                M m2 = M.a;
                C2379y q2 = com.facebook.internal.C.q(M.o(), false);
                if (q2 != null && q2.c()) {
                    C2358c f2 = C2358c.f.f(M.n());
                    if (f2 != null && f2.h() != null) {
                        str = f2.h();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(g, str);
                        bundle.putString("fields", e);
                        S H = S.n.H(null, FirebaseMessaging.r, null);
                        H.r0(bundle);
                        JSONObject i2 = H.l().i();
                        if (i2 != null) {
                            a aVar = l;
                            aVar.i(Boolean.valueOf(i2.optBoolean(e, false)));
                            aVar.h(j2);
                            a.y(aVar);
                        }
                    }
                }
            }
            d.set(false);
        } catch (Throwable th) {
            SQ.c(th, p0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void o() {
        if (!SQ.e(p0.class)) {
            try {
                M m2 = M.a;
                Context n2 = M.n();
                ApplicationInfo applicationInfo = n2.getPackageManager().getApplicationInfo(n2.getPackageName(), 128);
                C6562gT0.o(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    com.facebook.appevents.K k2 = new com.facebook.appevents.K(n2);
                    Bundle bundle2 = new Bundle();
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    if (!com.facebook.internal.l0.W()) {
                        bundle2.putString("SchemeWarning", u);
                        Log.w(b, u);
                    }
                    k2.j("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                SQ.c(th, p0.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final Boolean r() {
        SharedPreferences sharedPreferences;
        String str = "";
        if (SQ.e(p0.class)) {
            return null;
        }
        try {
            a.x();
            try {
                sharedPreferences = p;
            } catch (JSONException e2) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.l0(b, e2);
            }
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(j.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
                return null;
            }
            C6562gT0.S("userSettingPref");
            throw null;
        } catch (Throwable th) {
            SQ.c(th, p0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void t(boolean z) {
        if (SQ.e(p0.class)) {
            return;
        }
        try {
            a aVar = k;
            aVar.i(Boolean.valueOf(z));
            aVar.h(System.currentTimeMillis());
            if (c.get()) {
                a.y(aVar);
            } else {
                a.k();
            }
        } catch (Throwable th) {
            SQ.c(th, p0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void u(boolean z) {
        if (SQ.e(p0.class)) {
            return;
        }
        try {
            a aVar = i;
            aVar.i(Boolean.valueOf(z));
            aVar.h(System.currentTimeMillis());
            if (c.get()) {
                a.y(aVar);
            } else {
                a.k();
            }
        } catch (Throwable th) {
            SQ.c(th, p0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void v(boolean z) {
        if (SQ.e(p0.class)) {
            return;
        }
        try {
            a aVar = j;
            aVar.i(Boolean.valueOf(z));
            aVar.h(System.currentTimeMillis());
            if (c.get()) {
                a.y(aVar);
            } else {
                a.k();
            }
        } catch (Throwable th) {
            SQ.c(th, p0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void w(boolean z) {
        if (SQ.e(p0.class)) {
            return;
        }
        try {
            a aVar = m;
            aVar.i(Boolean.valueOf(z));
            aVar.h(System.currentTimeMillis());
            if (c.get()) {
                a.y(aVar);
            } else {
                a.k();
            }
        } catch (Throwable th) {
            SQ.c(th, p0.class);
        }
    }

    public final boolean b() {
        if (SQ.e(this)) {
            return false;
        }
        try {
            com.facebook.internal.C c2 = com.facebook.internal.C.a;
            Map<String, Boolean> g2 = com.facebook.internal.C.g();
            if (g2 != null && !g2.isEmpty()) {
                Boolean bool = g2.get(com.facebook.internal.C.F);
                Boolean bool2 = g2.get(com.facebook.internal.C.E);
                if (bool == null) {
                    Boolean c3 = c();
                    if (c3 == null) {
                        if (bool2 == null) {
                            return true;
                        }
                        return bool2.booleanValue();
                    }
                    return c3.booleanValue();
                }
                return bool.booleanValue();
            }
            return j.e();
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final Boolean c() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Boolean r2 = r();
            if (r2 == null) {
                Boolean m2 = m();
                if (m2 == null) {
                    return null;
                }
                return m2;
            }
            return r2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void i() {
        if (!SQ.e(this)) {
            try {
                a aVar = l;
                s(aVar);
                final long currentTimeMillis = System.currentTimeMillis();
                if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                    aVar.i(null);
                    aVar.h(0L);
                    if (!d.compareAndSet(false, true)) {
                        return;
                    }
                    M m2 = M.a;
                    M.y().execute(new Runnable() { // from class: com.facebook.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            p0.j(currentTimeMillis);
                        }
                    });
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void k() {
        if (!SQ.e(this)) {
            try {
                M m2 = M.a;
                if (!M.N() || !c.compareAndSet(false, true)) {
                    return;
                }
                SharedPreferences sharedPreferences = M.n().getSharedPreferences(n, 0);
                C6562gT0.o(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                p = sharedPreferences;
                l(j, k, i);
                i();
                q();
                p();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void l(a... aVarArr) {
        if (!SQ.e(this)) {
            try {
                int length = aVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    a aVar = aVarArr[i2];
                    i2++;
                    if (aVar == l) {
                        i();
                    } else if (aVar.d() == null) {
                        s(aVar);
                        if (aVar.d() == null) {
                            n(aVar);
                        }
                    } else {
                        y(aVar);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final Boolean m() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            x();
            try {
                M m2 = M.a;
                Context n2 = M.n();
                ApplicationInfo applicationInfo = n2.getPackageManager().getApplicationInfo(n2.getPackageName(), 128);
                C6562gT0.o(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = j;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.l0(b, e2);
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void n(a aVar) {
        if (!SQ.e(this)) {
            try {
                x();
                try {
                    M m2 = M.a;
                    Context n2 = M.n();
                    ApplicationInfo applicationInfo = n2.getPackageManager().getApplicationInfo(n2.getPackageName(), 128);
                    C6562gT0.o(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && bundle.containsKey(aVar.b())) {
                        aVar.i(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void p() {
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        if (!SQ.e(this)) {
            try {
                if (c.get()) {
                    M m2 = M.a;
                    if (M.N()) {
                        Context n2 = M.n();
                        int e2 = i.e() | ((j.e() ? 1 : 0) << 1) | ((k.e() ? 1 : 0) << 2) | ((m.e() ? 1 : 0) << 3);
                        SharedPreferences sharedPreferences = p;
                        if (sharedPreferences != null) {
                            int i4 = 0;
                            int i5 = sharedPreferences.getInt(f147o, 0);
                            if (i5 != e2) {
                                SharedPreferences sharedPreferences2 = p;
                                if (sharedPreferences2 != null) {
                                    sharedPreferences2.edit().putInt(f147o, e2).apply();
                                    try {
                                        applicationInfo = n2.getPackageManager().getApplicationInfo(n2.getPackageName(), 128);
                                        C6562gT0.o(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i2 = 0;
                                    }
                                    if (applicationInfo.metaData != null) {
                                        String[] strArr = {M.C, M.D, M.F, M.H};
                                        boolean[] zArr = {true, true, true, true};
                                        i2 = 0;
                                        i3 = 0;
                                        while (true) {
                                            int i6 = i4 + 1;
                                            try {
                                                i2 |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                                                i3 |= (applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) ? 1 : 0) << i4;
                                                if (i6 > 3) {
                                                    break;
                                                }
                                                i4 = i6;
                                            } catch (PackageManager.NameNotFoundException unused2) {
                                                i4 = i3;
                                                i3 = i4;
                                                i4 = i2;
                                                com.facebook.appevents.K k2 = new com.facebook.appevents.K(n2);
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("usage", i4);
                                                bundle.putInt("initial", i3);
                                                bundle.putInt("previous", i5);
                                                bundle.putInt("current", e2);
                                                k2.h(bundle);
                                                return;
                                            }
                                        }
                                        i4 = i2;
                                        com.facebook.appevents.K k22 = new com.facebook.appevents.K(n2);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("usage", i4);
                                        bundle2.putInt("initial", i3);
                                        bundle2.putInt("previous", i5);
                                        bundle2.putInt("current", e2);
                                        k22.h(bundle2);
                                        return;
                                    }
                                    i3 = 0;
                                    com.facebook.appevents.K k222 = new com.facebook.appevents.K(n2);
                                    Bundle bundle22 = new Bundle();
                                    bundle22.putInt("usage", i4);
                                    bundle22.putInt("initial", i3);
                                    bundle22.putInt("previous", i5);
                                    bundle22.putInt("current", e2);
                                    k222.h(bundle22);
                                    return;
                                }
                                C6562gT0.S("userSettingPref");
                                throw null;
                            }
                            return;
                        }
                        C6562gT0.S("userSettingPref");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void q() {
        if (!SQ.e(this)) {
            try {
                M m2 = M.a;
                Context n2 = M.n();
                ApplicationInfo applicationInfo = n2.getPackageManager().getApplicationInfo(n2.getPackageName(), 128);
                C6562gT0.o(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    if (!bundle.containsKey(M.F)) {
                        Log.w(b, s);
                    }
                    if (!d()) {
                        Log.w(b, t);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void s(a aVar) {
        String str = "";
        if (!SQ.e(this)) {
            try {
                x();
                try {
                    SharedPreferences sharedPreferences = p;
                    if (sharedPreferences != null) {
                        String string = sharedPreferences.getString(aVar.b(), "");
                        if (string != null) {
                            str = string;
                        }
                        if (str.length() > 0) {
                            JSONObject jSONObject = new JSONObject(str);
                            aVar.i(Boolean.valueOf(jSONObject.getBoolean("value")));
                            aVar.h(jSONObject.getLong(q));
                            return;
                        }
                        return;
                    }
                    C6562gT0.S("userSettingPref");
                    throw null;
                } catch (JSONException e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void x() {
        if (!SQ.e(this)) {
            try {
                if (c.get()) {
                    return;
                }
                throw new N("The UserSettingManager has not been initialized successfully");
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void y(a aVar) {
        if (!SQ.e(this)) {
            try {
                x();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", aVar.d());
                    jSONObject.put(q, aVar.c());
                    SharedPreferences sharedPreferences = p;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                        p();
                        return;
                    }
                    C6562gT0.S("userSettingPref");
                    throw null;
                } catch (Exception e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
