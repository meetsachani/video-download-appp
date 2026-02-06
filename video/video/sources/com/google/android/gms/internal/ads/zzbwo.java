package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbwo extends zzayk implements zzbwq {
    public zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void A6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void H4(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdnVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void S6(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, zzbwxVar);
        o1(14, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final Bundle b() throws RemoteException {
        Parcel g1 = g1(9, O0());
        Bundle bundle = (Bundle) zzaym.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final com.google.android.gms.ads.internal.client.zzdx c() throws RemoteException {
        Parcel g1 = g1(12, O0());
        com.google.android.gms.ads.internal.client.zzdx W7 = com.google.android.gms.ads.internal.client.zzdw.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String d() throws RemoteException {
        Parcel g1 = g1(16, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void d5(zzbxe zzbxeVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbxeVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String e() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void e5(zzbwt zzbwtVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbwtVar);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final zzbwn f() throws RemoteException {
        zzbwn zzbwlVar;
        Parcel g1 = g1(11, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbwn) {
                zzbwlVar = (zzbwn) queryLocalInterface;
            } else {
                zzbwlVar = new zzbwl(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void f7(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, zzbwxVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final boolean o() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void r3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdqVar);
        o1(13, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void v1(zzbwy zzbwyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void v3(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(15, O0);
    }
}
