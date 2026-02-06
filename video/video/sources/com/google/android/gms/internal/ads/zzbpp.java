package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbpp extends zzayk implements zzbpr {
    public zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void A(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void B() throws RemoteException {
        o1(11, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void C() throws RemoteException {
        o1(13, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void N4(zzbwn zzbwnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbwnVar);
        o1(16, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void N6(zzbwj zzbwjVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void O1(int i, String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        O0.writeString(str);
        o1(22, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void V5(zzbha zzbhaVar, String str) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhaVar);
        O0.writeString(str);
        o1(10, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void Y1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(23, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void b7(String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        o1(9, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void d() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void e() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void e3(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(24, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void g0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void j0(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void m() throws RemoteException {
        o1(8, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void n() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void o() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void p() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void q() throws RemoteException {
        o1(18, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void t() throws RemoteException {
        o1(25, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void w() throws RemoteException {
        o1(20, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void y() throws RemoteException {
        o1(15, O0());
    }
}
