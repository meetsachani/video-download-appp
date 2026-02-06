package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbtd extends zzayl implements zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbte W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzbte) {
            return (zzbte) queryLocalInterface;
        }
        return new zzbtc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzaym.c(parcel);
                s1((Intent) zzaym.a(parcel, Intent.CREATOR));
                break;
            case 2:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                p6(g1, readString, readString2);
                break;
            case 3:
                h();
                break;
            case 4:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                Z0(g12);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                v2(createStringArray, createIntArray, g13);
                break;
            case 6:
                zzaym.c(parcel);
                G7(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.offline.buffering.zza) zzaym.a(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
