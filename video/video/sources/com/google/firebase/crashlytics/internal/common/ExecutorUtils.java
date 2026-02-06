package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class ExecutorUtils {
    public static final long a = 2;

    private ExecutorUtils() {
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(final String str, final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        BackgroundPriorityRunnable backgroundPriorityRunnable = new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2
            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void a() {
                try {
                    Logger f = Logger.f();
                    f.b("Executing shutdown hook for " + str);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(j, timeUnit)) {
                        Logger f2 = Logger.f();
                        f2.b(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Logger.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        };
        runtime.addShutdownHook(new Thread(backgroundPriorityRunnable, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService f = f(e(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, f);
        return f;
    }

    public static ScheduledExecutorService d(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(e(str));
        a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static ThreadFactory e(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1
                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public void a() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
