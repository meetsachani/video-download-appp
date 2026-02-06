package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.facebook.bolts.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2330b {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public static final C2330b c = new C2330b();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final long g = 1;
    @NotNull
    public final Executor a = new ExecutorC0078b();

    /* renamed from: com.facebook.bolts.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final ExecutorService a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C2330b.e, C2330b.f, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @InterfaceC9511sW0
        @NotNull
        public final Executor b() {
            return C2330b.c.a;
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.bolts.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class ExecutorC0078b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            C6562gT0.p(runnable, "command");
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        d = availableProcessors;
        e = availableProcessors + 1;
        f = (availableProcessors * 2) + 1;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ExecutorService e() {
        return b.a();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Executor f() {
        return b.b();
    }
}
