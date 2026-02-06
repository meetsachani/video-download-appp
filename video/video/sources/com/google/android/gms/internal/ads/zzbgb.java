package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbgb extends zzayk implements zzbgd {
    public zzbgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void D2(zzbho zzbhoVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float d() throws RemoteException {
        Parcel g1 = g1(2, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float e() throws RemoteException {
        Parcel g1 = g1(6, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float g() throws RemoteException {
        Parcel g1 = g1(5, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final com.google.android.gms.ads.internal.client.zzea h() throws RemoteException {
        Parcel g1 = g1(7, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final IObjectWrapper i() throws RemoteException {
        Parcel g1 = g1(4, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean k() throws RemoteException {
        Parcel g1 = g1(10, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean l() throws RemoteException {
        Parcel g1 = g1(8, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void s0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(3, O0);
    }
}
