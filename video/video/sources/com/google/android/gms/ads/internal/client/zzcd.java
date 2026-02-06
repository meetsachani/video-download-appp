package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzcd extends zzayl implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzaym.c(parcel);
            z1((zzfp) zzaym.a(parcel, zzfp.CREATOR));
        } else {
            zzaym.c(parcel);
            S2((zzfp) zzaym.a(parcel, zzfp.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
