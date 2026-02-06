package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbpq extends zzayl implements zzbpr {
    public zzbpq() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpr W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzbpr) {
            return (zzbpr) queryLocalInterface;
        }
        return new zzbpp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                d();
                break;
            case 2:
                e();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                A(readInt);
                break;
            case 4:
                n();
                break;
            case 5:
                o();
                break;
            case 6:
                p();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzaym.c(parcel);
                break;
            case 8:
                m();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                b7(readString, readString2);
                break;
            case 10:
                zzbgz.W7(parcel.readStrongBinder());
                parcel.readString();
                zzaym.c(parcel);
                break;
            case 11:
                B();
                break;
            case 12:
                parcel.readString();
                zzaym.c(parcel);
                break;
            case 13:
                C();
                break;
            case 14:
                zzaym.c(parcel);
                N6((zzbwj) zzaym.a(parcel, zzbwj.CREATOR));
                break;
            case 15:
                y();
                break;
            case 16:
                zzbwn W7 = zzbwm.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                N4(W7);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzaym.c(parcel);
                j0(readInt2);
                break;
            case 18:
                q();
                break;
            case 19:
                Bundle bundle = (Bundle) zzaym.a(parcel, Bundle.CREATOR);
                zzaym.c(parcel);
                break;
            case 20:
                w();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzaym.c(parcel);
                g0(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzaym.c(parcel);
                O1(readInt3, readString4);
                break;
            case 23:
                zzaym.c(parcel);
                Y1((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 24:
                zzaym.c(parcel);
                e3((com.google.android.gms.ads.internal.client.zze) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 25:
                t();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
