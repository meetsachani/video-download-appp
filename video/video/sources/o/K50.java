package o;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class K50 extends ThreadPoolExecutor implements AutoCloseable {
    public K50(int i, ThreadFactory threadFactory) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        L50 l50 = new L50((RunnableC6713h60) runnable);
        execute(l50);
        return l50;
    }
}
