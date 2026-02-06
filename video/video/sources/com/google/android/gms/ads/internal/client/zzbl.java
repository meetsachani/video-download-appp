package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzbl extends zzayk implements zzbn {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void c() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void d1(zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(2, O0);
    }
}
