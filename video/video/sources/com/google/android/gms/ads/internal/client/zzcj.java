package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;

/* loaded from: classes2.dex */
public final class zzcj extends zzayk implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void n1(String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        o1(1, O0);
    }
}
