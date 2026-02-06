package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbkt extends zzayk implements zzbkv {
    public zzbkt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void I(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(1, O0);
    }
}
