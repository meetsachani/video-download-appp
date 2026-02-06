package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zzcr implements Executor {
    public final ThreadPoolExecutor Y;
    public final AtomicInteger X = new AtomicInteger(1);
    public WeakReference Z = new WeakReference(null);

    public zzcr(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory("Google consent worker") { // from class: com.google.android.gms.internal.consent_sdk.zzcq
            public final /* synthetic */ String b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zzcr.b(zzcr.this, this.b, runnable);
            }
        });
        this.Y = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread b(zzcr zzcrVar, String str, Runnable runnable) {
        int andIncrement = zzcrVar.X.getAndIncrement();
        Thread thread = new Thread(runnable, "Google consent worker #" + andIncrement);
        zzcrVar.Z = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.Z.get()) {
            runnable.run();
        } else {
            this.Y.execute(runnable);
        }
    }
}
