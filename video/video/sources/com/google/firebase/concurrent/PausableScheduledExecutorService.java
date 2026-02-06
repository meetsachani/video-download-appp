package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import o.C2695Cu1;

/* loaded from: classes3.dex */
public interface PausableScheduledExecutorService extends ScheduledExecutorService, PausableExecutorService, AutoCloseable {
    @Override // com.google.firebase.concurrent.PausableExecutorService, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }
}
