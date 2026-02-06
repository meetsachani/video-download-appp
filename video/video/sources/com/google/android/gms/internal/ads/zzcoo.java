package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcoo implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzcoo(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    public static zzcyq c(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return new zzcyq(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzcyq b() {
        return c((ScheduledExecutorService) this.a.b(), (Clock) this.b.b());
    }
}
