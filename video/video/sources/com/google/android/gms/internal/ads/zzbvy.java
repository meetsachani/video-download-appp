package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbvy extends zzayk implements IInterface {
    public zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void r4(zzbvx zzbvxVar, String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbvxVar);
        O0.writeString(str);
        O0.writeString(str2);
        o1(2, O0);
    }
}
