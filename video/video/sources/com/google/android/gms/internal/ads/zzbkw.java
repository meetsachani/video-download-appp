package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbkw extends zzayk implements zzbky {
    public zzbkw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void S(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void d() throws RemoteException {
        o1(2, O0());
    }
}
