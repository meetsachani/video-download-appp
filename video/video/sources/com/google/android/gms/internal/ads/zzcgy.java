package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcgy extends zzayk implements zzcha {
    public zzcgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void Y5(IObjectWrapper iObjectWrapper, zzcgx zzcgxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzcgxVar);
        o1(2, O0);
    }
}
