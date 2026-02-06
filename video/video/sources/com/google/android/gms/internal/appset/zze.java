package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean O0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            g3((Status) zzc.a(parcel, Status.CREATOR), (com.google.android.gms.appset.zzc) zzc.a(parcel, com.google.android.gms.appset.zzc.CREATOR));
            return true;
        }
        return false;
    }
}
