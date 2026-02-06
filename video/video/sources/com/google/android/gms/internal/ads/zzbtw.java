package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class zzbtw extends zzayl implements zzbtx {
    public static zzbtx W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof zzbtx) {
            return (zzbtx) queryLocalInterface;
        }
        return new zzbtv(iBinder);
    }
}
