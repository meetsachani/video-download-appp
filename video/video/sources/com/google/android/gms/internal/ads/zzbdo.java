package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbdo extends zzayk implements zzbdq {
    public zzbdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdq
    public final void h7(zzbdn zzbdnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbdnVar);
        o1(1, O0);
    }
}
