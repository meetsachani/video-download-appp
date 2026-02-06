package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzayn extends zzayk implements zzayp {
    public zzayn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void A(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void F3(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString("GMA_SDK");
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void J0(int[] iArr) throws RemoteException {
        Parcel O0 = O0();
        O0.writeIntArray(null);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void N(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(0);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void X0(byte[] bArr) throws RemoteException {
        Parcel O0 = O0();
        O0.writeByteArray(bArr);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void e() throws RemoteException {
        o1(3, O0());
    }
}
