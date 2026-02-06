package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmp;

/* loaded from: classes2.dex */
public final class zzbr extends zzayk implements zzbt {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void B2(zzbhe zzbheVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void E7(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void K3(zzbk zzbkVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbkVar);
        o1(2, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void L7(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void M2(zzbfv zzbfvVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbfvVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void N7(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, adManagerAdViewOptions);
        o1(15, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void W2(zzbmp zzbmpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void Y3(String str, zzbhn zzbhnVar, zzbhk zzbhkVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzaym.f(O0, zzbhnVar);
        zzaym.f(O0, zzbhkVar);
        o1(5, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq d() throws RemoteException {
        zzbq zzboVar;
        Parcel g1 = g1(1, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbq) {
                zzboVar = (zzbq) queryLocalInterface;
            } else {
                zzboVar = new zzbo(readStrongBinder);
            }
        }
        g1.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void n7(zzbhr zzbhrVar, zzr zzrVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhrVar);
        zzaym.d(O0, zzrVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void p7(zzbhh zzbhhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void q7(zzbhu zzbhuVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhuVar);
        o1(10, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void v4(zzbmg zzbmgVar) throws RemoteException {
        throw null;
    }
}
