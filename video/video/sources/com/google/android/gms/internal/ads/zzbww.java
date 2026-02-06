package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbww extends zzayl implements zzbwx {
    public zzbww() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                G((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                E(readInt);
            }
        } else {
            g();
        }
        parcel2.writeNoException();
        return true;
    }
}
