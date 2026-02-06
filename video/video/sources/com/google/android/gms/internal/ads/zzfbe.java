package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfbe implements zzgcu {
    public final /* synthetic */ zzelg a;
    public final /* synthetic */ zzfhn b;
    public final /* synthetic */ zzfhc c;
    public final /* synthetic */ zzfbf d;
    public final /* synthetic */ zzfbh e;

    public zzfbe(zzfbh zzfbhVar, zzelg zzelgVar, zzfhn zzfhnVar, zzfhc zzfhcVar, zzfbf zzfbfVar) {
        this.a = zzelgVar;
        this.b = zzfhnVar;
        this.c = zzfhcVar;
        this.d = zzfbfVar;
        this.e = zzfbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzezl zzezlVar;
        final com.google.android.gms.ads.internal.client.zze a;
        zzfax zzfaxVar;
        zzdol k;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X5)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.l("Rewarded ad failed to load", th);
        }
        zzfbh zzfbhVar = this.e;
        zzezlVar = zzfbhVar.e;
        zzdom zzdomVar = (zzdom) zzezlVar.f();
        if (zzdomVar == null) {
            a = zzfdq.b(th, null);
        } else {
            a = zzdomVar.b().a(th);
        }
        synchronized (zzfbhVar) {
            try {
                if (zzdomVar == null) {
                    zzfaxVar = zzfbhVar.d;
                    zzfaxVar.C0(a);
                    k = zzfbhVar.k(this.d);
                    k.d().b().c().h();
                } else {
                    zzdomVar.a().C0(a);
                    executor = zzfbhVar.b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfax zzfaxVar2;
                            zzfaxVar2 = zzfbe.this.e.d;
                            zzfaxVar2.C0(a);
                        }
                    });
                }
                zzfdm.b(a.X, th, "RewardedAdLoader.onFailure");
                this.a.a();
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzfbhVar.g;
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
        zzfax zzfaxVar;
        Executor executor;
        final zzfax zzfaxVar2;
        zzfax zzfaxVar3;
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        zzfbh zzfbhVar = this.e;
        zzdoh zzdohVar = (zzdoh) obj;
        synchronized (zzfbhVar) {
            try {
                zzdae e = zzdohVar.e();
                zzfaxVar = zzfbhVar.d;
                e.d(zzfaxVar);
                this.a.c(zzdohVar);
                executor = zzfbhVar.b;
                zzfaxVar2 = zzfbhVar.d;
                Objects.requireNonNull(zzfaxVar2);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfax.this.v();
                    }
                });
                zzfaxVar3 = zzfbhVar.d;
                zzfaxVar3.q();
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzfbhVar.g;
                    zzfhc zzfhcVar = this.c;
                    zzfhcVar.e(zzdohVar.g().b);
                    zzfhcVar.p0(zzdohVar.c().g());
                    zzfhcVar.c(true);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.g(zzdohVar.g().b);
                    zzfhnVar.e(zzdohVar.c().g());
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
