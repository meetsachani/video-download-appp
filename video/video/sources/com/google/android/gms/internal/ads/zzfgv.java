package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzfgv implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzfgv(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzfgt(zzffn.c(), (ScheduledExecutorService) this.a.b(), ((zzfgw) this.b).b());
    }
}
