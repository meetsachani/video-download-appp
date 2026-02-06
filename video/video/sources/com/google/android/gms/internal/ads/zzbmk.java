package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbmk extends zzayk implements zzbmm {
    public zzbmk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void E(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void e() throws RemoteException {
        o1(1, O0());
    }
}
