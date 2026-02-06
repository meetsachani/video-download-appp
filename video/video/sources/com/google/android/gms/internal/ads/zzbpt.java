package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbpt extends zzayl implements zzbpu {
    public zzbpt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbpu W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof zzbpu) {
            return (zzbpu) queryLocalInterface;
        }
        return new zzbps(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            boolean e = e();
            parcel2.writeNoException();
            int i3 = zzaym.b;
            parcel2.writeInt(e ? 1 : 0);
        } else {
            IObjectWrapper d = d();
            parcel2.writeNoException();
            zzaym.f(parcel2, d);
        }
        return true;
    }
}
