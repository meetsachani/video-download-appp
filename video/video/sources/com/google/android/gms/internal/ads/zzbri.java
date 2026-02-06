package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbri extends zzayk implements zzbrk {
    public zzbri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean F0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(15, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void H7(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbqyVar);
        zzaym.f(O0, zzbprVar);
        zzaym.d(O0, zzrVar);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void K6(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpr zzbprVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbqyVar);
        zzaym.f(O0, zzbprVar);
        zzaym.d(O0, zzrVar);
        o1(13, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void M0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(19, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void N2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbrhVar);
        zzaym.f(O0, zzbprVar);
        o1(20, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean O(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(24, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void P5(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbreVar);
        zzaym.f(O0, zzbprVar);
        o1(18, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.ads.internal.client.zzea d() throws RemoteException {
        Parcel g1 = g1(5, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz e() throws RemoteException {
        Parcel g1 = g1(2, O0());
        zzbrz zzbrzVar = (zzbrz) zzaym.a(g1, zzbrz.CREATOR);
        g1.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final zzbrz g() throws RemoteException {
        Parcel g1 = g1(3, O0());
        zzbrz zzbrzVar = (zzbrz) zzaym.a(g1, zzbrz.CREATOR);
        g1.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean m4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(17, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void q2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbrbVar);
        zzaym.f(O0, zzbprVar);
        o1(14, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void t4(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqv zzbqvVar, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbqvVar);
        zzaym.f(O0, zzbprVar);
        o1(23, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void w2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpr zzbprVar, zzbfv zzbfvVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbreVar);
        zzaym.f(O0, zzbprVar);
        zzaym.d(O0, zzbfvVar);
        o1(22, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void w6(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.d(O0, zzmVar);
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbrhVar);
        zzaym.f(O0, zzbprVar);
        o1(16, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void x5(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbrn zzbrnVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        zzaym.d(O0, bundle);
        zzaym.d(O0, bundle2);
        zzaym.d(O0, zzrVar);
        zzaym.f(O0, zzbrnVar);
        o1(1, O0);
    }
}
