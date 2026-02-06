package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzad implements IGmsServiceBroker {
    public final IBinder X;

    public zzad(IBinder iBinder) {
        this.X = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.X;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void q5(IGmsCallbacks iGmsCallbacks, @InterfaceC11300zs1 GetServiceRequest getServiceRequest) throws RemoteException {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (iGmsCallbacks != null) {
                iBinder = iGmsCallbacks.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                zzn.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.X.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
