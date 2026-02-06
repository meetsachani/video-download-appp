package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int c() throws RemoteException {
        Parcel O0 = O0(2, V3());
        int readInt = O0.readInt();
        O0.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper f() throws RemoteException {
        Parcel O0 = O0(1, V3());
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }
}
