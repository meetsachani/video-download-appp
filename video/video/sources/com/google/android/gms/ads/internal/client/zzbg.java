package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;

/* loaded from: classes2.dex */
public abstract class zzbg extends zzayl implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            b();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
