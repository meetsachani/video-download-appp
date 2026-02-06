package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.ko2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7612ko2 {
    public long a;
    public long b;
    public long c;
    public long d;
    @NotNull
    public final ReentrantLock e;
    @NotNull
    public final Condition f;

    /* renamed from: o.ko2$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3011Fy0 {
        public final /* synthetic */ C7612ko2 X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J82 j82, C7612ko2 c7612ko2) {
            super(j82);
            this.X = c7612ko2;
        }

        @Override // o.AbstractC3011Fy0, o.J82
        public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
            C6562gT0.p(c5422bq, "source");
            while (j > 0) {
                try {
                    long l = this.X.l(j);
                    super.write(c5422bq, l);
                    j -= l;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* renamed from: o.ko2$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3501Ky0 {
        public final /* synthetic */ C7612ko2 X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7072ia2 interfaceC7072ia2, C7612ko2 c7612ko2) {
            super(interfaceC7072ia2);
            this.X = c7612ko2;
        }

        @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            C6562gT0.p(c5422bq, "sink");
            try {
                return super.read(c5422bq, this.X.l(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public C7612ko2(long j) {
        this.a = j;
        this.c = 8192L;
        this.d = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C6562gT0.o(newCondition, "newCondition(...)");
        this.f = newCondition;
    }

    public static /* synthetic */ void e(C7612ko2 c7612ko2, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = c7612ko2.c;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = c7612ko2.d;
        }
        c7612ko2.d(j, j4, j3);
    }

    public final long a(long j, long j2) {
        if (this.b == 0) {
            return j2;
        }
        long max = Math.max(this.a - j, 0L);
        long i = this.d - i(max);
        if (i >= j2) {
            this.a = j + max + f(j2);
            return j2;
        }
        long j3 = this.c;
        if (i >= j3) {
            this.a = j + f(this.d);
            return i;
        }
        long min = Math.min(j3, j2);
        long f = max + f(min - this.d);
        if (f == 0) {
            this.a = j + f(this.d);
            return min;
        }
        return -f;
    }

    @InterfaceC8289nW0
    public final void b(long j) {
        e(this, j, 0L, 0L, 6, null);
    }

    @InterfaceC8289nW0
    public final void c(long j, long j2) {
        e(this, j, j2, 0L, 4, null);
    }

    @InterfaceC8289nW0
    public final void d(long j, long j2, long j3) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (j >= 0) {
                if (j2 > 0) {
                    if (j3 >= j2) {
                        this.b = j;
                        this.c = j2;
                        this.d = j3;
                        this.f.signalAll();
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long f(long j) {
        return (j * C10323vs.k) / this.b;
    }

    @NotNull
    public final Condition g() {
        return this.f;
    }

    @NotNull
    public final ReentrantLock h() {
        return this.e;
    }

    public final long i(long j) {
        return (j * this.b) / C10323vs.k;
    }

    @NotNull
    public final J82 j(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        return new a(j82, this);
    }

    @NotNull
    public final InterfaceC7072ia2 k(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        return new b(interfaceC7072ia2, this);
    }

    public final long l(long j) {
        if (j > 0) {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            while (true) {
                try {
                    long a2 = a(System.nanoTime(), j);
                    if (a2 >= 0) {
                        return a2;
                    }
                    this.f.awaitNanos(-a2);
                } finally {
                    reentrantLock.unlock();
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public C7612ko2() {
        this(System.nanoTime());
    }
}
