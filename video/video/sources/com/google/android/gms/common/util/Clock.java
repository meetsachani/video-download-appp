package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public interface Clock {

    /* renamed from: com.google.android.gms.common.util.Clock$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @KeepForSdk
        public static long a(@InterfaceC5670cr1 Clock clock) {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    @KeepForSdk
    long a();

    @KeepForSdk
    long b();

    @KeepForSdk
    long c();

    @KeepForSdk
    long nanoTime();
}
