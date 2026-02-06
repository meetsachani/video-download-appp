package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzbhg extends zzayl implements zzbhh {
    public static zzbhh W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof zzbhh) {
            return (zzbhh) queryLocalInterface;
        }
        return new zzbhf(iBinder);
    }
}
