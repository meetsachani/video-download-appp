package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzevo implements zzetv {
    public final JSONObject a;

    public zzevo(Context context) {
        this.a = zzbvh.c(context, VersionInfoParcel.m0());
    }

    public static /* synthetic */ void c(zzevo zzevoVar, JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", zzevoVar.a);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.lc)).booleanValue()) {
            return zzgcy.h(new zzetu() { // from class: com.google.android.gms.internal.ads.zzevm
                @Override // com.google.android.gms.internal.ads.zzetu
                public final /* synthetic */ void b(Object obj) {
                }

                @Override // com.google.android.gms.internal.ads.zzetu
                public final void c(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                }
            });
        }
        return zzgcy.h(new zzetu() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // com.google.android.gms.internal.ads.zzetu
            public final /* synthetic */ void b(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzetu
            public final void c(Object obj) {
                zzevo.c(zzevo.this, (JSONObject) obj);
            }
        });
    }
}
