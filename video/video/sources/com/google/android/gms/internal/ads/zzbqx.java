package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbqx extends zzayl implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    zzbpu W7 = zzbpt.W7(parcel.readStrongBinder());
                    zzaym.c(parcel);
                    S4(W7);
                } else {
                    zzaym.c(parcel);
                    G((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                }
            } else {
                String readString = parcel.readString();
                zzaym.c(parcel);
                u(readString);
            }
        } else {
            IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            zzaym.c(parcel);
            Z0(g1);
        }
        parcel2.writeNoException();
        return true;
    }
}
