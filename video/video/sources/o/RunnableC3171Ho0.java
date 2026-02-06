package o;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.Ho0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3171Ho0 implements Runnable {
    public static final C4147Ro0[] a1 = new C4147Ro0[0];
    public final long X;
    public final List<C4147Ro0> Y;
    public ThreadFactory Y0;
    public Thread Z;
    public volatile boolean Z0;

    public RunnableC3171Ho0() {
        this(10000L);
    }

    public void a(C4147Ro0 c4147Ro0) {
        if (c4147Ro0 != null) {
            this.Y.add(c4147Ro0);
        }
    }

    public long b() {
        return this.X;
    }

    public Iterable<C4147Ro0> c() {
        return new ArrayList(this.Y);
    }

    public void d(final C4147Ro0 c4147Ro0) {
        if (c4147Ro0 != null) {
            this.Y.removeIf(new Predicate() { // from class: o.Eo0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C4147Ro0.this.equals((C4147Ro0) obj);
                }
            });
        }
    }

    public synchronized void e(ThreadFactory threadFactory) {
        this.Y0 = threadFactory;
    }

    public synchronized void f() throws Exception {
        try {
            if (!this.Z0) {
                for (C4147Ro0 c4147Ro0 : this.Y) {
                    c4147Ro0.v();
                }
                this.Z0 = true;
                ThreadFactory threadFactory = this.Y0;
                if (threadFactory != null) {
                    this.Z = threadFactory.newThread(this);
                } else {
                    this.Z = new Thread(this);
                }
                this.Z.start();
            } else {
                throw new IllegalStateException("Monitor is already running");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() throws Exception {
        h(this.X);
    }

    public synchronized void h(long j) throws Exception {
        if (this.Z0) {
            this.Z0 = false;
            try {
                this.Z.interrupt();
                this.Z.join(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            for (C4147Ro0 c4147Ro0 : this.Y) {
                c4147Ro0.n();
            }
        } else {
            throw new IllegalStateException("Monitor is not running");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Duration ofMillis;
        while (this.Z0) {
            this.Y.forEach(new Consumer() { // from class: o.Go0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((C4147Ro0) obj).l();
                }
            });
            if (this.Z0) {
                try {
                    ofMillis = Duration.ofMillis(this.X);
                    C5174ao2.b(ofMillis);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    public RunnableC3171Ho0(long j) {
        this.Y = new CopyOnWriteArrayList();
        this.X = j;
    }

    public RunnableC3171Ho0(long j, Collection<C4147Ro0> collection) {
        this(j, (C4147Ro0[]) ((Collection) Optional.ofNullable(collection).orElse(Collections.EMPTY_LIST)).toArray(a1));
    }

    public RunnableC3171Ho0(long j, C4147Ro0... c4147Ro0Arr) {
        this(j);
        if (c4147Ro0Arr != null) {
            Stream.of((Object[]) c4147Ro0Arr).forEach(new Consumer() { // from class: o.Fo0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    RunnableC3171Ho0.this.a((C4147Ro0) obj);
                }
            });
        }
    }
}
