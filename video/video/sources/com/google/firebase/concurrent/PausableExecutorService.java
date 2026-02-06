package com.google.firebase.concurrent;

import java.util.concurrent.ExecutorService;
import o.C2695Cu1;

/* loaded from: classes3.dex */
public interface PausableExecutorService extends ExecutorService, PausableExecutor, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }
}
