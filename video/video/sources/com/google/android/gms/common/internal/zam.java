package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper r4(IObjectWrapper iObjectWrapper, zax zaxVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.base.zac.d(O0, iObjectWrapper);
        com.google.android.gms.internal.base.zac.c(O0, zaxVar);
        Parcel g1 = g1(2, O0);
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }
}
