package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbma extends zzayl implements zzbmb {
    public zzbma() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbmb W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof zzbmb) {
            return (zzbmb) queryLocalInterface;
        }
        return new zzblz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblu.CREATOR);
            zzaym.c(parcel);
            K0(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
