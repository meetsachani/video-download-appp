package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import o.InterfaceC5539cJ0;

/* loaded from: classes3.dex */
public abstract class zzcb extends zzbx implements zzby {
    public static zzby g1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC5539cJ0.a.X);
        if (queryLocalInterface instanceof zzby) {
            return (zzby) queryLocalInterface;
        }
        return new zzca(iBinder);
    }
}
