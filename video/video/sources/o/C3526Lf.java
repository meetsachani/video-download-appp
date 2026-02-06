package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Lf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3526Lf extends C8120mp2 {
    @NotNull
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    @NotNull
    private static final Condition condition;
    @Nullable
    private static C3526Lf head;
    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;
    @Nullable
    private C3526Lf next;
    private long timeoutAt;

    @InterfaceC8303na2({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    /* renamed from: o.Lf$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final C3526Lf c() throws InterruptedException {
            C3526Lf c3526Lf = C3526Lf.head;
            C6562gT0.m(c3526Lf);
            C3526Lf c3526Lf2 = c3526Lf.next;
            if (c3526Lf2 != null) {
                long a = c3526Lf2.a(System.nanoTime());
                if (a <= 0) {
                    C3526Lf c3526Lf3 = C3526Lf.head;
                    C6562gT0.m(c3526Lf3);
                    c3526Lf3.next = c3526Lf2.next;
                    c3526Lf2.next = null;
                    return c3526Lf2;
                }
                e().await(a, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            e().await(C3526Lf.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            C3526Lf c3526Lf4 = C3526Lf.head;
            C6562gT0.m(c3526Lf4);
            if (c3526Lf4.next == null && System.nanoTime() - nanoTime >= C3526Lf.IDLE_TIMEOUT_NANOS) {
                return C3526Lf.head;
            }
            return null;
        }

        public final boolean d(C3526Lf c3526Lf) {
            ReentrantLock f = C3526Lf.Companion.f();
            f.lock();
            try {
                if (c3526Lf.inQueue) {
                    c3526Lf.inQueue = false;
                    for (C3526Lf c3526Lf2 = C3526Lf.head; c3526Lf2 != null; c3526Lf2 = c3526Lf2.next) {
                        if (c3526Lf2.next == c3526Lf) {
                            c3526Lf2.next = c3526Lf.next;
                            c3526Lf.next = null;
                            return false;
                        }
                    }
                    f.unlock();
                    return true;
                }
                return false;
            } finally {
                f.unlock();
            }
        }

        @NotNull
        public final Condition e() {
            return C3526Lf.condition;
        }

        @NotNull
        public final ReentrantLock f() {
            return C3526Lf.lock;
        }

        public final void g(C3526Lf c3526Lf, long j, boolean z) {
            ReentrantLock f = C3526Lf.Companion.f();
            f.lock();
            try {
                if (!c3526Lf.inQueue) {
                    c3526Lf.inQueue = true;
                    if (C3526Lf.head == null) {
                        C3526Lf.head = new C3526Lf();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i != 0 && z) {
                        c3526Lf.timeoutAt = Math.min(j, c3526Lf.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        c3526Lf.timeoutAt = j + nanoTime;
                    } else if (z) {
                        c3526Lf.timeoutAt = c3526Lf.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long a = c3526Lf.a(nanoTime);
                    C3526Lf c3526Lf2 = C3526Lf.head;
                    C6562gT0.m(c3526Lf2);
                    while (c3526Lf2.next != null) {
                        C3526Lf c3526Lf3 = c3526Lf2.next;
                        C6562gT0.m(c3526Lf3);
                        if (a < c3526Lf3.a(nanoTime)) {
                            break;
                        }
                        c3526Lf2 = c3526Lf2.next;
                        C6562gT0.m(c3526Lf2);
                    }
                    c3526Lf.next = c3526Lf2.next;
                    c3526Lf2.next = c3526Lf;
                    if (c3526Lf2 == C3526Lf.head) {
                        C3526Lf.Companion.e().signal();
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    f.unlock();
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } catch (Throwable th) {
                f.unlock();
                throw th;
            }
        }

        public a() {
        }
    }

    /* renamed from: o.Lf$b */
    /* loaded from: classes4.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f;
            C3526Lf c;
            while (true) {
                try {
                    a aVar = C3526Lf.Companion;
                    f = aVar.f();
                    f.lock();
                    c = aVar.c();
                } catch (InterruptedException unused) {
                }
                if (c == C3526Lf.head) {
                    C3526Lf.head = null;
                    f.unlock();
                    return;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                f.unlock();
                if (c != null) {
                    c.timedOut();
                }
            }
        }
    }

    @InterfaceC8303na2({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    /* renamed from: o.Lf$c */
    /* loaded from: classes4.dex */
    public static final class c implements J82 {
        public final /* synthetic */ J82 Y;

        public c(J82 j82) {
            this.Y = j82;
        }

        @Override // o.J82
        @NotNull
        /* renamed from: a */
        public C3526Lf timeout() {
            return C3526Lf.this;
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3526Lf c3526Lf = C3526Lf.this;
            J82 j82 = this.Y;
            c3526Lf.enter();
            try {
                j82.close();
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (!c3526Lf.exit()) {
                    return;
                }
                throw c3526Lf.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c3526Lf.exit()) {
                    throw e;
                }
                throw c3526Lf.access$newTimeoutException(e);
            } finally {
                c3526Lf.exit();
            }
        }

        @Override // o.J82, java.io.Flushable
        public void flush() {
            C3526Lf c3526Lf = C3526Lf.this;
            J82 j82 = this.Y;
            c3526Lf.enter();
            try {
                j82.flush();
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (!c3526Lf.exit()) {
                    return;
                }
                throw c3526Lf.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c3526Lf.exit()) {
                    throw e;
                }
                throw c3526Lf.access$newTimeoutException(e);
            } finally {
                c3526Lf.exit();
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.sink(" + this.Y + ')';
        }

        @Override // o.J82
        public void write(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "source");
            C8648p.e(c5422bq.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    PZ1 pz1 = c5422bq.X;
                    C6562gT0.m(pz1);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += pz1.c - pz1.b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            pz1 = pz1.f;
                            C6562gT0.m(pz1);
                        }
                    }
                    C3526Lf c3526Lf = C3526Lf.this;
                    J82 j82 = this.Y;
                    c3526Lf.enter();
                    try {
                        try {
                            j82.write(c5422bq, j2);
                            C7458kA2 c7458kA2 = C7458kA2.a;
                            if (!c3526Lf.exit()) {
                                j -= j2;
                            } else {
                                throw c3526Lf.access$newTimeoutException(null);
                            }
                        } catch (IOException e) {
                            if (!c3526Lf.exit()) {
                                throw e;
                            }
                            throw c3526Lf.access$newTimeoutException(e);
                        }
                    } catch (Throwable th) {
                        c3526Lf.exit();
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @InterfaceC8303na2({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    /* renamed from: o.Lf$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC7072ia2 {
        public final /* synthetic */ InterfaceC7072ia2 Y;

        public d(InterfaceC7072ia2 interfaceC7072ia2) {
            this.Y = interfaceC7072ia2;
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        /* renamed from: a */
        public C3526Lf timeout() {
            return C3526Lf.this;
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3526Lf c3526Lf = C3526Lf.this;
            InterfaceC7072ia2 interfaceC7072ia2 = this.Y;
            c3526Lf.enter();
            try {
                interfaceC7072ia2.close();
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (!c3526Lf.exit()) {
                    return;
                }
                throw c3526Lf.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c3526Lf.exit()) {
                    throw e;
                }
                throw c3526Lf.access$newTimeoutException(e);
            } finally {
                c3526Lf.exit();
            }
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            C3526Lf c3526Lf = C3526Lf.this;
            InterfaceC7072ia2 interfaceC7072ia2 = this.Y;
            c3526Lf.enter();
            try {
                long read = interfaceC7072ia2.read(c5422bq, j);
                if (!c3526Lf.exit()) {
                    return read;
                }
                throw c3526Lf.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c3526Lf.exit()) {
                    throw e;
                }
                throw c3526Lf.access$newTimeoutException(e);
            } finally {
                c3526Lf.exit();
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.source(" + this.Y + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C6562gT0.o(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long a(long j) {
        return this.timeoutAt - j;
    }

    @HK1
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final J82 sink(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        return new c(j82);
    }

    @NotNull
    public final InterfaceC7072ia2 source(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        return new d(interfaceC7072ia2);
    }

    public final <T> T withTimeout(@NotNull FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "block");
        enter();
        try {
            try {
                T invoke = fa0.invoke();
                UP0.d(1);
                if (!exit()) {
                    UP0.c(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e) {
                if (!exit()) {
                    throw e;
                }
                throw access$newTimeoutException(e);
            }
        } catch (Throwable th) {
            UP0.d(1);
            exit();
            UP0.c(1);
            throw th;
        }
    }

    public void timedOut() {
    }
}
