package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzfsa extends zzayk implements zzfsc {
    public zzfsa(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void R6(String str, Bundle bundle, zzfse zzfseVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzaym.d(O0, bundle);
        zzaym.f(O0, zzfseVar);
        V3(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void m5(Bundle bundle, zzfse zzfseVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        zzaym.f(O0, zzfseVar);
        V3(3, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void m6(Bundle bundle, zzfse zzfseVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        zzaym.f(O0, zzfseVar);
        V3(2, O0);
    }
}
