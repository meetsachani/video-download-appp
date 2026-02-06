package o;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@InterfaceC5601ca0
/* renamed from: o.gg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6608gg0 {
    public final AtomicReference<InterfaceFutureC8411o11<Void>> a = new AtomicReference<>(C6980iC0.n());
    public e b = new e(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.gg0$a */
    /* loaded from: classes3.dex */
    public class a<T> implements InterfaceC2535Bf<T> {
        public final /* synthetic */ Callable a;

        public a(C6608gg0 c6608gg0, Callable callable) {
            this.a = callable;
        }

        @Override // o.InterfaceC2535Bf
        public InterfaceFutureC8411o11<T> call() throws Exception {
            return C6980iC0.m(this.a.call());
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.gg0$b */
    /* loaded from: classes3.dex */
    public class b<T> implements InterfaceC2535Bf<T> {
        public final /* synthetic */ d a;
        public final /* synthetic */ InterfaceC2535Bf b;

        public b(C6608gg0 c6608gg0, d dVar, InterfaceC2535Bf interfaceC2535Bf) {
            this.a = dVar;
            this.b = interfaceC2535Bf;
        }

        @Override // o.InterfaceC2535Bf
        public InterfaceFutureC8411o11<T> call() throws Exception {
            if (!this.a.e()) {
                return C6980iC0.k();
            }
            return this.b.call();
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* renamed from: o.gg0$c */
    /* loaded from: classes3.dex */
    public enum c {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* renamed from: o.gg0$d */
    /* loaded from: classes3.dex */
    public static final class d extends AtomicReference<c> implements Executor, Runnable {
        @MB
        public C6608gg0 X;
        @MB
        public Executor Y;
        @MB
        public Thread Y0;
        @MB
        public Runnable Z;

        public /* synthetic */ d(Executor executor, C6608gg0 c6608gg0, a aVar) {
            this(executor, c6608gg0);
        }

        public final boolean d() {
            return compareAndSet(c.NOT_RUN, c.CANCELLED);
        }

        public final boolean e() {
            return compareAndSet(c.NOT_RUN, c.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            boolean z;
            if (get() == c.CANCELLED) {
                this.Y = null;
                this.X = null;
                return;
            }
            this.Y0 = Thread.currentThread();
            try {
                C6608gg0 c6608gg0 = this.X;
                Objects.requireNonNull(c6608gg0);
                e eVar = c6608gg0.b;
                if (eVar.a == this.Y0) {
                    this.X = null;
                    if (eVar.b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10664xF1.g0(z);
                    eVar.b = runnable;
                    Executor executor = this.Y;
                    Objects.requireNonNull(executor);
                    eVar.c = executor;
                    this.Y = null;
                } else {
                    Executor executor2 = this.Y;
                    Objects.requireNonNull(executor2);
                    this.Y = null;
                    this.Z = runnable;
                    executor2.execute(this);
                }
                this.Y0 = null;
            } catch (Throwable th) {
                this.Y0 = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.Y0) {
                Runnable runnable = this.Z;
                Objects.requireNonNull(runnable);
                this.Z = null;
                runnable.run();
                return;
            }
            e eVar = new e(null);
            eVar.a = currentThread;
            C6608gg0 c6608gg0 = this.X;
            Objects.requireNonNull(c6608gg0);
            c6608gg0.b = eVar;
            this.X = null;
            try {
                Runnable runnable2 = this.Z;
                Objects.requireNonNull(runnable2);
                this.Z = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = eVar.b;
                    if (runnable3 == null || (executor = eVar.c) == null) {
                        break;
                    }
                    eVar.b = null;
                    eVar.c = null;
                    executor.execute(runnable3);
                }
            } finally {
                eVar.a = null;
            }
        }

        public d(Executor executor, C6608gg0 c6608gg0) {
            super(c.NOT_RUN);
            this.Y = executor;
            this.X = c6608gg0;
        }
    }

    /* renamed from: o.gg0$e */
    /* loaded from: classes3.dex */
    public static final class e {
        @MB
        public Thread a;
        @MB
        public Runnable b;
        @MB
        public Executor c;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(Iu2 iu2, D22 d22, InterfaceFutureC8411o11 interfaceFutureC8411o11, InterfaceFutureC8411o11 interfaceFutureC8411o112, d dVar) {
        if (iu2.isDone()) {
            d22.D(interfaceFutureC8411o11);
        } else if (interfaceFutureC8411o112.isCancelled() && dVar.d()) {
            iu2.cancel(false);
        }
    }

    public static C6608gg0 d() {
        return new C6608gg0();
    }

    public <T> InterfaceFutureC8411o11<T> e(Callable<T> callable, Executor executor) {
        C10664xF1.E(callable);
        C10664xF1.E(executor);
        return f(new a(this, callable), executor);
    }

    public <T> InterfaceFutureC8411o11<T> f(InterfaceC2535Bf<T> interfaceC2535Bf, Executor executor) {
        C10664xF1.E(interfaceC2535Bf);
        C10664xF1.E(executor);
        final d dVar = new d(executor, this, null);
        b bVar = new b(this, dVar, interfaceC2535Bf);
        final D22 F = D22.F();
        final InterfaceFutureC8411o11<Void> andSet = this.a.getAndSet(F);
        final Iu2 P = Iu2.P(bVar);
        andSet.h4(P, dVar);
        final InterfaceFutureC8411o11<T> q = C6980iC0.q(P);
        Runnable runnable = new Runnable() { // from class: o.fg0
            @Override // java.lang.Runnable
            public final void run() {
                C6608gg0.a(Iu2.this, F, andSet, q, dVar);
            }
        };
        q.h4(runnable, C3645Mk1.c());
        P.h4(runnable, C3645Mk1.c());
        return q;
    }
}
