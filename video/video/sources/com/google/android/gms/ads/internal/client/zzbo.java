package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzbo extends zzayk implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void Q4(zzm zzmVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        O0.writeInt(i);
        o1(5, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void U4(zzm zzmVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String d() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String e() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean i() throws RemoteException {
        Parcel g1 = g1(3, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
