package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbra extends zzayl implements zzbrb {
    public zzbra() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                zzaym.c(parcel);
                G((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                String readString = parcel.readString();
                zzaym.c(parcel);
                u(readString);
            }
        } else {
            g();
        }
        parcel2.writeNoException();
        return true;
    }
}
