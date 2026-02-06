package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbbh extends zzayk implements IInterface {
    public zzbbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbbc B5(zzbbf zzbbfVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbbfVar);
        Parcel g1 = g1(2, O0);
        zzbbc zzbbcVar = (zzbbc) zzaym.a(g1, zzbbc.CREATOR);
        g1.recycle();
        return zzbbcVar;
    }

    public final zzbbc h5(zzbbf zzbbfVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbbfVar);
        Parcel g1 = g1(1, O0);
        zzbbc zzbbcVar = (zzbbc) zzaym.a(g1, zzbbc.CREATOR);
        g1.recycle();
        return zzbbcVar;
    }

    public final long r4(zzbbf zzbbfVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzbbfVar);
        Parcel g1 = g1(3, O0);
        long readLong = g1.readLong();
        g1.recycle();
        return readLong;
    }
}
