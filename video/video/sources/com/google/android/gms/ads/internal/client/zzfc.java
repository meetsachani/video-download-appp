package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfc extends zzbp {
    public final /* synthetic */ zzfe X;

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void Q4(zzm zzmVar, int i) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzfb(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void U4(zzm zzmVar) throws RemoteException {
        Q4(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    @InterfaceC11300zs1
    public final String d() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    @InterfaceC11300zs1
    public final String e() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean i() throws RemoteException {
        return false;
    }
}
