package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbqp extends zzbpq {
    public final Adapter X;
    public final zzbwi Y;

    public zzbqp(Adapter adapter, zzbwi zzbwiVar) {
        this.X = adapter;
        this.Y = zzbwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void A(int i) throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.b3(ObjectWrapper.V3(this.X), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void B() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void C() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.E0(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void N4(zzbwn zzbwnVar) throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.M1(ObjectWrapper.V3(this.X), new zzbwj(zzbwnVar.e(), zzbwnVar.d()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void N6(@InterfaceC11300zs1 zzbwj zzbwjVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void O1(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void V5(zzbha zzbhaVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void Y1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void b7(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void d() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.zze(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void e() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.R0(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void e3(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void g0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void j0(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void m() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void n() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void o() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.s0(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void p() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.i1(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void q() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.Q1(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void t() throws RemoteException {
        zzbwi zzbwiVar = this.Y;
        if (zzbwiVar != null) {
            zzbwiVar.d0(ObjectWrapper.V3(this.X));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void w() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void y() throws RemoteException {
    }
}
