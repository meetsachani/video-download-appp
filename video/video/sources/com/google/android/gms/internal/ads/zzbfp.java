package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbfp extends zzayk implements IInterface {
    public zzbfp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void r4(zzbup zzbupVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbupVar);
        o1(1, O0);
    }
}
