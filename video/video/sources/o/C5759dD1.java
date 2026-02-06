package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
/* renamed from: o.dD1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5759dD1 {
    public final long a;
    @NotNull
    public final C5422bq b = new C5422bq();
    public boolean c;
    public boolean d;
    public boolean e;
    @Nullable
    public J82 f;
    @NotNull
    public final ReentrantLock g;
    @NotNull
    public final Condition h;
    @NotNull
    public final J82 i;
    @NotNull
    public final InterfaceC7072ia2 j;

    @InterfaceC8303na2({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
    /* renamed from: o.dD1$a */
    /* loaded from: classes4.dex */
    public static final class a implements J82 {
        @NotNull
        public final C8120mp2 X = new C8120mp2();

        public a() {
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j = C5759dD1.this.j();
            C5759dD1 c5759dD1 = C5759dD1.this;
            j.lock();
            try {
                if (c5759dD1.l()) {
                    j.unlock();
                    return;
                }
                J82 i = c5759dD1.i();
                if (i == null) {
                    if (c5759dD1.m() && c5759dD1.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    c5759dD1.p(true);
                    c5759dD1.h().signalAll();
                    i = null;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                j.unlock();
                if (i != null) {
                    C5759dD1 c5759dD12 = C5759dD1.this;
                    C8120mp2 timeout = i.timeout();
                    C8120mp2 timeout2 = c5759dD12.r().timeout();
                    long timeoutNanos = timeout.timeoutNanos();
                    long a = C8120mp2.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            i.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        i.close();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                j.unlock();
                throw th3;
            }
        }

        @Override // o.J82, java.io.Flushable
        public void flush() {
            ReentrantLock j = C5759dD1.this.j();
            C5759dD1 c5759dD1 = C5759dD1.this;
            j.lock();
            try {
                if (!c5759dD1.l()) {
                    if (!c5759dD1.g()) {
                        J82 i = c5759dD1.i();
                        if (i == null) {
                            if (c5759dD1.m() && c5759dD1.f().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            i = null;
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        j.unlock();
                        if (i != null) {
                            C5759dD1 c5759dD12 = C5759dD1.this;
                            C8120mp2 timeout = i.timeout();
                            C8120mp2 timeout2 = c5759dD12.r().timeout();
                            long timeoutNanos = timeout.timeoutNanos();
                            long a = C8120mp2.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(a, timeUnit);
                            if (timeout.hasDeadline()) {
                                long deadlineNanoTime = timeout.deadlineNanoTime();
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                }
                                try {
                                    i.flush();
                                    timeout.timeout(timeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                    }
                                    throw th;
                                }
                            }
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                i.flush();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th2;
                            }
                        }
                        return;
                    }
                    throw new IOException("canceled");
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th3) {
                j.unlock();
                throw th3;
            }
        }

        @Override // o.J82
        @NotNull
        public C8120mp2 timeout() {
            return this.X;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
            r1 = o.C7458kA2.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
            if (r2 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
            r0 = r12.Y;
            r1 = r2.timeout();
            r0 = r0.r().timeout();
            r3 = r1.timeoutNanos();
            r5 = o.C8120mp2.Companion.a(r0.timeoutNanos(), r1.timeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.timeout(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
            if (r1.hasDeadline() == false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
            r5 = r1.deadlineNanoTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
            if (r0.hasDeadline() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
            r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
            if (r0.hasDeadline() == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
            if (r0.hasDeadline() != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
            if (r0.hasDeadline() == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
            r1.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
            if (r0.hasDeadline() == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
            if (r0.hasDeadline() != false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
            return;
         */
        @Override // o.J82
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void write(@NotNull C5422bq c5422bq, long j) {
            J82 j82;
            C6562gT0.p(c5422bq, "source");
            ReentrantLock j2 = C5759dD1.this.j();
            C5759dD1 c5759dD1 = C5759dD1.this;
            j2.lock();
            try {
                if (!c5759dD1.l()) {
                    if (!c5759dD1.g()) {
                        while (true) {
                            if (j > 0) {
                                j82 = c5759dD1.i();
                                if (j82 != null) {
                                    break;
                                } else if (!c5759dD1.m()) {
                                    long k = c5759dD1.k() - c5759dD1.f().size();
                                    if (k == 0) {
                                        this.X.awaitSignal(c5759dD1.h());
                                        if (c5759dD1.g()) {
                                            throw new IOException("canceled");
                                        }
                                    } else {
                                        long min = Math.min(k, j);
                                        c5759dD1.f().write(c5422bq, min);
                                        j -= min;
                                        c5759dD1.h().signalAll();
                                    }
                                } else {
                                    throw new IOException("source is closed");
                                }
                            } else {
                                j82 = null;
                                break;
                            }
                        }
                    } else {
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            } catch (Throwable th) {
                j2.unlock();
                throw th;
            }
        }
    }

    @InterfaceC8303na2({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    /* renamed from: o.dD1$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC7072ia2 {
        @NotNull
        public final C8120mp2 X = new C8120mp2();

        public b() {
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j = C5759dD1.this.j();
            C5759dD1 c5759dD1 = C5759dD1.this;
            j.lock();
            try {
                c5759dD1.q(true);
                c5759dD1.h().signalAll();
                C7458kA2 c7458kA2 = C7458kA2.a;
            } finally {
                j.unlock();
            }
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            ReentrantLock j2 = C5759dD1.this.j();
            C5759dD1 c5759dD1 = C5759dD1.this;
            j2.lock();
            try {
                if (!c5759dD1.m()) {
                    if (!c5759dD1.g()) {
                        while (c5759dD1.f().size() == 0) {
                            if (c5759dD1.l()) {
                                j2.unlock();
                                return -1L;
                            }
                            this.X.awaitSignal(c5759dD1.h());
                            if (c5759dD1.g()) {
                                throw new IOException("canceled");
                            }
                        }
                        long read = c5759dD1.f().read(c5422bq, j);
                        c5759dD1.h().signalAll();
                        j2.unlock();
                        return read;
                    }
                    throw new IOException("canceled");
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                j2.unlock();
                throw th;
            }
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return this.X;
        }
    }

    public C5759dD1(long j) {
        this.a = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.g = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C6562gT0.o(newCondition, "newCondition(...)");
        this.h = newCondition;
        if (j >= 1) {
            this.i = new a();
            this.j = new b();
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
    }

    @InterfaceC8046mW0(name = "-deprecated_sink")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "sink", imports = {}))
    @NotNull
    public final J82 a() {
        return this.i;
    }

    @InterfaceC8046mW0(name = "-deprecated_source")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "source", imports = {}))
    @NotNull
    public final InterfaceC7072ia2 b() {
        return this.j;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            this.c = true;
            this.b.h();
            this.h.signalAll();
            C7458kA2 c7458kA2 = C7458kA2.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(@NotNull J82 j82) throws IOException {
        C6562gT0.p(j82, "sink");
        while (true) {
            this.g.lock();
            try {
                if (this.f == null) {
                    if (!this.c) {
                        if (this.b.M3()) {
                            this.e = true;
                            this.f = j82;
                            return;
                        }
                        boolean z = this.d;
                        C5422bq c5422bq = new C5422bq();
                        C5422bq c5422bq2 = this.b;
                        c5422bq.write(c5422bq2, c5422bq2.size());
                        this.h.signalAll();
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        try {
                            j82.write(c5422bq, c5422bq.size());
                            if (z) {
                                j82.close();
                            } else {
                                j82.flush();
                            }
                        } catch (Throwable th) {
                            this.g.lock();
                            try {
                                this.e = true;
                                this.h.signalAll();
                                C7458kA2 c7458kA22 = C7458kA2.a;
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        this.f = j82;
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("sink already folded");
                }
            } finally {
            }
        }
    }

    public final void e(J82 j82, HA0<? super J82, C7458kA2> ha0) {
        C8120mp2 timeout = j82.timeout();
        C8120mp2 timeout2 = r().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long a2 = C8120mp2.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(a2, timeUnit);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                ha0.invoke(j82);
                C7458kA2 c7458kA2 = C7458kA2.a;
                UP0.d(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                UP0.c(1);
                return;
            } catch (Throwable th) {
                UP0.d(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                UP0.c(1);
                throw th;
            }
        }
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            ha0.invoke(j82);
            C7458kA2 c7458kA22 = C7458kA2.a;
            UP0.d(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            UP0.c(1);
        } catch (Throwable th2) {
            UP0.d(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            UP0.c(1);
            throw th2;
        }
    }

    @NotNull
    public final C5422bq f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    @NotNull
    public final Condition h() {
        return this.h;
    }

    @Nullable
    public final J82 i() {
        return this.f;
    }

    @NotNull
    public final ReentrantLock j() {
        return this.g;
    }

    public final long k() {
        return this.a;
    }

    public final boolean l() {
        return this.d;
    }

    public final boolean m() {
        return this.e;
    }

    public final void n(boolean z) {
        this.c = z;
    }

    public final void o(@Nullable J82 j82) {
        this.f = j82;
    }

    public final void p(boolean z) {
        this.d = z;
    }

    public final void q(boolean z) {
        this.e = z;
    }

    @InterfaceC8046mW0(name = "sink")
    @NotNull
    public final J82 r() {
        return this.i;
    }

    @InterfaceC8046mW0(name = "source")
    @NotNull
    public final InterfaceC7072ia2 s() {
        return this.j;
    }
}
