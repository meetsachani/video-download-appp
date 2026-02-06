package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzcnw implements zzazn {
    public final ScheduledExecutorService X;
    public final Clock Y;
    @InterfaceC11300zs1
    public ScheduledFuture Z;
    public long Y0 = -1;
    public long Z0 = -1;
    public Runnable a1 = null;
    public boolean b1 = false;

    public zzcnw(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.X = scheduledExecutorService;
        this.Y = clock;
        com.google.android.gms.ads.internal.zzv.f().c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final void O0(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }

    @InterfaceC5056aJ2
    public final synchronized void a() {
        try {
            if (!this.b1) {
                ScheduledFuture scheduledFuture = this.Z;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.Z.cancel(true);
                    this.Z0 = this.Y0 - this.Y.b();
                } else {
                    this.Z0 = -1L;
                }
                this.b1 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC5056aJ2
    public final synchronized void b() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.b1) {
                if (this.Z0 > 0 && (scheduledFuture = this.Z) != null && scheduledFuture.isCancelled()) {
                    this.Z = this.X.schedule(this.a1, this.Z0, TimeUnit.MILLISECONDS);
                }
                this.b1 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(int i, Runnable runnable) {
        this.a1 = runnable;
        long j = i;
        this.Y0 = this.Y.b() + j;
        this.Z = this.X.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
