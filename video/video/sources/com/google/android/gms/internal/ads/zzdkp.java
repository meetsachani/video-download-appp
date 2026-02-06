package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o.C2531Be;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdkp implements zzcwn {
    public final zzdio X;
    public final zzdit Y;
    public final Executor Y0;
    public final Executor Z;

    public zzdkp(zzdio zzdioVar, zzdit zzditVar, Executor executor, Executor executor2) {
        this.X = zzdioVar;
        this.Y = zzditVar;
        this.Z = executor;
        this.Y0 = executor2;
    }

    public final void b(final zzcfb zzcfbVar) {
        this.Z.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // java.lang.Runnable
            public final void run() {
                zzcfb.this.q("onSdkImpression", new C2531Be());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        if (this.Y.d()) {
            zzdio zzdioVar = this.X;
            zzeda h0 = zzdioVar.h0();
            if (h0 == null && zzdioVar.j0() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D5)).booleanValue()) {
                InterfaceFutureC8411o11 j0 = zzdioVar.j0();
                zzcaf c0 = zzdioVar.c0();
                if (j0 != null && c0 != null) {
                    zzgcy.r(zzgcy.l(j0, c0), new zzdko(this), this.Y0);
                }
            } else if (h0 != null) {
                zzcfb e0 = zzdioVar.e0();
                zzcfb f0 = zzdioVar.f0();
                if (e0 == null) {
                    if (f0 == null) {
                        e0 = null;
                    } else {
                        e0 = f0;
                    }
                }
                if (e0 != null) {
                    b(e0);
                }
            }
        }
    }
}
