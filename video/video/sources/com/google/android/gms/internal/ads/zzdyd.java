package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdyd extends zzdyb {
    public final Context b1;
    public final Executor c1;

    public zzdyd(Context context, Executor executor) {
        this.b1 = context;
        this.c1 = executor;
        this.a1 = new zzbuq(context, com.google.android.gms.ads.internal.zzv.z().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(Bundle bundle) {
        zzbvd zzdxzVar;
        synchronized (this.Y) {
            try {
                if (!this.Y0) {
                    this.Y0 = true;
                    try {
                        zzbuz q0 = this.a1.q0();
                        zzbvl zzbvlVar = this.Z0;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.hd)).booleanValue()) {
                            zzdxzVar = new zzdya(this.X, this.Z0);
                        } else {
                            zzdxzVar = new zzdxz(this);
                        }
                        q0.w5(zzbvlVar, zzdxzVar);
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.X.d(new zzdyq(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.t().x(th, "RemoteSignalsClientTask.onConnected");
                        this.X.d(new zzdyq(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final InterfaceFutureC8411o11 c(zzbvl zzbvlVar) {
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    return this.X;
                }
                this.Z = true;
                this.Z0 = zzbvlVar;
                this.a1.x();
                zzcaf zzcafVar = this.X;
                zzcafVar.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyd.this.a();
                    }
                }, zzcaa.g);
                zzdyb.b(this.b1, zzcafVar, this.c1);
                return zzcafVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
