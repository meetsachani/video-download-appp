package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeqf implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzeqf(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzers a = zzeru.a();
        zzeon zzeonVar = (zzeon) this.a.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.b();
        if (((List) this.b.b()).contains("24")) {
            return new zzesh(zzeonVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xc)).intValue(), scheduledExecutorService);
        }
        return new zzesh(a, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xc)).intValue(), scheduledExecutorService);
    }
}
