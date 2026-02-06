package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzfsb extends zzayl implements zzfsc {
    public static zzfsc W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        if (queryLocalInterface instanceof zzfsc) {
            return (zzfsc) queryLocalInterface;
        }
        return new zzfsa(iBinder);
    }
}
