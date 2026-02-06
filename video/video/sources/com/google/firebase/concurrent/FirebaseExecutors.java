package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class FirebaseExecutors {

    /* loaded from: classes3.dex */
    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private FirebaseExecutors() {
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor b(Executor executor, int i) {
        return new LimitedConcurrencyExecutor(executor, i);
    }

    public static ExecutorService c(ExecutorService executorService, int i) {
        return new LimitedConcurrencyExecutorService(executorService, i);
    }

    public static ScheduledExecutorService d(ExecutorService executorService, int i) {
        return new DelegatingScheduledExecutorService(c(executorService, i), ExecutorsRegistrar.d.get());
    }

    public static PausableExecutor e(Executor executor) {
        return new PausableExecutorImpl(false, executor);
    }

    public static PausableExecutorService f(ExecutorService executorService) {
        return new PausableExecutorServiceImpl(false, executorService);
    }

    public static PausableScheduledExecutorService g(ScheduledExecutorService scheduledExecutorService) {
        return new PausableScheduledExecutorServiceImpl(f(scheduledExecutorService), ExecutorsRegistrar.d.get());
    }

    public static Executor h(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
