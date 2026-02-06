package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbve extends zzayk implements IInterface {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void r4(String str, zzbuv zzbuvVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzaym.d(O0, zzbuvVar);
        o1(1, O0);
    }

    public final void s5(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbbVar);
        o1(2, O0);
    }
}
