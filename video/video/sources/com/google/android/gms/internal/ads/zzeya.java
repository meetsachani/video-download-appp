package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzeya extends com.google.android.gms.ads.internal.client.zzbw implements com.google.android.gms.ads.internal.overlay.zzr, zzbah {
    public final zzchb X;
    public final Context Y;
    public final String Y0;
    public final zzexu Z0;
    public final zzexs a1;
    public final VersionInfoParcel b1;
    public final zzdsd c1;
    @InterfaceC11300zs1
    public zzcnw e1;
    @InterfaceC11300zs1
    public zzcoj f1;
    public AtomicBoolean Z = new AtomicBoolean();
    public long d1 = -1;

    public zzeya(zzchb zzchbVar, Context context, String str, zzexu zzexuVar, zzexs zzexsVar, VersionInfoParcel versionInfoParcel, zzdsd zzdsdVar) {
        this.X = zzchbVar;
        this.Y = context;
        this.Y0 = str;
        this.Z0 = zzexuVar;
        this.a1 = zzexsVar;
        this.b1 = versionInfoParcel;
        this.c1 = zzdsdVar;
        zzexsVar.e(this);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.Z0.l(zzxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void C() {
        Preconditions.k("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void C1(zzbdq zzbdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean C3(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        boolean z;
        try {
            if (!zzmVar.B0()) {
                if (((Boolean) zzbet.d.e()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue()) {
                        z = true;
                        if (this.b1.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue() || !z) {
                            Preconditions.k("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.b1.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue()) {
                }
                Preconditions.k("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzv.v();
            if (com.google.android.gms.ads.internal.util.zzs.i(this.Y) && zzmVar.n1 == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load the ad because app ID is missing.");
                this.a1.C0(zzfdq.d(4, null, null));
                return false;
            }
            if (z0()) {
                return false;
            }
            this.Z = new AtomicBoolean();
            return this.Z0.b(zzmVar, this.Y0, new zzexy(this), new zzexz(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void D4(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void G3(zzbtx zzbtxVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void J1(zzbwd zzbwdVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void L() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L2(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void M3(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void P4(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void Q5(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void R() {
        Preconditions.k("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void R7(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void V() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void a() {
        b8(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    public final synchronized void b8(int i) {
        try {
            if (this.Z.compareAndSet(false, true)) {
                this.a1.b();
                zzcnw zzcnwVar = this.e1;
                if (zzcnwVar != null) {
                    com.google.android.gms.ads.internal.zzv.f().e(zzcnwVar);
                }
                if (this.f1 != null) {
                    long j = -1;
                    if (this.d1 != -1) {
                        j = com.google.android.gms.ads.internal.zzv.d().b() - this.d1;
                    }
                    this.f1.l(j, i);
                }
                y();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean c0() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void c7(zzbtu zzbtuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle f() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr g() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        b8(6);
                        return;
                    } else {
                        b8(3);
                        return;
                    }
                }
                b8(4);
                return;
            }
            b8(2);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk i() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void i7(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl j() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzdx k() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) {
        this.a1.q(zzbaqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean l0() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void o1() {
        zzcoj zzcojVar = this.f1;
        if (zzcojVar != null) {
            zzcojVar.l(com.google.android.gms.ads.internal.zzv.d().b() - this.d1, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void o6(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void r4() {
        if (this.f1 != null) {
            this.d1 = com.google.android.gms.ads.internal.zzv.d().b();
            int i = this.f1.i();
            if (i > 0) {
                zzcnw zzcnwVar = new zzcnw(this.X.c(), com.google.android.gms.ads.internal.zzv.d());
                this.e1 = zzcnwVar;
                zzcnwVar.c(i, new Runnable() { // from class: com.google.android.gms.internal.ads.zzexx
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.X.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeya.this.b8(5);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String s() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String v() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void v6(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String x() {
        return this.Y0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void y() {
        Preconditions.k("destroy must be called on the main UI thread.");
        zzcoj zzcojVar = this.f1;
        if (zzcojVar != null) {
            zzcojVar.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean z0() {
        return this.Z0.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void z2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.k("setAdSize must be called on the main UI thread.");
    }
}
