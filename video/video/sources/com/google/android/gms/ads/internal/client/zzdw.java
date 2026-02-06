package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzdw extends zzayl implements zzdx {
    public zzdw() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdx W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzdx) {
            return (zzdx) queryLocalInterface;
        }
        return new zzdv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 2:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 3:
                List j = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(j);
                return true;
            case 4:
                zzv e = e();
                parcel2.writeNoException();
                zzaym.e(parcel2, e);
                return true;
            case 5:
                Bundle d = d();
                parcel2.writeNoException();
                zzaym.e(parcel2, d);
                return true;
            case 6:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            default:
                return false;
        }
    }
}
