package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbqw extends zzayk implements zzbqy {
    public zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzeVar);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void S4(zzbpu zzbpuVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbpuVar);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void Z0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString("Adapter returned null.");
        o1(2, O0);
    }
}
