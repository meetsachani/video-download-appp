package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbwl extends zzayk implements zzbwn {
    public zzbwl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final int d() throws RemoteException {
        Parcel g1 = g1(2, O0());
        int readInt = g1.readInt();
        g1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final String e() throws RemoteException {
        Parcel g1 = g1(1, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }
}
