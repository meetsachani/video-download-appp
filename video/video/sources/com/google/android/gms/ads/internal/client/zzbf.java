package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;

/* loaded from: classes2.dex */
public final class zzbf extends zzayk implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void b() throws RemoteException {
        o1(1, O0());
    }
}
