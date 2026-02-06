package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyi implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    public zzbyi(zzbyj zzbyjVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@InterfaceC5670cr1 Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + andIncrement);
    }
}
