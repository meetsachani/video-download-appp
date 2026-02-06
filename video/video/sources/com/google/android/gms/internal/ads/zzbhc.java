package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhc extends zzayk implements zzbhe {
    public zzbhc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final void K1(zzbgv zzbgvVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbgvVar);
        o1(1, O0);
    }
}
