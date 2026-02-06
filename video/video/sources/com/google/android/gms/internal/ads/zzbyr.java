package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbyr extends zzayl implements zzbys {
    public zzbyr() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                h2(parcel.readString(), parcel.readString(), (Bundle) zzaym.a(parcel, Bundle.CREATOR));
            } else {
                String readString = parcel.readString();
                zzaym.c(parcel);
                I(readString);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzaym.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
