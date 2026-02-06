package okhttp3;

import java.util.concurrent.TimeUnit;
import o.C6562gT0;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class ConnectionPool {
    @NotNull
    private final RealConnectionPool delegate;

    public ConnectionPool(@NotNull RealConnectionPool realConnectionPool) {
        C6562gT0.p(realConnectionPool, "delegate");
        this.delegate = realConnectionPool;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    @NotNull
    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, @NotNull TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i, j, timeUnit));
        C6562gT0.p(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
