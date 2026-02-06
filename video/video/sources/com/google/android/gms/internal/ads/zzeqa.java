package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeqa implements zzhfv {
    public final zzhge a;

    public zzeqa(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzesh(zzeqx.a(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zc)).intValue(), (ScheduledExecutorService) this.a.b());
    }
}
