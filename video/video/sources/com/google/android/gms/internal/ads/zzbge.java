package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbge extends zzayk implements zzbgg {
    public zzbge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final double b() throws RemoteException {
        Parcel g1 = g1(3, O0());
        double readDouble = g1.readDouble();
        g1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final int c() throws RemoteException {
        Parcel g1 = g1(5, O0());
        int readInt = g1.readInt();
        g1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final Uri d() throws RemoteException {
        Parcel g1 = g1(2, O0());
        Uri uri = (Uri) zzaym.a(g1, Uri.CREATOR);
        g1.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final IObjectWrapper e() throws RemoteException {
        Parcel g1 = g1(1, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final int f() throws RemoteException {
        Parcel g1 = g1(4, O0());
        int readInt = g1.readInt();
        g1.recycle();
        return readInt;
    }
}
