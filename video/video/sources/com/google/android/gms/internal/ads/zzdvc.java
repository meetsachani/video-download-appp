package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC10571ws1;
import o.InterfaceFutureC8411o11;
import o.XH0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdvc implements zzdwd, zzdun {
    public final zzdvn a;
    public final zzdwe b;
    public final zzduo c;
    public final zzdux d;
    public final zzdum e;
    public final zzdvz f;
    public final zzdvj g;
    public final zzdvj h;
    public final String i;
    public final Context j;
    @InterfaceC10571ws1
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final Map l = new HashMap();
    public final Map m = new HashMap();
    public final Map n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    public String f273o = "{}";
    public long q = Long.MAX_VALUE;
    public zzduy r = zzduy.NONE;
    public zzdvb v = zzdvb.UNKNOWN;
    public long w = 0;
    public String x = "";

    public zzdvc(zzdvn zzdvnVar, zzdwe zzdweVar, zzduo zzduoVar, Context context, VersionInfoParcel versionInfoParcel, zzdux zzduxVar, zzdvz zzdvzVar, zzdvj zzdvjVar, zzdvj zzdvjVar2, @InterfaceC10571ws1 String str) {
        this.a = zzdvnVar;
        this.b = zzdweVar;
        this.c = zzduoVar;
        this.e = new zzdum(context);
        this.i = versionInfoParcel.X;
        this.k = str;
        this.d = zzduxVar;
        this.f = zzdvzVar;
        this.g = zzdvjVar;
        this.h = zzdvjVar2;
        this.j = context;
        com.google.android.gms.ads.internal.zzv.y().g(this);
    }

    public final synchronized void A() {
        int ordinal = this.r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.c.c();
            return;
        }
        this.b.c();
    }

    public final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            y(jSONObject.optBoolean("isTestMode", false), false);
            x((zzduy) Enum.valueOf(zzduy.class, jSONObject.optString("gesture", XH0.M)), false);
            this.f273o = jSONObject.optString("networkExtras", "{}");
            this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzduy b() {
        return this.r;
    }

    public final synchronized InterfaceFutureC8411o11 c(String str) {
        zzcaf zzcafVar;
        try {
            zzcafVar = new zzcaf();
            Map map = this.m;
            if (map.containsKey(str)) {
                zzcafVar.c((zzduq) map.get(str));
            } else {
                Map map2 = this.n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcafVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcafVar;
    }

    public final synchronized String d() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && r()) {
            if (this.q < com.google.android.gms.ads.internal.zzv.d().a() / 1000) {
                this.f273o = "{}";
                this.q = Long.MAX_VALUE;
                return "";
            } else if (!this.f273o.equals("{}")) {
                return this.f273o;
            }
        }
        return "";
    }

    public final synchronized String e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.s);
            jSONObject.put("gesture", this.r);
            if (this.q > com.google.android.gms.ads.internal.zzv.d().a() / 1000) {
                jSONObject.put("networkExtras", this.f273o);
                jSONObject.put("networkExtrasExpirationSecs", this.q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.k;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.e0, "afma-sdk-a-v" + str);
                }
                jSONObject.put("internalSdkVersion", this.i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.d.a());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J9)).booleanValue()) {
                    String o2 = com.google.android.gms.ads.internal.zzv.t().o();
                    if (!TextUtils.isEmpty(o2)) {
                        jSONObject.put("plugin", o2);
                    }
                }
                if (this.q < com.google.android.gms.ads.internal.zzv.d().a() / 1000) {
                    this.f273o = "{}";
                }
                jSONObject.put("networkExtras", this.f273o);
                jSONObject.put("adSlots", u());
                jSONObject.put("appInfo", this.e.a());
                String c = com.google.android.gms.ads.internal.zzv.t().j().g().c();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject.put("cld", new JSONObject(c));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z9)).booleanValue() && (jSONObject2 = this.p) != null) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.p);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
                    jSONObject.put("openAction", this.v);
                    jSONObject.put("gesture", this.r);
                }
                jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.y().l());
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.client.zzbb.b();
                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.x());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L9)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.x));
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N9))) {
                    jSONObject.put("gmaDisk", this.h.a());
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M9))) {
                    jSONObject.put("userDisk", this.g.a());
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.t().w(e, "Inspector.toJson");
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void g(String str, zzduq zzduqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue() && r()) {
            if (this.t >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l9)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.t++;
            ((List) map.get(str)).add(zzduqVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
                String a = zzduqVar.a();
                this.m.put(a, zzduqVar);
                Map map2 = this.n;
                if (map2.containsKey(a)) {
                    List<zzcaf> list = (List) map2.get(a);
                    for (zzcaf zzcafVar : list) {
                        zzcafVar.c(zzduqVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void h() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue() && com.google.android.gms.ads.internal.zzv.t().j().K()) {
                v();
                return;
            }
            String k = com.google.android.gms.ads.internal.zzv.t().j().k();
            if (!TextUtils.isEmpty(k)) {
                try {
                    if (new JSONObject(k).optBoolean("isTestMode", false)) {
                        v();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final synchronized void i(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzdvb zzdvbVar) {
        if (!r()) {
            try {
                zzdkVar.U2(zzfdq.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
            try {
                zzdkVar.U2(zzfdq.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Ad inspector had an internal error.");
                return;
            }
        }
        this.v = zzdvbVar;
        this.a.e(zzdkVar, new zzbkq(this), new zzbkj(this.f), new zzbjx(this));
        return;
    }

    public final synchronized void j(String str, long j) {
        this.f273o = str;
        this.q = j;
        w();
    }

    public final synchronized void k(String str) {
        this.x = str;
        com.google.android.gms.ads.internal.zzv.t().j().i0(this.x);
    }

    public final synchronized void l(long j) {
        this.w += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z) {
        if (!this.u) {
            if (z) {
                v();
                if (!this.s) {
                    A();
                    return;
                }
            }
            if (!r()) {
                z();
            }
        }
    }

    public final void n(zzduy zzduyVar) {
        x(zzduyVar, true);
    }

    public final synchronized void o(JSONObject jSONObject) {
        this.p = jSONObject;
    }

    public final void p(boolean z) {
        if (!this.u && z) {
            v();
        }
        y(z, true);
    }

    public final boolean q() {
        return this.p != null;
    }

    public final synchronized boolean r() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
            if (!this.s && !com.google.android.gms.ads.internal.zzv.y().l()) {
                return false;
            }
            return true;
        }
        return this.s;
    }

    public final synchronized boolean s() {
        return this.s;
    }

    public final boolean t() {
        if (this.w < ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E9)).longValue()) {
            return true;
        }
        return false;
    }

    public final synchronized JSONObject u() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzduq zzduqVar : (List) entry.getValue()) {
                    if (zzduqVar.e()) {
                        jSONArray.put(zzduqVar.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void v() {
        this.u = true;
        this.d.c();
        this.a.d(this);
        this.b.d(this);
        this.c.d(this);
        this.f.Z7(this);
        zzbcm zzbcmVar = zzbcv.M9;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar))) {
            this.g.b(PreferenceManager.getDefaultSharedPreferences(this.j), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).split(",")));
        }
        zzbcm zzbcmVar2 = zzbcv.N9;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar2))) {
            this.h.b(this.j.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar2)).split(",")));
        }
        a(com.google.android.gms.ads.internal.zzv.t().j().k());
        this.x = com.google.android.gms.ads.internal.zzv.t().j().l();
    }

    public final void w() {
        com.google.android.gms.ads.internal.zzv.t().j().l0(e());
    }

    public final synchronized void x(zzduy zzduyVar, boolean z) {
        try {
            if (this.r != zzduyVar) {
                if (r()) {
                    z();
                }
                this.r = zzduyVar;
                if (r()) {
                    A();
                }
                if (z) {
                    w();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void y(boolean z, boolean z2) {
        try {
            if (this.s != z) {
                this.s = z;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
                        if (!com.google.android.gms.ads.internal.zzv.y().l()) {
                        }
                    }
                    A();
                    if (z2) {
                        w();
                        return;
                    }
                }
                if (!r()) {
                    z();
                }
                if (z2) {
                }
            }
        } finally {
        }
    }

    public final synchronized void z() {
        int ordinal = this.r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.c.b();
            return;
        }
        this.b.b();
    }
}
