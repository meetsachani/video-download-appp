package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbwh extends zzayl implements zzbwi {
    public zzbwh() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbwi W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzbwi) {
            return (zzbwi) queryLocalInterface;
        }
        return new zzbwg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                I7(g1);
                break;
            case 2:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                T4(g12, readInt);
                break;
            case 3:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                i1(g13);
                break;
            case 4:
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                s0(g14);
                break;
            case 5:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                E0(g15);
                break;
            case 6:
                IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                R0(g16);
                break;
            case 7:
                zzaym.c(parcel);
                M1(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (zzbwj) zzaym.a(parcel, zzbwj.CREATOR));
                break;
            case 8:
                IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                zze(g17);
                break;
            case 9:
                IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaym.c(parcel);
                b3(g18, readInt2);
                break;
            case 10:
                IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                H5(g19);
                break;
            case 11:
                IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                Q1(g110);
                break;
            case 12:
                Bundle bundle = (Bundle) zzaym.a(parcel, Bundle.CREATOR);
                zzaym.c(parcel);
                break;
            case 13:
                IObjectWrapper g111 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                d0(g111);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
