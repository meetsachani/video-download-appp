package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void L5(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void Y2(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel V3 = V3();
        V3.writeInt(i);
        V3.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.c(V3, bundle);
        g1(1, V3);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void z7(int i, IBinder iBinder, zzk zzkVar) throws RemoteException {
        throw null;
    }
}
