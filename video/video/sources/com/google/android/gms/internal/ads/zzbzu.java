package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbzu {
    @InterfaceC11300zs1
    public zzgdj a;
    @InterfaceC11300zs1
    public zzdsd b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;
    public long f = -1;

    public static /* synthetic */ void a(zzbzu zzbzuVar) {
        zzdsd zzdsdVar;
        while (zzbzuVar.d.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzs
                @Override // java.lang.Runnable
                public final void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(zzbzuVar.e);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ld)).booleanValue() && (zzdsdVar = zzbzuVar.b) != null) {
                        zzdsc a = zzdsdVar.a();
                        a.b("action", "paa");
                        a.i();
                    }
                }
                do {
                    try {
                        Thread.sleep(zzbzuVar.f);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final void b(zzgdj zzgdjVar, zzdsd zzdsdVar) {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.a = zzgdjVar;
        this.b = zzdsdVar;
        this.e = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Jd)).longValue();
        this.f = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Kd)).longValue();
    }

    public final void c() {
        zzgdj zzgdjVar;
        if (this.c.get() && this.e >= 0 && this.f >= 0 && this.d.compareAndSet(false, true) && (zzgdjVar = this.a) != null) {
            zzgdjVar.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzbzu.a(zzbzu.this);
                }
            });
        }
    }
}
