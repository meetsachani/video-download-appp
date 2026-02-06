package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbfy extends zzayl implements zzbfz {
    public zzbfy() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbfz W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzbfz) {
            return (zzbfz) queryLocalInterface;
        }
        return new zzbfx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            List h = h();
            parcel2.writeNoException();
            parcel2.writeList(h);
            return true;
        }
        String g = g();
        parcel2.writeNoException();
        parcel2.writeString(g);
        return true;
    }
}
