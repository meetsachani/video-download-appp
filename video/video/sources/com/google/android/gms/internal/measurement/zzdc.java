package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzdc extends zzbu implements zzda {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int a() throws RemoteException {
        Parcel g1 = g1(2, O0());
        int readInt = g1.readInt();
        g1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void e1(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.d(O0, bundle);
        O0.writeLong(j);
        o1(1, O0);
    }
}
