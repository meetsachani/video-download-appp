package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfm extends com.google.android.gms.internal.measurement.zzbu implements zzfk {
    public zzfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final zzam A3(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        Parcel g1 = g1(21, O0);
        zzam zzamVar = (zzam) com.google.android.gms.internal.measurement.zzbw.a(g1, zzam.CREATOR);
        g1.recycle();
        return zzamVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void F4(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(18, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final String J5(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        Parcel g1 = g1(11, O0);
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void J7(zzad zzadVar, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzadVar);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(12, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void K7(zznc zzncVar, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzncVar);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(2, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void O2(long j, String str, String str2, String str3) throws RemoteException {
        Parcel O0 = O0();
        O0.writeLong(j);
        O0.writeString(str);
        O0.writeString(str2);
        O0.writeString(str3);
        o1(10, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zzad> R2(String str, String str2, String str3) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        O0.writeString(str3);
        Parcel g1 = g1(17, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zzad.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void W5(zzbg zzbgVar, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzbgVar);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zznc> X1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        O0.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.e(O0, z);
        Parcel g1 = g1(15, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zznc.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zznc> e7(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.e(O0, z);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        Parcel g1 = g1(14, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zznc.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zzmh> f4(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.d(O0, bundle);
        Parcel g1 = g1(24, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zzmh.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final byte[] i6(zzbg zzbgVar, String str) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzbgVar);
        O0.writeString(str);
        Parcel g1 = g1(9, O0);
        byte[] createByteArray = g1.createByteArray();
        g1.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zznc> l4(zzo zzoVar, boolean z) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.e(O0, z);
        Parcel g1 = g1(7, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zznc.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void l5(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(20, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void l6(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(4, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void l7(zzbg zzbgVar, String str, String str2) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzbgVar);
        O0.writeString(str);
        O0.writeString(str2);
        o1(5, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void n5(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, bundle);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(19, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void o5(zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final void p3(zzad zzadVar) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzadVar);
        o1(13, O0);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    public final List<zzad> u1(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.d(O0, zzoVar);
        Parcel g1 = g1(16, O0);
        ArrayList createTypedArrayList = g1.createTypedArrayList(zzad.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }
}
