package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdv extends zzayk implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle d() throws RemoteException {
        Parcel g1 = g1(5, O0());
        Bundle bundle = (Bundle) zzaym.a(g1, Bundle.CREATOR);
        g1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv e() throws RemoteException {
        Parcel g1 = g1(4, O0());
        zzv zzvVar = (zzv) zzaym.a(g1, zzv.CREATOR);
        g1.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String g() throws RemoteException {
        Parcel g1 = g1(1, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String h() throws RemoteException {
        Parcel g1 = g1(6, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String i() throws RemoteException {
        Parcel g1 = g1(2, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List j() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList createTypedArrayList = g1.createTypedArrayList(zzv.CREATOR);
        g1.recycle();
        return createTypedArrayList;
    }
}
