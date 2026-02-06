package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbao extends zzayk implements zzbaq {
    public zzbao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void k1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void x4(zzban zzbanVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbanVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void z(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(2, O0);
    }
}
