package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzblz extends zzayk implements zzbmb {
    public zzblz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void K0(List list) throws RemoteException {
        Parcel O0 = O0();
        O0.writeTypedList(list);
        o1(1, O0);
    }
}
