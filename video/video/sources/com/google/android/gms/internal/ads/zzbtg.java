package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzbtg extends zzayl implements zzbth {
    public static zzbth W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        if (queryLocalInterface instanceof zzbth) {
            return (zzbth) queryLocalInterface;
        }
        return new zzbtf(iBinder);
    }
}
