package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbbb {
    public ScheduledFuture a = null;
    public final Runnable b = new zzbax(this);
    public final Object c = new Object();
    @InterfaceC11300zs1
    public zzbbe d;
    @InterfaceC11300zs1
    public Context e;
    @InterfaceC11300zs1
    public zzbbh f;

    public static /* bridge */ /* synthetic */ void h(zzbbb zzbbbVar) {
        synchronized (zzbbbVar.c) {
            try {
                zzbbe zzbbeVar = zzbbbVar.d;
                if (zzbbeVar == null) {
                    return;
                }
                if (zzbbeVar.a() || zzbbbVar.d.h()) {
                    zzbbbVar.d.c();
                }
                zzbbbVar.d = null;
                zzbbbVar.f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long a(zzbbf zzbbfVar) {
        synchronized (this.c) {
            try {
                if (this.f == null) {
                    return -2L;
                }
                if (this.d.q0()) {
                    try {
                        return this.f.r4(zzbbfVar);
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbbc b(zzbbf zzbbfVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzbbc();
            }
            try {
                if (this.d.q0()) {
                    return this.f.B5(zzbbfVar);
                }
                return this.f.h5(zzbbfVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to call into cache service.", e);
                return new zzbbc();
            }
        }
    }

    @InterfaceC5056aJ2
    public final synchronized zzbbe d(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbbe(this.e, com.google.android.gms.ads.internal.zzv.z().b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            try {
                if (this.e != null) {
                    return;
                }
                this.e = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v4)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.f().c(new zzbay(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x4)).booleanValue()) {
            synchronized (this.c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.a = zzcaa.d.schedule(this.b, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        synchronized (this.c) {
            try {
                if (this.e != null && this.d == null) {
                    zzbbe d = d(new zzbaz(this), new zzbba(this));
                    this.d = d;
                    d.x();
                }
            } finally {
            }
        }
    }
}
