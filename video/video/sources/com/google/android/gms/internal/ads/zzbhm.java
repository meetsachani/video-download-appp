package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbhm extends zzayl implements zzbhn {
    public zzbhm() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbhn W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (queryLocalInterface instanceof zzbhn) {
            return (zzbhn) queryLocalInterface;
        }
        return new zzbhl(iBinder);
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
            zzaym.c(parcel);
            c4(zzbgyVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
