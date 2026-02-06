package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbkx extends zzayl implements zzbky {
    public zzbkx() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static zzbky W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        if (queryLocalInterface instanceof zzbky) {
            return (zzbky) queryLocalInterface;
        }
        return new zzbkw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            d();
        } else {
            String readString = parcel.readString();
            zzaym.c(parcel);
            S(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
