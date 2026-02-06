package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzbjk implements zzgcu {
    public final /* synthetic */ zzcfb a;

    public zzbjk(zzcfb zzcfbVar) {
        this.a = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        com.google.android.gms.ads.internal.zzv.t().x(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar;
        String str = (String) obj;
        zzcfb zzcfbVar = this.a;
        if (zzcfbVar.F() != null) {
            zzvVar = zzcfbVar.F().x0;
        } else {
            zzvVar = null;
        }
        new com.google.android.gms.ads.internal.util.zzbw(zzcfbVar.getContext(), zzcfbVar.m().X, str, null, zzvVar).b();
    }
}
