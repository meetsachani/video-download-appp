package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbtc extends zzayk implements zzbte {
    public zzbtc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void G7(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzaVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void Z0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void h() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void p6(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void s1(Intent intent) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, intent);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void v2(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        O0.writeStringArray(strArr);
        O0.writeIntArray(iArr);
        zzaym.f(O0, iObjectWrapper);
        o1(5, O0);
    }
}
