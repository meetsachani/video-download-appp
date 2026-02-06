package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbxy {
    public final com.google.android.gms.ads.internal.util.zzg a;

    public zzbxy(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyj zzbyjVar) {
        this.a = zzgVar;
    }

    public final void a(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H0)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.a;
        if (j - zzgVar.e() < 0) {
            com.google.android.gms.ads.internal.util.zze.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I0)).booleanValue()) {
            zzgVar.d0(-1);
            zzgVar.k0(j);
            return;
        }
        zzgVar.d0(i);
        zzgVar.k0(j);
    }
}
