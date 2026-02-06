package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzekz extends com.google.android.gms.ads.internal.client.zzbw {
    public final com.google.android.gms.ads.internal.client.zzr X;
    public final Context Y;
    public final String Y0;
    public final zzezx Z;
    public final VersionInfoParcel Z0;
    public final zzekr a1;
    public final zzfax b1;
    public final zzavl c1;
    public final zzdsd d1;
    @InterfaceC11300zs1
    public zzdew e1;
    public boolean f1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S0)).booleanValue();

    public zzekz(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzezx zzezxVar, zzekr zzekrVar, zzfax zzfaxVar, VersionInfoParcel versionInfoParcel, zzavl zzavlVar, zzdsd zzdsdVar) {
        this.X = zzrVar;
        this.Y0 = str;
        this.Y = context;
        this.Z = zzezxVar;
        this.a1 = zzekrVar;
        this.b1 = zzfaxVar;
        this.Z0 = versionInfoParcel;
        this.c1 = zzavlVar;
        this.d1 = zzdsdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void C() {
        Preconditions.k("pause must be called on the main UI thread.");
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null) {
            zzdewVar.d().t1(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void C1(zzbdq zzbdqVar) {
        Preconditions.k("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.Z.i(zzbdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean C3(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.B0()) {
                if (((Boolean) zzbet.i.e()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue()) {
                        z = true;
                        if (this.Z0.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue() || !z) {
                            Preconditions.k("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.Z0.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue()) {
                }
                Preconditions.k("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzv.v();
            Context context = this.Y;
            if (com.google.android.gms.ads.internal.util.zzs.i(context) && zzmVar.n1 == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load the ad because app ID is missing.");
                zzekr zzekrVar = this.a1;
                if (zzekrVar != null) {
                    zzekrVar.C0(zzfdq.d(4, null, null));
                }
            } else if (!Z7()) {
                zzfdm.a(context, zzmVar.a1);
                this.e1 = null;
                return this.Z.b(zzmVar, this.Y0, new zzezq(this.X), new zzeky(this));
            }
            return false;
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
        this.b1.B(zzbwdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L() {
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
        Preconditions.k("setAppEventListener must be called on the main UI thread.");
        this.a1.C(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void Q5(IObjectWrapper iObjectWrapper) {
        if (this.e1 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Interstitial can not be shown before loaded.");
            this.a1.w(zzfdq.d(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue()) {
            this.c1.c().f(new Throwable().getStackTrace());
        }
        this.e1.j(this.f1, (Activity) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void R() {
        Preconditions.k("resume must be called on the main UI thread.");
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null) {
            zzdewVar.d().u1(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R7(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.a1.Q(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void V() {
        Preconditions.k("showInterstitial must be called on the main UI thread.");
        if (this.e1 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Interstitial can not be shown before loaded.");
            this.a1.w(zzfdq.d(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue()) {
            this.c1.c().f(new Throwable().getStackTrace());
        }
        this.e1.j(this.f1, null);
    }

    public final synchronized boolean Z7() {
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null) {
            if (!zzdewVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.a1.x(zzbnVar);
        C3(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean c0() {
        Preconditions.k("isLoaded must be called on the main UI thread.");
        return Z7();
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
    public final com.google.android.gms.ads.internal.client.zzr g() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk i() {
        return this.a1.g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void i7(boolean z) {
        Preconditions.k("setImmersiveMode must be called on the main UI thread.");
        this.f1 = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl j() {
        return this.a1.n();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzdx k() {
        zzdew zzdewVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue() && (zzdewVar = this.e1) != null) {
            return zzdewVar.c();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean l0() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.k("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.e()) {
                this.d1.e();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.a1.B(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        Preconditions.k("setAdListener must be called on the main UI thread.");
        this.a1.q(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void o6(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized String s() {
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null && zzdewVar.c() != null) {
            return zzdewVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final synchronized String v() {
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null && zzdewVar.c() != null) {
            return zzdewVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void v6(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String x() {
        return this.Y0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void y() {
        Preconditions.k("destroy must be called on the main UI thread.");
        zzdew zzdewVar = this.e1;
        if (zzdewVar != null) {
            zzdewVar.d().n1(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean z0() {
        return this.Z.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void z2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }
}
