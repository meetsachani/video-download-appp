package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbam extends zzayl implements zzban {
    public zzbam() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzban W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        if (queryLocalInterface instanceof zzban) {
            return (zzban) queryLocalInterface;
        }
        return new zzbal(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbau zzbasVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx d = d();
                parcel2.writeNoException();
                zzaym.f(parcel2, d);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbar) {
                        zzbar zzbarVar = (zzbar) queryLocalInterface;
                    }
                }
                zzaym.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbasVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzbau) {
                        zzbasVar = (zzbau) queryLocalInterface2;
                    } else {
                        zzbasVar = new zzbas(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                k5(g1, zzbasVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx e = e();
                parcel2.writeNoException();
                zzaym.f(parcel2, e);
                return true;
            case 6:
                boolean g = zzaym.g(parcel);
                zzaym.c(parcel);
                j3(g);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq W7 = com.google.android.gms.ads.internal.client.zzdp.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                j4(W7);
                parcel2.writeNoException();
                return true;
            case 8:
                String g2 = g();
                parcel2.writeNoException();
                parcel2.writeString(g2);
                return true;
            default:
                return false;
        }
    }
}
