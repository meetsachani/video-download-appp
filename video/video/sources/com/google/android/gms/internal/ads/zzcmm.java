package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcmm implements zzgcu {
    public final /* synthetic */ zzfjr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv c;
    public final /* synthetic */ zzcmn d;

    public zzcmm(zzcmn zzcmnVar, zzfjr zzfjrVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.a = zzfjrVar;
        this.b = str;
        this.c = zzvVar;
        this.d = zzcmnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(final Throwable th) {
        zzgdj zzgdjVar;
        zzgdjVar = this.d.e;
        final zzfjr zzfjrVar = this.a;
        final String str = this.b;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.c;
        zzgdjVar.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmk
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ea)).booleanValue();
                zzcmm zzcmmVar = zzcmm.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcmn zzcmnVar = zzcmmVar.d;
                    context2 = zzcmnVar.a;
                    zzbuk e = zzbui.e(context2);
                    zzcmnVar.i = e;
                    e.b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcmn zzcmnVar2 = zzcmmVar.d;
                    context = zzcmnVar2.a;
                    zzbuk c = zzbui.c(context);
                    zzcmnVar2.h = c;
                    c.b(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjrVar.d(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzgdj zzgdjVar;
        final zzfjr zzfjrVar = this.a;
        final String str = (String) obj;
        zzgdjVar = this.d.e;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.c;
        zzgdjVar.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcml
            @Override // java.lang.Runnable
            public final void run() {
                zzfjr.this.d(str, zzvVar, null, null);
            }
        });
    }
}
