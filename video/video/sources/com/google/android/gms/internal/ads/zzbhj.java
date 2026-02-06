package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbhj extends zzayl implements zzbhk {
    public zzbhj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbhk W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzbhk) {
            return (zzbhk) queryLocalInterface;
        }
        return new zzbhi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbha zzbgyVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbgyVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof zzbha) {
                    zzbgyVar = (zzbha) queryLocalInterface;
                } else {
                    zzbgyVar = new zzbgy(readStrongBinder);
                }
            }
            String readString = parcel.readString();
            zzaym.c(parcel);
            T3(zzbgyVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
