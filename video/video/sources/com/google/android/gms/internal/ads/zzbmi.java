package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbmi extends zzayl implements zzbmj {
    public zzbmi() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbmm zzbmkVar;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return false;
                        }
                        zzbgd c = c();
                        parcel2.writeNoException();
                        zzaym.f(parcel2, c);
                        return true;
                    }
                    IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                    zzaym.c(parcel);
                    zze(g1);
                    parcel2.writeNoException();
                    return true;
                }
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmkVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof zzbmm) {
                        zzbmkVar = (zzbmm) queryLocalInterface;
                    } else {
                        zzbmkVar = new zzbmk(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                g6(g12, zzbmkVar);
                parcel2.writeNoException();
                return true;
            }
            f();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzea b = b();
        parcel2.writeNoException();
        zzaym.f(parcel2, b);
        return true;
    }
}
