package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhs extends zzayk implements zzbhu {
    public zzbhs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhu
    public final void j5(zzbia zzbiaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbiaVar);
        o1(1, O0);
    }
}
