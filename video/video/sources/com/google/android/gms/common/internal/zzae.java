package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzae extends com.google.android.gms.internal.common.zza implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq F6(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.c(V3, zzoVar);
        Parcel O0 = O0(8, V3);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) com.google.android.gms.internal.common.zzc.a(O0, com.google.android.gms.common.zzq.CREATOR);
        O0.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean a5(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.c(V3, zzsVar);
        com.google.android.gms.internal.common.zzc.e(V3, iObjectWrapper);
        Parcel O0 = O0(5, V3);
        boolean f = com.google.android.gms.internal.common.zzc.f(O0);
        O0.recycle();
        return f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean g() throws RemoteException {
        Parcel O0 = O0(9, V3());
        boolean f = com.google.android.gms.internal.common.zzc.f(O0);
        O0.recycle();
        return f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean i() throws RemoteException {
        Parcel O0 = O0(7, V3());
        boolean f = com.google.android.gms.internal.common.zzc.f(O0);
        O0.recycle();
        return f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq k6(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel V3 = V3();
        com.google.android.gms.internal.common.zzc.c(V3, zzoVar);
        Parcel O0 = O0(6, V3);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) com.google.android.gms.internal.common.zzc.a(O0, com.google.android.gms.common.zzq.CREATOR);
        O0.recycle();
        return zzqVar;
    }
}
