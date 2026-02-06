package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.D6;
import o.InterfaceC10251va;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

@InterfaceC10251va
/* loaded from: classes3.dex */
public class ConfigCacheClient {
    public static final long d = 5;
    @InterfaceC8710pF0("ConfigCacheClient.class")
    public static final Map<String, ConfigCacheClient> e = new HashMap();
    public static final Executor f = new D6();
    public final Executor a;
    public final ConfigStorageClient b;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public Task<ConfigContainer> c = null;

    /* loaded from: classes3.dex */
    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch a;

        private AwaitListener() {
            this.a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void a(TResult tresult) {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void b() {
            this.a.countDown();
        }

        public void c() throws InterruptedException {
            this.a.await();
        }

        public boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void e(@InterfaceC5670cr1 Exception exc) {
            this.a.countDown();
        }
    }

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.a = executor;
        this.b = configStorageClient;
    }

    public static /* synthetic */ Task a(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer, Void r3) {
        if (z) {
            configCacheClient.m(configContainer);
        } else {
            configCacheClient.getClass();
        }
        return Tasks.g(configContainer);
    }

    public static <TResult> TResult c(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f;
        task.l(executor, awaitListener);
        task.i(executor, awaitListener);
        task.c(executor, awaitListener);
        if (awaitListener.d(j, timeUnit)) {
            if (task.v()) {
                return task.r();
            }
            throw new ExecutionException(task.q());
        }
        throw new TimeoutException("Task await timed out.");
    }

    @InterfaceC5056aJ2
    public static synchronized void e() {
        synchronized (ConfigCacheClient.class) {
            e.clear();
        }
    }

    public static synchronized ConfigCacheClient j(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            try {
                String c = configStorageClient.c();
                Map<String, ConfigCacheClient> map = e;
                if (!map.containsKey(c)) {
                    map.put(c, new ConfigCacheClient(executor, configStorageClient));
                }
                configCacheClient = map.get(c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return configCacheClient;
    }

    public void d() {
        synchronized (this) {
            this.c = Tasks.g(null);
        }
        this.b.a();
    }

    public synchronized Task<ConfigContainer> f() {
        try {
            Task<ConfigContainer> task = this.c;
            if (task != null) {
                if (task.u() && !this.c.v()) {
                }
            }
            Executor executor = this.a;
            final ConfigStorageClient configStorageClient = this.b;
            Objects.requireNonNull(configStorageClient);
            this.c = Tasks.d(executor, new Callable() { // from class: o.LJ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ConfigStorageClient.this.e();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    @InterfaceC11300zs1
    public ConfigContainer g() {
        return h(5L);
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public ConfigContainer h(long j) {
        synchronized (this) {
            try {
                Task<ConfigContainer> task = this.c;
                if (task != null && task.v()) {
                    return this.c.r();
                }
                try {
                    return (ConfigContainer) c(f(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d(FirebaseRemoteConfig.z, "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public synchronized Task<ConfigContainer> i() {
        return this.c;
    }

    public Task<ConfigContainer> k(ConfigContainer configContainer) {
        return l(configContainer, true);
    }

    public Task<ConfigContainer> l(final ConfigContainer configContainer, final boolean z) {
        return Tasks.d(this.a, new Callable() { // from class: o.JJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void f2;
                f2 = ConfigCacheClient.this.b.f(configContainer);
                return f2;
            }
        }).x(this.a, new SuccessContinuation() { // from class: o.KJ
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                return ConfigCacheClient.a(ConfigCacheClient.this, z, configContainer, (Void) obj);
            }
        });
    }

    public final synchronized void m(ConfigContainer configContainer) {
        this.c = Tasks.g(configContainer);
    }
}
