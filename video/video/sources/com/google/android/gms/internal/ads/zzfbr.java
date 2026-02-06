package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfbr extends zzbvz {
    public final zzfbh X;
    public final zzfax Y;
    @InterfaceC11300zs1
    public zzdoh Y0;
    public final zzfch Z;
    public boolean Z0 = false;

    public zzfbr(zzfbh zzfbhVar, zzfax zzfaxVar, zzfch zzfchVar) {
        this.X = zzfbhVar;
        this.Y = zzfaxVar;
        this.Z = zzfchVar;
    }

    private final synchronized boolean w() {
        zzdoh zzdohVar = this.Y0;
        if (zzdohVar != null) {
            if (!zzdohVar.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void O(@InterfaceC11300zs1 IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.k("showAd must be called on the main UI thread.");
            if (this.Y0 != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object o1 = ObjectWrapper.o1(iObjectWrapper);
                    if (o1 instanceof Activity) {
                        activity = (Activity) o1;
                    }
                }
                this.Y0.o(this.Z0, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void R0(IObjectWrapper iObjectWrapper) {
        Preconditions.k("destroy must be called on the main UI thread.");
        Context context = null;
        this.Y.g(null);
        if (this.Y0 != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.o1(iObjectWrapper);
            }
            this.Y0.d().n1(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void S1(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.k("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.Y.g(null);
        } else {
            this.Y.g(new zzfbq(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void X2(String str) throws RemoteException {
        Preconditions.k("#008 Must be called on the main UI thread.: setCustomData");
        this.Z.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void a0(boolean z) {
        Preconditions.k("setImmersiveMode must be called on the main UI thread.");
        this.Z0 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void a3(String str) throws RemoteException {
        Preconditions.k("setUserId must be called on the main UI thread.");
        this.Z.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle b() {
        Preconditions.k("getAdMetadata can only be called from the UI thread.");
        zzdoh zzdohVar = this.Y0;
        if (zzdohVar != null) {
            return zzdohVar.i();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void b0(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.k("resume must be called on the main UI thread.");
        if (this.Y0 != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.o1(iObjectWrapper);
            }
            this.Y0.d().u1(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzdx c() throws RemoteException {
        zzdoh zzdohVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue() && (zzdohVar = this.Y0) != null) {
            return zzdohVar.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void d() throws RemoteException {
        R0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void e4(zzbwd zzbwdVar) throws RemoteException {
        Preconditions.k("setRewardedVideoAdListener can only be called from the UI thread.");
        this.Y.B(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @InterfaceC11300zs1
    public final synchronized String f() throws RemoteException {
        zzdoh zzdohVar = this.Y0;
        if (zzdohVar != null && zzdohVar.c() != null) {
            return zzdohVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void g5(zzbvy zzbvyVar) {
        Preconditions.k("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.Y.C(zzbvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void h() {
        i1(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void i1(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.k("pause must be called on the main UI thread.");
        if (this.Y0 != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.o1(iObjectWrapper);
            }
            this.Y0.d().t1(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void j() {
        b0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void r() throws RemoteException {
        O(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean s() throws RemoteException {
        Preconditions.k("isLoaded must be called on the main UI thread.");
        return w();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean v() {
        zzdoh zzdohVar = this.Y0;
        if (zzdohVar != null && zzdohVar.n()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.K5)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzbwa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void x6(zzbwe zzbweVar) throws RemoteException {
        Preconditions.k("loadAd must be called on the main UI thread.");
        String str = zzbweVar.Y;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I5);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (w()) {
        }
        zzfaz zzfazVar = new zzfaz(null);
        this.Y0 = null;
        zzfbh zzfbhVar = this.X;
        zzfbhVar.j(1);
        zzfbhVar.b(zzbweVar.X, zzbweVar.Y, zzfazVar, new zzfbp(this));
    }
}
