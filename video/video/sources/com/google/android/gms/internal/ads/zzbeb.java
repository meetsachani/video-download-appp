package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbeb implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzbeb(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzbea b() {
        return new zzbea((ScheduledExecutorService) this.a.b(), (com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.b.b(), (com.google.android.gms.ads.nonagon.signalgeneration.zzf) this.c.b(), (zzdsi) this.d.b());
    }
}
