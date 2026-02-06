package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzevh implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzevh(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
    }

    public static zzevf a(String str, zzbaw zzbawVar, zzbzn zzbznVar, ScheduledExecutorService scheduledExecutorService, zzgdj zzgdjVar) {
        return new zzevf(str, zzbawVar, zzbznVar, scheduledExecutorService, zzgdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzevf(((zzewc) this.a).a(), zzcko.a(), (zzbzn) this.b.b(), (ScheduledExecutorService) this.c.b(), zzffn.c());
    }
}
