package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzemh implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzemh(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzemf((InterfaceFutureC8411o11) this.a.b(), zzffn.c(), (ScheduledExecutorService) this.b.b());
    }
}
