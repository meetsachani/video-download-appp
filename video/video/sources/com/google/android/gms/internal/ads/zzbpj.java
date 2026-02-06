package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbpj extends zzayk implements zzbpl {
    public zzbpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final zzbpo I(String str) throws RemoteException {
        zzbpo zzbpmVar;
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzbpo) {
                zzbpmVar = (zzbpo) queryLocalInterface;
            } else {
                zzbpmVar = new zzbpm(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final zzbrk Q(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(3, O0);
        zzbrk W7 = zzbrj.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean p0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(4, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(2, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
