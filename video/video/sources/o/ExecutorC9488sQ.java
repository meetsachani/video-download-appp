package o;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1044:1\n286#1:1047\n284#1:1048\n284#1:1049\n286#1:1050\n281#1:1053\n282#1,5:1054\n292#1:1060\n284#1:1061\n285#1:1062\n284#1:1065\n285#1:1066\n281#1:1067\n289#1:1068\n284#1:1069\n284#1:1072\n285#1:1073\n286#1:1074\n77#2:1045\n77#2:1059\n77#2:1070\n1#3:1046\n27#4:1051\n27#4:1063\n16#5:1052\n16#5:1064\n622#6:1071\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1047\n289#1:1048\n290#1:1049\n299#1:1050\n348#1:1053\n377#1:1054,5\n400#1:1060\n447#1:1061\n448#1:1062\n484#1:1065\n485#1:1066\n491#1:1067\n500#1:1068\n500#1:1069\n581#1:1072\n582#1:1073\n583#1:1074\n120#1:1045\n397#1:1059\n517#1:1070\n348#1:1051\n480#1:1063\n348#1:1052\n480#1:1064\n524#1:1071\n*E\n"})
/* renamed from: o.sQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC9488sQ implements Executor, Closeable {
    @NotNull
    public static final a c1 = new a(null);
    public static final /* synthetic */ AtomicLongFieldUpdater d1 = AtomicLongFieldUpdater.newUpdater(ExecutorC9488sQ.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e1 = AtomicLongFieldUpdater.newUpdater(ExecutorC9488sQ.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC9488sQ.class, "_isTerminated$volatile");
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 g1 = new C7592kj2("NOT_IN_STACK");
    public static final int h1 = -1;
    public static final int i1 = 0;
    public static final int j1 = 1;
    public static final int k1 = 21;
    public static final long l1 = 2097151;
    public static final long m1 = 4398044413952L;
    public static final int n1 = 42;
    public static final long o1 = 9223367638808264704L;
    public static final int p1 = 1;
    public static final int q1 = 2097150;
    public static final long r1 = 2097151;
    public static final long s1 = -2097152;
    public static final long t1 = 2097152;
    @InterfaceC7058iW0
    public final int X;
    @InterfaceC7058iW0
    public final int Y;
    @InterfaceC7058iW0
    @NotNull
    public final String Y0;
    @InterfaceC7058iW0
    public final long Z;
    @InterfaceC7058iW0
    @NotNull
    public final C6247fE0 Z0;
    private volatile /* synthetic */ int _isTerminated$volatile;
    @InterfaceC7058iW0
    @NotNull
    public final C6247fE0 a1;
    @InterfaceC7058iW0
    @NotNull
    public final QS1<c> b1;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: o.sQ$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.sQ$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.Y0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.Z0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.sQ$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public static final /* synthetic */ d[] a1;
        public static final /* synthetic */ InterfaceC3127Hd0 b1;
        public static final d X = new d("CPU_ACQUIRED", 0);
        public static final d Y = new d("BLOCKING", 1);
        public static final d Z = new d("PARKING", 2);
        public static final d Y0 = new d("DORMANT", 3);
        public static final d Z0 = new d("TERMINATED", 4);

        static {
            d[] e = e();
            a1 = e;
            b1 = C3323Jd0.c(e);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] e() {
            return new d[]{X, Y, Z, Y0, Z0};
        }

        @NotNull
        public static InterfaceC3127Hd0<d> g() {
            return b1;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) a1.clone();
        }
    }

    public ExecutorC9488sQ(int i, int i2, long j, @NotNull String str) {
        this.X = i;
        this.Y = i2;
        this.Z = j;
        this.Y0 = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.Z0 = new C6247fE0();
            this.a1 = new C6247fE0();
            this.b1 = new QS1<>((i + 1) * 2);
            this.controlState$volatile = i << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
    }

    public static /* synthetic */ boolean Z(ExecutorC9488sQ executorC9488sQ, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = e1.get(executorC9488sQ);
        }
        return executorC9488sQ.W(j);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater d() {
        return e1;
    }

    public static /* synthetic */ void q(ExecutorC9488sQ executorC9488sQ, Runnable runnable, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        executorC9488sQ.p(runnable, z, z2);
    }

    public final long A() {
        return e1.addAndGet(this, 2097152L);
    }

    public final int C() {
        return (int) (e1.incrementAndGet(this) & 2097151);
    }

    public final /* synthetic */ void E(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final int F(c cVar) {
        Object h = cVar.h();
        while (h != g1) {
            if (h == null) {
                return 0;
            }
            c cVar2 = (c) h;
            int g = cVar2.g();
            if (g != 0) {
                return g;
            }
            h = cVar2.h();
        }
        return -1;
    }

    public final c G() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d1;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            c b2 = this.b1.b((int) (2097151 & j));
            if (b2 == null) {
                return null;
            }
            long j2 = (2097152 + j) & s1;
            int F = F(b2);
            if (F >= 0 && d1.compareAndSet(this, j, F | j2)) {
                b2.t(g1);
                return b2;
            }
        }
    }

    public final boolean H(@NotNull c cVar) {
        long j;
        long j2;
        int g;
        if (cVar.h() == g1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d1;
            do {
                j = atomicLongFieldUpdater.get(this);
                j2 = (2097152 + j) & s1;
                g = cVar.g();
                cVar.t(this.b1.b((int) (2097151 & j)));
            } while (!d1.compareAndSet(this, j, j2 | g));
            return true;
        }
        return false;
    }

    public final void I(@NotNull c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d1;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & s1;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = F(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (d1.compareAndSet(this, j, j2 | i3)) {
                    return;
                }
            }
        }
    }

    public final long M() {
        return d().addAndGet(this, 4398046511104L);
    }

    public final void N(@NotNull AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
        try {
            abstractRunnableC3650Ml2.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                AbstractC10857y3 a2 = C11100z3.a();
                if (a2 != null) {
                    a2.f();
                }
            } finally {
                AbstractC10857y3 a3 = C11100z3.a();
                if (a3 != null) {
                    a3.f();
                }
            }
        }
    }

    public final /* synthetic */ void O(long j) {
        this.controlState$volatile = j;
    }

    public final /* synthetic */ void P(long j) {
        this.parkedWorkersStack$volatile = j;
    }

    public final /* synthetic */ void Q(int i) {
        this._isTerminated$volatile = i;
    }

    public final void R(long j) {
        int i;
        AbstractRunnableC3650Ml2 j2;
        if (!f1.compareAndSet(this, 0, 1)) {
            return;
        }
        c m = m();
        synchronized (this.b1) {
            i = (int) (d().get(this) & 2097151);
        }
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                c b2 = this.b1.b(i2);
                C6562gT0.m(b2);
                c cVar = b2;
                if (cVar != m) {
                    while (cVar.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(cVar);
                        cVar.join(j);
                    }
                    cVar.X.o(this.a1);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.a1.b();
        this.Z0.b();
        while (true) {
            if (m != null) {
                j2 = m.f(true);
                if (j2 != null) {
                    continue;
                    N(j2);
                }
            }
            j2 = this.Z0.j();
            if (j2 == null && (j2 = this.a1.j()) == null) {
                break;
            }
            N(j2);
        }
        if (m != null) {
            m.x(d.Z0);
        }
        d1.set(this, 0L);
        e1.set(this, 0L);
    }

    public final void S(long j, boolean z) {
        if (z || a0() || W(j)) {
            return;
        }
        a0();
    }

    public final void T() {
        if (a0() || Z(this, 0L, 1, null)) {
            return;
        }
        a0();
    }

    public final AbstractRunnableC3650Ml2 U(c cVar, AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2, boolean z) {
        d dVar;
        if (cVar == null || (dVar = cVar.Z) == d.Z0) {
            return abstractRunnableC3650Ml2;
        }
        if (!abstractRunnableC3650Ml2.Y && dVar == d.Y) {
            return abstractRunnableC3650Ml2;
        }
        cVar.b1 = true;
        return cVar.X.a(abstractRunnableC3650Ml2, z);
    }

    public final boolean V() {
        long j;
        AtomicLongFieldUpdater d2 = d();
        do {
            j = d2.get(this);
            if (((int) ((o1 & j) >> 42)) == 0) {
                return false;
            }
        } while (!d().compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    public final boolean W(long j) {
        if (C5075aO1.u(((int) (2097151 & j)) - ((int) ((j & m1) >> 21)), 0) < this.X) {
            int j2 = j();
            if (j2 == 1 && this.X > 1) {
                j();
            }
            if (j2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean a0() {
        c G;
        do {
            G = G();
            if (G == null) {
                return false;
            }
        } while (!c.d1.compareAndSet(G, -1, 0));
        LockSupport.unpark(G);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        R(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        q(this, runnable, false, false, 6, null);
    }

    public final boolean f(AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
        if (abstractRunnableC3650Ml2.Y) {
            return this.a1.a(abstractRunnableC3650Ml2);
        }
        return this.Z0.a(abstractRunnableC3650Ml2);
    }

    public final int h(long j) {
        return (int) ((j & o1) >> 42);
    }

    public final int i(long j) {
        return (int) ((j & m1) >> 21);
    }

    public final boolean isTerminated() {
        if (f1.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        synchronized (this.b1) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j = e1.get(this);
                int i = (int) (j & 2097151);
                int u = C5075aO1.u(i - ((int) ((j & m1) >> 21)), 0);
                if (u >= this.X) {
                    return 0;
                }
                if (i >= this.Y) {
                    return 0;
                }
                int i2 = ((int) (d().get(this) & 2097151)) + 1;
                if (i2 > 0 && this.b1.b(i2) == null) {
                    c cVar = new c(this, i2);
                    this.b1.c(i2, cVar);
                    if (i2 == ((int) (2097151 & e1.incrementAndGet(this)))) {
                        int i3 = u + 1;
                        cVar.start();
                        return i3;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final AbstractRunnableC3650Ml2 k(@NotNull Runnable runnable, boolean z) {
        long a2 = C4528Vl2.f.a();
        if (runnable instanceof AbstractRunnableC3650Ml2) {
            AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2 = (AbstractRunnableC3650Ml2) runnable;
            abstractRunnableC3650Ml2.X = a2;
            abstractRunnableC3650Ml2.Y = z;
            return abstractRunnableC3650Ml2;
        }
        return C4528Vl2.b(runnable, a2, z);
    }

    public final int l(long j) {
        return (int) (j & 2097151);
    }

    public final c m() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !C6562gT0.g(ExecutorC9488sQ.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void n() {
        d().addAndGet(this, s1);
    }

    public final int o() {
        return (int) (d().getAndDecrement(this) & 2097151);
    }

    public final void p(@NotNull Runnable runnable, boolean z, boolean z2) {
        long j;
        boolean z3;
        AbstractC10857y3 a2 = C11100z3.a();
        if (a2 != null) {
            a2.e();
        }
        AbstractRunnableC3650Ml2 k = k(runnable, z);
        boolean z4 = k.Y;
        if (z4) {
            j = e1.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        c m = m();
        AbstractRunnableC3650Ml2 U = U(m, k, z2);
        if (U != null && !f(U)) {
            throw new RejectedExecutionException(this.Y0 + " was terminated");
        }
        if (z2 && m != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4) {
            S(j, z3);
        } else if (z3) {
        } else {
            T();
        }
    }

    public final int r() {
        return (int) ((e1.get(this) & o1) >> 42);
    }

    public final /* synthetic */ long s() {
        return this.controlState$volatile;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.b1.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a2; i6++) {
            c b2 = this.b1.b(i6);
            if (b2 != null) {
                int n = b2.X.n();
                int i7 = b.a[b2.Z.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    i5++;
                                } else {
                                    throw new C3865Oq1();
                                }
                            } else {
                                i4++;
                                if (n > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(n);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(n);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i2++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(n);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i3++;
                }
            }
        }
        long j = e1.get(this);
        return this.Y0 + C11304zt1.a + NV.b(this) + "[Pool Size {core = " + this.X + ", max = " + this.Y + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.Z0.c() + ", global blocking queue size = " + this.a1.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((m1 & j) >> 21)) + ", CPUs acquired = " + (this.X - ((int) ((o1 & j) >> 42))) + "}]";
    }

    public final int u() {
        return (int) (d().get(this) & 2097151);
    }

    public final /* synthetic */ long v() {
        return this.parkedWorkersStack$volatile;
    }

    public final /* synthetic */ int y() {
        return this._isTerminated$volatile;
    }

    @InterfaceC8303na2({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1044:1\n298#2,2:1045\n286#2:1047\n300#2,4:1048\n305#2:1052\n295#2,2:1053\n295#2,2:1058\n281#2:1062\n290#2:1063\n284#2:1064\n281#2:1065\n1#3:1055\n77#4:1056\n77#4:1057\n27#5:1060\n16#6:1061\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n687#1:1045,2\n687#1:1047\n687#1:1048,4\n702#1:1052\n776#1:1053,2\n824#1:1058,2\n875#1:1062\n901#1:1063\n901#1:1064\n974#1:1065\n815#1:1056\n818#1:1057\n871#1:1060\n871#1:1061\n*E\n"})
    /* renamed from: o.sQ$c */
    /* loaded from: classes4.dex */
    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater d1 = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        @InterfaceC7058iW0
        @NotNull
        public final C7267jN2 X;
        @NotNull
        public final RP1.h<AbstractRunnableC3650Ml2> Y;
        public long Y0;
        @InterfaceC7058iW0
        @NotNull
        public d Z;
        public long Z0;
        public int a1;
        @InterfaceC7058iW0
        public boolean b1;
        private volatile int indexInArray;
        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC9488sQ.this.getClass().getClassLoader());
            this.X = new C7267jN2();
            this.Y = new RP1.h<>();
            this.Z = d.Y0;
            this.nextParkedWorker = ExecutorC9488sQ.g1;
            int nanoTime = (int) System.nanoTime();
            this.a1 = nanoTime == 0 ? 42 : nanoTime;
        }

        public final void b(AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
            this.Y0 = 0L;
            if (this.Z == d.Z) {
                this.Z = d.Y;
            }
            if (abstractRunnableC3650Ml2.Y) {
                if (x(d.Y)) {
                    ExecutorC9488sQ.this.T();
                }
                ExecutorC9488sQ.this.N(abstractRunnableC3650Ml2);
                ExecutorC9488sQ.d().addAndGet(ExecutorC9488sQ.this, ExecutorC9488sQ.s1);
                if (this.Z != d.Z0) {
                    this.Z = d.Y0;
                    return;
                }
                return;
            }
            ExecutorC9488sQ.this.N(abstractRunnableC3650Ml2);
        }

        public final AbstractRunnableC3650Ml2 c(boolean z) {
            boolean z2;
            AbstractRunnableC3650Ml2 p;
            AbstractRunnableC3650Ml2 p2;
            if (z) {
                if (n(ExecutorC9488sQ.this.X * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (p2 = p()) != null) {
                    return p2;
                }
                AbstractRunnableC3650Ml2 p3 = this.X.p();
                if (p3 != null) {
                    return p3;
                }
                if (!z2 && (p = p()) != null) {
                    return p;
                }
            } else {
                AbstractRunnableC3650Ml2 p4 = p();
                if (p4 != null) {
                    return p4;
                }
            }
            return y(3);
        }

        public final AbstractRunnableC3650Ml2 d() {
            AbstractRunnableC3650Ml2 q = this.X.q();
            if (q == null) {
                AbstractRunnableC3650Ml2 j = ExecutorC9488sQ.this.a1.j();
                if (j == null) {
                    return y(1);
                }
                return j;
            }
            return q;
        }

        public final AbstractRunnableC3650Ml2 e() {
            AbstractRunnableC3650Ml2 s = this.X.s();
            if (s == null) {
                AbstractRunnableC3650Ml2 j = ExecutorC9488sQ.this.a1.j();
                if (j == null) {
                    return y(2);
                }
                return j;
            }
            return s;
        }

        @Nullable
        public final AbstractRunnableC3650Ml2 f(boolean z) {
            if (v()) {
                return c(z);
            }
            return d();
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final ExecutorC9488sQ i() {
            return ExecutorC9488sQ.this;
        }

        public final /* synthetic */ int j() {
            return this.workerCtl$volatile;
        }

        public final boolean l() {
            if (this.nextParkedWorker != ExecutorC9488sQ.g1) {
                return true;
            }
            return false;
        }

        public final boolean m() {
            if (this.Z == d.Y) {
                return true;
            }
            return false;
        }

        public final int n(int i) {
            int i2 = this.a1;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.a1 = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        public final void o() {
            if (this.Y0 == 0) {
                this.Y0 = System.nanoTime() + ExecutorC9488sQ.this.Z;
            }
            LockSupport.parkNanos(ExecutorC9488sQ.this.Z);
            if (System.nanoTime() - this.Y0 >= 0) {
                this.Y0 = 0L;
                z();
            }
        }

        public final AbstractRunnableC3650Ml2 p() {
            if (n(2) == 0) {
                AbstractRunnableC3650Ml2 j = ExecutorC9488sQ.this.Z0.j();
                if (j != null) {
                    return j;
                }
                return ExecutorC9488sQ.this.a1.j();
            }
            AbstractRunnableC3650Ml2 j2 = ExecutorC9488sQ.this.a1.j();
            if (j2 != null) {
                return j2;
            }
            return ExecutorC9488sQ.this.Z0.j();
        }

        public final long q() {
            boolean z;
            AbstractRunnableC3650Ml2 d;
            if (this.Z == d.X) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d = e();
            } else {
                d = d();
            }
            if (d == null) {
                long j = this.Z0;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            ExecutorC9488sQ.this.N(d);
            if (!z) {
                ExecutorC9488sQ.d().addAndGet(ExecutorC9488sQ.this, ExecutorC9488sQ.s1);
            }
            return 0L;
        }

        public final void r() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC9488sQ.this.isTerminated() && this.Z != d.Z0) {
                    AbstractRunnableC3650Ml2 f = f(this.b1);
                    if (f != null) {
                        this.Z0 = 0L;
                        b(f);
                    } else {
                        this.b1 = false;
                        if (this.Z0 != 0) {
                            if (!z) {
                                z = true;
                            } else {
                                x(d.Z);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.Z0);
                                this.Z0 = 0L;
                            }
                        } else {
                            w();
                        }
                    }
                }
            }
            x(d.Z0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            r();
        }

        public final void s(int i) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC9488sQ.this.Y0);
            sb.append("-worker-");
            if (i == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void t(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void u(int i) {
            this.workerCtl$volatile = i;
        }

        public final boolean v() {
            long j;
            if (this.Z == d.X) {
                return true;
            }
            ExecutorC9488sQ executorC9488sQ = ExecutorC9488sQ.this;
            AtomicLongFieldUpdater d = ExecutorC9488sQ.d();
            do {
                j = d.get(executorC9488sQ);
                if (((int) ((ExecutorC9488sQ.o1 & j) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC9488sQ.d().compareAndSet(executorC9488sQ, j, j - 4398046511104L));
            this.Z = d.X;
            return true;
        }

        public final void w() {
            if (!l()) {
                ExecutorC9488sQ.this.H(this);
                return;
            }
            d1.set(this, -1);
            while (l() && d1.get(this) == -1 && !ExecutorC9488sQ.this.isTerminated() && this.Z != d.Z0) {
                x(d.Z);
                Thread.interrupted();
                o();
            }
        }

        public final boolean x(@NotNull d dVar) {
            boolean z;
            d dVar2 = this.Z;
            if (dVar2 == d.X) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ExecutorC9488sQ.d().addAndGet(ExecutorC9488sQ.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.Z = dVar;
            }
            return z;
        }

        public final AbstractRunnableC3650Ml2 y(int i) {
            int i2 = (int) (ExecutorC9488sQ.d().get(ExecutorC9488sQ.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int n = n(i2);
            ExecutorC9488sQ executorC9488sQ = ExecutorC9488sQ.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                n++;
                if (n > i2) {
                    n = 1;
                }
                c b = executorC9488sQ.b1.b(n);
                if (b != null && b != this) {
                    long B = b.X.B(i, this.Y);
                    if (B == -1) {
                        RP1.h<AbstractRunnableC3650Ml2> hVar = this.Y;
                        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2 = hVar.X;
                        hVar.X = null;
                        return abstractRunnableC3650Ml2;
                    } else if (B > 0) {
                        j = Math.min(j, B);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.Z0 = j;
            return null;
        }

        public final void z() {
            ExecutorC9488sQ executorC9488sQ = ExecutorC9488sQ.this;
            synchronized (executorC9488sQ.b1) {
                try {
                    if (executorC9488sQ.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC9488sQ.d().get(executorC9488sQ) & 2097151)) <= executorC9488sQ.X) {
                        return;
                    }
                    if (!d1.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i = this.indexInArray;
                    s(0);
                    executorC9488sQ.I(this, i, 0);
                    int andDecrement = (int) (ExecutorC9488sQ.d().getAndDecrement(executorC9488sQ) & 2097151);
                    if (andDecrement != i) {
                        c b = executorC9488sQ.b1.b(andDecrement);
                        C6562gT0.m(b);
                        c cVar = b;
                        executorC9488sQ.b1.c(i, cVar);
                        cVar.s(i);
                        executorC9488sQ.I(cVar, andDecrement, i);
                    }
                    executorC9488sQ.b1.c(andDecrement, null);
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    this.Z = d.Z0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(ExecutorC9488sQ executorC9488sQ, int i) {
            this();
            s(i);
        }
    }

    public /* synthetic */ ExecutorC9488sQ(int i, int i2, long j, String str, int i3, C9516sY c9516sY) {
        this(i, i2, (i3 & 4) != 0 ? C4528Vl2.e : j, (i3 & 8) != 0 ? C4528Vl2.a : str);
    }
}
