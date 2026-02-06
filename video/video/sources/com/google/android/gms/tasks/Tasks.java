package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult a(@InterfaceC5670cr1 Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.p();
        Preconditions.n();
        Preconditions.s(task, "Task must not be null");
        if (task.u()) {
            return (TResult) s(task);
        }
        zzad zzadVar = new zzad(null);
        t(task, zzadVar);
        zzadVar.c();
        return (TResult) s(task);
    }

    public static <TResult> TResult b(@InterfaceC5670cr1 Task<TResult> task, long j, @InterfaceC5670cr1 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.p();
        Preconditions.n();
        Preconditions.s(task, "Task must not be null");
        Preconditions.s(timeUnit, "TimeUnit must not be null");
        if (task.u()) {
            return (TResult) s(task);
        }
        zzad zzadVar = new zzad(null);
        t(task, zzadVar);
        if (zzadVar.d(j, timeUnit)) {
            return (TResult) s(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @InterfaceC5670cr1
    @Deprecated
    public static <TResult> Task<TResult> c(@InterfaceC5670cr1 Callable<TResult> callable) {
        return d(TaskExecutors.a, callable);
    }

    @InterfaceC5670cr1
    @Deprecated
    public static <TResult> Task<TResult> d(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Callable<TResult> callable) {
        Preconditions.s(executor, "Executor must not be null");
        Preconditions.s(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @InterfaceC5670cr1
    public static <TResult> Task<TResult> e() {
        zzw zzwVar = new zzw();
        zzwVar.A();
        return zzwVar;
    }

    @InterfaceC5670cr1
    public static <TResult> Task<TResult> f(@InterfaceC5670cr1 Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.y(exc);
        return zzwVar;
    }

    @InterfaceC5670cr1
    public static <TResult> Task<TResult> g(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.z(tresult);
        return zzwVar;
    }

    @InterfaceC5670cr1
    public static Task<Void> h(@InterfaceC11300zs1 Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Task<?> task : collection) {
                if (task == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            zzw zzwVar = new zzw();
            zzaf zzafVar = new zzaf(collection.size(), zzwVar);
            for (Task<?> task2 : collection) {
                t(task2, zzafVar);
            }
            return zzwVar;
        }
        return g(null);
    }

    @InterfaceC5670cr1
    public static Task<Void> i(@InterfaceC11300zs1 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return h(Arrays.asList(taskArr));
        }
        return g(null);
    }

    @InterfaceC5670cr1
    public static Task<List<Task<?>>> j(@InterfaceC11300zs1 Collection<? extends Task<?>> collection) {
        return k(TaskExecutors.a, collection);
    }

    @InterfaceC5670cr1
    public static Task<List<Task<?>>> k(@InterfaceC5670cr1 Executor executor, @InterfaceC11300zs1 Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return h(collection).p(executor, new zzab(collection));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static Task<List<Task<?>>> l(@InterfaceC5670cr1 Executor executor, @InterfaceC11300zs1 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return k(executor, Arrays.asList(taskArr));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static Task<List<Task<?>>> m(@InterfaceC11300zs1 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return j(Arrays.asList(taskArr));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static <TResult> Task<List<TResult>> n(@InterfaceC11300zs1 Collection<? extends Task> collection) {
        return o(TaskExecutors.a, collection);
    }

    @InterfaceC5670cr1
    public static <TResult> Task<List<TResult>> o(@InterfaceC5670cr1 Executor executor, @InterfaceC11300zs1 Collection<? extends Task> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (Task<List<TResult>>) h(collection).n(executor, new zzaa(collection));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static <TResult> Task<List<TResult>> p(@InterfaceC5670cr1 Executor executor, @InterfaceC11300zs1 Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return o(executor, Arrays.asList(taskArr));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static <TResult> Task<List<TResult>> q(@InterfaceC11300zs1 Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return n(Arrays.asList(taskArr));
        }
        return g(Collections.EMPTY_LIST);
    }

    @InterfaceC5670cr1
    public static <T> Task<T> r(@InterfaceC5670cr1 Task<T> task, long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        boolean z;
        Preconditions.s(task, "Task must not be null");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "Timeout must be positive");
        Preconditions.s(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.e(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task2) {
                com.google.android.gms.internal.tasks.zza.this.removeCallbacksAndMessages(null);
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task2.v()) {
                    taskCompletionSource2.e(task2.r());
                } else if (task2.t()) {
                    zzbVar.c();
                } else {
                    Exception q = task2.q();
                    q.getClass();
                    taskCompletionSource2.d(q);
                }
            }
        });
        return taskCompletionSource.a();
    }

    public static Object s(@InterfaceC5670cr1 Task task) throws ExecutionException {
        if (task.v()) {
            return task.r();
        }
        if (task.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.q());
    }

    public static void t(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.b;
        task.l(executor, zzaeVar);
        task.i(executor, zzaeVar);
        task.c(executor, zzaeVar);
    }
}
