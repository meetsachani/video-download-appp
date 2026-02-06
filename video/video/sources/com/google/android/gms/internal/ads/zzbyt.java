package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbyt extends zzayk implements zzbyv {
    public zzbyt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void E3(IObjectWrapper iObjectWrapper, zzbyz zzbyzVar, zzbys zzbysVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzbyzVar);
        zzaym.f(O0, zzbysVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void O3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void R3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void V1(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final IObjectWrapper V2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        O0.writeString(str);
        zzaym.f(O0, iObjectWrapper3);
        Parcel g1 = g1(11, O0);
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void a6(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void b0(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void s0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(8, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void s4(zzbud zzbudVar) throws RemoteException {
        throw null;
    }
}
