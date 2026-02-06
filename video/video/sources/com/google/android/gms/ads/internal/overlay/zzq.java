package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class zzq implements Callable {
    public final long a;

    public zzq(long j) {
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        long j = this.a;
        concurrentHashMap = AdOverlayInfoParcel.u1;
        if (concurrentHashMap.remove(Long.valueOf(j)) != null) {
            com.google.android.gms.ads.internal.zzv.t().x(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
            return null;
        }
        return null;
    }
}
