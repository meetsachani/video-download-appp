package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzboq implements zzbkl {
    public final zzbnt a;
    public final zzcaf b;
    public final /* synthetic */ zzbor c;

    public zzboq(zzbor zzborVar, zzbnt zzbntVar, zzcaf zzcafVar) {
        this.c = zzborVar;
        this.a = zzbntVar;
        this.b = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void a(JSONObject jSONObject) {
        zzbof zzbofVar;
        try {
            try {
                zzcaf zzcafVar = this.b;
                zzbofVar = this.c.a;
                zzcafVar.c(zzbofVar.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.b.d(e);
            }
        } finally {
            this.a.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void w(@InterfaceC11300zs1 String str) {
        try {
            if (str == null) {
                this.b.d(new zzboc());
            } else {
                this.b.d(new zzboc(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.a.h();
            throw th;
        }
        this.a.h();
    }
}
