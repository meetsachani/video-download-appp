package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcwi implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzcwi(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzcwg(((zzcwh) this.a).b(), ((zzhgh) this.b).b(), zzffn.c(), (ScheduledExecutorService) this.c.b());
    }
}
