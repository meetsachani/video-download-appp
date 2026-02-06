package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzbyx extends zzayl implements zzbyy {
    public static zzbyy W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        if (queryLocalInterface instanceof zzbyy) {
            return (zzbyy) queryLocalInterface;
        }
        return new zzbyw(iBinder);
    }
}
