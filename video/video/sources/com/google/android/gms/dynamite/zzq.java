package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper B5(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(i);
        Parcel O0 = O0(2, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }

    public final IObjectWrapper S7(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(i);
        Parcel O0 = O0(4, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }

    public final IObjectWrapper V7(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(z ? 1 : 0);
        V3.writeLong(j);
        Parcel O0 = O0(7, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }

    public final int d() throws RemoteException {
        Parcel O0 = O0(6, V3());
        int readInt = O0.readInt();
        O0.recycle();
        return readInt;
    }

    public final int h5(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(z ? 1 : 0);
        Parcel O0 = O0(5, V3);
        int readInt = O0.readInt();
        O0.recycle();
        return readInt;
    }

    public final int r4(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(z ? 1 : 0);
        Parcel O0 = O0(3, V3);
        int readInt = O0.readInt();
        O0.recycle();
        return readInt;
    }

    public final IObjectWrapper s7(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        V3.writeString(str);
        V3.writeInt(i);
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper2);
        Parcel O0 = O0(8, V3);
        IObjectWrapper g1 = IObjectWrapper.Stub.g1(O0.readStrongBinder());
        O0.recycle();
        return g1;
    }
}
