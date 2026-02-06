package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzblw extends zzayk implements zzbly {
    public zzblw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void e() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(3, O0);
    }
}
