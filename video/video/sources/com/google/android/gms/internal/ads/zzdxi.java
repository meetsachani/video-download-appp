package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdxi implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzdxi(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar;
        this.b = zzhgeVar4;
        this.c = zzhgeVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzdxh b() {
        return new zzdxh((ScheduledExecutorService) this.a.b(), zzffn.c(), zzfft.c(), ((zzdye) this.b).b(), zzhfu.a(this.c));
    }
}
