package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbgo extends zzayk implements zzbgq {
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void c3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void f() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void p4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(1, O0);
    }
}
