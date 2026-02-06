package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;

/* loaded from: classes2.dex */
public final class zzdl extends zzayk implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void d() throws RemoteException {
        o1(1, O0());
    }
}
