package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import o.C2695Cu1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public interface zzgdj extends ExecutorService, AutoCloseable {
    InterfaceFutureC8411o11 I2(Callable callable);

    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }

    InterfaceFutureC8411o11 f0(Runnable runnable);
}
