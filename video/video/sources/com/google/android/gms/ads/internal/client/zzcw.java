package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcw extends zzayk implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void B4(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(18, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void D6(float f) throws RemoteException {
        Parcel O0 = O0();
        O0.writeFloat(f);
        o1(2, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void I4(zzdk zzdkVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzdkVar);
        o1(16, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void P6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        o1(5, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void Q3(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void T7(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(4, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void b6(zzbpl zzbplVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbplVar);
        o1(11, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float d() throws RemoteException {
        Parcel g1 = g1(7, O0());
        float readFloat = g1.readFloat();
        g1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void d3(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(null);
        zzaym.f(O0, iObjectWrapper);
        o1(6, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String e() throws RemoteException {
        Parcel g1 = g1(9, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List g() throws RemoteException {
        Parcel g1 = g1(13, O0());
        ArrayList createTypedArrayList = g1.createTypedArrayList(zzblu.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void i() throws RemoteException {
        o1(15, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void k() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void n0(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(17, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean q() throws RemoteException {
        Parcel g1 = g1(8, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void r0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(10, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void u4(zzbmb zzbmbVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbmbVar);
        o1(12, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void y1(zzfr zzfrVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.d(O0, zzfrVar);
        o1(14, O0);
    }
}
