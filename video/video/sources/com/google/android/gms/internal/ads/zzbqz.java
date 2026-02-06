package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbqz extends zzayk implements zzbrb {
    public zzbqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void g() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString("Adapter returned null.");
        o1(3, O0);
    }
}
