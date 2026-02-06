package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbhw extends zzayl implements zzbhx {
    public zzbhw() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
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
