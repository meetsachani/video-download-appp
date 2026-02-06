package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwg extends zzdbo implements zzcvx {
    public final ScheduledExecutorService Y;
    public boolean Y0;
    public ScheduledFuture Z;

    public zzcwg(zzcwf zzcwfVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.Y0 = false;
        this.Y = scheduledExecutorService;
        super.c1(zzcwfVar, executor);
    }

    public static /* synthetic */ void n1(zzcwg zzcwgVar) {
        synchronized (zzcwgVar) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Timeout waiting for show call succeed to be called.");
            zzcwgVar.k(new zzdgh("Timeout for show call succeed."));
            zzcwgVar.Y0 = true;
        }
    }

    public final synchronized void b() {
        ScheduledFuture scheduledFuture = this.Z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void e() {
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ya)).intValue();
        this.Z = this.Y.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // java.lang.Runnable
            public final void run() {
                zzcwg.n1(zzcwg.this);
            }
        }, intValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void f() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzcvx) obj).f();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k(final zzdgh zzdghVar) {
        if (this.Y0) {
            return;
        }
        ScheduledFuture scheduledFuture = this.Z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcwb
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzcvx) obj).k(zzdgh.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k1(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzcvx) obj).k1(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }
}
