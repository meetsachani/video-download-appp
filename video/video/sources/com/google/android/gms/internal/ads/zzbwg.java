package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbwg extends zzayk implements zzbwi {
    public zzbwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void E0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void H5(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void I7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void M1(IObjectWrapper iObjectWrapper, zzbwj zzbwjVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzbwjVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void Q1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(11, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void R0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void T4(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void b3(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeInt(i);
        o1(9, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(13, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void i1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void s0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(8, O0);
    }
}
