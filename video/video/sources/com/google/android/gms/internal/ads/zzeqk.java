package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeqk implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzeqk(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzesh(((zzeth) this.a).b(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.tc)).intValue(), (ScheduledExecutorService) this.b.b());
    }
}
