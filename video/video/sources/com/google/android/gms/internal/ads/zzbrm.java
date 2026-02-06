package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbrm extends zzayl implements zzbrn {
    public zzbrm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                D1((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                String readString = parcel.readString();
                zzaym.c(parcel);
                S(readString);
            }
        } else {
            String readString2 = parcel.readString();
            zzaym.c(parcel);
            u(readString2);
        }
        parcel2.writeNoException();
        return true;
    }
}
