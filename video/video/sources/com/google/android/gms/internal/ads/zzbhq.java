package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbhq extends zzayl implements zzbhr {
    public zzbhq() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbhr W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof zzbhr) {
            return (zzbhr) queryLocalInterface;
        }
        return new zzbhp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzbx W7 = com.google.android.gms.ads.internal.client.zzbw.W7(parcel.readStrongBinder());
            IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            zzaym.c(parcel);
            N1(W7, g1);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
