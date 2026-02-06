package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzgdn extends zzgcs implements zzgdi {
    public final ScheduledFuture Y;

    public zzgdn(InterfaceFutureC8411o11 interfaceFutureC8411o11, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC8411o11);
        this.Y = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgcr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = g().cancel(z);
        if (cancel) {
            this.Y.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.Y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.Y.getDelay(timeUnit);
    }
}
