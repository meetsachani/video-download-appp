package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbps extends zzayk implements zzbpu {
    public zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final IObjectWrapper d() throws RemoteException {
        Parcel g1 = g1(1, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean e() throws RemoteException {
        Parcel g1 = g1(2, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
