package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfkw extends zzbww {
    public final /* synthetic */ zzgds X;
    public final /* synthetic */ zzbwq Y;
    public final /* synthetic */ zzfkx Z;

    public zzfkw(zzfkx zzfkxVar, zzgds zzgdsVar, zzbwq zzbwqVar) {
        this.X = zzgdsVar;
        this.Y = zzbwqVar;
        this.Z = zzfkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void E(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.B0().toString();
        zzfkx zzfkxVar = this.Z;
        String str = zzfkxVar.e.X;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to load rewarded ad with error: " + adError + ", adUnitId: " + str);
        zzfkxVar.f(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void g() {
        zzfju.a(this.Y, this.X);
    }
}
