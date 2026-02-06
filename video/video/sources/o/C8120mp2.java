package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/* renamed from: o.mp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8120mp2 {
    @NotNull
    public static final b Companion = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final C8120mp2 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: o.mp2$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public final long a(long j, long j2) {
            if (j != 0 && (j2 == 0 || j < j2)) {
                return j;
            }
            return j2;
        }

        public b() {
        }
    }

    public final void awaitSignal(@NotNull Condition condition) throws InterruptedIOException {
        C6562gT0.p(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public C8120mp2 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @NotNull
    public C8120mp2 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @NotNull
    public final C8120mp2 deadline(long j, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(@NotNull C8120mp2 c8120mp2, @NotNull FA0<? extends T> fa0) {
        C6562gT0.p(c8120mp2, "other");
        C6562gT0.p(fa0, "block");
        long timeoutNanos = timeoutNanos();
        long a2 = Companion.a(c8120mp2.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (c8120mp2.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), c8120mp2.deadlineNanoTime()));
            }
            try {
                T invoke = fa0.invoke();
                UP0.d(1);
                timeout(timeoutNanos, timeUnit);
                if (c8120mp2.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                UP0.c(1);
                return invoke;
            } catch (Throwable th) {
                UP0.d(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (c8120mp2.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                UP0.c(1);
                throw th;
            }
        }
        if (c8120mp2.hasDeadline()) {
            deadlineNanoTime(c8120mp2.deadlineNanoTime());
        }
        try {
            T invoke2 = fa0.invoke();
            UP0.d(1);
            timeout(timeoutNanos, timeUnit);
            if (c8120mp2.hasDeadline()) {
                clearDeadline();
            }
            UP0.c(1);
            return invoke2;
        } catch (Throwable th2) {
            UP0.d(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (c8120mp2.hasDeadline()) {
                clearDeadline();
            }
            UP0.c(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @NotNull
    public C8120mp2 timeout(long j, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@NotNull Object obj) throws InterruptedIOException {
        C6562gT0.p(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public C8120mp2 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    /* renamed from: o.mp2$a */
    /* loaded from: classes4.dex */
    public static final class a extends C8120mp2 {
        @Override // o.C8120mp2
        @NotNull
        public C8120mp2 timeout(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            return this;
        }

        @Override // o.C8120mp2
        public void throwIfReached() {
        }

        @Override // o.C8120mp2
        @NotNull
        public C8120mp2 deadlineNanoTime(long j) {
            return this;
        }
    }
}
