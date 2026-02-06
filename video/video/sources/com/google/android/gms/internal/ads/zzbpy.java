package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbpy extends zzayk implements zzbqa {
    public zzbpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void G4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(20, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean L() throws RemoteException {
        Parcel g1 = g1(18, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean R() throws RemoteException {
        Parcel g1 = g1(17, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void X5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(22, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final double d() throws RemoteException {
        Parcel g1 = g1(8, O0());
        double readDouble = g1.readDouble();
        g1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float e() throws RemoteException {
        Parcel g1 = g1(23, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float g() throws RemoteException {
        Parcel g1 = g1(25, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void g7(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        zzaym.f(O0, iObjectWrapper3);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float h() throws RemoteException {
        Parcel g1 = g1(24, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final Bundle i() throws RemoteException {
        Parcel g1 = g1(16, O0());
        Bundle bundle = (Bundle) zzaym.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final com.google.android.gms.ads.internal.client.zzea j() throws RemoteException {
        Parcel g1 = g1(11, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final zzbfz k() throws RemoteException {
        Parcel g1 = g1(12, O0());
        zzbfz W7 = zzbfy.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final zzbgg l() throws RemoteException {
        Parcel g1 = g1(5, O0());
        zzbgg W7 = zzbgf.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final IObjectWrapper m() throws RemoteException {
        Parcel g1 = g1(13, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final IObjectWrapper n() throws RemoteException {
        Parcel g1 = g1(14, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String o() throws RemoteException {
        Parcel g1 = g1(7, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final IObjectWrapper p() throws RemoteException {
        Parcel g1 = g1(15, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final List q() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList b = zzaym.b(g1);
        g1.recycle();
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String r() throws RemoteException {
        Parcel g1 = g1(4, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String s() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String t() throws RemoteException {
        Parcel g1 = g1(9, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String v() throws RemoteException {
        Parcel g1 = g1(10, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String x() throws RemoteException {
        Parcel g1 = g1(6, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void y() throws RemoteException {
        o1(19, O0());
    }
}
