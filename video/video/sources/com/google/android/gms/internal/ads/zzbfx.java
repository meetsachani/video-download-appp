package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbfx extends zzayk implements zzbfz {
    public zzbfx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final String g() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final List h() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList b = zzaym.b(g1);
        g1.recycle();
        return b;
    }
}
