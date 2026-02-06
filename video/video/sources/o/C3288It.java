package o;

import java.util.concurrent.Callable;

@InterfaceC5601ca0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.It */
/* loaded from: classes3.dex */
public final class C3288It {
    public static /* synthetic */ void a(InterfaceC8331nh2 interfaceC8331nh2, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean i = i((String) interfaceC8331nh2.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (i) {
                i(name, currentThread);
            }
        }
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(InterfaceExecutorServiceC10119v11 interfaceExecutorServiceC10119v11, Callable callable) {
        return interfaceExecutorServiceC10119v11.submit(callable);
    }

    public static /* synthetic */ Object c(InterfaceC8331nh2 interfaceC8331nh2, Callable callable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean i = i((String) interfaceC8331nh2.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (i) {
                i(name, currentThread);
            }
        }
    }

    public static /* synthetic */ Object d(Object obj) {
        return obj;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <T> InterfaceC2535Bf<T> e(final Callable<T> callable, final InterfaceExecutorServiceC10119v11 interfaceExecutorServiceC10119v11) {
        C10664xF1.E(callable);
        C10664xF1.E(interfaceExecutorServiceC10119v11);
        return new InterfaceC2535Bf() { // from class: o.Ft
            @Override // o.InterfaceC2535Bf
            public final InterfaceFutureC8411o11 call() {
                return C3288It.b(InterfaceExecutorServiceC10119v11.this, callable);
            }
        };
    }

    public static <T> Callable<T> f(@InterfaceC7165iy1 final T t) {
        return new Callable() { // from class: o.Gt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3288It.d(t);
            }
        };
    }

    @InterfaceC11149zF0
    public static Runnable g(final Runnable runnable, final InterfaceC8331nh2<String> interfaceC8331nh2) {
        C10664xF1.E(interfaceC8331nh2);
        C10664xF1.E(runnable);
        return new Runnable() { // from class: o.Ht
            @Override // java.lang.Runnable
            public final void run() {
                C3288It.a(InterfaceC8331nh2.this, runnable);
            }
        };
    }

    @InterfaceC11149zF0
    public static <T> Callable<T> h(final Callable<T> callable, final InterfaceC8331nh2<String> interfaceC8331nh2) {
        C10664xF1.E(interfaceC8331nh2);
        C10664xF1.E(callable);
        return new Callable() { // from class: o.Et
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3288It.c(InterfaceC8331nh2.this, callable);
            }
        };
    }

    @InterfaceC11149zF0
    public static boolean i(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
