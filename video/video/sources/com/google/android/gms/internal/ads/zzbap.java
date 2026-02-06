package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbap extends zzayl implements zzbaq {
    public zzbap() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbaq W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzbaq) {
            return (zzbaq) queryLocalInterface;
        }
        return new zzbao(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzban zzbalVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                k1((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
            } else {
                parcel.readInt();
                zzaym.c(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbalVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzban) {
                    zzbalVar = (zzban) queryLocalInterface;
                } else {
                    zzbalVar = new zzbal(readStrongBinder);
                }
            }
            zzaym.c(parcel);
            x4(zzbalVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
