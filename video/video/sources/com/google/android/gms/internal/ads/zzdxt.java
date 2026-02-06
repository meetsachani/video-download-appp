package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdxt implements zzgcu {
    public final /* synthetic */ zzdxu a;

    public zzdxt(zzdxu zzdxuVar) {
        this.a = zzdxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcyt zzcytVar;
        zzfcg zzfcgVar = (zzfcg) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v2)).booleanValue()) {
            zzcytVar = this.a.k;
            zzcytVar.f0(zzfcgVar);
        }
    }
}
