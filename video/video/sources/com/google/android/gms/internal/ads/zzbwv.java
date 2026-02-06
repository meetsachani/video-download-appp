package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbwv extends zzayk implements zzbwx {
    public zzbwv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void E(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void g() throws RemoteException {
        o1(1, O0());
    }
}
