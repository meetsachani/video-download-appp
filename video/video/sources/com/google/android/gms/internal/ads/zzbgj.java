package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbgj extends zzayl implements zzbgk {
    public zzbgj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbgk W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof zzbgk) {
            return (zzbgk) queryLocalInterface;
        }
        return new zzbgi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgd zzbgbVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                C5(readString, g1);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                IObjectWrapper I = I(readString2);
                parcel2.writeNoException();
                zzaym.f(parcel2, I);
                return true;
            case 3:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                T6(g12);
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                parcel.readInt();
                zzaym.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                P1(g13);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                L0(g14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbgbVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof zzbgd) {
                        zzbgbVar = (zzbgd) queryLocalInterface;
                    } else {
                        zzbgbVar = new zzbgb(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                N5(zzbgbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                L6(g15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
