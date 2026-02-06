package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Object Y = new Object();
    public boolean X = false;

    @InterfaceC11300zs1
    @KeepForSdk
    public static Integer B0() {
        synchronized (Y) {
        }
        return null;
    }

    @KeepForSdk
    public static boolean m0(@InterfaceC5670cr1 String str) {
        synchronized (Y) {
        }
        return true;
    }

    @KeepForSdk
    public abstract boolean E0(int i);

    @KeepForSdk
    public void G0(boolean z) {
        this.X = z;
    }

    @KeepForSdk
    public boolean H0() {
        return this.X;
    }
}
