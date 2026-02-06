package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzejx extends com.google.android.gms.ads.internal.client.zzbw implements zzcyk {
    public final Context X;
    public final zzeyg Y;
    public final zzekr Y0;
    public final String Z;
    public com.google.android.gms.ads.internal.client.zzr Z0;
    public final zzfcn a1;
    public final VersionInfoParcel b1;
    public final zzdsd c1;
    @InterfaceC11300zs1
    public zzcop d1;

    public zzejx(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzeyg zzeygVar, zzekr zzekrVar, VersionInfoParcel versionInfoParcel, zzdsd zzdsdVar) {
        this.X = context;
        this.Y = zzeygVar;
        this.Z0 = zzrVar;
        this.Z = str;
        this.Y0 = zzekrVar;
        this.a1 = zzeygVar.f();
        this.b1 = versionInfoParcel;
        this.c1 = zzdsdVar;
        zzeygVar.o(this);
    }

    private final boolean b8() {
        boolean z;
        if (((Boolean) zzbet.f.e()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue()) {
                z = true;
                if (this.b1.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue() || !z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (this.b1.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue()) {
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void C() {
        zzcop zzcopVar;
        try {
            if (((Boolean) zzbet.g.e()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.vb)).booleanValue()) {
                    if (this.b1.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zb)).intValue()) {
                    }
                    zzcopVar = this.d1;
                    if (zzcopVar == null) {
                        zzcopVar.d().t1(null);
                        return;
                    }
                    return;
                }
            }
            Preconditions.k("pause must be called on the main UI thread.");
            zzcopVar = this.d1;
            if (zzcopVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void C1(zzbdq zzbdqVar) {
        Preconditions.k("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.Y.p(zzbdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean C3(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        Z7(this.Z0);
        return a8(zzmVar);
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
        Preconditions.k("recordManualImpression must be called on the main UI thread.");
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null) {
            zzcopVar.o();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L2(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void M3(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.k("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void P4(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (b8()) {
            Preconditions.k("setAppEventListener must be called on the main UI thread.");
        }
        this.Y0.C(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void Q5(IObjectWrapper iObjectWrapper) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void R() {
        zzcop zzcopVar;
        try {
            if (((Boolean) zzbet.h.e()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.tb)).booleanValue()) {
                    if (this.b1.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zb)).intValue()) {
                    }
                    zzcopVar = this.d1;
                    if (zzcopVar == null) {
                        zzcopVar.d().u1(null);
                        return;
                    }
                    return;
                }
            }
            Preconditions.k("resume must be called on the main UI thread.");
            zzcopVar = this.d1;
            if (zzcopVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void R7(boolean z) {
        try {
            if (b8()) {
                Preconditions.k("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.a1.b(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void V() {
    }

    public final synchronized void Z7(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzfcn zzfcnVar = this.a1;
        zzfcnVar.O(zzrVar);
        zzfcnVar.U(this.Z0.i1);
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final synchronized void a() {
        try {
            if (this.Y.s()) {
                zzfcn zzfcnVar = this.a1;
                com.google.android.gms.ads.internal.client.zzr D = zzfcnVar.D();
                if (this.d1 != null && zzfcnVar.t()) {
                    D = zzfcv.a(this.X, Collections.singletonList(this.d1.n()));
                }
                Z7(D);
                zzfcnVar.T(true);
                try {
                    a8(zzfcnVar.B());
                } catch (RemoteException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Failed to refresh the banner ad.");
                }
                this.a1.T(false);
                return;
            }
            this.Y.l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a8(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        try {
            if (b8()) {
                Preconditions.k("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzv.v();
            Context context = this.X;
            if (com.google.android.gms.ads.internal.util.zzs.i(context) && zzmVar.n1 == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load the ad because app ID is missing.");
                zzekr zzekrVar = this.Y0;
                if (zzekrVar != null) {
                    zzekrVar.C0(zzfdq.d(4, null, null));
                }
                return false;
            }
            zzfdm.a(context, zzmVar.a1);
            return this.Y.b(zzmVar, this.Z, null, new zzejw(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final synchronized void b() throws ExecutionException, InterruptedException {
        zzeyg zzeygVar = this.Y;
        if (zzeygVar.s()) {
            zzeygVar.q();
        } else {
            zzeygVar.m();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
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
        Preconditions.k("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr g() {
        Preconditions.k("getAdSize must be called on the main UI thread.");
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null) {
            return zzfcv.a(this.X, Collections.singletonList(zzcopVar.m()));
        }
        return this.a1.D();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk i() {
        return this.Y0.g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void i7(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl j() {
        return this.Y0.n();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzdx k() {
        zzcop zzcopVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue() && (zzcopVar = this.d1) != null) {
            return zzcopVar.c();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzea l() {
        Preconditions.k("getVideoController must be called from the main thread.");
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null) {
            return zzcopVar.l();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean l0() {
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null) {
            if (zzcopVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (b8()) {
            Preconditions.k("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.e()) {
                this.c1.e();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.Y0.B(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() {
        if (b8()) {
            Preconditions.k("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.V3(this.Y.c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (b8()) {
            Preconditions.k("setAdListener must be called on the main UI thread.");
        }
        this.Y0.q(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void o6(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.k("setCorrelationIdProvider must be called on the main UI thread");
        this.a1.v(zzcpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized String s() {
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null && zzcopVar.c() != null) {
            return zzcopVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized String v() {
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null && zzcopVar.c() != null) {
            return zzcopVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void v6(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        try {
            if (b8()) {
                Preconditions.k("setVideoOptions must be called on the main UI thread.");
            }
            this.a1.i(zzfwVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String x() {
        return this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void y() {
        zzcop zzcopVar;
        try {
            if (((Boolean) zzbet.e.e()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ub)).booleanValue()) {
                    if (this.b1.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zb)).intValue()) {
                    }
                    zzcopVar = this.d1;
                    if (zzcopVar == null) {
                        zzcopVar.a();
                        return;
                    }
                    return;
                }
            }
            Preconditions.k("destroy must be called on the main UI thread.");
            zzcopVar = this.d1;
            if (zzcopVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (b8()) {
            Preconditions.k("setAdListener must be called on the main UI thread.");
        }
        this.Y.n(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean z0() {
        return this.Y.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void z2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.k("setAdSize must be called on the main UI thread.");
        this.a1.O(zzrVar);
        this.Z0 = zzrVar;
        zzcop zzcopVar = this.d1;
        if (zzcopVar != null) {
            zzcopVar.p(this.Y.c(), zzrVar);
        }
    }
}
