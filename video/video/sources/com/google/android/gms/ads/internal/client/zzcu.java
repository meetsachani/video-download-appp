package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes2.dex */
public abstract class zzcu extends zzayl implements zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcv asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof zzcv) {
            return (zzcv) queryLocalInterface;
        }
        return new zzct(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzbpl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaym.f(parcel2, adapterCreator);
        } else {
            zzex liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaym.e(parcel2, liteSdkVersion);
        }
        return true;
    }
}
