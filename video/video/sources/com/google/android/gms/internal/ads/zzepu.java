package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzepu implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzepu(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzenx b = ((zzenz) this.a).b();
        zzeon zzeonVar = (zzeon) this.b.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.b();
        if (((List) this.c.b()).contains("13")) {
            return new zzesh(zzeonVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Dc)).intValue(), scheduledExecutorService);
        }
        return new zzesh(b, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Dc)).intValue(), scheduledExecutorService);
    }
}
