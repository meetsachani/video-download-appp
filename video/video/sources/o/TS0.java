package o;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import o.InterfaceC8512oQ1;

@InterfaceC5601ca0
@InterfaceC8512oQ1(InterfaceC8512oQ1.a.FULL)
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public abstract class TS0<T> extends AtomicReference<Runnable> implements Runnable {
    public static final Runnable X = new c();
    public static final Runnable Y = new c();
    public static final int Z = 1000;

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {
        public final TS0<?> X;

        public final void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.X.toString();
        }

        public b(TS0<?> ts0) {
            this.X = ts0;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public abstract void a(Throwable th);

    public abstract void b(@InterfaceC7165iy1 T t);

    public final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(X) == Y) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    @InterfaceC7165iy1
    public abstract T e() throws Exception;

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof b;
            if (!z2 && runnable != Y) {
                break;
            }
            if (z2) {
                bVar = (b) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = Y;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d = d();
            if (!d) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, X)) {
                        g(currentThread);
                    }
                    if (!d) {
                        a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, X)) {
                g(currentThread);
            }
            if (!d) {
                b(C2589Bs1.a(obj));
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == X) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append(C6566gU0.g);
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String f = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(f).length());
        sb2.append(str);
        sb2.append(C6566gU0.h);
        sb2.append(f);
        return sb2.toString();
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
