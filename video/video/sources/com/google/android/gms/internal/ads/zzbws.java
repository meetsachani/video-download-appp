package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbws extends zzayl implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwn zzbwlVar;
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                g();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbwlVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof zzbwn) {
                        zzbwlVar = (zzbwn) queryLocalInterface;
                    } else {
                        zzbwlVar = new zzbwl(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                x1(zzbwlVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                W(readInt);
                break;
            case 5:
                zzaym.c(parcel);
                X3((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 6:
                e();
                break;
            case 7:
                d();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
