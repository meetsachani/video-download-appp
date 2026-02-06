package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
final class zzdr implements ThreadFactory {
    public ThreadFactory a = Executors.defaultThreadFactory();

    public zzdr(zzdf zzdfVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
