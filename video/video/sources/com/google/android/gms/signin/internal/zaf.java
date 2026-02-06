package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes3.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void B5(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.base.zac.c(O0, zaiVar);
        com.google.android.gms.internal.base.zac.d(O0, zaeVar);
        o1(12, O0);
    }

    public final void h5(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.base.zac.d(O0, iAccountAccessor);
        O0.writeInt(i);
        com.google.android.gms.internal.base.zac.b(O0, z);
        o1(9, O0);
    }

    public final void r4(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(7, O0);
    }
}
