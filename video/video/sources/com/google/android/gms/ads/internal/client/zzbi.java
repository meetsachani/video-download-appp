package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzbi extends zzayk implements zzbk {
    public zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void E(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(2, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void G(zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void c() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void f() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void g() throws RemoteException {
        o1(7, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void h() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void i() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void j() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void k() throws RemoteException {
        o1(9, O0());
    }
}
