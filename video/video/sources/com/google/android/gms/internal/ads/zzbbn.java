package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbbn implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int Y0 = 0;
    public final /* synthetic */ zzbbf X;
    public final /* synthetic */ zzcaf Y;
    public final /* synthetic */ zzbbp Z;

    public zzbbn(zzbbp zzbbpVar, zzbbf zzbbfVar, zzcaf zzcafVar) {
        this.X = zzbbfVar;
        this.Y = zzcafVar;
        this.Z = zzbbpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        Object obj;
        boolean z;
        final zzbbe zzbbeVar;
        zzbbp zzbbpVar = this.Z;
        obj = zzbbpVar.d;
        synchronized (obj) {
            try {
                z = zzbbpVar.b;
                if (!z) {
                    zzbbpVar.b = true;
                    zzbbeVar = zzbbpVar.a;
                    if (zzbbeVar == null) {
                        return;
                    }
                    zzgdj zzgdjVar = zzcaa.a;
                    final zzbbf zzbbfVar = this.X;
                    final zzcaf zzcafVar = this.Y;
                    final InterfaceFutureC8411o11 f0 = zzgdjVar.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbbc h5;
                            zzbbn zzbbnVar = zzbbn.this;
                            zzbbe zzbbeVar2 = zzbbeVar;
                            zzcaf zzcafVar2 = zzcafVar;
                            try {
                                zzbbh r0 = zzbbeVar2.r0();
                                boolean q0 = zzbbeVar2.q0();
                                zzbbf zzbbfVar2 = zzbbfVar;
                                if (q0) {
                                    h5 = r0.B5(zzbbfVar2);
                                } else {
                                    h5 = r0.h5(zzbbfVar2);
                                }
                                if (!h5.H0()) {
                                    zzcafVar2.d(new RuntimeException("No entry contents."));
                                    zzbbp.e(zzbbnVar.Z);
                                    return;
                                }
                                zzbbm zzbbmVar = new zzbbm(zzbbnVar, h5.E0(), 1);
                                int read = zzbbmVar.read();
                                if (read != -1) {
                                    zzbbmVar.unread(read);
                                    zzcafVar2.c(zzbbr.b(zzbbmVar, h5.G0(), h5.O0(), h5.m0(), h5.I0()));
                                    return;
                                }
                                throw new IOException("Unable to read from cache.");
                            } catch (RemoteException e) {
                                e = e;
                                int i = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to obtain a cache service instance.", e);
                                zzcafVar2.d(e);
                                zzbbp.e(zzbbnVar.Z);
                            } catch (IOException e2) {
                                e = e2;
                                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to obtain a cache service instance.", e);
                                zzcafVar2.d(e);
                                zzbbp.e(zzbbnVar.Z);
                            }
                        }
                    });
                    zzcafVar.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbl
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (zzcaf.this.isCancelled()) {
                                f0.cancel(true);
                            }
                        }
                    }, zzcaa.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
    }
}
