package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import o.C6528gK2;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdrj implements zzcyv, zzcxh, zzcvw, zzdek {
    public final zzdrx X;
    public final zzdsi Y;
    public final int Z;

    public zzdrj(zzdrx zzdrxVar, zzdsi zzdsiVar, int i) {
        this.X = zzdrxVar;
        this.Y = zzdsiVar;
        this.Z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdrx zzdrxVar = this.X;
        zzdrxVar.b().put("action", "ftl");
        zzdrxVar.d("ftl", String.valueOf(zzeVar.X));
        zzdrxVar.d("ed", zzeVar.Z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r7)).booleanValue()) {
            zzdrxVar.d("emsg", zzeVar.Y);
        }
        this.Y.g(zzdrxVar.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        this.X.f(zzbvlVar.X);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d7)).booleanValue()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J7)).booleanValue()) {
            this.X.b().put("sgw", String.valueOf(this.Z));
        }
        zzdrx zzdrxVar = this.X;
        zzdrxVar.b().put("action", "sgf");
        zzdrxVar.d("sgf_reason", str);
        this.Y.g(zzdrxVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzdek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@InterfaceC11300zs1 com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        String str;
        String str2;
        zzbvl zzbvlVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d7)).booleanValue()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J7)).booleanValue()) {
            this.X.b().put("sgw", String.valueOf(this.Z));
        }
        if (zzbkVar == null) {
            zzdrx zzdrxVar = this.X;
            zzdrxVar.b().put("action", "sgs");
            zzdrxVar.b().put(C9755tW1.f875o, "-1");
            this.Y.g(zzdrxVar.b());
            return;
        }
        zzbvl zzbvlVar2 = zzbkVar.d;
        Bundle bundle = zzbkVar.e;
        if (zzbvlVar2 != null) {
            c(zzbvlVar2.h1, zzdrm.d);
        } else if (bundle != null && !bundle.isEmpty()) {
            c(bundle, zzdrm.d);
        }
        try {
            if (TextUtils.isEmpty(zzbkVar.c)) {
                str = zzbkVar.b;
            } else {
                str = zzbkVar.c;
            }
            JSONObject jSONObject = new JSONObject(str);
            zzdrx zzdrxVar2 = this.X;
            zzdrxVar2.b().put("action", "sgs");
            Map b = zzdrxVar2.b();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W9)).booleanValue()) {
                try {
                    if (jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie")) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                } catch (JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Error retrieving JSONObject from the requestJson, ", e);
                }
                b.put("tpc", str2);
                zzbvlVar = zzbkVar.d;
                if (zzbvlVar != null) {
                    this.X.f(zzbvlVar.X);
                }
                this.Y.g(this.X.b());
            }
            str2 = "na";
            b.put("tpc", str2);
            zzbvlVar = zzbkVar.d;
            if (zzbvlVar != null) {
            }
            this.Y.g(this.X.b());
        } catch (JSONException unused) {
            zzdrx zzdrxVar3 = this.X;
            zzdrxVar3.b().put("action", "sgf");
            zzdrxVar3.b().put("sgf_reason", "request_invalid");
            this.Y.g(zzdrxVar3.b());
        }
    }

    public final void b(@InterfaceC11300zs1 Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j = bundle.getLong(str);
                if (j >= 0) {
                    this.X.d(str, String.valueOf(j));
                }
            }
        }
    }

    public final void c(Bundle bundle, zzfyc zzfycVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && bundle != null) {
            bundle.putLong(zzdrl.PUBLIC_API_CALLBACK.e(), com.google.android.gms.ads.internal.zzv.d().a());
            zzdrx zzdrxVar = this.X;
            zzdrxVar.c();
            String str2 = "1";
            if (bundle.containsKey("ls")) {
                if (true == bundle.getBoolean("ls")) {
                    str = "1";
                } else {
                    str = "0";
                }
                zzdrxVar.d("ls", str);
            }
            int size = zzfycVar.size();
            for (int i = 0; i < size; i++) {
                zzdrm zzdrmVar = (zzdrm) zzfycVar.get(i);
                long j = bundle.getLong(zzdrmVar.a().e(), -1L);
                long j2 = bundle.getLong(zzdrmVar.b().e(), -1L);
                if (j > 0 && j2 > 0) {
                    zzdrxVar.d(zzdrmVar.c(), String.valueOf(j2 - j));
                }
            }
            b(bundle.getBundle("client_sig_latency_key"));
            b(bundle.getBundle("gms_sig_latency_key"));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J7)).booleanValue()) {
                if (bundle.containsKey("sod_h")) {
                    if (true != bundle.getBoolean("sod_h")) {
                        str2 = "0";
                    }
                    zzdrxVar.d("sod_h", str2);
                }
                if (bundle.containsKey("cmr")) {
                    zzdrxVar.d("cmr", String.valueOf(bundle.getInt("cmr")));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
        this.X.e(zzfcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        String str;
        zzdrx zzdrxVar = this.X;
        zzdrxVar.b().put("action", "loaded");
        c(zzdrxVar.a(), zzdrm.e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Sc)).booleanValue()) {
            boolean a = C6528gK2.a("MUTE_AUDIO");
            Map b = zzdrxVar.b();
            if (true != a) {
                str = "0";
            } else {
                str = "1";
            }
            b.put("mafe", str);
        }
        this.Y.g(zzdrxVar.b());
    }
}
