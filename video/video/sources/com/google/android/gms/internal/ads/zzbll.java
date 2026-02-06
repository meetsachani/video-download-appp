package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbll extends zzayl implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzaym.c(parcel);
            C4((ParcelFileDescriptor) zzaym.a(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
