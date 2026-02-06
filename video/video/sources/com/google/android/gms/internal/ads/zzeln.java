package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeln implements zzgcu {
    public final /* synthetic */ zzelg a;
    public final /* synthetic */ zzfhn b;
    public final /* synthetic */ zzfhc c;
    public final /* synthetic */ zzdgw d;
    public final /* synthetic */ zzelo e;

    public zzeln(zzelo zzeloVar, zzelg zzelgVar, zzfhn zzfhnVar, zzfhc zzfhcVar, zzdgw zzdgwVar) {
        this.a = zzelgVar;
        this.b = zzfhnVar;
        this.c = zzfhcVar;
        this.d = zzdgwVar;
        this.e = zzeloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzchb zzchbVar;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X5)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.l("Native ad failed to load", th);
        }
        zzdgw zzdgwVar = this.d;
        final com.google.android.gms.ads.internal.client.zze a = zzdgwVar.a().a(th);
        zzdgwVar.b().C0(a);
        zzelo zzeloVar = this.e;
        zzchbVar = zzeloVar.b;
        zzchbVar.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelm
            @Override // java.lang.Runnable
            public final void run() {
                zzele zzeleVar;
                zzeleVar = zzeln.this.e.d;
                zzeleVar.a().C0(a);
            }
        });
        zzfdm.b(a.X, th, "NativeAdLoader.onFailure");
        this.a.a();
        if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
            zzfhqVar = zzeloVar.e;
            zzfhc zzfhcVar = this.c;
            zzfhcVar.g(a);
            zzfhcVar.f(th);
            zzfhcVar.c(false);
            zzfhqVar.c(zzfhcVar.m());
            return;
        }
        zzfhnVar.c(a);
        zzfhc zzfhcVar2 = this.c;
        zzfhcVar2.f(th);
        zzfhcVar2.c(false);
        zzfhnVar.a(zzfhcVar2);
        zzfhnVar.h();
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzele zzeleVar;
        zzchb zzchbVar;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        zzelo zzeloVar = this.e;
        zzcqx zzcqxVar = (zzcqx) obj;
        synchronized (zzeloVar) {
            try {
                zzdae e = zzcqxVar.e();
                zzeleVar = zzeloVar.d;
                e.a(zzeleVar.d());
                this.a.c(zzcqxVar);
                zzchbVar = zzeloVar.b;
                zzchbVar.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzele zzeleVar2;
                        zzeleVar2 = zzeln.this.e.d;
                        zzeleVar2.b().v();
                    }
                });
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzeloVar.e;
                    zzfhc zzfhcVar = this.c;
                    zzfhcVar.e(zzcqxVar.g().b);
                    zzfhcVar.p0(zzcqxVar.c().g());
                    zzfhcVar.c(true);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.g(zzcqxVar.g().b);
                    zzfhnVar.e(zzcqxVar.c().g());
                    zzfhc zzfhcVar2 = this.c;
                    zzfhcVar2.c(true);
                    zzfhnVar.a(zzfhcVar2);
                    zzfhnVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
