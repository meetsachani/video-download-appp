package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzewz implements zzgcu {
    public final /* synthetic */ zzelg a;
    public final /* synthetic */ zzfhn b;
    public final /* synthetic */ zzfhc c;
    public final /* synthetic */ zzexa d;
    public final /* synthetic */ zzexc e;

    public zzewz(zzexc zzexcVar, zzelg zzelgVar, zzfhn zzfhnVar, zzfhc zzfhcVar, zzexa zzexaVar) {
        this.a = zzelgVar;
        this.b = zzfhnVar;
        this.c = zzfhcVar;
        this.d = zzexaVar;
        this.e = zzexcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzezl zzezlVar;
        final com.google.android.gms.ads.internal.client.zze a;
        zzexs zzexsVar;
        zzcuy m;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X5)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.l("App open ad failed to load", th);
        }
        zzexc zzexcVar = this.e;
        zzezlVar = zzexcVar.e;
        zzcnz zzcnzVar = (zzcnz) zzezlVar.f();
        if (zzcnzVar == null) {
            a = zzfdq.b(th, null);
        } else {
            a = zzcnzVar.b().a(th);
        }
        synchronized (zzexcVar) {
            try {
                zzexcVar.j = null;
                if (zzcnzVar == null) {
                    zzexsVar = zzexcVar.d;
                    zzexsVar.C0(a);
                    m = zzexcVar.m(this.d);
                    ((zzcnz) m.h()).b().c().h();
                } else {
                    zzcnzVar.c().C0(a);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w8)).booleanValue()) {
                        executor = zzexcVar.b;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewy
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzexs zzexsVar2;
                                zzexsVar2 = zzewz.this.e.d;
                                zzexsVar2.C0(a);
                            }
                        });
                    }
                }
                zzfdm.b(a.X, th, "AppOpenAdLoader.onFailure");
                this.a.a();
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzexcVar.h;
                    zzfhc zzfhcVar = this.c;
                    zzfhcVar.g(a);
                    zzfhcVar.f(th);
                    zzfhcVar.c(false);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.c(a);
                    zzfhc zzfhcVar2 = this.c;
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
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        zzexs zzexsVar;
        zzcqx zzcqxVar = (zzcqx) obj;
        zzexc zzexcVar = this.e;
        synchronized (zzexcVar) {
            try {
                zzexcVar.j = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w8)).booleanValue()) {
                    zzdae e = zzcqxVar.e();
                    zzexsVar = zzexcVar.d;
                    e.b(zzexsVar);
                }
                this.a.c(zzcqxVar);
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzexcVar.h;
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
