package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzcp extends Handler {
    @InterfaceC11300zs1
    public static zzcr b;
    public final Looper a;

    public zzcp() {
        this.a = Looper.getMainLooper();
    }

    public zzcp(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
}
