package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbwm extends zzayl implements zzbwn {
    public zzbwm() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzbwn W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        if (queryLocalInterface instanceof zzbwn) {
            return (zzbwn) queryLocalInterface;
        }
        return new zzbwl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int d = d();
            parcel2.writeNoException();
            parcel2.writeInt(d);
        } else {
            String e = e();
            parcel2.writeNoException();
            parcel2.writeString(e);
        }
        return true;
    }
}
