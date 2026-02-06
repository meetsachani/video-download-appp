package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcx extends zzbu implements zzcv {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void v0(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        o1(1, O0);
    }
}
