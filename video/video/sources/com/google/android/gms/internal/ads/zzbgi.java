package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbgi extends zzayk implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void C5(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzaym.f(O0, iObjectWrapper);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final IObjectWrapper I(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(2, O0);
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void L0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void L6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(9, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void N5(zzbgd zzbgdVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbgdVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void P1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void T6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void c() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void p2(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeInt(i);
        o1(5, O0);
    }
}
