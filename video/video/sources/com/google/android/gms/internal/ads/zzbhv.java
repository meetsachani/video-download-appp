package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhv extends zzayk implements zzbhx {
    public zzbhv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhx
    public final void S(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhx
    public final void d() throws RemoteException {
        o1(2, O0());
    }
}
