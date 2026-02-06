package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdih implements zzgcu {
    public final /* synthetic */ String a = "Google";
    public final /* synthetic */ zzdij b;

    public zzdih(zzdij zzdijVar, String str, boolean z) {
        this.b = zzdijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E5)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdio zzdioVar;
        zzdio zzdioVar2;
        zzdij zzdijVar = this.b;
        zzdioVar = zzdijVar.k;
        zzdioVar.t((zzcfb) obj);
        zzdioVar2 = zzdijVar.k;
        zzcaf c0 = zzdioVar2.c0();
        zzeda V = zzdijVar.V(this.a, true);
        if (V != null && c0 != null) {
            c0.c(V);
        } else if (c0 != null) {
            c0.cancel(false);
        }
    }
}
