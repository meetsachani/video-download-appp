package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;

/* loaded from: classes2.dex */
public final class zzbz extends zzayk implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void d() throws RemoteException {
        o1(1, O0());
    }
}
