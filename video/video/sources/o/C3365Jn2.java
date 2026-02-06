package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/* renamed from: o.Jn2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3365Jn2 {
    @InterfaceC6442g20
    @NotNull
    public static final AbstractC7335jg0 b(final int i, @NotNull final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return C8569og0.d(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: o.In2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread c;
                    c = C3365Jn2.c(i, str, atomicInteger, runnable);
                    return c;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    public static final Thread c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
