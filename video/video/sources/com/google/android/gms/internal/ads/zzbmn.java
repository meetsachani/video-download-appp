package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbmn extends zzayk implements zzbmp {
    public zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void E(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void K5(zzbmj zzbmjVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbmjVar);
        o1(1, O0);
    }
}
