package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbpx extends zzayk implements IInterface {
    public zzbpx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final boolean B() throws RemoteException {
        Parcel g1 = g1(11, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    public final zzbgg B5() throws RemoteException {
        Parcel g1 = g1(5, O0());
        zzbgg W7 = zzbgf.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    public final IObjectWrapper S7() throws RemoteException {
        Parcel g1 = g1(21, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    public final List V7() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList b = zzaym.b(g1);
        g1.recycle();
        return b;
    }

    public final void W7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(9, O0);
    }

    public final void X7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(10, O0);
    }

    public final void Y7(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        zzaym.f(O0, iObjectWrapper3);
        o1(22, O0);
    }

    public final void Z7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(14, O0);
    }

    public final Bundle d() throws RemoteException {
        Parcel g1 = g1(13, O0());
        Bundle bundle = (Bundle) zzaym.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle;
    }

    public final zzbfz h5() throws RemoteException {
        Parcel g1 = g1(19, O0());
        zzbfz W7 = zzbfy.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    public final IObjectWrapper i() throws RemoteException {
        Parcel g1 = g1(15, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    public final String l() throws RemoteException {
        Parcel g1 = g1(7, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    public final String m() throws RemoteException {
        Parcel g1 = g1(4, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    public final String n() throws RemoteException {
        Parcel g1 = g1(6, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    public final String p() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    public final boolean q() throws RemoteException {
        Parcel g1 = g1(12, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    public final com.google.android.gms.ads.internal.client.zzea r4() throws RemoteException {
        Parcel g1 = g1(16, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    public final IObjectWrapper s7() throws RemoteException {
        Parcel g1 = g1(20, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    public final void x() throws RemoteException {
        o1(8, O0());
    }
}
