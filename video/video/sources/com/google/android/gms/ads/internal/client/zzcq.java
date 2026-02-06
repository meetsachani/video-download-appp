package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzcq extends zzayk implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void D0(zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void b() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void c() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void d() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void e() throws RemoteException {
        o1(2, O0());
    }
}
