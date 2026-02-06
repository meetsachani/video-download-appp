package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzboy implements zzbkl {
    public final zzcaf a;

    public zzboy(zzboz zzbozVar, zzcaf zzcafVar) {
        this.a = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void a(JSONObject jSONObject) {
        try {
            this.a.c(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.a.d(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void w(@InterfaceC11300zs1 String str) {
        try {
            if (str == null) {
                this.a.d(new zzboc());
            } else {
                this.a.d(new zzboc(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
