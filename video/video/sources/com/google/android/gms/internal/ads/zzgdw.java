package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.C6566gU0;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdw extends zzgco {
    public InterfaceFutureC8411o11 c1;
    public ScheduledFuture d1;

    public zzgdw(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        interfaceFutureC8411o11.getClass();
        this.c1 = interfaceFutureC8411o11;
    }

    public static InterfaceFutureC8411o11 C(InterfaceFutureC8411o11 interfaceFutureC8411o11, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdw zzgdwVar = new zzgdw(interfaceFutureC8411o11);
        zzgdt zzgdtVar = new zzgdt(zzgdwVar);
        zzgdwVar.d1 = scheduledExecutorService.schedule(zzgdtVar, j, timeUnit);
        interfaceFutureC8411o11.h4(zzgdtVar, zzgcm.INSTANCE);
        return zzgdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c1;
        ScheduledFuture scheduledFuture = this.d1;
        if (interfaceFutureC8411o11 != null) {
            String str = "inputFuture=[" + interfaceFutureC8411o11.toString() + C6566gU0.g;
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void k() {
        t(this.c1);
        ScheduledFuture scheduledFuture = this.d1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.c1 = null;
        this.d1 = null;
    }
}
