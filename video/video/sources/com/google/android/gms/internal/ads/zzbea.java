package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C9500sT;
import o.C9743tT;
import o.CT;
import o.InterfaceC10571ws1;
import o.InterfaceC5056aJ2;
import o.InterfaceC7866lr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbea {
    public final ScheduledExecutorService a;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzo b;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzf c;
    public final zzdsi d;
    public Runnable e;
    public zzbdx f;
    public CT g;
    public String h;
    public long i = 0;
    public long j;
    public JSONArray k;
    public Context l;

    @InterfaceC5056aJ2
    public zzbea(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdsi zzdsiVar) {
        this.a = scheduledExecutorService;
        this.b = zzoVar;
        this.c = zzfVar;
        this.d = zzdsiVar;
    }

    @InterfaceC10571ws1
    public final CT b() {
        return this.g;
    }

    @InterfaceC5056aJ2
    public final JSONObject c(String str, String str2) throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            j = ((Long) zzbfa.h.e()).longValue();
        } else {
            j = 0;
        }
        jSONObject.put("sdk_ttl_ms", j);
        k(jSONObject);
        if (((Boolean) zzbfa.c.e()).booleanValue()) {
            jSONObject.put("as", this.c.a());
        }
        return jSONObject;
    }

    @InterfaceC5056aJ2
    public final JSONObject d(String str, String str2) throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            j = ((Long) zzbfa.h.e()).longValue();
        } else {
            j = 0;
        }
        jSONObject.put("sdk_ttl_ms", j);
        k(jSONObject);
        if (((Boolean) zzbfa.c.e()).booleanValue()) {
            jSONObject.put("as", this.c.a());
        }
        return jSONObject;
    }

    public final void f() {
        this.i = com.google.android.gms.ads.internal.zzv.d().b() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fa)).intValue();
        if (this.e == null) {
            this.e = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdy
                @Override // java.lang.Runnable
                public final void run() {
                    zzbea.this.j();
                }
            };
        }
        j();
    }

    public final void g(@InterfaceC7866lr1 Context context, @InterfaceC7866lr1 C9743tT c9743tT, @InterfaceC7866lr1 String str, @InterfaceC10571ws1 C9500sT c9500sT) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (c9743tT != null) {
                    this.l = context;
                    this.h = str;
                    zzdsi zzdsiVar = this.d;
                    zzbdx zzbdxVar = new zzbdx(this, c9500sT, zzdsiVar);
                    this.f = zzbdxVar;
                    CT k = c9743tT.k(zzbdxVar);
                    this.g = k;
                    if (k == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.d("CustomTabsClient failed to create new session.");
                    }
                    com.google.android.gms.ads.nonagon.signalgeneration.zzaa.d(zzdsiVar, null, "pact_action", new Pair("pe", "pact_init"));
                    return;
                }
                throw new IllegalArgumentException("CustomTabsClient parameter is null");
            }
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        throw new IllegalArgumentException("App Context parameter is null");
    }

    public final void h(String str) {
        try {
            CT ct = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.j).toString());
            k(jSONObject);
            if (((Boolean) zzbfa.c.e()).booleanValue()) {
                jSONObject.put("as", this.c.a());
            }
            ct.l(jSONObject.toString(), null);
            zzbdz zzbdzVar = new zzbdz(this, str);
            if (((Boolean) zzbfa.e.e()).booleanValue()) {
                this.b.g(this.g, zzbdzVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.a(this.l, AdFormat.BANNER, new AdRequest.Builder().e(AdMobAdapter.class, bundle).p(), zzbdzVar);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error creating JSON: ", e);
        }
    }

    public final void i(long j) {
        this.j = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.ga)).booleanValue() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ScheduledExecutorService scheduledExecutorService;
        zzbdx zzbdxVar = this.f;
        if (zzbdxVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("PACT callback is not present, please initialize the PawCustomTabsImpl.");
        } else if (zzbdxVar.l().booleanValue()) {
        } else {
            if (this.h != null && this.g != null && (scheduledExecutorService = this.a) != null) {
                if (this.i == 0 || com.google.android.gms.ads.internal.zzv.d().b() > this.i) {
                }
                this.g.n(Uri.parse(this.h));
                scheduledExecutorService.schedule(this.e, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ha)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            com.google.android.gms.ads.internal.util.zze.k("PACT max retry connection duration timed out");
        }
    }

    public final void k(JSONObject jSONObject) {
        try {
            if (this.k == null) {
                this.k = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ja));
            }
            jSONObject.put("eids", this.k);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
