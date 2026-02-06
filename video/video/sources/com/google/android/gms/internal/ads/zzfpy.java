package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzfpy extends zzayk implements zzfqa {
    public zzfpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void A(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void J0(int[] iArr) throws RemoteException {
        Parcel O0 = O0();
        O0.writeIntArray(null);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void N(int i) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void X0(byte[] bArr) throws RemoteException {
        Parcel O0 = O0();
        O0.writeByteArray(bArr);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void e() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final void o4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        O0.writeString(null);
        o1(8, O0);
    }
}
