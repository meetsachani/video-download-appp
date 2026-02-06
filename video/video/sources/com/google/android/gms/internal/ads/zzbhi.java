package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhi extends zzayk implements zzbhk {
    public zzbhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void T3(zzbha zzbhaVar, String str) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhaVar);
        O0.writeString(str);
        o1(1, O0);
    }
}
