package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class CrashlyticsBackgroundWorker {
    public final Executor a;
    public Task<Void> b = Tasks.g(null);
    public final Object c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.a = executor;
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.1
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsBackgroundWorker.this.d.set(Boolean.TRUE);
            }
        });
    }

    public void b() {
        if (e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public Executor c() {
        return this.a;
    }

    public final <T> Task<Void> d(Task<T> task) {
        return task.n(this.a, (Continuation<T, Void>) new Continuation<T, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.4
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: b */
            public Void a(@InterfaceC5670cr1 Task<T> task2) throws Exception {
                return null;
            }
        });
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    public final <T> Continuation<Void, T> f(final Callable<T> callable) {
        return new Continuation<Void, T>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.3
            @Override // com.google.android.gms.tasks.Continuation
            public T a(@InterfaceC5670cr1 Task<Void> task) throws Exception {
                return (T) callable.call();
            }
        };
    }

    public Task<Void> g(final Runnable runnable) {
        return h(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> n;
        synchronized (this.c) {
            n = this.b.n(this.a, f(callable));
            this.b = d(n);
        }
        return n;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> p;
        synchronized (this.c) {
            p = this.b.p(this.a, f(callable));
            this.b = d(p);
        }
        return p;
    }
}
