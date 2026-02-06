package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbvw extends zzayl implements zzbvx {
    public zzbvw() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        } else {
            String c = c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        }
        return true;
    }
}
