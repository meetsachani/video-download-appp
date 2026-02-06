package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbrd extends zzayl implements zzbre {
    public zzbrd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
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
                String readString = parcel.readString();
                zzaym.c(parcel);
                u(readString);
            }
        } else {
            zzbqa W7 = zzbpz.W7(parcel.readStrongBinder());
            zzaym.c(parcel);
            P7(W7);
        }
        parcel2.writeNoException();
        return true;
    }
}
