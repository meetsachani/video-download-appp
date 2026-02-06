package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfjv extends zzbap {
    public final /* synthetic */ zzgds X;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzfp Y;
    public final /* synthetic */ zzfjw Z;

    public zzfjv(zzfjw zzfjwVar, zzgds zzgdsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        this.X = zzgdsVar;
        this.Y = zzfpVar;
        this.Z = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void k1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.B0().toString();
        String str = this.Y.X;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to load app open ad with error parcel: " + adError + " for ad unit: " + str);
        this.Z.f(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void x4(zzban zzbanVar) {
        zzfju.a(zzbanVar, this.X);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void z(int i) {
    }
}
