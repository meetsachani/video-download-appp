package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbrc extends zzayk implements zzbre {
    public zzbrc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void P7(zzbqa zzbqaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbqaVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString("Adapter returned null.");
        o1(2, O0);
    }
}
