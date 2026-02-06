package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import o.C8812pg0;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final Lazy<ScheduledExecutorService> a = new Lazy<>(new Provider() { // from class: o.qg0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
            return m;
        }
    });
    public static final Lazy<ScheduledExecutorService> b = new Lazy<>(new Provider() { // from class: o.rg0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
            return m;
        }
    });
    public static final Lazy<ScheduledExecutorService> c = new Lazy<>(new Provider() { // from class: o.sg0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m;
            m = ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
            return m;
        }
    });
    public static final Lazy<ScheduledExecutorService> d = new Lazy<>(new Provider() { // from class: o.tg0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            C8812pg0.a(detectNetwork);
        }
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new CustomThreadFactory(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.g(Qualified.a(Background.class, ScheduledExecutorService.class), Qualified.a(Background.class, ExecutorService.class), Qualified.a(Background.class, Executor.class)).f(new ComponentFactory() { // from class: o.ug0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.a.get();
                return scheduledExecutorService;
            }
        }).d(), Component.g(Qualified.a(Blocking.class, ScheduledExecutorService.class), Qualified.a(Blocking.class, ExecutorService.class), Qualified.a(Blocking.class, Executor.class)).f(new ComponentFactory() { // from class: o.vg0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.c.get();
                return scheduledExecutorService;
            }
        }).d(), Component.g(Qualified.a(Lightweight.class, ScheduledExecutorService.class), Qualified.a(Lightweight.class, ExecutorService.class), Qualified.a(Lightweight.class, Executor.class)).f(new ComponentFactory() { // from class: o.wg0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.b.get();
                return scheduledExecutorService;
            }
        }).d(), Component.f(Qualified.a(UiThread.class, Executor.class)).f(new ComponentFactory() { // from class: o.xg0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                Executor executor;
                executor = UiExecutor.INSTANCE;
                return executor;
            }
        }).d());
    }
}
