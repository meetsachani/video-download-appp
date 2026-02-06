package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbhp extends zzayk implements zzbhr {
    public zzbhp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void N1(com.google.android.gms.ads.internal.client.zzbx zzbxVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbxVar);
        zzaym.f(O0, iObjectWrapper);
        o1(1, O0);
    }
}
