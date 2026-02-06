package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzfph extends zzayk implements IInterface {
    public zzfph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void B5(zzfpa zzfpaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfpaVar);
        o1(2, O0);
    }

    public final zzfpo h5(zzfpm zzfpmVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfpmVar);
        Parcel g1 = g1(3, O0);
        zzfpo zzfpoVar = (zzfpo) zzaym.a(g1, zzfpo.CREATOR);
        g1.recycle();
        return zzfpoVar;
    }

    public final zzfpf r4(zzfpd zzfpdVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfpdVar);
        Parcel g1 = g1(1, O0);
        zzfpf zzfpfVar = (zzfpf) zzaym.a(g1, zzfpf.CREATOR);
        g1.recycle();
        return zzfpfVar;
    }
}
