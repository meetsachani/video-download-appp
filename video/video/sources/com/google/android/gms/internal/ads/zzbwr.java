package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbwr extends zzayk implements zzbwt {
    public zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void W(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void X3(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void d() throws RemoteException {
        o1(7, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void e() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void g() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void j() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void x1(zzbwn zzbwnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbwnVar);
        o1(3, O0);
    }
}
