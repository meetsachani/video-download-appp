package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbyq extends zzayk implements zzbys {
    public zzbyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void I(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void h2(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, bundle);
        o1(3, O0);
    }
}
