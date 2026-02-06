package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzdp extends zzayl implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdq W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzdq) {
            return (zzdq) queryLocalInterface;
        }
        return new zzdo(iBinder);
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
            zzaym.c(parcel);
            a7((zzt) zzaym.a(parcel, zzt.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
