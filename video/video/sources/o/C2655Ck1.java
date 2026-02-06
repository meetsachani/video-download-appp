package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.Ck1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2655Ck1 {
    public final boolean a;
    public final ReentrantLock b;
    @InterfaceC7980mF0("lock")
    @MB
    public a c;

    /* renamed from: o.Ck1$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        @GJ2
        public final C2655Ck1 a;
        public final Condition b;
        @InterfaceC7980mF0("monitor.lock")
        public int c = 0;
        @InterfaceC7980mF0("monitor.lock")
        @MB
        public a d;

        public a(C2655Ck1 c2655Ck1) {
            this.a = (C2655Ck1) C10664xF1.F(c2655Ck1, "monitor");
            this.b = c2655Ck1.b.newCondition();
        }

        public abstract boolean a();
    }

    public C2655Ck1() {
        this(false);
    }

    public static long E(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (System.nanoTime() - j);
    }

    public static long H(long j, TimeUnit timeUnit) {
        return C7194j51.f(timeUnit.toNanos(j), 0L, 6917529027641081853L);
    }

    public static long y(long j) {
        if (j <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    public boolean A() {
        return this.b.isLocked();
    }

    public boolean B() {
        return this.b.isHeldByCurrentThread();
    }

    @InterfaceC7980mF0("lock")
    public final boolean C(a aVar) {
        try {
            return aVar.a();
        } catch (Throwable th) {
            F();
            throw th;
        }
    }

    public void D() {
        ReentrantLock reentrantLock = this.b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @InterfaceC7980mF0("lock")
    public final void F() {
        for (a aVar = this.c; aVar != null; aVar = aVar.d) {
            aVar.b.signalAll();
        }
    }

    @InterfaceC7980mF0("lock")
    public final void G() {
        for (a aVar = this.c; aVar != null; aVar = aVar.d) {
            if (C(aVar)) {
                aVar.b.signal();
                return;
            }
        }
    }

    public boolean I() {
        return this.b.tryLock();
    }

    public boolean J(a aVar) {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            if (!reentrantLock.tryLock()) {
                return false;
            }
            try {
                boolean a2 = aVar.a();
                if (!a2) {
                }
                return a2;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void K(a aVar) throws InterruptedException {
        if (aVar.a == this && this.b.isHeldByCurrentThread()) {
            if (!aVar.a()) {
                b(aVar, true);
                return;
            }
            return;
        }
        throw new IllegalMonitorStateException();
    }

    public boolean L(a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        long H = H(j, timeUnit);
        if (aVar.a == this && this.b.isHeldByCurrentThread()) {
            if (aVar.a()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return c(aVar, H, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    public void M(a aVar) {
        if (aVar.a == this && this.b.isHeldByCurrentThread()) {
            if (!aVar.a()) {
                d(aVar, true);
                return;
            }
            return;
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean N(a aVar, long j, TimeUnit timeUnit) {
        long H = H(j, timeUnit);
        if (aVar.a == this && this.b.isHeldByCurrentThread()) {
            boolean z = true;
            if (aVar.a()) {
                return true;
            }
            long y = y(H);
            boolean interrupted = Thread.interrupted();
            long j2 = H;
            boolean z2 = true;
            while (true) {
                try {
                    try {
                        boolean c = c(aVar, j2, z2);
                        if (interrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return c;
                    } catch (InterruptedException unused) {
                        if (aVar.a()) {
                            Thread.currentThread().interrupt();
                            return true;
                        }
                        j2 = E(y, H);
                        z2 = false;
                        interrupted = true;
                    } catch (Throwable th) {
                        th = th;
                        z = interrupted;
                        if (z) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    @InterfaceC7980mF0("lock")
    public final void b(a aVar, boolean z) throws InterruptedException {
        if (z) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.b.await();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @InterfaceC7980mF0("lock")
    public final boolean c(a aVar, long j, boolean z) throws InterruptedException {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        G();
                    } catch (Throwable th) {
                        if (!z2) {
                            f(aVar);
                        }
                        throw th;
                    }
                }
                e(aVar);
                z2 = false;
            }
            j = aVar.b.awaitNanos(j);
            if (aVar.a()) {
                if (!z2) {
                    f(aVar);
                }
                return true;
            }
        }
        if (!z2) {
            f(aVar);
        }
        return false;
    }

    @InterfaceC7980mF0("lock")
    public final void d(a aVar, boolean z) {
        if (z) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.b.awaitUninterruptibly();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @InterfaceC7980mF0("lock")
    public final void e(a aVar) {
        int i = aVar.c;
        aVar.c = i + 1;
        if (i == 0) {
            aVar.d = this.c;
            this.c = aVar;
        }
    }

    @InterfaceC7980mF0("lock")
    public final void f(a aVar) {
        int i = aVar.c - 1;
        aVar.c = i;
        if (i == 0) {
            a aVar2 = this.c;
            a aVar3 = null;
            while (aVar2 != aVar) {
                aVar3 = aVar2;
                aVar2 = aVar2.d;
            }
            if (aVar3 == null) {
                this.c = aVar2.d;
            } else {
                aVar3.d = aVar2.d;
            }
            aVar2.d = null;
        }
    }

    public void g() {
        this.b.lock();
    }

    public boolean h(long j, TimeUnit timeUnit) {
        boolean tryLock;
        long H = H(j, timeUnit);
        ReentrantLock reentrantLock = this.b;
        boolean z = true;
        if (!this.a && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j2 = H;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j2, TimeUnit.NANOSECONDS);
                        break;
                    } catch (InterruptedException unused) {
                        j2 = E(nanoTime, H);
                        interrupted = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th2) {
            th = th2;
            z = interrupted;
        }
    }

    public boolean i(a aVar) {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                boolean a2 = aVar.a();
                if (!a2) {
                }
                return a2;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean j(a aVar, long j, TimeUnit timeUnit) {
        if (aVar.a == this) {
            if (!h(j, timeUnit)) {
                return false;
            }
            try {
                boolean a2 = aVar.a();
                if (!a2) {
                }
                return a2;
            } finally {
                this.b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean k(a aVar) throws InterruptedException {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lockInterruptibly();
            try {
                boolean a2 = aVar.a();
                if (!a2) {
                }
                return a2;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean l(a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            if (!reentrantLock.tryLock(j, timeUnit)) {
                return false;
            }
            try {
                boolean a2 = aVar.a();
                if (!a2) {
                }
                return a2;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void m() throws InterruptedException {
        this.b.lockInterruptibly();
    }

    public boolean n(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.tryLock(j, timeUnit);
    }

    public void o(a aVar) throws InterruptedException {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lockInterruptibly();
            try {
                if (!aVar.a()) {
                    b(aVar, isHeldByCurrentThread);
                    return;
                }
                return;
            } catch (Throwable th) {
                D();
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (c(r11, r0, r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean p(a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        long y;
        long H = H(j, timeUnit);
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean z = false;
            try {
                if (!this.a) {
                    if (!Thread.interrupted()) {
                        if (reentrantLock.tryLock()) {
                            y = 0;
                            if (!aVar.a()) {
                                if (y != 0) {
                                    H = E(y, H);
                                }
                            }
                            z = true;
                            if (!z) {
                            }
                            return z;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                }
                if (!aVar.a()) {
                }
                z = true;
                if (!z) {
                }
                return z;
            } catch (Throwable th) {
                if (!isHeldByCurrentThread) {
                    try {
                        G();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                throw th;
            }
            y = y(H);
            if (!reentrantLock.tryLock(j, timeUnit)) {
                return false;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    public void q(a aVar) {
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lock();
            try {
                if (!aVar.a()) {
                    d(aVar, isHeldByCurrentThread);
                    return;
                }
                return;
            } catch (Throwable th) {
                D();
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:5:0x0012, B:7:0x001a, B:28:0x004f, B:32:0x005c, B:33:0x005f, B:13:0x0025, B:15:0x002a, B:17:0x0032, B:22:0x003d, B:26:0x0049, B:25:0x0045), top: B:47:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r(a aVar, long j, TimeUnit timeUnit) {
        long y;
        long E;
        long H = H(j, timeUnit);
        if (aVar.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean interrupted = Thread.interrupted();
            try {
                boolean z = true;
                if (!this.a && reentrantLock.tryLock()) {
                    y = 0;
                    while (!aVar.a()) {
                        try {
                            if (y == 0) {
                                y = y(H);
                                E = H;
                            } else {
                                E = E(y, H);
                            }
                            z = c(aVar, E, isHeldByCurrentThread);
                        } catch (InterruptedException unused) {
                            isHeldByCurrentThread = false;
                            interrupted = z;
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (!z) {
                        reentrantLock.unlock();
                    }
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return z;
                }
                y = y(H);
                long j2 = H;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (InterruptedException unused2) {
                            j2 = E(y, H);
                            interrupted = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        interrupted = true;
                        if (interrupted) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (!reentrantLock.tryLock(j2, TimeUnit.NANOSECONDS)) {
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
                while (!aVar.a()) {
                }
                if (!z) {
                }
                if (interrupted) {
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    public int s() {
        return this.b.getHoldCount();
    }

    public int t() {
        return this.b.getQueueLength();
    }

    public int u(a aVar) {
        if (aVar.a == this) {
            this.b.lock();
            try {
                return aVar.c;
            } finally {
                this.b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean v(Thread thread) {
        return this.b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.b.hasQueuedThreads();
    }

    public boolean x(a aVar) {
        if (u(aVar) > 0) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.a;
    }

    public C2655Ck1(boolean z) {
        this.c = null;
        this.a = z;
        this.b = new ReentrantLock(z);
    }
}
