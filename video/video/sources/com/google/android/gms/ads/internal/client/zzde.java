package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;

/* loaded from: classes2.dex */
public final class zzde extends zzayk implements zzdg {
    public zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String d() throws RemoteException {
        Parcel g1 = g1(1, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String e() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }
}
