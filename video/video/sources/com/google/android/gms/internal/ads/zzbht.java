package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbht extends zzayl implements zzbhu {
    public zzbht() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbhu W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (queryLocalInterface instanceof zzbhu) {
            return (zzbhu) queryLocalInterface;
        }
        return new zzbhs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbia zzbhyVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbhyVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                if (queryLocalInterface instanceof zzbia) {
                    zzbhyVar = (zzbia) queryLocalInterface;
                } else {
                    zzbhyVar = new zzbhy(readStrongBinder);
                }
            }
            zzaym.c(parcel);
            j5(zzbhyVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
