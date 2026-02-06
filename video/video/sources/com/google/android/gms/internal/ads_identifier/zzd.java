package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean a2(boolean z) throws RemoteException {
        Parcel O0 = O0();
        zzc.a(O0, true);
        Parcel g1 = g1(2, O0);
        boolean b = zzc.b(g1);
        g1.recycle();
        return b;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String c() throws RemoteException {
        Parcel g1 = g1(1, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean f() throws RemoteException {
        Parcel g1 = g1(6, O0());
        boolean b = zzc.b(g1);
        g1.recycle();
        return b;
    }
}
