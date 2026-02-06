package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {
    public final IBinder X;
    public final String Y = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public zza(IBinder iBinder, String str) {
        this.X = iBinder;
    }

    public final Parcel O0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.Y);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
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
}
