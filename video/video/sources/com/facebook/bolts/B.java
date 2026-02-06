package com.facebook.bolts;

import com.facebook.bolts.B;
import com.facebook.bolts.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.C6562gT0;
import o.C7458kA2;
import o.C8222nF;
import o.C8319ne2;
import o.C9516sY;
import o.InterfaceC7058iW0;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class B<TResult> {
    @NotNull
    public static final a j = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final ExecutorService k;
    @NotNull
    public static final Executor l;
    @InterfaceC7058iW0
    @NotNull
    public static final Executor m;
    @Nullable
    public static volatile c n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final B<?> f81o;
    @NotNull
    public static final B<Boolean> p;
    @NotNull
    public static final B<Boolean> q;
    @NotNull
    public static final B<?> r;
    @NotNull
    public final ReentrantLock a;
    public final Condition b;
    public boolean c;
    public boolean d;
    @Nullable
    public TResult e;
    @Nullable
    public Exception f;
    public boolean g;
    @Nullable
    public D h;
    @Nullable
    public List<l<TResult, Void>> i;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.facebook.bolts.B$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0076a<TTaskResult, TContinuationResult> implements l {
            public final /* synthetic */ ReentrantLock a;
            public final /* synthetic */ AtomicBoolean b;
            public final /* synthetic */ AtomicInteger c;
            public final /* synthetic */ ArrayList<Exception> d;
            public final /* synthetic */ C<Void> e;

            public C0076a(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ArrayList<Exception> arrayList, C<Void> c) {
                this.a = reentrantLock;
                this.b = atomicBoolean;
                this.c = atomicInteger;
                this.d = arrayList;
                this.e = c;
            }

            @Override // com.facebook.bolts.l
            @Nullable
            /* renamed from: b */
            public final Void a(@NotNull B<Object> b) {
                C6562gT0.p(b, "it");
                if (b.S()) {
                    ReentrantLock reentrantLock = this.a;
                    ArrayList<Exception> arrayList = this.d;
                    reentrantLock.lock();
                    try {
                        arrayList.add(b.N());
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (b.Q()) {
                    this.b.set(true);
                }
                if (this.c.decrementAndGet() == 0) {
                    if (this.d.size() != 0) {
                        if (this.d.size() == 1) {
                            this.e.c(this.d.get(0));
                        } else {
                            C8319ne2 c8319ne2 = C8319ne2.a;
                            String format = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.d.size())}, 1));
                            C6562gT0.o(format, "java.lang.String.format(format, *args)");
                            this.e.c(new C2329a(format, this.d));
                        }
                    } else if (this.b.get()) {
                        this.e.b();
                    } else {
                        this.e.d(null);
                    }
                }
                return null;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements l<Void, List<? extends TResult>> {
            public final /* synthetic */ Collection<B<TResult>> a;

            public b(Collection<B<TResult>> collection) {
                this.a = collection;
            }

            @Override // com.facebook.bolts.l
            @NotNull
            /* renamed from: b */
            public List<TResult> a(@NotNull B<Void> b) {
                C6562gT0.p(b, "task");
                if (this.a.isEmpty()) {
                    return C8222nF.H();
                }
                ArrayList arrayList = new ArrayList();
                for (B<TResult> b2 : this.a) {
                    arrayList.add(b2.O());
                }
                return arrayList;
            }
        }

        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final void A(C c) {
            C6562gT0.p(c, "$tcs");
            c.g(null);
        }

        public static final void B(ScheduledFuture scheduledFuture, C c) {
            C6562gT0.p(c, "$tcs");
            scheduledFuture.cancel(true);
            c.e();
        }

        public static final Void J(AtomicBoolean atomicBoolean, C c, B b2) {
            C6562gT0.p(atomicBoolean, "$isAnyTaskComplete");
            C6562gT0.p(c, "$firstCompleted");
            C6562gT0.p(b2, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                c.d(b2);
                return null;
            }
            b2.N();
            return null;
        }

        public static final Void L(AtomicBoolean atomicBoolean, C c, B b2) {
            C6562gT0.p(atomicBoolean, "$isAnyTaskComplete");
            C6562gT0.p(c, "$firstCompleted");
            C6562gT0.p(b2, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                c.d(b2);
                return null;
            }
            b2.N();
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void o(h hVar, C c, Callable callable) {
            C6562gT0.p(c, "$tcs");
            C6562gT0.p(callable, "$callable");
            if (hVar != null && hVar.a()) {
                c.b();
                return;
            }
            try {
                c.d(callable.call());
            } catch (CancellationException unused) {
                c.b();
            } catch (Exception e) {
                c.c(e);
            }
        }

        public static final void t(final h hVar, final C c, l lVar, B b2) {
            C6562gT0.p(c, "$tcs");
            C6562gT0.p(lVar, "$continuation");
            C6562gT0.p(b2, "$task");
            if (hVar != null && hVar.a()) {
                c.b();
                return;
            }
            try {
                B b3 = (B) lVar.a(b2);
                if (b3 == null) {
                    c.d(null);
                } else {
                    b3.y(new l() { // from class: com.facebook.bolts.u
                        @Override // com.facebook.bolts.l
                        public final Object a(B b4) {
                            Void u;
                            u = B.a.u(h.this, c, b4);
                            return u;
                        }
                    });
                }
            } catch (CancellationException unused) {
                c.b();
            } catch (Exception e) {
                c.c(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final Void u(h hVar, C c, B b2) {
            C6562gT0.p(c, "$tcs");
            C6562gT0.p(b2, "task");
            if (hVar != null && hVar.a()) {
                c.b();
                return null;
            }
            if (b2.Q()) {
                c.b();
            } else if (b2.S()) {
                c.c(b2.N());
            } else {
                c.d(b2.O());
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void w(h hVar, C c, l lVar, B b2) {
            C6562gT0.p(c, "$tcs");
            C6562gT0.p(lVar, "$continuation");
            C6562gT0.p(b2, "$task");
            if (hVar != null && hVar.a()) {
                c.b();
                return;
            }
            try {
                c.d(lVar.a(b2));
            } catch (CancellationException unused) {
                c.b();
            } catch (Exception e) {
                c.c(e);
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> C(@Nullable Exception exc) {
            C c = new C();
            c.c(exc);
            return c.a();
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> D(@Nullable TResult tresult) {
            if (tresult == null) {
                return B.f81o;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? B.p : B.q;
            }
            C c = new C();
            c.d(tresult);
            return c.a();
        }

        @InterfaceC9511sW0
        @Nullable
        public final c E() {
            return B.n;
        }

        @InterfaceC9511sW0
        public final void F(@Nullable c cVar) {
            B.n = cVar;
        }

        @InterfaceC9511sW0
        @NotNull
        public final B<Void> G(@NotNull Collection<? extends B<?>> collection) {
            C6562gT0.p(collection, "tasks");
            if (collection.isEmpty()) {
                return D(null);
            }
            C c = new C();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (B<?> b2 : collection) {
                b2.y(new C0076a(reentrantLock, atomicBoolean, atomicInteger, arrayList, c));
            }
            return c.a();
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<List<TResult>> H(@NotNull Collection<B<TResult>> collection) {
            C6562gT0.p(collection, "tasks");
            return (B<List<TResult>>) G(collection).V(new b(collection));
        }

        @InterfaceC9511sW0
        @NotNull
        public final B<B<?>> I(@NotNull Collection<? extends B<?>> collection) {
            C6562gT0.p(collection, "tasks");
            if (collection.isEmpty()) {
                return D(null);
            }
            final C c = new C();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (B<?> b2 : collection) {
                b2.y(new l() { // from class: com.facebook.bolts.A
                    @Override // com.facebook.bolts.l
                    public final Object a(B b3) {
                        Void J;
                        J = B.a.J(atomicBoolean, c, b3);
                        return J;
                    }
                });
            }
            return c.a();
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<B<TResult>> K(@NotNull Collection<B<TResult>> collection) {
            C6562gT0.p(collection, "tasks");
            if (collection.isEmpty()) {
                return D(null);
            }
            final C c = new C();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (B<TResult> b2 : collection) {
                b2.y(new l() { // from class: com.facebook.bolts.v
                    @Override // com.facebook.bolts.l
                    public final Object a(B b3) {
                        Void L;
                        L = B.a.L(atomicBoolean, c, b3);
                        return L;
                    }
                });
            }
            return c.a();
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> k(@NotNull Callable<TResult> callable) {
            C6562gT0.p(callable, "callable");
            return n(callable, B.l, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> l(@NotNull Callable<TResult> callable, @Nullable h hVar) {
            C6562gT0.p(callable, "callable");
            return n(callable, B.l, hVar);
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> m(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            C6562gT0.p(callable, "callable");
            C6562gT0.p(executor, "executor");
            return n(callable, executor, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> n(@NotNull final Callable<TResult> callable, @NotNull Executor executor, @Nullable final h hVar) {
            C6562gT0.p(callable, "callable");
            C6562gT0.p(executor, "executor");
            final C c = new C();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.a.o(h.this, c, callable);
                    }
                });
            } catch (Exception e) {
                c.c(new m(e));
            }
            return c.a();
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> p(@NotNull Callable<TResult> callable) {
            C6562gT0.p(callable, "callable");
            return n(callable, B.k, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> q(@NotNull Callable<TResult> callable, @Nullable h hVar) {
            C6562gT0.p(callable, "callable");
            return n(callable, B.k, hVar);
        }

        @InterfaceC9511sW0
        @NotNull
        public final <TResult> B<TResult> r() {
            return B.r;
        }

        public final <TContinuationResult, TResult> void s(final C<TContinuationResult> c, final l<TResult, B<TContinuationResult>> lVar, final B<TResult> b2, Executor executor, final h hVar) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.a.t(h.this, c, lVar, b2);
                    }
                });
            } catch (Exception e) {
                c.c(new m(e));
            }
        }

        public final <TContinuationResult, TResult> void v(final C<TContinuationResult> c, final l<TResult, TContinuationResult> lVar, final B<TResult> b2, Executor executor, final h hVar) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.a.w(h.this, c, lVar, b2);
                    }
                });
            } catch (Exception e) {
                c.c(new m(e));
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final B<Void> x(long j) {
            return z(j, f.d.e(), null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final B<Void> y(long j, @Nullable h hVar) {
            return z(j, f.d.e(), hVar);
        }

        @InterfaceC9511sW0
        @NotNull
        public final B<Void> z(long j, @NotNull ScheduledExecutorService scheduledExecutorService, @Nullable h hVar) {
            C6562gT0.p(scheduledExecutorService, "executor");
            if (hVar != null && hVar.a()) {
                return r();
            }
            if (j <= 0) {
                return D(null);
            }
            final C c = new C();
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.bolts.w
                @Override // java.lang.Runnable
                public final void run() {
                    B.a.A(C.this);
                }
            }, j, TimeUnit.MILLISECONDS);
            if (hVar != null) {
                hVar.b(new Runnable() { // from class: com.facebook.bolts.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.a.B(schedule, c);
                    }
                });
            }
            return c.a();
        }

        public a() {
        }
    }

    @InterfaceC9150r20(message = "Please use [TaskCompletionSource] instead. ")
    /* loaded from: classes2.dex */
    public final class b extends C<TResult> {
        public final /* synthetic */ B<TResult> b;

        public b(B b) {
            C6562gT0.p(b, "this$0");
            this.b = b;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(@NotNull B<?> b, @NotNull E e);
    }

    /* loaded from: classes2.dex */
    public static final class d implements l<Void, B<Void>> {
        public final /* synthetic */ h a;
        public final /* synthetic */ Callable<Boolean> b;
        public final /* synthetic */ l<Void, B<Void>> c;
        public final /* synthetic */ Executor d;

        public d(h hVar, Callable<Boolean> callable, l<Void, B<Void>> lVar, Executor executor) {
            this.a = hVar;
            this.b = callable;
            this.c = lVar;
            this.d = executor;
        }

        @Override // com.facebook.bolts.l
        @NotNull
        /* renamed from: b */
        public B<Void> a(@NotNull B<Void> b) throws Exception {
            C6562gT0.p(b, "task");
            h hVar = this.a;
            if (hVar != null && hVar.a()) {
                return B.j.r();
            }
            Boolean call = this.b.call();
            C6562gT0.o(call, "predicate.call()");
            if (call.booleanValue()) {
                return B.j.D(null).c0(this.c, this.d).c0(this, this.d);
            }
            return B.j.D(null);
        }
    }

    static {
        f.a aVar = f.d;
        k = aVar.b();
        l = aVar.c();
        m = C2330b.b.b();
        f81o = new B<>((Object) null);
        p = new B<>(Boolean.TRUE);
        q = new B<>(Boolean.FALSE);
        r = new B<>(true);
    }

    public B() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.i = new ArrayList();
    }

    public static final Void C(C c2, l lVar, Executor executor, h hVar, B b2) {
        C6562gT0.p(c2, "$tcs");
        C6562gT0.p(lVar, "$continuation");
        C6562gT0.p(executor, "$executor");
        C6562gT0.p(b2, "task");
        j.v(c2, lVar, b2, executor, hVar);
        return null;
    }

    public static final Void H(C c2, l lVar, Executor executor, h hVar, B b2) {
        C6562gT0.p(c2, "$tcs");
        C6562gT0.p(lVar, "$continuation");
        C6562gT0.p(executor, "$executor");
        C6562gT0.p(b2, "task");
        j.s(c2, lVar, b2, executor, hVar);
        return null;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final B<Void> I(long j2) {
        return j.x(j2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final B<Void> J(long j2, @Nullable h hVar) {
        return j.y(j2, hVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final B<Void> K(long j2, @NotNull ScheduledExecutorService scheduledExecutorService, @Nullable h hVar) {
        return j.z(j2, scheduledExecutorService, hVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> L(@Nullable Exception exc) {
        return j.C(exc);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> M(@Nullable TResult tresult) {
        return j.D(tresult);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final c P() {
        return j.E();
    }

    public static final B U(B b2) {
        C6562gT0.p(b2, "task");
        if (b2.Q()) {
            return j.r();
        }
        if (b2.S()) {
            return j.C(b2.N());
        }
        return j.D(null);
    }

    public static final B Z(h hVar, l lVar, B b2) {
        C6562gT0.p(lVar, "$continuation");
        C6562gT0.p(b2, "task");
        if (hVar != null && hVar.a()) {
            return j.r();
        }
        if (b2.S()) {
            return j.C(b2.N());
        }
        if (b2.Q()) {
            return j.r();
        }
        return b2.y(lVar);
    }

    public static final B e0(h hVar, l lVar, B b2) {
        C6562gT0.p(lVar, "$continuation");
        C6562gT0.p(b2, "task");
        if (hVar != null && hVar.a()) {
            return j.r();
        }
        if (b2.S()) {
            return j.C(b2.N());
        }
        if (b2.Q()) {
            return j.r();
        }
        return b2.D(lVar);
    }

    @InterfaceC9511sW0
    public static final void g0(@Nullable c cVar) {
        j.F(cVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> m(@NotNull Callable<TResult> callable) {
        return j.k(callable);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final B<Void> m0(@NotNull Collection<? extends B<?>> collection) {
        return j.G(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> n(@NotNull Callable<TResult> callable, @Nullable h hVar) {
        return j.l(callable, hVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<List<TResult>> n0(@NotNull Collection<B<TResult>> collection) {
        return j.H(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> o(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
        return j.m(callable, executor);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final B<B<?>> o0(@NotNull Collection<? extends B<?>> collection) {
        return j.I(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> p(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable h hVar) {
        return j.n(callable, executor, hVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<B<TResult>> p0(@NotNull Collection<B<TResult>> collection) {
        return j.K(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> q(@NotNull Callable<TResult> callable) {
        return j.p(callable);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> r(@NotNull Callable<TResult> callable, @Nullable h hVar) {
        return j.q(callable, hVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final <TResult> B<TResult> s() {
        return j.r();
    }

    public static /* synthetic */ B x(B b2, Callable callable, l lVar, Executor executor, h hVar, int i, Object obj) {
        if ((i & 4) != 0) {
            executor = l;
        }
        if ((i & 8) != 0) {
            hVar = null;
        }
        return b2.w(callable, lVar, executor, hVar);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> A(@NotNull l<TResult, TContinuationResult> lVar, @NotNull Executor executor) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return B(lVar, executor, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> B(@NotNull final l<TResult, TContinuationResult> lVar, @NotNull final Executor executor, @Nullable final h hVar) {
        List<l<TResult, Void>> list;
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        final C c2 = new C();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean R = R();
            if (!R && (list = this.i) != null) {
                list.add(new l() { // from class: com.facebook.bolts.p
                    @Override // com.facebook.bolts.l
                    public final Object a(B b2) {
                        Void C;
                        C = B.C(C.this, lVar, executor, hVar, b2);
                        return C;
                    }
                });
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            if (R) {
                j.v(c2, lVar, this, executor, hVar);
            }
            return c2.a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> D(@NotNull l<TResult, B<TContinuationResult>> lVar) {
        C6562gT0.p(lVar, "continuation");
        return G(lVar, l, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> E(@NotNull l<TResult, B<TContinuationResult>> lVar, @Nullable h hVar) {
        C6562gT0.p(lVar, "continuation");
        return G(lVar, l, hVar);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> F(@NotNull l<TResult, B<TContinuationResult>> lVar, @NotNull Executor executor) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return G(lVar, executor, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> G(@NotNull final l<TResult, B<TContinuationResult>> lVar, @NotNull final Executor executor, @Nullable final h hVar) {
        List<l<TResult, Void>> list;
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        final C c2 = new C();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean R = R();
            if (!R && (list = this.i) != null) {
                list.add(new l() { // from class: com.facebook.bolts.s
                    @Override // com.facebook.bolts.l
                    public final Object a(B b2) {
                        Void H;
                        H = B.H(C.this, lVar, executor, hVar, b2);
                        return H;
                    }
                });
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            if (R) {
                j.s(c2, lVar, this, executor, hVar);
            }
            return c2.a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final Exception N() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.f != null) {
                this.g = true;
                D d2 = this.h;
                if (d2 != null) {
                    d2.a();
                    this.h = null;
                }
            }
            Exception exc = this.f;
            reentrantLock.unlock();
            return exc;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final TResult O() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.e;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean Q() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean R() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean S() {
        boolean z;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.f != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final B<Void> T() {
        return D(new l() { // from class: com.facebook.bolts.q
            @Override // com.facebook.bolts.l
            public final Object a(B b2) {
                B U;
                U = B.U(b2);
                return U;
            }
        });
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> V(@NotNull l<TResult, TContinuationResult> lVar) {
        C6562gT0.p(lVar, "continuation");
        return Y(lVar, l, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> W(@NotNull l<TResult, TContinuationResult> lVar, @Nullable h hVar) {
        C6562gT0.p(lVar, "continuation");
        return Y(lVar, l, hVar);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> X(@NotNull l<TResult, TContinuationResult> lVar, @NotNull Executor executor) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return Y(lVar, executor, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> Y(@NotNull final l<TResult, TContinuationResult> lVar, @NotNull Executor executor, @Nullable final h hVar) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return F(new l() { // from class: com.facebook.bolts.r
            @Override // com.facebook.bolts.l
            public final Object a(B b2) {
                B Z;
                Z = B.Z(h.this, lVar, b2);
                return Z;
            }
        }, executor);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> a0(@NotNull l<TResult, B<TContinuationResult>> lVar) {
        C6562gT0.p(lVar, "continuation");
        return c0(lVar, l);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> b0(@NotNull l<TResult, B<TContinuationResult>> lVar, @Nullable h hVar) {
        C6562gT0.p(lVar, "continuation");
        return d0(lVar, l, hVar);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> c0(@NotNull l<TResult, B<TContinuationResult>> lVar, @NotNull Executor executor) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return d0(lVar, executor, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> d0(@NotNull final l<TResult, B<TContinuationResult>> lVar, @NotNull Executor executor, @Nullable final h hVar) {
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return F(new l() { // from class: com.facebook.bolts.o
            @Override // com.facebook.bolts.l
            public final Object a(B b2) {
                B e0;
                e0 = B.e0(h.this, lVar, b2);
                return e0;
            }
        }, executor);
    }

    public final void f0() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            List<l<TResult, Void>> list = this.i;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((l) it.next()).a(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.i = null;
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean h0() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.c) {
                reentrantLock.unlock();
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.signalAll();
            f0();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i0(@Nullable Exception exc) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.g = false;
            this.b.signalAll();
            f0();
            if (!this.g && n != null) {
                this.h = new D(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean j0(@Nullable TResult tresult) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.c) {
                reentrantLock.unlock();
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.signalAll();
            f0();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void k0() throws InterruptedException {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!R()) {
                this.b.await();
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean l0(long j2, @NotNull TimeUnit timeUnit) throws InterruptedException {
        C6562gT0.p(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!R()) {
                this.b.await(j2, timeUnit);
            }
            boolean R = R();
            reentrantLock.unlock();
            return R;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <TOut> B<TOut> t() {
        return this;
    }

    @NotNull
    public final B<Void> u(@NotNull Callable<Boolean> callable, @NotNull l<Void, B<Void>> lVar) {
        C6562gT0.p(callable, "predicate");
        C6562gT0.p(lVar, "continuation");
        return w(callable, lVar, l, null);
    }

    @NotNull
    public final B<Void> v(@NotNull Callable<Boolean> callable, @NotNull l<Void, B<Void>> lVar, @Nullable h hVar) {
        C6562gT0.p(callable, "predicate");
        C6562gT0.p(lVar, "continuation");
        return w(callable, lVar, l, hVar);
    }

    @NotNull
    public final B<Void> w(@NotNull Callable<Boolean> callable, @NotNull l<Void, B<Void>> lVar, @NotNull Executor executor, @Nullable h hVar) {
        C6562gT0.p(callable, "predicate");
        C6562gT0.p(lVar, "continuation");
        C6562gT0.p(executor, "executor");
        return T().F(new d(hVar, callable, lVar, executor), executor);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> y(@NotNull l<TResult, TContinuationResult> lVar) {
        C6562gT0.p(lVar, "continuation");
        return B(lVar, l, null);
    }

    @NotNull
    public final <TContinuationResult> B<TContinuationResult> z(@NotNull l<TResult, TContinuationResult> lVar, @Nullable h hVar) {
        C6562gT0.p(lVar, "continuation");
        return B(lVar, l, hVar);
    }

    public B(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.i = new ArrayList();
        j0(tresult);
    }

    public B(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.i = new ArrayList();
        if (z) {
            h0();
        } else {
            j0(null);
        }
    }
}
