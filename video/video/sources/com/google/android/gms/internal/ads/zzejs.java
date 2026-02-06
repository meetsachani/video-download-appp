package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzejs extends com.google.android.gms.ads.internal.client.zzbw {
    public final Context X;
    public final com.google.android.gms.ads.internal.client.zzbk Y;
    public final zzcop Y0;
    public final zzfcp Z;
    public final ViewGroup Z0;
    public final zzdsd a1;

    public zzejs(Context context, @InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzbk zzbkVar, zzfcp zzfcpVar, zzcop zzcopVar, zzdsd zzdsdVar) {
        this.X = context;
        this.Y = zzbkVar;
        this.Z = zzfcpVar;
        this.Y0 = zzcopVar;
        this.a1 = zzdsdVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View k = zzcopVar.k();
        com.google.android.gms.ads.internal.zzv.v();
        frameLayout.addView(k, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(g().Z);
        frameLayout.setMinimumWidth(g().a1);
        this.Z0 = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(com.google.android.gms.ads.internal.client.zzx zzxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C() throws RemoteException {
        Preconditions.k("destroy must be called on the main UI thread.");
        this.Y0.d().t1(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C1(zzbdq zzbdqVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean C3(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void D4(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void G3(zzbtx zzbtxVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void J1(zzbwd zzbwdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L() throws RemoteException {
        this.Y0.o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L2(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void M3(com.google.android.gms.ads.internal.client.zzcb zzcbVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void P4(com.google.android.gms.ads.internal.client.zzcl zzclVar) throws RemoteException {
        zzekr zzekrVar = this.Z.c;
        if (zzekrVar != null) {
            zzekrVar.C(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void Q5(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R() throws RemoteException {
        Preconditions.k("destroy must be called on the main UI thread.");
        this.Y0.d().u1(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R7(boolean z) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void V() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean c0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void c7(zzbtu zzbtuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle f() throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr g() {
        Preconditions.k("getAdSize must be called on the main UI thread.");
        return zzfcv.a(this.X, Collections.singletonList(this.Y0.m()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk i() throws RemoteException {
        return this.Y;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void i7(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzcl j() throws RemoteException {
        return this.Z.n;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzdx k() {
        return this.Y0.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzea l() throws RemoteException {
        return this.Y0.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean l0() throws RemoteException {
        zzcop zzcopVar = this.Y0;
        if (zzcopVar != null && zzcopVar.h()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Qb)).booleanValue()) {
            zzekr zzekrVar = this.Z.c;
            if (zzekrVar != null) {
                try {
                    if (!zzdqVar.e()) {
                        this.a1.e();
                    }
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
                }
                zzekrVar.B(zzdqVar);
                return;
            }
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() throws RemoteException {
        return ObjectWrapper.V3(this.Z0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void o6(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final String s() throws RemoteException {
        zzcop zzcopVar = this.Y0;
        if (zzcopVar.c() != null) {
            return zzcopVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final String v() throws RemoteException {
        zzcop zzcopVar = this.Y0;
        if (zzcopVar.c() != null) {
            return zzcopVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void v6(com.google.android.gms.ads.internal.client.zzfw zzfwVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String x() throws RemoteException {
        return this.Z.f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y() throws RemoteException {
        Preconditions.k("destroy must be called on the main UI thread.");
        this.Y0.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean z0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void z2(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Preconditions.k("setAdSize must be called on the main UI thread.");
        zzcop zzcopVar = this.Y0;
        if (zzcopVar != null) {
            zzcopVar.p(this.Z0, zzrVar);
        }
    }
}
