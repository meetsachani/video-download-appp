package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzblx extends zzayl implements zzbly {
    public zzblx() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbly W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof zzbly) {
            return (zzbly) queryLocalInterface;
        }
        return new zzblw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzaym.c(parcel);
            u(readString);
        } else {
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
