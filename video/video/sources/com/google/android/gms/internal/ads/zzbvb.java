package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbvb extends zzayk implements zzbvd {
    public zzbvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void s5(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbbVar);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void t1(ParcelFileDescriptor parcelFileDescriptor, zzbvl zzbvlVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, parcelFileDescriptor);
        zzaym.d(O0, zzbvlVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void y6(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, parcelFileDescriptor);
        o1(1, O0);
    }
}
