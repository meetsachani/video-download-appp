package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayl;

/* loaded from: classes2.dex */
public abstract class zzca extends zzayl implements zzcb {
    public static zzcb W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzcb) {
            return (zzcb) queryLocalInterface;
        }
        return new zzbz(iBinder);
    }
}
