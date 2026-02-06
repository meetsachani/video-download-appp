package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes2.dex */
public final class zzct extends zzayk implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbpl getAdapterCreator() throws RemoteException {
        Parcel g1 = g1(2, O0());
        zzbpl W7 = zzbpk.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzex getLiteSdkVersion() throws RemoteException {
        Parcel g1 = g1(1, O0());
        zzex zzexVar = (zzex) zzaym.a(g1, zzex.CREATOR);
        g1.recycle();
        return zzexVar;
    }
}
