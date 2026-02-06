package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
interface IMessengerCompat extends IInterface {
    public static final String a = "com.google.android.gms.iid.IMessengerCompat";
    public static final int b = 1;

    /* loaded from: classes2.dex */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        @InterfaceC5670cr1
        public IBinder asBinder() {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void b5(@InterfaceC5670cr1 Message message) throws RemoteException {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, @InterfaceC5670cr1 Parcel parcel, @InterfaceC11300zs1 Parcel parcel2, int i2) throws RemoteException {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class Proxy implements IMessengerCompat {
        public final IBinder X;

        public Proxy(@InterfaceC5670cr1 IBinder iBinder) {
            this.X = iBinder;
        }

        @Override // android.os.IInterface
        @InterfaceC5670cr1
        public IBinder asBinder() {
            return this.X;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void b5(@InterfaceC5670cr1 Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(IMessengerCompat.a);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.X.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void b5(@InterfaceC5670cr1 Message message) throws RemoteException;
}
