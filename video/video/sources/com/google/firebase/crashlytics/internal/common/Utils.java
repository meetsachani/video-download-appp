package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class Utils {
    public static final int a = 4;
    public static final ExecutorService b = ExecutorUtils.c("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    public static /* synthetic */ Object a(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.v()) {
            taskCompletionSource.c(task.r());
            return null;
        } else if (task.q() != null) {
            taskCompletionSource.b(task.q());
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void c(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.v()) {
            taskCompletionSource.e(task.r());
            return null;
        } else if (task.q() != null) {
            taskCompletionSource.d(task.q());
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ Void d(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.v()) {
            taskCompletionSource.e(task.r());
            return null;
        } else if (task.q() != null) {
            taskCompletionSource.d(task.q());
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ void e(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).n(executor, new Continuation() { // from class: o.YD2
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task) {
                    return Utils.a(TaskCompletionSource.this, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    public static <T> T f(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.n(b, new Continuation() { // from class: o.WD2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task2) {
                return Utils.b(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.v()) {
            return task.r();
        }
        if (!task.t()) {
            if (task.u()) {
                throw new IllegalStateException(task.q());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static boolean g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> Task<T> h(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: o.XD2
            @Override // java.lang.Runnable
            public final void run() {
                Utils.e(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.a();
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> i(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: o.VD2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task3) {
                return Utils.d(TaskCompletionSource.this, task3);
            }
        };
        task.m(continuation);
        task2.m(continuation);
        return taskCompletionSource.a();
    }

    public static <T> Task<T> j(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: o.ZD2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task3) {
                return Utils.c(TaskCompletionSource.this, task3);
            }
        };
        task.n(executor, continuation);
        task2.n(executor, continuation);
        return taskCompletionSource.a();
    }
}
