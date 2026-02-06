package o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class P0<V> implements InterfaceFutureC8411o11<V> {
    public static final boolean Y0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C3855Oo.a));
    public static final Logger Z0 = Logger.getLogger(P0.class.getName());
    public static final long a1 = 1000;
    public static final b b1;
    public static final Object c1;
    public volatile Object X;
    public volatile e Y;
    public volatile i Z;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(P0<?> future, e expect, e update);

        public abstract boolean b(P0<?> future, Object expect, Object update);

        public abstract boolean c(P0<?> future, i expect, i update);

        public abstract void d(i waiter, i newValue);

        public abstract void e(i waiter, Thread newValue);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (P0.Y0) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean wasInterrupted, Throwable cause) {
            this.a = wasInterrupted;
            this.b = cause;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.a = (Throwable) P0.d(exception);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable task, Executor executor) {
            this.a = task;
            this.b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<P0, i> c;
        public final AtomicReferenceFieldUpdater<P0, e> d;
        public final AtomicReferenceFieldUpdater<P0, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<P0, i> waitersUpdater, AtomicReferenceFieldUpdater<P0, e> listenersUpdater, AtomicReferenceFieldUpdater<P0, Object> valueUpdater) {
            super();
            this.a = waiterThreadUpdater;
            this.b = waiterNextUpdater;
            this.c = waitersUpdater;
            this.d = listenersUpdater;
            this.e = valueUpdater;
        }

        @Override // o.P0.b
        public boolean a(P0<?> future, e expect, e update) {
            return P2.a(this.d, future, expect, update);
        }

        @Override // o.P0.b
        public boolean b(P0<?> future, Object expect, Object update) {
            return P2.a(this.e, future, expect, update);
        }

        @Override // o.P0.b
        public boolean c(P0<?> future, i expect, i update) {
            return P2.a(this.c, future, expect, update);
        }

        @Override // o.P0.b
        public void d(i waiter, i newValue) {
            this.b.lazySet(waiter, newValue);
        }

        @Override // o.P0.b
        public void e(i waiter, Thread newValue) {
            this.a.lazySet(waiter, newValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final P0<V> X;
        public final InterfaceFutureC8411o11<? extends V> Y;

        public g(P0<V> owner, InterfaceFutureC8411o11<? extends V> future) {
            this.X = owner;
            this.Y = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.X == this) {
                if (P0.b1.b(this.X, this, P0.i(this.Y))) {
                    P0.f(this.X);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // o.P0.b
        public boolean a(P0<?> future, e expect, e update) {
            synchronized (future) {
                try {
                    if (future.Y == expect) {
                        future.Y = update;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.P0.b
        public boolean b(P0<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.X == expect) {
                        future.X = update;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.P0.b
        public boolean c(P0<?> future, i expect, i update) {
            synchronized (future) {
                try {
                    if (future.Z == expect) {
                        future.Z = update;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.P0.b
        public void d(i waiter, i newValue) {
            waiter.b = newValue;
        }

        @Override // o.P0.b
        public void e(i waiter, Thread newValue) {
            waiter.a = newValue;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i(boolean unused) {
        }

        public void a(i next) {
            P0.b1.d(this, next);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            P0.b1.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(P0.class, i.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(P0.class, e.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(P0.class, Object.class, "X"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        b1 = hVar;
        if (th != null) {
            Z0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c1 = new Object();
    }

    private void a(StringBuilder builder) {
        try {
            Object j = j(this);
            builder.append("SUCCESS, result=[");
            builder.append(s(j));
            builder.append(C6566gU0.g);
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e2) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e2.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            builder.append("FAILURE, cause=[");
            builder.append(e3.getCause());
            builder.append(C6566gU0.g);
        }
    }

    private static CancellationException c(String message, Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    public static <T> T d(T reference) {
        reference.getClass();
        return reference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.P0$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.P0<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.P0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.P0<V>, o.P0] */
    public static void f(P0<?> future) {
        e eVar = null;
        while (true) {
            future.n();
            future.b();
            e e2 = future.e(eVar);
            while (e2 != null) {
                eVar = e2.c;
                Runnable runnable = e2.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    future = gVar.X;
                    if (future.X == gVar) {
                        if (b1.b(future, gVar, i(gVar.Y))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e2.b);
                }
                e2 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = Z0;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == c1) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        throw c("Task was cancelled.", ((c) obj).b);
    }

    public static Object i(InterfaceFutureC8411o11<?> future) {
        if (future instanceof P0) {
            Object obj = ((P0) future).X;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a) {
                    if (cVar.b != null) {
                        return new c(false, cVar.b);
                    }
                    return c.d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!Y0) & isCancelled) {
            return c.d;
        }
        try {
            Object j = j(future);
            if (j == null) {
                return c1;
            }
            return j;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.Z;
        } while (!b1.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private String s(Object o2) {
        if (o2 == this) {
            return "this future";
        }
        return String.valueOf(o2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean mayInterruptIfRunning) {
        boolean z;
        c cVar;
        boolean z2;
        Object obj = this.X;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        if (!(z | (obj instanceof g))) {
            return false;
        }
        if (Y0) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else if (mayInterruptIfRunning) {
            cVar = c.c;
        } else {
            cVar = c.d;
        }
        P0<V> p0 = this;
        boolean z3 = false;
        while (true) {
            if (b1.b(p0, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    p0.k();
                }
                f(p0);
                if (!(obj instanceof g)) {
                    break;
                }
                InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = ((g) obj).Y;
                if (interfaceFutureC8411o11 instanceof P0) {
                    p0 = (P0) interfaceFutureC8411o11;
                    obj = p0.X;
                    if (obj == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && !(obj instanceof g)) {
                        break;
                    }
                    z3 = true;
                } else {
                    interfaceFutureC8411o11.cancel(mayInterruptIfRunning);
                    break;
                }
            } else {
                obj = p0.X;
                if (!(obj instanceof g)) {
                    return z3;
                }
            }
        }
    }

    public final e e(e onto) {
        e eVar;
        do {
            eVar = this.Y;
        } while (!b1.a(this, eVar, e.d));
        e eVar2 = onto;
        e eVar3 = eVar;
        while (eVar3 != null) {
            e eVar4 = eVar3.c;
            eVar3.c = eVar2;
            eVar2 = eVar3;
            eVar3 = eVar4;
        }
        return eVar2;
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = unit.toNanos(timeout);
        if (!Thread.interrupted()) {
            Object obj = this.X;
            if ((obj != null) & (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.Z;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (b1.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.X;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.Z;
                        }
                    } while (iVar != i.c);
                    return h(this.X);
                }
                return h(this.X);
            }
            while (nanos > 0) {
                Object obj3 = this.X;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String p0 = toString();
            String lowerCase = unit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + timeout + C4500Ve2.b + unit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j = -nanos;
                long convert = unit.convert(j, TimeUnit.NANOSECONDS);
                long nanos2 = j - unit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + C4500Ve2.b + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + C4500Ve2.b;
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + p0);
        }
        throw new InterruptedException();
    }

    @Override // o.InterfaceFutureC8411o11
    public final void h4(Runnable listener, Executor executor) {
        d(listener);
        d(executor);
        e eVar = this.Y;
        if (eVar != e.d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.c = eVar;
                if (b1.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.Y;
            } while (eVar != e.d);
            g(listener, executor);
        }
        g(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.X != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof g)) & z;
    }

    public final void l(Future<?> related) {
        boolean z;
        if (related != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            related.cancel(t());
        }
    }

    public String m() {
        Object obj = this.X;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).Y) + C6566gU0.g;
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void o(i node) {
        node.a = null;
        while (true) {
            i iVar = this.Z;
            if (iVar != i.c) {
                i iVar2 = null;
                while (iVar != null) {
                    i iVar3 = iVar.b;
                    if (iVar.a != null) {
                        iVar2 = iVar;
                    } else if (iVar2 != null) {
                        iVar2.b = iVar3;
                        if (iVar2.a == null) {
                            break;
                        }
                    } else if (!b1.c(this, iVar, iVar3)) {
                        break;
                    }
                    iVar = iVar3;
                }
                return;
            }
            return;
        }
    }

    public boolean p(V value) {
        if (value == null) {
            value = (V) c1;
        }
        if (b1.b(this, null, value)) {
            f(this);
            return true;
        }
        return false;
    }

    public boolean q(Throwable throwable) {
        if (b1.b(this, null, new d((Throwable) d(throwable)))) {
            f(this);
            return true;
        }
        return false;
    }

    public boolean r(InterfaceFutureC8411o11<? extends V> future) {
        d dVar;
        d(future);
        Object obj = this.X;
        if (obj == null) {
            if (future.isDone()) {
                if (!b1.b(this, null, i(future))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, future);
            if (b1.b(this, null, gVar)) {
                try {
                    future.h4(gVar, EnumC11101z30.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    b1.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.X;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).a);
        }
        return false;
    }

    public final boolean t() {
        Object obj = this.X;
        if ((obj instanceof c) && ((c) obj).a) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(C6566gU0.g);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public void b() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.Z;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (b1.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.Z;
                } while (iVar != i.c);
                return h(this.X);
            }
            return h(this.X);
        }
        throw new InterruptedException();
    }
}
