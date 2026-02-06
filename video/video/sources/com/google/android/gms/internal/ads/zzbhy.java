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
public final class zzbhy extends zzayk implements zzbia {
    public zzbhy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void B() throws RemoteException {
        o1(22, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean D() throws RemoteException {
        Parcel g1 = g1(24, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void F() throws RemoteException {
        o1(27, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void J2(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdgVar);
        o1(25, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void L() throws RemoteException {
        o1(28, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean P() throws RemoteException {
        Parcel g1 = g1(30, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void Z6(zzbhx zzbhxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhxVar);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final double d() throws RemoteException {
        Parcel g1 = g1(8, O0());
        double readDouble = g1.readDouble();
        g1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final Bundle e() throws RemoteException {
        Parcel g1 = g1(20, O0());
        Bundle bundle = (Bundle) zzaym.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void f6(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        o1(33, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final com.google.android.gms.ads.internal.client.zzdx g() throws RemoteException {
        Parcel g1 = g1(31, O0());
        com.google.android.gms.ads.internal.client.zzdx W7 = com.google.android.gms.ads.internal.client.zzdw.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final com.google.android.gms.ads.internal.client.zzea h() throws RemoteException {
        Parcel g1 = g1(11, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbfz i() throws RemoteException {
        zzbfz zzbfxVar;
        Parcel g1 = g1(14, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbfz) {
                zzbfxVar = (zzbfz) queryLocalInterface;
            } else {
                zzbfxVar = new zzbfx(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbgd j() throws RemoteException {
        zzbgd zzbgbVar;
        Parcel g1 = g1(29, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbgd) {
                zzbgbVar = (zzbgd) queryLocalInterface;
            } else {
                zzbgbVar = new zzbgb(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final zzbgg k() throws RemoteException {
        zzbgg zzbgeVar;
        Parcel g1 = g1(5, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbgg) {
                zzbgeVar = (zzbgg) queryLocalInterface;
            } else {
                zzbgeVar = new zzbge(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final IObjectWrapper l() throws RemoteException {
        Parcel g1 = g1(19, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final IObjectWrapper m() throws RemoteException {
        Parcel g1 = g1(18, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String n() throws RemoteException {
        Parcel g1 = g1(7, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String o() throws RemoteException {
        Parcel g1 = g1(6, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final boolean o3(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        Parcel g1 = g1(16, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String p() throws RemoteException {
        Parcel g1 = g1(4, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void p5(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdqVar);
        o1(32, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final List q() throws RemoteException {
        Parcel g1 = g1(23, O0());
        ArrayList b = zzaym.b(g1);
        g1.recycle();
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String r() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String s() throws RemoteException {
        Parcel g1 = g1(10, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final List t() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList b = zzaym.b(g1);
        g1.recycle();
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String v() throws RemoteException {
        Parcel g1 = g1(9, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void w4(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        o1(15, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final String x() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void y() throws RemoteException {
        o1(13, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void y4(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdcVar);
        o1(26, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbia
    public final void z5(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        o1(17, O0);
    }
}
