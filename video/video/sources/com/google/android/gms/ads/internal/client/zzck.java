package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzck extends zzayl implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcl W7(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzcl) {
            return (zzcl) queryLocalInterface;
        }
        return new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaym.c(parcel);
            n1(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
