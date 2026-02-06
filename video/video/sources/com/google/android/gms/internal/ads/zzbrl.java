package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbrl extends zzayk implements zzbrn {
    public zzbrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void D1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void S(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(1, O0);
    }
}
