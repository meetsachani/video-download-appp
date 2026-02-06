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
public abstract class O2<V> implements InterfaceFutureC8411o11<V> {
    public static final boolean Y0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C3855Oo.a));
    public static final Logger Z0 = Logger.getLogger(O2.class.getName());
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

        public abstract boolean a(O2<?> o2, e eVar, e eVar2);

        public abstract boolean b(O2<?> o2, Object obj, Object obj2);

        public abstract boolean c(O2<?> o2, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (O2.Y0) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.a = (Throwable) O2.i(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<O2, i> c;
        public final AtomicReferenceFieldUpdater<O2, e> d;
        public final AtomicReferenceFieldUpdater<O2, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<O2, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<O2, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<O2, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // o.O2.b
        public boolean a(O2<?> o2, e eVar, e eVar2) {
            return P2.a(this.d, o2, eVar, eVar2);
        }

        @Override // o.O2.b
        public boolean b(O2<?> o2, Object obj, Object obj2) {
            return P2.a(this.e, o2, obj, obj2);
        }

        @Override // o.O2.b
        public boolean c(O2<?> o2, i iVar, i iVar2) {
            return P2.a(this.c, o2, iVar, iVar2);
        }

        @Override // o.O2.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // o.O2.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final O2<V> X;
        public final InterfaceFutureC8411o11<? extends V> Y;

        public g(O2<V> o2, InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11) {
            this.X = o2;
            this.Y = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.X == this) {
                if (O2.b1.b(this.X, this, O2.o(this.Y))) {
                    O2.l(this.X);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // o.O2.b
        public boolean a(O2<?> o2, e eVar, e eVar2) {
            synchronized (o2) {
                try {
                    if (o2.Y == eVar) {
                        o2.Y = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.O2.b
        public boolean b(O2<?> o2, Object obj, Object obj2) {
            synchronized (o2) {
                try {
                    if (o2.X == obj) {
                        o2.X = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.O2.b
        public boolean c(O2<?> o2, i iVar, i iVar2) {
            synchronized (o2) {
                try {
                    if (o2.Z == iVar) {
                        o2.Z = iVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.O2.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // o.O2.b
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i(boolean z) {
        }

        public void a(i iVar) {
            O2.b1.d(this, iVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            O2.b1.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(O2.class, i.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(O2.class, e.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(O2.class, Object.class, "X"));
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

    private void e(StringBuilder sb) {
        try {
            Object p = p(this);
            sb.append("SUCCESS, result=[");
            sb.append(y(p));
            sb.append(C6566gU0.g);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(C6566gU0.g);
        }
    }

    private static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T i(T t) {
        t.getClass();
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.O2$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.O2<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.O2] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.O2, o.O2<V>] */
    public static void l(O2<?> o2) {
        e eVar = null;
        while (true) {
            o2.t();
            o2.g();
            e j = o2.j(eVar);
            while (j != null) {
                eVar = j.c;
                Runnable runnable = j.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    o2 = gVar.X;
                    if (o2.X == gVar) {
                        if (b1.b(o2, gVar, o(gVar.Y))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m(runnable, j.b);
                }
                j = eVar;
            }
            return;
        }
    }

    private static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = Z0;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V n(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == c1) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        throw h("Task was cancelled.", ((c) obj).b);
    }

    public static Object o(InterfaceFutureC8411o11<?> interfaceFutureC8411o11) {
        if (interfaceFutureC8411o11 instanceof O2) {
            Object obj = ((O2) interfaceFutureC8411o11).X;
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
        boolean isCancelled = interfaceFutureC8411o11.isCancelled();
        if ((!Y0) & isCancelled) {
            return c.d;
        }
        try {
            Object p = p(interfaceFutureC8411o11);
            if (p == null) {
                return c1;
            }
            return p;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC8411o11, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V p(Future<V> future) throws ExecutionException {
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

    private void t() {
        i iVar;
        do {
            iVar = this.Z;
        } while (!b1.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        boolean z2;
        c cVar;
        boolean z3;
        Object obj = this.X;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof g))) {
            return false;
        }
        if (Y0) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = c.c;
        } else {
            cVar = c.d;
        }
        O2<V> o2 = this;
        boolean z4 = false;
        while (true) {
            if (b1.b(o2, obj, cVar)) {
                if (z) {
                    o2.q();
                }
                l(o2);
                if (!(obj instanceof g)) {
                    break;
                }
                InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = ((g) obj).Y;
                if (interfaceFutureC8411o11 instanceof O2) {
                    o2 = (O2) interfaceFutureC8411o11;
                    obj = o2.X;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof g)) {
                        break;
                    }
                    z4 = true;
                } else {
                    interfaceFutureC8411o11.cancel(z);
                    break;
                }
            } else {
                obj = o2.X;
                if (!(obj instanceof g)) {
                    return z4;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.X;
            if ((obj != null) & (!(obj instanceof g))) {
                return n(obj);
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
                                        return n(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    u(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            u(iVar2);
                        } else {
                            iVar = this.Z;
                        }
                    } while (iVar != i.c);
                    return n(this.X);
                }
                return n(this.X);
            }
            while (nanos > 0) {
                Object obj3 = this.X;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return n(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String o2 = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + C4500Ve2.b + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(str + " for " + o2);
        }
        throw new InterruptedException();
    }

    @Override // o.InterfaceFutureC8411o11
    public final void h4(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        e eVar = this.Y;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (b1.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.Y;
            } while (eVar != e.d);
            m(runnable, executor);
        }
        m(runnable, executor);
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

    public final e j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.Y;
        } while (!b1.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final void r(Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(z());
        }
    }

    public String s() {
        Object obj = this.X;
        if (obj instanceof g) {
            return "setFuture=[" + y(((g) obj).Y) + C6566gU0.g;
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                str = s();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(C6566gU0.g);
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public final void u(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.Z;
            if (iVar2 != i.c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.b;
                    if (iVar2.a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.b = iVar4;
                        if (iVar3.a == null) {
                            break;
                        }
                    } else if (!b1.c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean v(V v) {
        if (v == null) {
            v = (V) c1;
        }
        if (b1.b(this, null, v)) {
            l(this);
            return true;
        }
        return false;
    }

    public boolean w(Throwable th) {
        if (b1.b(this, null, new d((Throwable) i(th)))) {
            l(this);
            return true;
        }
        return false;
    }

    public boolean x(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11) {
        d dVar;
        i(interfaceFutureC8411o11);
        Object obj = this.X;
        if (obj == null) {
            if (interfaceFutureC8411o11.isDone()) {
                if (!b1.b(this, null, o(interfaceFutureC8411o11))) {
                    return false;
                }
                l(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC8411o11);
            if (b1.b(this, null, gVar)) {
                try {
                    interfaceFutureC8411o11.h4(gVar, EnumC10858y30.INSTANCE);
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
            interfaceFutureC8411o11.cancel(((c) obj).a);
        }
        return false;
    }

    public final String y(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public final boolean z() {
        Object obj = this.X;
        if ((obj instanceof c) && ((c) obj).a) {
            return true;
        }
        return false;
    }

    public void g() {
    }

    public void q() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return n(obj2);
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
                                u(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return n(obj);
                    }
                    iVar = this.Z;
                } while (iVar != i.c);
                return n(this.X);
            }
            return n(this.X);
        }
        throw new InterruptedException();
    }
}
