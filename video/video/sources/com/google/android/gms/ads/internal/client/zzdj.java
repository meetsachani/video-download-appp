package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzdj extends zzayl implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzaym.c(parcel);
            U2((zze) zzaym.a(parcel, zze.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
