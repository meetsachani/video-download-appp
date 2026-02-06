package o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import o.InterfaceC8512oQ1;
import sun.misc.Unsafe;

@InterfaceC5601ca0
@InterfaceC8512oQ1(InterfaceC8512oQ1.a.FULL)
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public abstract class Q0<V> extends AS0 implements InterfaceFutureC8411o11<V> {
    public static final boolean Y0;
    public static final Logger Z0;
    public static final long a1 = 1000;
    public static final b b1;
    public static final Object c1;
    @MB
    public volatile Object X;
    @MB
    public volatile e Y;
    @MB
    public volatile l Z;

    /* loaded from: classes3.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(Q0<?> q0, @MB e eVar, e eVar2);

        public abstract boolean b(Q0<?> q0, @MB Object obj, Object obj2);

        public abstract boolean c(Q0<?> q0, @MB l lVar, @MB l lVar2);

        public abstract e d(Q0<?> q0, e eVar);

        public abstract l e(Q0<?> q0, l lVar);

        public abstract void f(l lVar, @MB l lVar2);

        public abstract void g(l lVar, Thread thread);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @MB
        public static final c c;
        @MB
        public static final c d;
        public final boolean a;
        @MB
        public final Throwable b;

        static {
            if (Q0.Y0) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean z, @MB Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* loaded from: classes3.dex */
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
            this.a = (Throwable) C10664xF1.E(th);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<l, Thread> a;
        public final AtomicReferenceFieldUpdater<l, l> b;
        public final AtomicReferenceFieldUpdater<Q0, l> c;
        public final AtomicReferenceFieldUpdater<Q0, e> d;
        public final AtomicReferenceFieldUpdater<Q0, Object> e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<Q0, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<Q0, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<Q0, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // o.Q0.b
        public boolean a(Q0<?> q0, @MB e eVar, e eVar2) {
            return P2.a(this.d, q0, eVar, eVar2);
        }

        @Override // o.Q0.b
        public boolean b(Q0<?> q0, @MB Object obj, Object obj2) {
            return P2.a(this.e, q0, obj, obj2);
        }

        @Override // o.Q0.b
        public boolean c(Q0<?> q0, @MB l lVar, @MB l lVar2) {
            return P2.a(this.c, q0, lVar, lVar2);
        }

        @Override // o.Q0.b
        public e d(Q0<?> q0, e eVar) {
            return this.d.getAndSet(q0, eVar);
        }

        @Override // o.Q0.b
        public l e(Q0<?> q0, l lVar) {
            return this.c.getAndSet(q0, lVar);
        }

        @Override // o.Q0.b
        public void f(l lVar, @MB l lVar2) {
            this.b.lazySet(lVar, lVar2);
        }

        @Override // o.Q0.b
        public void g(l lVar, Thread thread) {
            this.a.lazySet(lVar, thread);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<V> implements Runnable {
        public final Q0<V> X;
        public final InterfaceFutureC8411o11<? extends V> Y;

        public g(Q0<V> q0, InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11) {
            this.X = q0;
            this.Y = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.X == this) {
                if (Q0.b1.b(this.X, this, Q0.u(this.Y))) {
                    Q0.r(this.X);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // o.Q0.b
        public boolean a(Q0<?> q0, @MB e eVar, e eVar2) {
            synchronized (q0) {
                try {
                    if (q0.Y == eVar) {
                        q0.Y = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.Q0.b
        public boolean b(Q0<?> q0, @MB Object obj, Object obj2) {
            synchronized (q0) {
                try {
                    if (q0.X == obj) {
                        q0.X = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.Q0.b
        public boolean c(Q0<?> q0, @MB l lVar, @MB l lVar2) {
            synchronized (q0) {
                try {
                    if (q0.Z == lVar) {
                        q0.Z = lVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.Q0.b
        public e d(Q0<?> q0, e eVar) {
            e eVar2;
            synchronized (q0) {
                try {
                    eVar2 = q0.Y;
                    if (eVar2 != eVar) {
                        q0.Y = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // o.Q0.b
        public l e(Q0<?> q0, l lVar) {
            l lVar2;
            synchronized (q0) {
                try {
                    lVar2 = q0.Z;
                    if (lVar2 != lVar) {
                        q0.Z = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override // o.Q0.b
        public void f(l lVar, @MB l lVar2) {
            lVar.b = lVar2;
        }

        @Override // o.Q0.b
        public void g(l lVar, Thread thread) {
            lVar.a = thread;
        }
    }

    /* loaded from: classes3.dex */
    public interface i<V> extends InterfaceFutureC8411o11<V> {
    }

    /* loaded from: classes3.dex */
    public static abstract class j<V> extends Q0<V> implements i<V> {
        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        public boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        @InterfaceC7165iy1
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // o.Q0, o.InterfaceFutureC8411o11
        public void h4(Runnable runnable, Executor executor) {
            super.h4(runnable, executor);
        }

        @Override // o.Q0, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // o.Q0, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        @InterfaceC7165iy1
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends b {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        /* loaded from: classes3.dex */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() throws Exception {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    c = unsafe.objectFieldOffset(Q0.class.getDeclaredField("Z"));
                    b = unsafe.objectFieldOffset(Q0.class.getDeclaredField("Y"));
                    d = unsafe.objectFieldOffset(Q0.class.getDeclaredField("X"));
                    e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    a = unsafe;
                } catch (Exception e2) {
                    C7855lo2.w(e2);
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        public k() {
            super();
        }

        @Override // o.Q0.b
        public boolean a(Q0<?> q0, @MB e eVar, e eVar2) {
            return C8038mT2.a(a, q0, b, eVar, eVar2);
        }

        @Override // o.Q0.b
        public boolean b(Q0<?> q0, @MB Object obj, Object obj2) {
            return C8038mT2.a(a, q0, d, obj, obj2);
        }

        @Override // o.Q0.b
        public boolean c(Q0<?> q0, @MB l lVar, @MB l lVar2) {
            return C8038mT2.a(a, q0, c, lVar, lVar2);
        }

        @Override // o.Q0.b
        public e d(Q0<?> q0, e eVar) {
            e eVar2;
            do {
                eVar2 = q0.Y;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(q0, eVar2, eVar));
            return eVar2;
        }

        @Override // o.Q0.b
        public l e(Q0<?> q0, l lVar) {
            l lVar2;
            do {
                lVar2 = q0.Z;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(q0, lVar2, lVar));
            return lVar2;
        }

        @Override // o.Q0.b
        public void f(l lVar, @MB l lVar2) {
            a.putObject(lVar, f, lVar2);
        }

        @Override // o.Q0.b
        public void g(l lVar, Thread thread) {
            a.putObject(lVar, e, thread);
        }
    }

    /* loaded from: classes3.dex */
    public static final class l {
        public static final l c = new l(false);
        @MB
        public volatile Thread a;
        @MB
        public volatile l b;

        public l(boolean z) {
        }

        public void a(@MB l lVar) {
            Q0.b1.f(this, lVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            Q0.b1.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        b hVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C3855Oo.a));
        } catch (SecurityException unused) {
            z = false;
        }
        Y0 = z;
        Z0 = Logger.getLogger(Q0.class.getName());
        Throwable th2 = null;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(Q0.class, l.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(Q0.class, e.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(Q0.class, Object.class, "X"));
            } catch (Throwable th4) {
                th2 = th4;
                hVar = new h();
            }
        }
        b1 = hVar;
        if (th2 != null) {
            Logger logger = Z0;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        c1 = new Object();
    }

    public static CancellationException p(String str, @MB Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.Q0$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.Q0<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.Q0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.Q0<V>, o.Q0] */
    public static void r(Q0<?> q0) {
        e eVar = null;
        while (true) {
            q0.z();
            q0.m();
            e q = q0.q(eVar);
            while (q != null) {
                eVar = q.c;
                Runnable runnable = q.a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    q0 = gVar.X;
                    if (q0.X == gVar) {
                        if (b1.b(q0, gVar, u(gVar.Y))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q.b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                q = eVar;
            }
            return;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = Z0;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e2);
        }
    }

    public static Object u(InterfaceFutureC8411o11<?> interfaceFutureC8411o11) {
        Throwable a2;
        if (interfaceFutureC8411o11 instanceof i) {
            Object obj = ((Q0) interfaceFutureC8411o11).X;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a) {
                    obj = cVar.b != null ? new c(false, cVar.b) : c.d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((interfaceFutureC8411o11 instanceof AS0) && (a2 = BS0.a((AS0) interfaceFutureC8411o11)) != null) {
            return new d(a2);
        } else {
            boolean isCancelled = interfaceFutureC8411o11.isCancelled();
            if ((!Y0) & isCancelled) {
                c cVar2 = c.d;
                Objects.requireNonNull(cVar2);
                return cVar2;
            }
            try {
                Object v = v(interfaceFutureC8411o11);
                if (isCancelled) {
                    String valueOf = String.valueOf(interfaceFutureC8411o11);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                    sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb.append(valueOf);
                    return new c(false, new IllegalArgumentException(sb.toString()));
                } else if (v == null) {
                    return c1;
                } else {
                    return v;
                }
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(interfaceFutureC8411o11);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new d(new IllegalArgumentException(sb2.toString(), e2));
                }
                return new c(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(interfaceFutureC8411o11);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new c(false, new IllegalArgumentException(sb3.toString(), e3));
                }
                return new d(e3.getCause());
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    @InterfaceC7165iy1
    private static <V> V v(Future<V> future) throws ExecutionException {
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

    public final void A(l lVar) {
        lVar.a = null;
        while (true) {
            l lVar2 = this.Z;
            if (lVar2 != l.c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.b;
                    if (lVar2.a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.b = lVar4;
                        if (lVar3.a == null) {
                            break;
                        }
                    } else if (!b1.c(this, lVar2, lVar4)) {
                        break;
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    @InterfaceC6181ey
    public boolean B(@InterfaceC7165iy1 V v) {
        if (v == null) {
            v = (V) c1;
        }
        if (b1.b(this, null, v)) {
            r(this);
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public boolean C(Throwable th) {
        if (b1.b(this, null, new d((Throwable) C10664xF1.E(th)))) {
            r(this);
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public boolean D(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11) {
        d dVar;
        C10664xF1.E(interfaceFutureC8411o11);
        Object obj = this.X;
        if (obj == null) {
            if (interfaceFutureC8411o11.isDone()) {
                if (!b1.b(this, null, u(interfaceFutureC8411o11))) {
                    return false;
                }
                r(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC8411o11);
            if (b1.b(this, null, gVar)) {
                try {
                    interfaceFutureC8411o11.h4(gVar, A30.INSTANCE);
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

    public final boolean E() {
        Object obj = this.X;
        if ((obj instanceof c) && ((c) obj).a) {
            return true;
        }
        return false;
    }

    @Override // o.AS0
    @MB
    public final Throwable a() {
        if (this instanceof i) {
            Object obj = this.X;
            if (obj instanceof d) {
                return ((d) obj).a;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @InterfaceC6181ey
    public boolean cancel(boolean z) {
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
        } else {
            if (z) {
                cVar = c.c;
            } else {
                cVar = c.d;
            }
            Objects.requireNonNull(cVar);
        }
        Q0<V> q0 = this;
        boolean z4 = false;
        while (true) {
            if (b1.b(q0, obj, cVar)) {
                if (z) {
                    q0.w();
                }
                r(q0);
                if (!(obj instanceof g)) {
                    break;
                }
                InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = ((g) obj).Y;
                if (interfaceFutureC8411o11 instanceof i) {
                    q0 = (Q0) interfaceFutureC8411o11;
                    obj = q0.X;
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
                obj = q0.X;
                if (!(obj instanceof g)) {
                    return z4;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    @InterfaceC6181ey
    @InterfaceC7165iy1
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.X;
            if ((obj != null) & (!(obj instanceof g))) {
                return t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l lVar = this.Z;
                if (lVar != l.c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (b1.c(this, lVar, lVar2)) {
                            do {
                                C6920hx1.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.X;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    A(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            A(lVar2);
                        } else {
                            lVar = this.Z;
                        }
                    } while (lVar != l.c);
                    Object obj3 = this.X;
                    Objects.requireNonNull(obj3);
                    return t(obj3);
                }
                Object obj32 = this.X;
                Objects.requireNonNull(obj32);
                return t(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.X;
                if ((obj4 != null) & (!(obj4 instanceof g))) {
                    return t(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String q0 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(C4500Ve2.b);
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(C4500Ve2.b);
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(C4500Ve2.b);
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(q0).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(q0);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        e eVar;
        C10664xF1.F(runnable, "Runnable was null.");
        C10664xF1.F(executor, "Executor was null.");
        if (!isDone() && (eVar = this.Y) != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (b1.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.Y;
            } while (eVar != e.d);
            s(runnable, executor);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.X instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj;
        boolean z;
        if (this.X != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof g)) & z;
    }

    public final void k(StringBuilder sb) {
        try {
            Object v = v(this);
            sb.append("SUCCESS, result=[");
            n(sb, v);
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

    public final void l(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.X;
        if (obj instanceof g) {
            sb.append(", setFuture=[");
            o(sb, ((g) obj).Y);
            sb.append(C6566gU0.g);
        } else {
            try {
                sb2 = C6108ef2.c(y());
            } catch (RuntimeException | StackOverflowError e2) {
                String valueOf = String.valueOf(e2.getClass());
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(valueOf);
                sb2 = sb3.toString();
            }
            if (sb2 != null) {
                sb.append(", info=[");
                sb.append(sb2);
                sb.append(C6566gU0.g);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    public final void n(StringBuilder sb, @MB Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void o(StringBuilder sb, @MB Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e3) {
            e = e3;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    @MB
    public final e q(@MB e eVar) {
        e eVar2 = eVar;
        e d2 = b1.d(this, e.d);
        while (d2 != null) {
            e eVar3 = d2.c;
            d2.c = eVar2;
            eVar2 = d2;
            d2 = eVar3;
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7165iy1
    public final V t(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == c1) {
                    return (V) C2589Bs1.b();
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        throw p("Task was cancelled.", ((c) obj).b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append(C11304zt1.a);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public final void x(@MB Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(E());
        }
    }

    @MB
    public String y() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    public final void z() {
        for (l e2 = b1.e(this, l.c); e2 != null; e2 = e2.b) {
            e2.b();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public static final e d = new e();
        @MB
        public final Runnable a;
        @MB
        public final Executor b;
        @MB
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        public e() {
            this.a = null;
            this.b = null;
        }
    }

    @InterfaceC6919hx0
    @InterfaceC4238Sm
    public void m() {
    }

    public void w() {
    }

    @Override // java.util.concurrent.Future
    @InterfaceC6181ey
    @InterfaceC7165iy1
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.Z;
            if (lVar != l.c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (b1.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.Z;
                } while (lVar != l.c);
                Object obj3 = this.X;
                Objects.requireNonNull(obj3);
                return t(obj3);
            }
            Object obj32 = this.X;
            Objects.requireNonNull(obj32);
            return t(obj32);
        }
        throw new InterruptedException();
    }
}
