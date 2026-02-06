package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzdo extends zzayk implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void a7(zzt zztVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zztVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean e() throws RemoteException {
        Parcel g1 = g1(2, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
