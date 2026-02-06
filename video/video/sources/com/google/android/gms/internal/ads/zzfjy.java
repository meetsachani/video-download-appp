package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfjy extends com.google.android.gms.ads.internal.client.zzbm {
    public final /* synthetic */ zzgds X;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx Y;
    public final /* synthetic */ zzfjz Z;

    public zzfjy(zzfjz zzfjzVar, zzgds zzgdsVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.X = zzgdsVar;
        this.Y = zzbxVar;
        this.Z = zzfjzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void c() {
        zzfju.a(this.Y, this.X);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void d1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.B0().toString();
        zzfjz zzfjzVar = this.Z;
        String str = zzfjzVar.e.X;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to load interstitial ad with error: " + adError + " for ad unit: " + str);
        zzfjzVar.f(zzeVar);
    }
}
