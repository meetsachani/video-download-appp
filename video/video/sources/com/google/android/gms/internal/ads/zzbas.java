package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbas extends zzayk implements zzbau {
    public zzbas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void D0(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void b() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void c() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void d() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void e() throws RemoteException {
        o1(1, O0());
    }
}
