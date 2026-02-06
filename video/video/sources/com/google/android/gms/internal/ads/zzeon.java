package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.C10415wE;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeon implements zzetv {
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference(Boolean.FALSE);
    public final Clock c;
    public final Executor d;
    public final zzetv e;
    public final long f;
    public final zzdsd g;

    public zzeon(zzetv zzetvVar, long j, Clock clock, Executor executor, zzdsd zzdsdVar) {
        this.c = clock;
        this.e = zzetvVar;
        this.f = j;
        this.d = executor;
        this.g = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzeom zzeomVar;
        zzeom zzeomVar2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.cc)).booleanValue()) {
            AtomicReference atomicReference = this.a;
            zzeomVar = (zzeom) atomicReference.get();
            if (zzeomVar == null || zzeomVar.a()) {
                zzetv zzetvVar = this.e;
                zzeomVar2 = new zzeom(zzetvVar.b(), this.f, this.c);
                atomicReference.set(zzeomVar2);
                zzeomVar = zzeomVar2;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bc)).booleanValue() && !((Boolean) this.b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcaa.d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeok
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeol
                            @Override // java.lang.Runnable
                            public final void run() {
                                r0.a.set(new zzeom(r0.e.b(), r0.f, zzeon.this.c));
                            }
                        });
                    }
                };
                long j = this.f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference2 = this.a;
                    zzeomVar = (zzeom) atomicReference2.get();
                    if (zzeomVar == null) {
                        zzeom zzeomVar3 = new zzeom(this.e.b(), this.f, this.c);
                        atomicReference2.set(zzeomVar3);
                        return zzeomVar3.a;
                    } else if (!((Boolean) this.b.get()).booleanValue() && zzeomVar.a()) {
                        InterfaceFutureC8411o11 interfaceFutureC8411o11 = zzeomVar.a;
                        zzetv zzetvVar2 = this.e;
                        zzeomVar2 = new zzeom(zzetvVar2.b(), this.f, this.c);
                        this.a.set(zzeomVar2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.dc)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ec)).booleanValue()) {
                                zzdsc a = this.g.a();
                                a.b("action", "scs");
                                a.b(C10415wE.l, String.valueOf(zzetvVar2.a()));
                                a.j();
                            }
                            return interfaceFutureC8411o11;
                        }
                        zzeomVar = zzeomVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzeomVar.a;
    }
}
