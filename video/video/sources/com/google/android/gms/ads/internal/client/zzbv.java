package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbwd;

/* loaded from: classes2.dex */
public final class zzbv extends zzayk implements zzbx {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C1(zzbdq zzbdqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean C3(zzm zzmVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        Parcel g1 = g1(4, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void D4(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void G3(zzbtx zzbtxVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void J1(zzbwd zzbwdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L() throws RemoteException {
        o1(11, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L2(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void M3(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void P4(zzcl zzclVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzclVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void Q5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(44, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R7(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(22, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(zzcs zzcsVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzcsVar);
        o1(45, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void V() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, zzbnVar);
        o1(43, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean c0() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void c7(zzbtu zzbtuVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle f() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr g() throws RemoteException {
        Parcel g1 = g1(12, O0());
        zzr zzrVar = (zzr) zzaym.a(g1, zzr.CREATOR);
        g1.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk i() throws RemoteException {
        zzbk zzbiVar;
        Parcel g1 = g1(33, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzbk) {
                zzbiVar = (zzbk) queryLocalInterface;
            } else {
                zzbiVar = new zzbi(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void i7(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(34, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzcl j() throws RemoteException {
        zzcl zzcjVar;
        Parcel g1 = g1(32, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzcl) {
                zzcjVar = (zzcl) queryLocalInterface;
            } else {
                zzcjVar = new zzcj(readStrongBinder);
            }
        }
        g1.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzdx k() throws RemoteException {
        zzdx zzdvVar;
        Parcel g1 = g1(41, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzdx) {
                zzdvVar = (zzdx) queryLocalInterface;
            } else {
                zzdvVar = new zzdv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbaqVar);
        o1(40, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea l() throws RemoteException {
        zzea zzdyVar;
        Parcel g1 = g1(26, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzea) {
                zzdyVar = (zzea) queryLocalInterface;
            } else {
                zzdyVar = new zzdy(readStrongBinder);
            }
        }
        g1.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean l0() throws RemoteException {
        Parcel g1 = g1(46, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(zzdq zzdqVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdqVar);
        o1(42, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() throws RemoteException {
        Parcel g1 = g1(1, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(zzbk zzbkVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbkVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void o6(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String s() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String v() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void v6(zzfw zzfwVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfwVar);
        o1(29, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String x() throws RemoteException {
        Parcel g1 = g1(31, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(zzbh zzbhVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhVar);
        o1(20, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean z0() throws RemoteException {
        Parcel g1 = g1(23, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void z2(zzr zzrVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzrVar);
        o1(13, O0);
    }
}
