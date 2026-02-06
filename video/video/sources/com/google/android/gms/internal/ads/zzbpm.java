package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbpm extends zzayk implements zzbpo {
    public zzbpm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void A4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void B6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        zzaym.f(O0, zzbprVar);
        o1(28, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void D() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void F1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.f(O0, zzbprVar);
        o1(35, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpw H() throws RemoteException {
        zzbpw zzbpwVar;
        Parcel g1 = g1(15, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzbpw) {
                zzbpwVar = (zzbpw) queryLocalInterface;
            } else {
                zzbpwVar = new zzbpw(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void I0(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(25, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void I5(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        zzaym.f(O0, zzbprVar);
        o1(32, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void J() throws RemoteException {
        o1(12, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void J6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(39, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean K() throws RemoteException {
        Parcel g1 = g1(22, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean M() throws RemoteException {
        Parcel g1 = g1(13, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void M4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar, zzbfv zzbfvVar, List list) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.f(O0, zzbprVar);
        zzaym.d(O0, zzbfvVar);
        O0.writeStringList(list);
        o1(14, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void M6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        zzaym.f(O0, zzbprVar);
        o1(38, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void Q7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(37, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void S3(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar, List list) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbwiVar);
        O0.writeStringList(list);
        o1(23, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpx T() throws RemoteException {
        zzbpx zzbpxVar;
        Parcel g1 = g1(16, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbpx) {
                zzbpxVar = (zzbpx) queryLocalInterface;
            } else {
                zzbpxVar = new zzbpx(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void U() throws RemoteException {
        o1(9, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void U7(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.f(O0, zzbprVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void c2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        O0.writeString(str2);
        zzaym.f(O0, zzbprVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle d() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void d2(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle e() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle g() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final com.google.android.gms.ads.internal.client.zzea h() throws RemoteException {
        Parcel g1 = g1(26, O0());
        com.google.android.gms.ads.internal.client.zzea W7 = com.google.android.gms.ads.internal.client.zzdz.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void h0() throws RemoteException {
        o1(8, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbha i() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpu j() throws RemoteException {
        zzbpu zzbpsVar;
        Parcel g1 = g1(36, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzbpu) {
                zzbpsVar = (zzbpu) queryLocalInterface;
            } else {
                zzbpsVar = new zzbps(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void j2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwi zzbwiVar, String str2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzmVar);
        O0.writeString(null);
        zzaym.f(O0, zzbwiVar);
        O0.writeString(str2);
        o1(10, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbqa k() throws RemoteException {
        zzbqa zzbpyVar;
        Parcel g1 = g1(27, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbqa) {
                zzbpyVar = (zzbqa) queryLocalInterface;
            } else {
                zzbpyVar = new zzbpy(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void k4(IObjectWrapper iObjectWrapper, zzbly zzblyVar, List list) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzblyVar);
        O0.writeTypedList(list);
        o1(31, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrz l() throws RemoteException {
        Parcel g1 = g1(33, O0());
        zzbrz zzbrzVar = (zzbrz) zzaym.a(g1, zzbrz.CREATOR);
        g1.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrz m() throws RemoteException {
        Parcel g1 = g1(34, O0());
        zzbrz zzbrzVar = (zzbrz) zzaym.a(g1, zzbrz.CREATOR);
        g1.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final IObjectWrapper n() throws RemoteException {
        Parcel g1 = g1(2, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void o7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(30, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void p() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void s6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void t6(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void w3(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzmVar);
        O0.writeString(str);
        o1(11, O0);
    }
}
