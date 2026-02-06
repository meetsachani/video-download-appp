package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbpk extends zzayl implements zzbpl {
    public zzbpk() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpl W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbpl) {
            return (zzbpl) queryLocalInterface;
        }
        return new zzbpj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzaym.c(parcel);
                    boolean p0 = p0(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(p0 ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzaym.c(parcel);
                    zzbrk Q = Q(readString2);
                    parcel2.writeNoException();
                    zzaym.f(parcel2, Q);
                }
            } else {
                String readString3 = parcel.readString();
                zzaym.c(parcel);
                boolean u = u(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(u ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzaym.c(parcel);
            zzbpo I = I(readString4);
            parcel2.writeNoException();
            zzaym.f(parcel2, I);
        }
        return true;
    }
}
