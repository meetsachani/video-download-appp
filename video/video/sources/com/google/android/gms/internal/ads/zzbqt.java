package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbqt extends zzayk implements zzbqv {
    public zzbqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void g() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString("Adapter returned null.");
        o1(3, O0);
    }
}
