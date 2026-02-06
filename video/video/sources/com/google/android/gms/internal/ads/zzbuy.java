package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbuy extends zzayl implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvd zzbvdVar = null;
        zzbve zzbveVar = null;
        zzbvd zzbvdVar2 = null;
        zzbvd zzbvdVar3 = null;
        zzbvd zzbvdVar4 = null;
        switch (i) {
            case 1:
                zzbur zzburVar = (zzbur) zzaym.a(parcel, zzbur.CREATOR);
                zzaym.c(parcel);
                parcel2.writeNoException();
                zzaym.e(parcel2, null);
                return true;
            case 2:
                zzbur zzburVar2 = (zzbur) zzaym.a(parcel, zzbur.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbva) {
                        zzbva zzbvaVar = (zzbva) queryLocalInterface;
                    }
                }
                zzaym.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvl zzbvlVar = (zzbvl) zzaym.a(parcel, zzbvl.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzbvd) {
                        zzbvdVar = (zzbvd) queryLocalInterface2;
                    } else {
                        zzbvdVar = new zzbvb(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                V4(zzbvlVar, zzbvdVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvl zzbvlVar2 = (zzbvl) zzaym.a(parcel, zzbvl.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzbvd) {
                        zzbvdVar4 = (zzbvd) queryLocalInterface3;
                    } else {
                        zzbvdVar4 = new zzbvb(readStrongBinder3);
                    }
                }
                zzaym.c(parcel);
                w5(zzbvlVar2, zzbvdVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvl zzbvlVar3 = (zzbvl) zzaym.a(parcel, zzbvl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzbvd) {
                        zzbvdVar3 = (zzbvd) queryLocalInterface4;
                    } else {
                        zzbvdVar3 = new zzbvb(readStrongBinder4);
                    }
                }
                zzaym.c(parcel);
                t7(zzbvlVar3, zzbvdVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzbvd) {
                        zzbvdVar2 = (zzbvd) queryLocalInterface5;
                    } else {
                        zzbvdVar2 = new zzbvb(readStrongBinder5);
                    }
                }
                zzaym.c(parcel);
                Q2(readString, zzbvdVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuv zzbuvVar = (zzbuv) zzaym.a(parcel, zzbuv.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    if (queryLocalInterface6 instanceof zzbve) {
                        zzbveVar = (zzbve) queryLocalInterface6;
                    } else {
                        zzbveVar = new zzbve(readStrongBinder6);
                    }
                }
                zzaym.c(parcel);
                K4(zzbuvVar, zzbveVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
