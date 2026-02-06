package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzezw implements zzgcu {
    public final /* synthetic */ zzelg a;
    public final /* synthetic */ zzfhn b;
    public final /* synthetic */ zzfhc c;
    public final /* synthetic */ zzdga d;
    public final /* synthetic */ zzezx e;

    public zzezw(zzezx zzezxVar, zzelg zzelgVar, zzfhn zzfhnVar, zzfhc zzfhcVar, zzdga zzdgaVar) {
        this.a = zzelgVar;
        this.b = zzfhnVar;
        this.c = zzfhcVar;
        this.d = zzdgaVar;
        this.e = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfhq zzfhqVar;
        zzfhn zzfhnVar;
        Executor executor;
        Executor executor2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X5)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.l("Interstitial ad failed to load", th);
        }
        zzdga zzdgaVar = this.d;
        final com.google.android.gms.ads.internal.client.zze a = zzdgaVar.a().a(th);
        zzezx zzezxVar = this.e;
        synchronized (zzezxVar) {
            try {
                zzezxVar.i = null;
                zzdgaVar.b().C0(a);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x8)).booleanValue()) {
                    executor = zzezxVar.b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezs
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzekr zzekrVar;
                            zzekrVar = zzezw.this.e.d;
                            zzekrVar.C0(a);
                        }
                    });
                    executor2 = zzezxVar.b;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfax zzfaxVar;
                            zzfaxVar = zzezw.this.e.e;
                            zzfaxVar.C0(a);
                        }
                    });
                }
                zzfdm.b(a.X, th, "InterstitialAdLoader.onFailure");
                this.a.a();
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzezxVar.g;
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
        Executor executor;
        Executor executor2;
        zzekr zzekrVar;
        zzfax zzfaxVar;
        zzdew zzdewVar = (zzdew) obj;
        zzezx zzezxVar = this.e;
        synchronized (zzezxVar) {
            try {
                zzezxVar.i = null;
                zzbcm zzbcmVar = zzbcv.x8;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    zzdae e = zzdewVar.e();
                    zzekrVar = zzezxVar.d;
                    e.a(zzekrVar);
                    zzfaxVar = zzezxVar.e;
                    e.d(zzfaxVar);
                }
                this.a.c(zzdewVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    executor = zzezxVar.b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzekr zzekrVar2;
                            zzekrVar2 = zzezw.this.e.d;
                            zzekrVar2.v();
                        }
                    });
                    executor2 = zzezxVar.b;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfax zzfaxVar2;
                            zzfaxVar2 = zzezw.this.e.e;
                            zzfaxVar2.v();
                        }
                    });
                }
                if (!((Boolean) zzbeo.c.e()).booleanValue() || (zzfhnVar = this.b) == null) {
                    zzfhqVar = zzezxVar.g;
                    zzfhc zzfhcVar = this.c;
                    zzfhcVar.e(zzdewVar.g().b);
                    zzfhcVar.p0(zzdewVar.c().g());
                    zzfhcVar.c(true);
                    zzfhqVar.c(zzfhcVar.m());
                } else {
                    zzfhnVar.g(zzdewVar.g().b);
                    zzfhnVar.e(zzdewVar.c().g());
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
