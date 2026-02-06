package com.google.firebase;

import android.os.SystemClock;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class StartupTime {
    @InterfaceC5670cr1
    public static StartupTime a(long j, long j2, long j3) {
        return new AutoValue_StartupTime(j, j2, j3);
    }

    @InterfaceC5670cr1
    public static StartupTime e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
