package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzepx implements zzhfv {
    public final zzhge a;

    public zzepx(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzfyh F;
        zzeop a = zzeor.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.b();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q4)).booleanValue()) {
            F = zzfyh.G(new zzesh(a, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r4)).intValue(), scheduledExecutorService));
        } else {
            F = zzfyh.F();
        }
        zzhgd.b(F);
        return F;
    }
}
