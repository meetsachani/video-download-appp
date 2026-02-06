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
public final class zzfbl extends zzbwp {
    public final zzfbh X;
    public final zzfax Y;
    public final zzfch Y0;
    public final String Z;
    public final Context Z0;
    public final VersionInfoParcel a1;
    public final zzavl b1;
    public final zzdsd c1;
    @InterfaceC11300zs1
    public zzdoh d1;
    public boolean e1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S0)).booleanValue();

    public zzfbl(@InterfaceC11300zs1 String str, zzfbh zzfbhVar, Context context, zzfax zzfaxVar, zzfch zzfchVar, VersionInfoParcel versionInfoParcel, zzavl zzavlVar, zzdsd zzdsdVar) {
        this.Z = str;
        this.X = zzfbhVar;
        this.Y = zzfaxVar;
        this.Y0 = zzfchVar;
        this.Z0 = context;
        this.a1 = versionInfoParcel;
        this.b1 = zzavlVar;
        this.c1 = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void A6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.k("#008 Must be called on the main UI thread.");
        if (this.d1 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Rewarded can not be shown before loaded");
            this.Y.w(zzfdq.d(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue()) {
            this.b1.c().f(new Throwable().getStackTrace());
        }
        this.d1.o(z, (Activity) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void H4(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (zzdnVar == null) {
            this.Y.g(null);
        } else {
            this.Y.g(new zzfbj(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void S6(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        a8(zzmVar, zzbwxVar, 3);
    }

    public final synchronized void a8(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar, int i) throws RemoteException {
        try {
            if (!zzmVar.B0()) {
                boolean z = false;
                if (((Boolean) zzbet.k.e()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.a1.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.yb)).intValue() || !z) {
                    Preconditions.k("#008 Must be called on the main UI thread.");
                }
            }
            zzfax zzfaxVar = this.Y;
            zzfaxVar.y(zzbwxVar);
            com.google.android.gms.ads.internal.zzv.v();
            if (com.google.android.gms.ads.internal.util.zzs.i(this.Z0) && zzmVar.n1 == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load the ad because app ID is missing.");
                zzfaxVar.C0(zzfdq.d(4, null, null));
                return;
            }
            if (this.d1 != null) {
                return;
            }
            zzfaz zzfazVar = new zzfaz(null);
            zzfbh zzfbhVar = this.X;
            zzfbhVar.j(i);
            zzfbhVar.b(zzmVar, this.Z, zzfazVar, new zzfbk(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final Bundle b() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzdoh zzdohVar = this.d1;
        if (zzdohVar != null) {
            return zzdohVar.i();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzdx c() {
        zzdoh zzdohVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue() && (zzdohVar = this.d1) != null) {
            return zzdohVar.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final String d() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        A6(iObjectWrapper, this.e1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void d5(zzbxe zzbxeVar) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzfch zzfchVar = this.Y0;
        zzfchVar.a = zzbxeVar.X;
        zzfchVar.b = zzbxeVar.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final synchronized String e() throws RemoteException {
        zzdoh zzdohVar = this.d1;
        if (zzdohVar != null && zzdohVar.c() != null) {
            return zzdohVar.c().g();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void e5(zzbwt zzbwtVar) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        this.Y.x(zzbwtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final zzbwn f() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzdoh zzdohVar = this.d1;
        if (zzdohVar != null) {
            return zzdohVar.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void f7(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        a8(zzmVar, zzbwxVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final boolean o() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzdoh zzdohVar = this.d1;
        if (zzdohVar != null && !zzdohVar.m()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void r3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.k("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.e()) {
                this.c1.e();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.Y.u(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void v1(zzbwy zzbwyVar) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        this.Y.Q(zzbwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void v3(boolean z) {
        Preconditions.k("setImmersiveMode must be called on the main UI thread.");
        this.e1 = z;
    }
}
