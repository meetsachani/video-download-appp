package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class DefaultClock implements Clock {
    public static final DefaultClock a = new DefaultClock();

    private DefaultClock() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Clock d() {
        return a;
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long c() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }
}
