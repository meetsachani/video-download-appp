package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC8289nW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C {
    @NotNull
    public static final String A = "7_challenge";
    @NotNull
    public static final String B = "try_login_activity";
    @NotNull
    public static final String C = "no_internet_permission";
    @NotNull
    public static final String D = "not_tried";
    @NotNull
    public static final String E = "new_permissions";
    @NotNull
    public static final String F = "login_behavior";
    @NotNull
    public static final String G = "request_code";
    @NotNull
    public static final String H = "permissions";
    @NotNull
    public static final String I = "default_audience";
    @NotNull
    public static final String J = "isReauthorize";
    @NotNull
    public static final String K = "facebookVersion";
    @NotNull
    public static final String L = "failure";
    @NotNull
    public static final String M = "target_app";
    @NotNull
    public static final String N = "com.facebook.katana";
    @NotNull
    public static final String e = "fb_mobile_login_method_start";
    @NotNull
    public static final String f = "fb_mobile_login_method_complete";
    @NotNull
    public static final String g = "fb_mobile_login_method_not_tried";
    @NotNull
    public static final String h = "skipped";
    @NotNull
    public static final String i = "fb_mobile_login_start";
    @NotNull
    public static final String j = "fb_mobile_login_complete";
    @NotNull
    public static final String k = "fb_mobile_login_status_start";
    @NotNull
    public static final String l = "fb_mobile_login_status_complete";
    @NotNull
    public static final String m = "fb_mobile_login_heartbeat";
    @NotNull
    public static final String n = "foa_mobile_login_method_start";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f129o = "foa_mobile_login_method_complete";
    @NotNull
    public static final String p = "foa_mobile_login_method_not_tried";
    @NotNull
    public static final String q = "foa_skipped";
    @NotNull
    public static final String r = "foa_mobile_login_start";
    @NotNull
    public static final String s = "foa_mobile_login_complete";
    @NotNull
    public static final String t = "0_auth_logger_id";
    @NotNull
    public static final String u = "1_timestamp_ms";
    @NotNull
    public static final String v = "2_result";
    @NotNull
    public static final String w = "3_method";
    @NotNull
    public static final String x = "4_error_code";
    @NotNull
    public static final String y = "5_error_message";
    @NotNull
    public static final String z = "6_extras";
    @NotNull
    public final String a;
    @NotNull
    public final com.facebook.appevents.K b;
    @Nullable
    public String c;
    @NotNull
    public static final a d = new a(null);
    public static final ScheduledExecutorService O = Executors.newSingleThreadScheduledExecutor();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong(C.u, System.currentTimeMillis());
            bundle.putString(C.t, str);
            bundle.putString(C.w, "");
            bundle.putString(C.v, "");
            bundle.putString(C.y, "");
            bundle.putString(C.x, "");
            bundle.putString(C.z, "");
            return bundle;
        }

        public a() {
        }
    }

    public C(@NotNull Context context, @NotNull String str) {
        PackageInfo packageInfo;
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "applicationId");
        this.a = str;
        this.b = new com.facebook.appevents.K(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ void e(C c, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 64) != 0) {
            str6 = f;
        }
        try {
            c.d(str, str2, str3, str4, str5, map, str6);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static /* synthetic */ void h(C c, String str, String str2, String str3, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = g;
        }
        try {
            c.g(str, str2, str3);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static /* synthetic */ void k(C c, String str, String str2, String str3, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = e;
        }
        try {
            c.j(str, str2, str3);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static /* synthetic */ void n(C c, String str, Map map, w.f.a aVar, Map map2, Exception exc, String str2, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 32) != 0) {
            str2 = j;
        }
        try {
            c.m(str, map, aVar, map2, exc, str2);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static final void p(C c, Bundle bundle) {
        if (SQ.e(C.class)) {
            return;
        }
        try {
            C6562gT0.p(c, "this$0");
            C6562gT0.p(bundle, "$bundle");
            c.b.m(m, bundle);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static /* synthetic */ void w(C c, w.e eVar, String str, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 2) != 0) {
            str = i;
        }
        try {
            c.v(eVar, str);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    public static /* synthetic */ void z(C c, String str, String str2, String str3, int i2, Object obj) {
        if (SQ.e(C.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        try {
            c.y(str, str2, str3);
        } catch (Throwable th) {
            SQ.c(th, C.class);
        }
    }

    @NotNull
    public final String b() {
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

    @InterfaceC8289nW0
    public final void c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map) {
        if (SQ.e(this)) {
            return;
        }
        try {
            e(this, str, str2, str3, str4, str5, map, null, 64, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void d(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, @Nullable String str6) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b(str);
                if (str3 != null) {
                    b.putString(v, str3);
                }
                if (str4 != null) {
                    b.putString(y, str4);
                }
                if (str5 != null) {
                    b.putString(x, str5);
                }
                if (map != null && !map.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    b.putString(z, new JSONObject(linkedHashMap).toString());
                }
                b.putString(w, str2);
                this.b.m(str6, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC8289nW0
    public final void f(@Nullable String str, @Nullable String str2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            h(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void g(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b(str);
                b.putString(w, str2);
                this.b.m(str3, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC8289nW0
    public final void i(@Nullable String str, @Nullable String str2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            k(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void j(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b(str);
                b.putString(w, str2);
                this.b.m(str3, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC8289nW0
    public final void l(@Nullable String str, @NotNull Map<String, String> map, @Nullable w.f.a aVar, @Nullable Map<String, String> map2, @Nullable Exception exc) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(map, "loggingExtras");
        } catch (Throwable th) {
            th = th;
        }
        try {
            n(this, str, map, aVar, map2, exc, null, 32, null);
        } catch (Throwable th2) {
            th = th2;
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void m(@Nullable String str, @NotNull Map<String, String> map, @Nullable w.f.a aVar, @Nullable Map<String, String> map2, @Nullable Exception exc, @Nullable String str2) {
        String message;
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(map, "loggingExtras");
                Bundle b = d.b(str);
                if (aVar != null) {
                    b.putString(v, aVar.g());
                }
                JSONObject jSONObject = null;
                if (exc == null) {
                    message = null;
                } else {
                    message = exc.getMessage();
                }
                if (message != null) {
                    b.putString(y, exc.getMessage());
                }
                if (!map.isEmpty()) {
                    jSONObject = new JSONObject(map);
                }
                if (map2 != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry<String, String> entry : map2.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (key != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    b.putString(z, jSONObject.toString());
                }
                this.b.m(str2, b);
                if (aVar == w.f.a.SUCCESS) {
                    o(str);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void o(String str) {
        if (!SQ.e(this)) {
            try {
                final Bundle b = d.b(str);
                O.schedule(new Runnable() { // from class: com.facebook.login.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.p(C.this, b);
                    }
                }, 5L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void q(@Nullable String str, @NotNull Exception exc) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(exc, "exception");
            Bundle b = d.b(str);
            b.putString(v, w.f.a.ERROR.g());
            b.putString(y, exc.toString());
            this.b.m(l, b);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void r(@Nullable String str) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b(str);
                b.putString(v, L);
                this.b.m(l, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void s(@Nullable String str) {
        if (!SQ.e(this)) {
            try {
                this.b.m(k, d.b(str));
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void t(@Nullable String str) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b(str);
                b.putString(v, w.f.a.SUCCESS.g());
                this.b.m(l, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC8289nW0
    public final void u(@NotNull w.e eVar) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(eVar, "pendingLoginRequest");
            w(this, eVar, null, 2, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void v(@NotNull w.e eVar, @Nullable String str) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(eVar, "pendingLoginRequest");
                Bundle b = d.b(eVar.b());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", eVar.m().toString());
                    jSONObject.put(G, w.h1.b());
                    jSONObject.put("permissions", TextUtils.join(",", eVar.s()));
                    jSONObject.put("default_audience", eVar.g().toString());
                    jSONObject.put(J, eVar.x());
                    String str2 = this.c;
                    if (str2 != null) {
                        jSONObject.put(K, str2);
                    }
                    if (eVar.n() != null) {
                        jSONObject.put(M, eVar.n().toString());
                    }
                    b.putString(z, jSONObject.toString());
                } catch (JSONException unused) {
                }
                this.b.m(str, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC8289nW0
    public final void x(@Nullable String str, @Nullable String str2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            z(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public final void y(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!SQ.e(this)) {
            try {
                Bundle b = d.b("");
                b.putString(v, w.f.a.ERROR.g());
                b.putString(y, str2);
                b.putString(w, str3);
                this.b.m(str, b);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
