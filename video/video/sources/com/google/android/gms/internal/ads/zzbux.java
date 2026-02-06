package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbux extends zzayk implements zzbuz {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void K4(zzbuv zzbuvVar, zzbve zzbveVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void Q2(String str, zzbvd zzbvdVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzaym.f(O0, zzbvdVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void V4(zzbvl zzbvlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbvlVar);
        zzaym.f(O0, zzbvdVar);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void t7(zzbvl zzbvlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbvlVar);
        zzaym.f(O0, zzbvdVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void w5(zzbvl zzbvlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbvlVar);
        zzaym.f(O0, zzbvdVar);
        o1(5, O0);
    }
}
