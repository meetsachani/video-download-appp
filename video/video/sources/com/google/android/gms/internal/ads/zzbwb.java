package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbwb extends zzayk implements zzbwd {
    public zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void A(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void e() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void h() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void i() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void i5(zzbvx zzbvxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbvxVar);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void j() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void k() throws RemoteException {
        o1(8, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void l() throws RemoteException {
        o1(3, O0());
    }
}
