package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbvc extends zzayl implements zzbvd {
    public zzbvc() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                t1((ParcelFileDescriptor) zzaym.a(parcel, ParcelFileDescriptor.CREATOR), (zzbvl) zzaym.a(parcel, zzbvl.CREATOR));
            } else {
                zzaym.c(parcel);
                s5((com.google.android.gms.ads.internal.util.zzbb) zzaym.a(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
            }
        } else {
            zzaym.c(parcel);
            y6((ParcelFileDescriptor) zzaym.a(parcel, ParcelFileDescriptor.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
