package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbwp extends zzayl implements zzbwq {
    public zzbwp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwq W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbwq) {
            return (zzbwq) queryLocalInterface;
        }
        return new zzbwo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwx zzbwxVar = null;
        zzbwx zzbwxVar2 = null;
        zzbwy zzbwyVar = null;
        zzbwt zzbwtVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbwx) {
                        zzbwxVar = (zzbwx) queryLocalInterface;
                    } else {
                        zzbwxVar = new zzbwv(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                f7(zzmVar, zzbwxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbwt) {
                        zzbwtVar = (zzbwt) queryLocalInterface2;
                    } else {
                        zzbwtVar = new zzbwr(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                e5(zzbwtVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean o2 = o();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(o2 ? 1 : 0);
                return true;
            case 4:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 5:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                d0(g1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbwy) {
                        zzbwyVar = (zzbwy) queryLocalInterface3;
                    } else {
                        zzbwyVar = new zzbwy(readStrongBinder3);
                    }
                }
                zzaym.c(parcel);
                v1(zzbwyVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaym.c(parcel);
                d5((zzbxe) zzaym.a(parcel, zzbxe.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn W7 = com.google.android.gms.ads.internal.client.zzdm.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                H4(W7);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle b = b();
                parcel2.writeNoException();
                zzaym.e(parcel2, b);
                return true;
            case 10:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                boolean g = zzaym.g(parcel);
                zzaym.c(parcel);
                A6(g12, g);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwn f = f();
                parcel2.writeNoException();
                zzaym.f(parcel2, f);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx c = c();
                parcel2.writeNoException();
                zzaym.f(parcel2, c);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq W72 = com.google.android.gms.ads.internal.client.zzdp.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                r3(W72);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbwx) {
                        zzbwxVar2 = (zzbwx) queryLocalInterface4;
                    } else {
                        zzbwxVar2 = new zzbwv(readStrongBinder4);
                    }
                }
                zzaym.c(parcel);
                S6(zzmVar2, zzbwxVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean g2 = zzaym.g(parcel);
                zzaym.c(parcel);
                v3(g2);
                parcel2.writeNoException();
                return true;
            case 16:
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            default:
                return false;
        }
    }
}
