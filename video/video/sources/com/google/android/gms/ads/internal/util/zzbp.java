package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzbp extends zzayk implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(2, O0);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        O0.writeString(str2);
        Parcel g1 = g1(1, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzaVar);
        Parcel g1 = g1(3, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
