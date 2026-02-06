package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzem implements zzdg {
    @Override // com.google.android.gms.internal.ads.zzdg
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final long c() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdq d(Looper looper, @InterfaceC11300zs1 Handler.Callback callback) {
        return new zzep(new Handler(looper, callback));
    }
}
