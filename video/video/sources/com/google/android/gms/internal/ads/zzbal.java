package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbal extends zzayk implements zzban {
    public zzbal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final com.google.android.gms.ads.internal.client.zzbx d() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final com.google.android.gms.ads.internal.client.zzdx e() throws RemoteException {
        Parcel g1 = g1(5, O0());
        com.google.android.gms.ads.internal.client.zzdx W7 = com.google.android.gms.ads.internal.client.zzdw.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final String g() throws RemoteException {
        Parcel g1 = g1(8, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void j3(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void j4(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdqVar);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void k5(IObjectWrapper iObjectWrapper, zzbau zzbauVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbauVar);
        o1(4, O0);
    }
}
