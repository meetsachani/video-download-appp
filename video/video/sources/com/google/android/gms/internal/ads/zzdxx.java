package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdxx extends zzdyb {
    public final Context b1;
    public final Executor c1;

    public zzdxx(Context context, Executor executor) {
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
                        q0.V4(zzbvlVar, zzdxzVar);
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.X.d(new zzdyq(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.t().x(th, "RemoteAdRequestClientTask.onConnected");
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
                zzcafVar.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdxx.this.a();
                    }
                }, zzcaa.g);
                zzdyb.b(this.b1, zzcafVar, this.c1);
                return zzcafVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyb, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Cannot connect to remote service, fallback to local instance.");
        this.X.d(new zzdyq(1));
    }
}
