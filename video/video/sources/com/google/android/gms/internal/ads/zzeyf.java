package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeyf implements zzgcu {
    public final /* synthetic */ zzfhn a;
    public final /* synthetic */ zzfhc b;
    public final /* synthetic */ zzcpu c;
    public final /* synthetic */ zzeyg d;

    public zzeyf(zzeyg zzeygVar, zzfhn zzfhnVar, zzfhc zzfhcVar, zzcpu zzcpuVar) {
        this.a = zzfhnVar;
        this.b = zzfhcVar;
        this.c = zzcpuVar;
        this.d = zzeygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        boolean z;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        zzcyq zzcyqVar;
        zzdaw zzdawVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X5)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.l("Banner ad failed to load", th);
        }
        zzeyg zzeygVar = this.d;
        synchronized (zzeygVar) {
            try {
                zzcpu zzcpuVar = this.c;
                com.google.android.gms.ads.internal.client.zze a = zzcpuVar.c().a(th);
                zzeygVar.n = a;
                zzcpuVar.d().C0(a);
                zzfdm.b(a.X, th, "BannerAdLoader.onFailure");
                z = zzeygVar.m;
                if (z) {
                    zzeygVar.t();
                    zzcyqVar = zzeygVar.h;
                    zzdawVar = zzeygVar.j;
                    zzcyqVar.n1(zzdawVar.a());
                }
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.a) == null) {
                    zzfhqVar = zzeygVar.i;
                    zzfhc zzfhcVar = this.b;
                    zzfhcVar.g(a);
                    zzfhcVar.f(th);
                    zzfhcVar.c(false);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.c(a);
                    zzfhc zzfhcVar2 = this.b;
                    zzfhcVar2.f(th);
                    zzfhcVar2.c(false);
                    zzfhnVar.a(zzfhcVar2);
                    zzfhnVar.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        boolean z;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        zzeyg zzeygVar = this.d;
        zzcop zzcopVar = (zzcop) obj;
        synchronized (zzeygVar) {
            try {
                z = zzeygVar.m;
                if (z) {
                    zzeygVar.q();
                }
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.a) == null) {
                    zzfhqVar = zzeygVar.i;
                    zzfhc zzfhcVar = this.b;
                    zzfhcVar.e(zzcopVar.g().b);
                    zzfhcVar.p0(zzcopVar.c().g());
                    zzfhcVar.c(true);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.g(zzcopVar.g().b);
                    zzfhnVar.e(zzcopVar.c().g());
                    zzfhc zzfhcVar2 = this.b;
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
