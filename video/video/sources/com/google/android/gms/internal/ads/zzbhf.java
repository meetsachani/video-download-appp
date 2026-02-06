package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhf extends zzayk implements zzbhh {
    public zzbhf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void x7(zzbgx zzbgxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbgxVar);
        o1(1, O0);
    }
}
