package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C2695Cu1;

/* loaded from: classes2.dex */
public interface zzgdk extends ScheduledExecutorService, zzgdj, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzgdj
    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }

    zzgdi s2(Callable callable, long j, TimeUnit timeUnit);
}
