package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdnm implements zzgcu {
    public final /* synthetic */ zzfbu a;
    public final /* synthetic */ zzfbx b;
    public final /* synthetic */ zzcmn c;
    public final /* synthetic */ zzdns d;

    public zzdnm(zzdns zzdnsVar, zzfbu zzfbuVar, zzfbx zzfbxVar, zzcmn zzcmnVar) {
        this.a = zzfbuVar;
        this.b = zzfbxVar;
        this.c = zzcmnVar;
        this.d = zzdnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzebt zzebtVar;
        zzfjr zzfjrVar;
        zzebt zzebtVar2;
        zzdsd zzdsdVar;
        zzcfb zzcfbVar = (zzcfb) obj;
        zzfbu zzfbuVar = this.a;
        zzcfbVar.Y0(zzfbuVar, this.b);
        zzcgt M = zzcfbVar.M();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ua)).booleanValue() && M != null) {
            zzcmn zzcmnVar = this.c;
            zzdns zzdnsVar = this.d;
            zzebtVar = zzdnsVar.i;
            zzfjrVar = zzdnsVar.j;
            M.J0(zzcmnVar, zzebtVar, zzfjrVar);
            zzebtVar2 = zzdnsVar.i;
            zzdsdVar = zzdnsVar.d;
            M.T0(zzcmnVar, zzebtVar2, zzdsdVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ld)).booleanValue() && M != null) {
            M.m1(zzfbuVar);
        }
    }
}
