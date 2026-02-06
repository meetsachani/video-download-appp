package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcok extends zzbam {
    public final zzcoj X;
    public final com.google.android.gms.ads.internal.client.zzbx Y;
    public boolean Y0 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V0)).booleanValue();
    public final zzexs Z;
    public final zzdsd Z0;

    public zzcok(zzcoj zzcojVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzexs zzexsVar, zzdsd zzdsdVar) {
        this.X = zzcojVar;
        this.Y = zzbxVar;
        this.Z = zzexsVar;
        this.Z0 = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final com.google.android.gms.ads.internal.client.zzbx d() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzdx e() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue()) {
            return null;
        }
        return this.X.c();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    @InterfaceC11300zs1
    public final String g() {
        try {
            return this.Y.x();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void j3(boolean z) {
        this.Y0 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void j4(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.k("setOnPaidEventListener must be called on the main UI thread.");
        if (this.Z != null) {
            try {
                if (!zzdqVar.e()) {
                    this.Z0.e();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
            }
            this.Z.k(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void k5(IObjectWrapper iObjectWrapper, zzbau zzbauVar) {
        try {
            this.Z.u(zzbauVar);
            this.X.k((Activity) ObjectWrapper.o1(iObjectWrapper), zzbauVar, this.Y0);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
