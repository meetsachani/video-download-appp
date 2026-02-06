package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbty extends zzayk implements zzbua {
    public zzbty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void A0(List list) throws RemoteException {
        Parcel O0 = O0();
        O0.writeTypedList(list);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(2, O0);
    }
}
