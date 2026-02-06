package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcuo implements zzcvt, zzddd, zzdas, zzcwj, zzayu {
    public final zzcwl X;
    public final zzcyh Y;
    public final ScheduledExecutorService Y0;
    public final zzfbu Z;
    public final Executor Z0;
    public ScheduledFuture b1;
    @InterfaceC11300zs1
    public final String d1;
    public final zzgds a1 = zzgds.A();
    public final AtomicBoolean c1 = new AtomicBoolean();

    public zzcuo(zzcwl zzcwlVar, zzfbu zzfbuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, @InterfaceC11300zs1 String str, zzcyh zzcyhVar) {
        this.X = zzcwlVar;
        this.Z = zzfbuVar;
        this.Y0 = scheduledExecutorService;
        this.Z0 = executor;
        this.d1 = str;
        this.Y = zzcyhVar;
    }

    public static /* synthetic */ void n(zzcuo zzcuoVar) {
        synchronized (zzcuoVar) {
            try {
                zzgds zzgdsVar = zzcuoVar.a1;
                if (zzgdsVar.isDone()) {
                    return;
                }
                zzgdsVar.l(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean o() {
        if (this.d1.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Mb)).booleanValue() && o() && zzaytVar.j && this.c1.compareAndSet(false, true) && this.Z.e != 3) {
            com.google.android.gms.ads.internal.util.zze.k("Full screen 1px impression occurred");
            this.X.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
        zzfbu zzfbuVar = this.Z;
        if (zzfbuVar.e != 3) {
            int i = zzfbuVar.Y;
            if (i == 0 || i == 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Mb)).booleanValue() && o()) {
                    return;
                }
                this.X.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final synchronized void g() {
        if (this.Z.e == 4) {
            this.X.a();
            return;
        }
        zzgds zzgdsVar = this.a1;
        if (zzgdsVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.b1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzgdsVar.l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void i() {
        zzfbu zzfbuVar = this.Z;
        int i = zzfbuVar.e;
        if (i != 3) {
            if (i == 4) {
                this.Y.a();
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I1)).booleanValue() && zzfbuVar.Y == 2) {
                int i2 = zzfbuVar.q;
                if (i2 == 0) {
                    this.X.a();
                    return;
                }
                zzgcy.r(this.a1, new zzcun(this), this.Z0);
                this.b1 = this.Y0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcum
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcuo.n(zzcuo.this);
                    }
                }, i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void k(zzbvx zzbvxVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final synchronized void w(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzgds zzgdsVar = this.a1;
            if (zzgdsVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.b1;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgdsVar.m(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }
}
