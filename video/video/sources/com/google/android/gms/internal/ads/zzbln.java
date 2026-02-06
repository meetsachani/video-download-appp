package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbln extends zzayk implements IInterface {
    public zzbln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void r4(zzblh zzblhVar, zzblm zzblmVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzblhVar);
        zzaym.f(O0, zzblmVar);
        V3(2, O0);
    }
}
