package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.EH;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class PoolableExecutors {
    public static final ExecutorFactory a;
    public static volatile ExecutorFactory b;

    /* loaded from: classes3.dex */
    public static class DefaultExecutorFactory implements ExecutorFactory {
        public static final long a = 60;

        private DefaultExecutorFactory() {
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService a(ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        public ExecutorService c(ThreadPriority threadPriority) {
            return h(1, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> d(@EH String str, @EH String str2, ThreadPriority threadPriority, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public void e(@EH String str, @EH String str2, ThreadPriority threadPriority, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService f(int i, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService g(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        public ExecutorService h(int i, ThreadPriority threadPriority) {
            return g(i, Executors.defaultThreadFactory(), threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        public ExecutorService i(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return g(1, threadFactory, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @InterfaceC5670cr1
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService j(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }
    }

    static {
        DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
        a = defaultExecutorFactory;
        b = defaultExecutorFactory;
    }

    private PoolableExecutors() {
    }

    public static ExecutorFactory a() {
        return b;
    }

    public static void b(ExecutorFactory executorFactory) {
        if (b == a) {
            b = executorFactory;
            return;
        }
        throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
    }
}
