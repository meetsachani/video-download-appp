package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbtj extends zzayk implements zzbtl {
    public zzbtj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void G5(int i, int i2, Intent intent) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        O0.writeInt(i2);
        zzaym.d(O0, intent);
        o1(12, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void K2(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        O0.writeStringArray(strArr);
        O0.writeIntArray(iArr);
        o1(15, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean P() throws RemoteException {
        Parcel g1 = g1(11, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void b0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(13, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void h1(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        Parcel g1 = g1(6, O0);
        if (g1.readInt() != 0) {
            bundle.readFromParcel(g1);
        }
        g1.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void i() throws RemoteException {
        o1(10, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void m() throws RemoteException {
        o1(8, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void n3(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, bundle);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void p() throws RemoteException {
        o1(5, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void q() throws RemoteException {
        o1(14, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void r() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void t() throws RemoteException {
        o1(7, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void v() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void x() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void y() throws RemoteException {
        o1(9, O0());
    }
}
