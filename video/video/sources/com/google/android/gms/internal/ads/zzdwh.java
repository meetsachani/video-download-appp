package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdwh implements zzcyv, zzdek, zzcxh {
    public final Context X;
    public final zzdsd Y;

    public zzdwh(Context context, zzdsd zzdsdVar) {
        this.X = context;
        this.Y = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S4)).booleanValue()) {
            c(this.X);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void a(@InterfaceC11300zs1 com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T4)).booleanValue()) {
            c(this.X);
        }
    }

    public final void c(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q4)).booleanValue()) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwg
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.j().g(context, zzdwh.this.Y);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U4)).booleanValue()) {
            c(this.X);
        }
    }
}
