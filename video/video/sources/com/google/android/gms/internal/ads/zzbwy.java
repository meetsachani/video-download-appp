package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbwy extends zzayk implements IInterface {
    public zzbwy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void r4(zzbwn zzbwnVar, String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbwnVar);
        O0.writeString(str);
        O0.writeString(str2);
        o1(2, O0);
    }
}
