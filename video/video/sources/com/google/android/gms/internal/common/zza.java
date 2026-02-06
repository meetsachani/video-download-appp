package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {
    public final IBinder X;
    public final String Y;

    public zza(IBinder iBinder, String str) {
        this.X = iBinder;
        this.Y = str;
    }

    public final Parcel O0(int i, Parcel parcel) throws RemoteException {
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

    public final Parcel V3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.Y);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.X;
    }

    public final void g1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.X.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void o1(int i, Parcel parcel) throws RemoteException {
        try {
            this.X.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
