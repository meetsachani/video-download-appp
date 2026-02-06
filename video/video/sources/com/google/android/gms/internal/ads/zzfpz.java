package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzfpz extends zzayl implements zzfqa {
    public zzfpz() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                parcel.readString();
                zzaym.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaym.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaym.c(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaym.c(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaym.c(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaym.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
