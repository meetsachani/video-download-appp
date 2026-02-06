package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzr extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper h5(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(i);
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper2);
        Parcel O0 = O0(3, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }

    public final IObjectWrapper r4(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(i);
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper2);
        Parcel O0 = O0(2, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }
}
