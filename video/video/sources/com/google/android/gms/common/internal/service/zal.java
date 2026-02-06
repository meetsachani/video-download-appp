package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zal extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void r4(zak zakVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.base.zac.d(O0, zakVar);
        V3(1, O0);
    }
}
