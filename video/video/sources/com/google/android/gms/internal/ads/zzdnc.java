package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdnc extends zzbhz {
    @InterfaceC11300zs1
    public final String X;
    public final zzdij Y;
    public final zzdsd Y0;
    public final zzdio Z;

    public zzdnc(@InterfaceC11300zs1 String str, zzdij zzdijVar, zzdio zzdioVar, zzdsd zzdsdVar) {
        this.X = str;
        this.Y = zzdijVar;
        this.Z = zzdioVar;
        this.Y0 = zzdsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void B() throws RemoteException {
        this.Y.i();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean D() throws RemoteException {
        zzdio zzdioVar = this.Z;
        if (!zzdioVar.h().isEmpty() && zzdioVar.X() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void F() {
        this.Y.x();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void J2(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        this.Y.k(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void L() {
        this.Y.p();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean P() {
        return this.Y.F();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void Z6(zzbhx zzbhxVar) throws RemoteException {
        this.Y.A(zzbhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final double d() throws RemoteException {
        return this.Z.A();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final Bundle e() throws RemoteException {
        return this.Z.Q();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void f6(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jd)).booleanValue()) {
            this.Y.q(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzdx g() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T6)).booleanValue()) {
            return null;
        }
        return this.Y.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final com.google.android.gms.ads.internal.client.zzea h() throws RemoteException {
        return this.Z.W();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbfz i() throws RemoteException {
        return this.Z.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbgd j() throws RemoteException {
        return this.Y.S().a();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbgg k() throws RemoteException {
        return this.Z.a0();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final IObjectWrapper l() throws RemoteException {
        return this.Z.i0();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final IObjectWrapper m() throws RemoteException {
        return ObjectWrapper.V3(this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String n() throws RemoteException {
        return this.Z.k0();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String o() throws RemoteException {
        return this.Z.m0();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean o3(Bundle bundle) throws RemoteException {
        return this.Y.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String p() throws RemoteException {
        return this.Z.l0();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void p5(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        try {
            if (!zzdqVar.e()) {
                this.Y0.e();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.Y.z(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final List q() throws RemoteException {
        if (D()) {
            return this.Z.h();
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String r() throws RemoteException {
        return this.Z.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String s() throws RemoteException {
        return this.Z.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final List t() throws RemoteException {
        return this.Z.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String v() throws RemoteException {
        return this.Z.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void w4(Bundle bundle) throws RemoteException {
        this.Y.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String x() throws RemoteException {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void y() throws RemoteException {
        this.Y.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void y4(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        this.Y.y(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void z5(Bundle bundle) throws RemoteException {
        this.Y.v(bundle);
    }
}
