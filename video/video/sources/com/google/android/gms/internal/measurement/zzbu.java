package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zzbu implements IInterface {
    public final IBinder X;
    public final String Y;

    public zzbu(IBinder iBinder, String str) {
        this.X = iBinder;
        this.Y = str;
    }

    public final Parcel O0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.Y);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.X;
    }

    public final Parcel g1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.X.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void o1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.X.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
