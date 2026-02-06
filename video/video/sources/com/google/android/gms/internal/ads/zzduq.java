package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.facebook.S;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzduq implements zzcvw, zzcyv, zzcxl {
    public final zzdvc X;
    public final String Y;
    public final String Z;
    public zzcvm a1;
    public com.google.android.gms.ads.internal.client.zze b1;
    public JSONObject f1;
    public JSONObject g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public String c1 = "";
    public String d1 = "";
    public String e1 = "";
    public int Y0 = 0;
    public zzdup Z0 = zzdup.AD_REQUESTED;

    public zzduq(zzdvc zzdvcVar, zzfcp zzfcpVar, String str) {
        this.X = zzdvcVar;
        this.Z = str;
        this.Y = zzfcpVar.f;
    }

    public static JSONObject f(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.Z);
        jSONObject.put("errorCode", zzeVar.X);
        jSONObject.put("errorDescription", zzeVar.Y);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.Y0;
        if (zzeVar2 == null) {
            f = null;
        } else {
            f = f(zzeVar2);
        }
        jSONObject.put("underlyingError", f);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdvc zzdvcVar = this.X;
        if (zzdvcVar.r()) {
            this.Z0 = zzdup.AD_LOAD_FAILED;
            this.b1 = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
                zzdvcVar.g(this.Y, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
            zzdvc zzdvcVar = this.X;
            if (zzdvcVar.r()) {
                zzdvcVar.g(this.Y, this);
            }
        }
    }

    public final String a() {
        return this.Z;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.Z0);
        jSONObject2.put(S.A, zzfbu.a(this.Y0));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.h1);
            if (this.h1) {
                jSONObject2.put("shown", this.i1);
            }
        }
        zzcvm zzcvmVar = this.a1;
        if (zzcvmVar != null) {
            jSONObject = g(zzcvmVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.b1;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.Z0) != null) {
                zzcvm zzcvmVar2 = (zzcvm) iBinder;
                jSONObject3 = g(zzcvmVar2);
                if (zzcvmVar2.j().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.b1));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void c() {
        this.h1 = true;
    }

    public final void d() {
        this.i1 = true;
    }

    public final boolean e() {
        return this.Z0 != zzdup.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
        zzdvc zzdvcVar = this.X;
        if (zzdvcVar.r()) {
            zzfcf zzfcfVar = zzfcgVar.b;
            List list = zzfcfVar.a;
            int i = 0;
            if (!list.isEmpty()) {
                this.Y0 = ((zzfbu) list.get(0)).b;
            }
            zzfbx zzfbxVar = zzfcfVar.b;
            String str = zzfbxVar.l;
            if (!TextUtils.isEmpty(str)) {
                this.c1 = str;
            }
            String str2 = zzfbxVar.m;
            if (!TextUtils.isEmpty(str2)) {
                this.d1 = str2;
            }
            JSONObject jSONObject = zzfbxVar.p;
            if (jSONObject.length() > 0) {
                this.g1 = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D9)).booleanValue()) {
                if (!zzdvcVar.t()) {
                    this.j1 = true;
                    return;
                }
                String str3 = zzfbxVar.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.e1 = str3;
                }
                JSONObject jSONObject2 = zzfbxVar.f278o;
                if (jSONObject2.length() > 0) {
                    this.f1 = jSONObject2;
                }
                JSONObject jSONObject3 = this.f1;
                if (jSONObject3 != null) {
                    i = jSONObject3.toString().length();
                }
                if (!TextUtils.isEmpty(this.e1)) {
                    i += this.e1.length();
                }
                zzdvcVar.l(i);
            }
        }
    }

    public final JSONObject g(zzcvm zzcvmVar) throws JSONException {
        JSONObject f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvmVar.g());
        jSONObject.put("responseSecsSinceEpoch", zzcvmVar.Y7());
        jSONObject.put("responseId", zzcvmVar.i());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A9)).booleanValue()) {
            String k = zzcvmVar.k();
            if (!TextUtils.isEmpty(k)) {
                String valueOf = String.valueOf(k);
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(k));
            }
        }
        if (!TextUtils.isEmpty(this.c1)) {
            jSONObject.put("adRequestUrl", this.c1);
        }
        if (!TextUtils.isEmpty(this.d1)) {
            jSONObject.put("postBody", this.d1);
        }
        if (!TextUtils.isEmpty(this.e1)) {
            jSONObject.put("adResponseBody", this.e1);
        }
        Object obj = this.f1;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.g1;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.j1);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzcvmVar.j()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.X);
            jSONObject2.put("latencyMillis", zzvVar.Y);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B9)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbb.b().o(zzvVar.Y0));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.Z;
            if (zzeVar == null) {
                f = null;
            } else {
                f = f(zzeVar);
            }
            jSONObject2.put("error", f);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void y0(zzcqx zzcqxVar) {
        zzdvc zzdvcVar = this.X;
        if (zzdvcVar.r()) {
            this.a1 = zzcqxVar.c();
            this.Z0 = zzdup.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
                zzdvcVar.g(this.Y, this);
            }
        }
    }
}
