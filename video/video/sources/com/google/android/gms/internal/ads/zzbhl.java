package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhl extends zzayk implements zzbhn {
    public zzbhl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void c4(zzbha zzbhaVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbhaVar);
        o1(1, O0);
    }
}
