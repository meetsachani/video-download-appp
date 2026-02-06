package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzj implements zzg {
    public boolean b;
    public InterfaceFutureC8411o11 d;
    @InterfaceC11300zs1
    public SharedPreferences f;
    @InterfaceC11300zs1
    public SharedPreferences.Editor g;
    @InterfaceC11300zs1
    public String i;
    @InterfaceC11300zs1
    public String j;
    public final Object a = new Object();
    public final List c = new ArrayList();
    @InterfaceC11300zs1
    public zzazt e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public int m = -1;
    public zzbzh n = new zzbzh("", 0);

    /* renamed from: o  reason: collision with root package name */
    public long f180o = 0;
    public long p = 0;
    public int q = -1;
    public int r = 0;
    public Set s = Collections.EMPTY_SET;
    public JSONObject t = new JSONObject();
    public boolean u = true;
    public boolean v = true;
    public String w = null;
    public String x = "";
    public boolean y = false;
    public String z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    public static /* synthetic */ void p(zzj zzjVar, Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (zzjVar.a) {
                zzjVar.f = sharedPreferences;
                zzjVar.g = edit;
                if (PlatformVersion.l()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                zzjVar.h = zzjVar.f.getBoolean("use_https", zzjVar.h);
                zzjVar.u = zzjVar.f.getBoolean("content_url_opted_out", zzjVar.u);
                zzjVar.i = zzjVar.f.getString("content_url_hashes", zzjVar.i);
                zzjVar.k = zzjVar.f.getBoolean("gad_idless", zzjVar.k);
                zzjVar.v = zzjVar.f.getBoolean("content_vertical_opted_out", zzjVar.v);
                zzjVar.j = zzjVar.f.getString("content_vertical_hashes", zzjVar.j);
                zzjVar.r = zzjVar.f.getInt("version_code", zzjVar.r);
                if (((Boolean) zzben.g.e()).booleanValue() && com.google.android.gms.ads.internal.client.zzbd.c().e()) {
                    zzjVar.n = new zzbzh("", 0L);
                } else {
                    zzjVar.n = new zzbzh(zzjVar.f.getString("app_settings_json", zzjVar.n.c()), zzjVar.f.getLong("app_settings_last_update_ms", zzjVar.n.a()));
                }
                zzjVar.f180o = zzjVar.f.getLong("app_last_background_time_ms", zzjVar.f180o);
                zzjVar.q = zzjVar.f.getInt("request_in_session_count", zzjVar.q);
                zzjVar.p = zzjVar.f.getLong("first_ad_req_time_ms", zzjVar.p);
                zzjVar.s = zzjVar.f.getStringSet("never_pool_slots", zzjVar.s);
                zzjVar.w = zzjVar.f.getString("display_cutout", zzjVar.w);
                zzjVar.B = zzjVar.f.getInt("app_measurement_npa", zzjVar.B);
                zzjVar.C = zzjVar.f.getInt("sd_app_measure_npa", zzjVar.C);
                zzjVar.D = zzjVar.f.getLong("sd_app_measure_npa_ts", zzjVar.D);
                zzjVar.x = zzjVar.f.getString("inspector_info", zzjVar.x);
                zzjVar.y = zzjVar.f.getBoolean("linked_device", zzjVar.y);
                zzjVar.z = zzjVar.f.getString("linked_ad_unit", zzjVar.z);
                zzjVar.A = zzjVar.f.getString("inspector_ui_storage", zzjVar.A);
                zzjVar.l = zzjVar.f.getString("IABTCF_TCString", zzjVar.l);
                zzjVar.m = zzjVar.f.getInt("gad_has_consent_for_cookies", zzjVar.m);
                try {
                    zzjVar.t = new JSONObject(zzjVar.f.getString("native_advanced_settings", "{}"));
                } catch (JSONException e) {
                    int i = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Could not convert native advanced settings to json object", e);
                }
                zzjVar.s();
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean G() {
        boolean z;
        q();
        synchronized (this.a) {
            z = this.u;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean H() {
        q();
        synchronized (this.a) {
            try {
                SharedPreferences sharedPreferences = this.f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean J() {
        boolean z;
        q();
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean K() {
        boolean z;
        q();
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean M() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L0)).booleanValue()) {
            return false;
        }
        q();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void N(boolean z) {
        q();
        synchronized (this.a) {
            try {
                if (this.v == z) {
                    return;
                }
                this.v = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void Q(int i) {
        q();
        synchronized (this.a) {
            try {
                this.m = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void U(boolean z) {
        q();
        synchronized (this.a) {
            try {
                if (z == this.k) {
                    return;
                }
                this.k = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void V(String str) {
        q();
        synchronized (this.a) {
            try {
                if (TextUtils.equals(this.w, str)) {
                    return;
                }
                this.w = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void W(boolean z) {
        q();
        synchronized (this.a) {
            try {
                if (this.u == z) {
                    return;
                }
                this.u = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void X(@InterfaceC5670cr1 String str) {
        q();
        synchronized (this.a) {
            try {
                this.l = str;
                if (this.g != null) {
                    if (str.equals("-1")) {
                        this.g.remove("IABTCF_TCString");
                    } else {
                        this.g.putString("IABTCF_TCString", str);
                    }
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void Y(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void Z(int i) {
        q();
        synchronized (this.a) {
            try {
                if (this.r == i) {
                    return;
                }
                this.r = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int a() {
        int i;
        q();
        synchronized (this.a) {
            i = this.r;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void a0(String str, String str2, boolean z) {
        q();
        synchronized (this.a) {
            try {
                JSONArray optJSONArray = this.t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzv.d().a());
                    optJSONArray.put(length, jSONObject);
                    this.t.put(str, optJSONArray);
                } catch (JSONException e) {
                    int i2 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.t.toString());
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int b() {
        q();
        return this.m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void b0(long j) {
        q();
        synchronized (this.a) {
            try {
                if (this.p == j) {
                    return;
                }
                this.p = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int c() {
        int i;
        q();
        synchronized (this.a) {
            i = this.q;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void c0(int i) {
        q();
        synchronized (this.a) {
            try {
                if (this.q == i) {
                    return;
                }
                this.q = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long d() {
        long j;
        q();
        synchronized (this.a) {
            j = this.p;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void d0(int i) {
        q();
        synchronized (this.a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long e() {
        long j;
        q();
        synchronized (this.a) {
            j = this.D;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void e0(boolean z) {
        q();
        synchronized (this.a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ma)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long f() {
        long j;
        q();
        synchronized (this.a) {
            j = this.f180o;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void f0(boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
            return;
        }
        q();
        synchronized (this.a) {
            try {
                if (this.y == z) {
                    return;
                }
                this.y = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbzh g() {
        zzbzh zzbzhVar;
        q();
        synchronized (this.a) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Wb)).booleanValue() && this.n.j()) {
                    for (Runnable runnable : this.c) {
                        runnable.run();
                    }
                }
                zzbzhVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbzhVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void g0(final Context context) {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return;
                }
                this.d = zzcaa.a.f0(new Runnable(context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context Y;
                    public final /* synthetic */ String Z = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj.p(zzj.this, this.Y, this.Z);
                    }
                });
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbzh h() {
        zzbzh zzbzhVar;
        synchronized (this.a) {
            zzbzhVar = this.n;
        }
        return zzbzhVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void h0(String str) {
        q();
        synchronized (this.a) {
            try {
                long a = com.google.android.gms.ads.internal.zzv.d().a();
                if (str != null && !str.equals(this.n.c())) {
                    this.n = new zzbzh(str, a);
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", a);
                        this.g.apply();
                    }
                    s();
                    for (Runnable runnable : this.c) {
                        runnable.run();
                    }
                    return;
                }
                this.n.g(a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String i() {
        String str;
        q();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void i0(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L9)).booleanValue()) {
            return;
        }
        q();
        synchronized (this.a) {
            try {
                if (this.A.equals(str)) {
                    return;
                }
                this.A = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String j() {
        String str;
        q();
        synchronized (this.a) {
            str = this.w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void j0(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
            return;
        }
        q();
        synchronized (this.a) {
            try {
                if (this.z.equals(str)) {
                    return;
                }
                this.z = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String k() {
        String str;
        q();
        synchronized (this.a) {
            str = this.x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void k0(long j) {
        q();
        synchronized (this.a) {
            try {
                if (this.D == j) {
                    return;
                }
                this.D = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String l() {
        String str;
        q();
        synchronized (this.a) {
            str = this.A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void l0(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
            return;
        }
        q();
        synchronized (this.a) {
            try {
                if (this.x.equals(str)) {
                    return;
                }
                this.x = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @InterfaceC11300zs1
    public final String m() {
        q();
        return this.l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void m0(long j) {
        q();
        synchronized (this.a) {
            try {
                if (this.f180o == j) {
                    return;
                }
                this.f180o = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject n() {
        JSONObject jSONObject;
        q();
        synchronized (this.a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }

    @InterfaceC11300zs1
    public final zzazt o() {
        if (!this.b) {
            return null;
        }
        if ((G() && J()) || !((Boolean) zzbem.b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.e == null) {
                    this.e = new zzazt();
                }
                this.e.d();
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.f("start fetching content...");
                return this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.d;
        if (interfaceFutureC8411o11 != null && !interfaceFutureC8411o11.isDone()) {
            try {
                this.d.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException e2) {
                e = e2;
                int i2 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (ExecutionException e3) {
                e = e3;
                int i22 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (TimeoutException e4) {
                e = e4;
                int i222 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Fail to initialize AdSharedPreferenceManager.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void r() {
        q();
        synchronized (this.a) {
            try {
                this.t = new JSONObject();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.g.apply();
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.o();
            }
        });
    }
}
