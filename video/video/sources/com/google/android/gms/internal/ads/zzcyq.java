package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcyq extends zzdbo {
    public final ScheduledExecutorService Y;
    public long Y0;
    public final Clock Z;
    public long Z0;
    public long a1;
    public long b1;
    public boolean c1;
    @InterfaceC11300zs1
    public ScheduledFuture d1;
    @InterfaceC11300zs1
    public ScheduledFuture e1;

    public zzcyq(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.EMPTY_SET);
        this.Y0 = -1L;
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = false;
        this.Y = scheduledExecutorService;
        this.Z = clock;
    }

    public final synchronized void a() {
        this.c1 = false;
        u1(0L);
    }

    public final synchronized void b() {
        try {
            if (!this.c1) {
                ScheduledFuture scheduledFuture = this.d1;
                if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                    this.d1.cancel(false);
                    this.a1 = this.Y0 - this.Z.b();
                } else {
                    this.a1 = -1L;
                }
                ScheduledFuture scheduledFuture2 = this.e1;
                if (scheduledFuture2 != null && !scheduledFuture2.isCancelled()) {
                    this.e1.cancel(false);
                    this.b1 = this.Z0 - this.Z.b();
                } else {
                    this.b1 = -1L;
                }
                this.c1 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.c1) {
                if (this.a1 > 0 && (scheduledFuture2 = this.d1) != null && scheduledFuture2.isCancelled()) {
                    u1(this.a1);
                }
                if (this.b1 > 0 && (scheduledFuture = this.e1) != null && scheduledFuture.isCancelled()) {
                    v1(this.b1);
                }
                this.c1 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n1(int i) {
        com.google.android.gms.ads.internal.util.zze.k("In scheduleRefresh: " + i);
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.c1) {
                long j = this.a1;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.a1 = millis;
                return;
            }
            long b = this.Z.b();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.wd)).booleanValue()) {
                long j2 = this.Y0;
                if (b >= j2 || j2 - b > millis) {
                    u1(millis);
                }
            } else {
                long j3 = this.Y0;
                if (b > j3 || j3 - b > millis) {
                    u1(millis);
                }
            }
        }
    }

    public final synchronized void t1(int i) {
        com.google.android.gms.ads.internal.util.zze.k("In scheduleShowRefreshedAd: " + i);
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.c1) {
                long j = this.b1;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.b1 = millis;
                return;
            }
            long b = this.Z.b();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.wd)).booleanValue()) {
                if (b == this.Z0) {
                    com.google.android.gms.ads.internal.util.zze.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j2 = this.Z0;
                if (b >= j2 || j2 - b > millis) {
                    v1(millis);
                }
            } else {
                long j3 = this.Z0;
                if (b > j3 || j3 - b > millis) {
                    v1(millis);
                }
            }
        }
    }

    public final synchronized void u1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.d1;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.d1.cancel(false);
            }
            this.Y0 = this.Z.b() + j;
            this.d1 = this.Y.schedule(new zzcyn(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void v1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.e1;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.e1.cancel(false);
            }
            this.Z0 = this.Z.b() + j;
            this.e1 = this.Y.schedule(new zzcyo(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
