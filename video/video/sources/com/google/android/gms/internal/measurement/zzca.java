package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import o.InterfaceC5539cJ0;

/* loaded from: classes3.dex */
public final class zzca extends zzbu implements zzby {
    public zzca(IBinder iBinder) {
        super(iBinder, InterfaceC5539cJ0.a.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzby
    public final Bundle v0(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        Parcel g1 = g1(1, O0);
        Bundle bundle2 = (Bundle) zzbw.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle2;
    }
}
