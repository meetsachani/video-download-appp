package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbgr extends zzayk implements zzbgt {
    public zzbgr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final IBinder G1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        zzaym.f(O0, iObjectWrapper3);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        g1.recycle();
        return readStrongBinder;
    }
}
