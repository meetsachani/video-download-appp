package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcqh implements zzayu {
    @InterfaceC11300zs1
    public final zzcfb X;
    public final Executor Y;
    public final AtomicReference Z = new AtomicReference();

    public zzcqh(@InterfaceC11300zs1 zzcfb zzcfbVar, Executor executor) {
        this.X = zzcfbVar;
        this.Y = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final synchronized void E0(zzayt zzaytVar) {
        final zzcfb zzcfbVar = this.X;
        if (zzcfbVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Rc)).booleanValue()) {
                if (zzaytVar.j) {
                    AtomicReference atomicReference = this.Z;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfb.this.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.Z;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqg
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfb.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
