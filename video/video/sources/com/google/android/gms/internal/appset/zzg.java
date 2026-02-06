package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void o1(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) throws RemoteException {
        Parcel O0 = O0();
        zzc.b(O0, zzaVar);
        zzc.c(O0, zzfVar);
        g1(1, O0);
    }
}
