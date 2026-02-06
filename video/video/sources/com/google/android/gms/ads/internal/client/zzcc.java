package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzcc extends zzayk implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void S2(zzfp zzfpVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfpVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void z1(zzfp zzfpVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfpVar);
        o1(2, O0);
    }
}
