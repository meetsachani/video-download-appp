package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdyh extends zzdyb {
    public String b1;
    public int c1 = 1;

    public zzdyh(Context context) {
        this.a1 = new zzbuq(context, com.google.android.gms.ads.internal.zzv.z().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        zzbvd zzdxzVar;
        zzbvd zzdxzVar2;
        synchronized (this.Y) {
            try {
                if (!this.Y0) {
                    this.Y0 = true;
                    try {
                        int i = this.c1;
                        if (i == 2) {
                            zzbuz q0 = this.a1.q0();
                            zzbvl zzbvlVar = this.Z0;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.hd)).booleanValue()) {
                                zzdxzVar2 = new zzdya(this.X, this.Z0);
                            } else {
                                zzdxzVar2 = new zzdxz(this);
                            }
                            q0.t7(zzbvlVar, zzdxzVar2);
                        } else if (i == 3) {
                            zzbuz q02 = this.a1.q0();
                            String str = this.b1;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.hd)).booleanValue()) {
                                zzdxzVar = new zzdya(this.X, this.Z0);
                            } else {
                                zzdxzVar = new zzdxz(this);
                            }
                            q02.Q2(str, zzdxzVar);
                        } else {
                            this.X.d(new zzdyq(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.X.d(new zzdyq(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.t().x(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i = this.c1;
                if (i != 1 && i != 2) {
                    return zzgcy.g(new zzdyq(2));
                } else if (this.Z) {
                    return this.X;
                } else {
                    this.c1 = 2;
                    this.Z = true;
                    this.Z0 = zzbvlVar;
                    this.a1.x();
                    zzcaf zzcafVar = this.X;
                    zzcafVar.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyh.this.a();
                        }
                    }, zzcaa.g);
                    return zzcafVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC8411o11 d(String str) {
        synchronized (this.Y) {
            try {
                int i = this.c1;
                if (i != 1 && i != 3) {
                    return zzgcy.g(new zzdyq(2));
                } else if (this.Z) {
                    return this.X;
                } else {
                    this.c1 = 3;
                    this.Z = true;
                    this.b1 = str;
                    this.a1.x();
                    zzcaf zzcafVar = this.X;
                    zzcafVar.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyh.this.a();
                        }
                    }, zzcaa.g);
                    return zzcafVar;
                }
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
