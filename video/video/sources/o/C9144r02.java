package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n369#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
/* renamed from: o.r02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9144r02 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C9144r02.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(C9144r02.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C9144r02.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C9144r02.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(C9144r02.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    @NotNull
    public final XA0<Throwable, C7458kA2, InterfaceC5809dQ, C7458kA2> b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: o.r02$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C7964mB0 implements VA0<Long, C9873u02, C9873u02> {
        public static final a e1 = new a();

        public a() {
            super(2, C9630t02.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C9873u02 i(Long l, C9873u02 c9873u02) {
            return u0(l.longValue(), c9873u02);
        }

        public final C9873u02 u0(long j, C9873u02 c9873u02) {
            C9873u02 j2;
            j2 = C9630t02.j(j, c9873u02);
            return j2;
        }
    }

    /* renamed from: o.r02$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C7964mB0 implements VA0<Long, C9873u02, C9873u02> {
        public static final b e1 = new b();

        public b() {
            super(2, C9630t02.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C9873u02 i(Long l, C9873u02 c9873u02) {
            return u0(l.longValue(), c9873u02);
        }

        public final C9873u02 u0(long j, C9873u02 c9873u02) {
            C9873u02 j2;
            j2 = C9630t02.j(j, c9873u02);
            return j2;
        }
    }

    public C9144r02(int i, int i2) {
        this.a = i;
        if (i > 0) {
            if (i2 >= 0 && i2 <= i) {
                C9873u02 c9873u02 = new C9873u02(0L, null, 2);
                this.head$volatile = c9873u02;
                this.tail$volatile = c9873u02;
                this._availablePermits$volatile = i - i2;
                this.b = new XA0() { // from class: o.q02
                    @Override // o.XA0
                    public final Object P(Object obj, Object obj2, Object obj3) {
                        C7458kA2 E;
                        E = C9144r02.E(C9144r02.this, (Throwable) obj, (C7458kA2) obj2, (InterfaceC5809dQ) obj3);
                        return E;
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    public static final C7458kA2 E(C9144r02 c9144r02, Throwable th, C7458kA2 c7458kA2, InterfaceC5809dQ interfaceC5809dQ) {
        c9144r02.g();
        return C7458kA2.a;
    }

    public final /* synthetic */ int B() {
        return this._availablePermits$volatile;
    }

    public final void D(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
        while (s() <= 0) {
            C6562gT0.n(interfaceC6691h02, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (q((InterfaceC9220rJ2) interfaceC6691h02)) {
                return;
            }
        }
        interfaceC6691h02.e(C7458kA2.a);
    }

    public final /* synthetic */ void F(long j) {
        this.deqIdx$volatile = j;
    }

    public final /* synthetic */ void G(long j) {
        this.enqIdx$volatile = j;
    }

    public final /* synthetic */ void H(Object obj) {
        this.head$volatile = obj;
    }

    public final /* synthetic */ void I(Object obj) {
        this.tail$volatile = obj;
    }

    public final /* synthetic */ void J(int i) {
        this._availablePermits$volatile = i;
    }

    public final boolean K(Object obj) {
        if (obj instanceof InterfaceC8396ny) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC8396ny interfaceC8396ny = (InterfaceC8396ny) obj;
            Object I = interfaceC8396ny.I(C7458kA2.a, null, this.b);
            if (I != null) {
                interfaceC8396ny.j0(I);
                return true;
            }
            return false;
        } else if (obj instanceof InterfaceC6691h02) {
            return ((InterfaceC6691h02) obj).h(this, C7458kA2.a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    public final boolean L() {
        int i;
        Object g2;
        int i2;
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        int i3;
        C7592kj2 c7592kj23;
        C7592kj2 c7592kj24;
        C7592kj2 c7592kj25;
        C9873u02 c9873u02 = (C9873u02) c.get(this);
        long andIncrement = d.getAndIncrement(this);
        i = C9630t02.f;
        long j = andIncrement / i;
        b bVar = b.e1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        loop0: while (true) {
            g2 = C9703tJ.g(c9873u02, j, bVar);
            if (TZ1.h(g2)) {
                break;
            }
            QZ1 f2 = TZ1.f(g2);
            while (true) {
                QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                if (qz1.Z >= f2.Z) {
                    break loop0;
                } else if (!f2.C()) {
                    break;
                } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, f2)) {
                    if (qz1.v()) {
                        qz1.q();
                    }
                } else if (f2.v()) {
                    f2.q();
                }
            }
        }
        C9873u02 c9873u022 = (C9873u02) TZ1.f(g2);
        c9873u022.b();
        if (c9873u022.Z <= j) {
            i2 = C9630t02.f;
            int i4 = (int) (andIncrement % i2);
            c7592kj2 = C9630t02.b;
            Object andSet = c9873u022.F().getAndSet(i4, c7592kj2);
            if (andSet == null) {
                i3 = C9630t02.a;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = c9873u022.F().get(i4);
                    c7592kj25 = C9630t02.c;
                    if (obj == c7592kj25) {
                        return true;
                    }
                }
                c7592kj23 = C9630t02.b;
                c7592kj24 = C9630t02.d;
                return !C3626Mf2.a(c9873u022.F(), i4, c7592kj23, c7592kj24);
            }
            c7592kj22 = C9630t02.e;
            if (andSet == c7592kj22) {
                return false;
            }
            return K(andSet);
        }
        return false;
    }

    public final int a() {
        return Math.max(g.get(this), 0);
    }

    @Nullable
    public final Object b(@NotNull HM<? super C7458kA2> hm) {
        if (s() > 0) {
            return C7458kA2.a;
        }
        Object p = p(hm);
        if (p == C7289jT0.l()) {
            return p;
        }
        return C7458kA2.a;
    }

    public final boolean c() {
        while (true) {
            int i = g.get(this);
            if (i > this.a) {
                r();
            } else if (i <= 0) {
                return false;
            } else {
                if (g.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final void g() {
        do {
            int andIncrement = g.getAndIncrement(this);
            if (andIncrement < this.a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                r();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
            }
        } while (!L());
    }

    public final <W> void n(W w, HA0<? super W, Boolean> ha0, HA0<? super W, C7458kA2> ha02) {
        while (s() <= 0) {
            if (ha0.invoke(w).booleanValue()) {
                return;
            }
        }
        ha02.invoke(w);
    }

    public final void o(@NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        while (s() <= 0) {
            C6562gT0.n(interfaceC8396ny, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (q((InterfaceC9220rJ2) interfaceC8396ny)) {
                return;
            }
        }
        interfaceC8396ny.K(C7458kA2.a, this.b);
    }

    public final Object p(HM<? super C7458kA2> hm) {
        C8883py b2 = C9375ry.b(C7048iT0.e(hm));
        try {
            if (!q(b2)) {
                o(b2);
            }
            Object A = b2.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        } catch (Throwable th) {
            b2.V();
            throw th;
        }
    }

    public final boolean q(InterfaceC9220rJ2 interfaceC9220rJ2) {
        int i;
        Object g2;
        int i2;
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C9873u02 c9873u02 = (C9873u02) e.get(this);
        long andIncrement = f.getAndIncrement(this);
        a aVar = a.e1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        i = C9630t02.f;
        long j = andIncrement / i;
        loop0: while (true) {
            g2 = C9703tJ.g(c9873u02, j, aVar);
            if (!TZ1.h(g2)) {
                QZ1 f2 = TZ1.f(g2);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                    if (qz1.Z >= f2.Z) {
                        break loop0;
                    } else if (!f2.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, f2)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                    } else if (f2.v()) {
                        f2.q();
                    }
                }
            } else {
                break;
            }
        }
        C9873u02 c9873u022 = (C9873u02) TZ1.f(g2);
        i2 = C9630t02.f;
        int i3 = (int) (andIncrement % i2);
        if (!C3626Mf2.a(c9873u022.F(), i3, null, interfaceC9220rJ2)) {
            c7592kj2 = C9630t02.b;
            c7592kj22 = C9630t02.c;
            if (C3626Mf2.a(c9873u022.F(), i3, c7592kj2, c7592kj22)) {
                if (interfaceC9220rJ2 instanceof InterfaceC8396ny) {
                    C6562gT0.n(interfaceC9220rJ2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC8396ny) interfaceC9220rJ2).K(C7458kA2.a, this.b);
                } else if (interfaceC9220rJ2 instanceof InterfaceC6691h02) {
                    ((InterfaceC6691h02) interfaceC9220rJ2).e(C7458kA2.a);
                } else {
                    throw new IllegalStateException(("unexpected: " + interfaceC9220rJ2).toString());
                }
                return true;
            }
            return false;
        }
        interfaceC9220rJ2.i(c9873u022, i3);
        return true;
    }

    public final void r() {
        int i;
        do {
            i = g.get(this);
            if (i <= this.a) {
                return;
            }
        } while (!g.compareAndSet(this, i, this.a));
    }

    public final int s() {
        int andDecrement;
        do {
            andDecrement = g.getAndDecrement(this);
        } while (andDecrement > this.a);
        return andDecrement;
    }

    public final /* synthetic */ long t() {
        return this.deqIdx$volatile;
    }

    public final /* synthetic */ long v() {
        return this.enqIdx$volatile;
    }

    public final /* synthetic */ Object x() {
        return this.head$volatile;
    }

    public final /* synthetic */ Object z() {
        return this.tail$volatile;
    }
}
