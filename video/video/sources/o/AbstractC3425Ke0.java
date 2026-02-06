package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.O10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n27#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
/* renamed from: o.Ke0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3425Ke0 extends AbstractC3523Le0 implements O10 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a1 = AtomicReferenceFieldUpdater.newUpdater(AbstractC3425Ke0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b1 = AtomicReferenceFieldUpdater.newUpdater(AbstractC3425Ke0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c1 = AtomicIntegerFieldUpdater.newUpdater(AbstractC3425Ke0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @InterfaceC8303na2({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    /* renamed from: o.Ke0$a */
    /* loaded from: classes3.dex */
    public final class a extends c {
        @NotNull
        public final InterfaceC8396ny<C7458kA2> Z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
            super(j);
            this.Z = interfaceC8396ny;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.Z.E(AbstractC3425Ke0.this, C7458kA2.a);
        }

        @Override // o.AbstractC3425Ke0.c
        @NotNull
        public String toString() {
            return super.toString() + this.Z;
        }
    }

    /* renamed from: o.Ke0$b */
    /* loaded from: classes3.dex */
    public static final class b extends c {
        @NotNull
        public final Runnable Z;

        public b(long j, @NotNull Runnable runnable) {
            super(j);
            this.Z = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.Z.run();
        }

        @Override // o.AbstractC3425Ke0.c
        @NotNull
        public String toString() {
            return super.toString() + this.Z;
        }
    }

    @InterfaceC8303na2({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n27#2:548\n27#2:551\n27#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    /* renamed from: o.Ke0$c */
    /* loaded from: classes3.dex */
    public static abstract class c implements Runnable, Comparable<c>, B40, InterfaceC3854On2 {
        @InterfaceC7058iW0
        public long X;
        public int Y = -1;
        @Nullable
        private volatile Object _heap;

        public c(long j) {
            this.X = j;
        }

        @Override // o.B40
        public final void e() {
            C7592kj2 c7592kj2;
            d dVar;
            C7592kj2 c7592kj22;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c7592kj2 = C3718Ne0.a;
                    if (obj == c7592kj2) {
                        return;
                    }
                    if (obj instanceof d) {
                        dVar = (d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.l(this);
                    }
                    c7592kj22 = C3718Ne0.a;
                    this._heap = c7592kj22;
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.InterfaceC3854On2
        public int getIndex() {
            return this.Y;
        }

        @Override // o.InterfaceC3854On2
        @Nullable
        public C3756Nn2<?> h() {
            Object obj = this._heap;
            if (obj instanceof C3756Nn2) {
                return (C3756Nn2) obj;
            }
            return null;
        }

        @Override // o.InterfaceC3854On2
        public void i(@Nullable C3756Nn2<?> c3756Nn2) {
            C7592kj2 c7592kj2;
            Object obj = this._heap;
            c7592kj2 = C3718Ne0.a;
            if (obj != c7592kj2) {
                this._heap = c3756Nn2;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        @Override // java.lang.Comparable
        /* renamed from: j */
        public int compareTo(@NotNull c cVar) {
            int i = ((this.X - cVar.X) > 0L ? 1 : ((this.X - cVar.X) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        public final int l(long j, @NotNull d dVar, @NotNull AbstractC3425Ke0 abstractC3425Ke0) {
            C7592kj2 c7592kj2;
            synchronized (this) {
                Object obj = this._heap;
                c7592kj2 = C3718Ne0.a;
                if (obj == c7592kj2) {
                    return 2;
                }
                synchronized (dVar) {
                    c e = dVar.e();
                    if (abstractC3425Ke0.l()) {
                        return 1;
                    }
                    if (e == null) {
                        dVar.c = j;
                    } else {
                        long j2 = e.X;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dVar.c > 0) {
                            dVar.c = j;
                        }
                    }
                    long j3 = this.X;
                    long j4 = dVar.c;
                    if (j3 - j4 < 0) {
                        this.X = j4;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean m(long j) {
            if (j - this.X >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC3854On2
        public void setIndex(int i) {
            this.Y = i;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.X + ']';
        }
    }

    /* renamed from: o.Ke0$d */
    /* loaded from: classes3.dex */
    public static final class d extends C3756Nn2<c> {
        @InterfaceC7058iW0
        public long c;

        public d(long j) {
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        if (c1.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final /* synthetic */ void t1(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final void C1() {
        a1.set(this, null);
        b1.set(this, null);
    }

    public final void D1(long j, @NotNull c cVar) {
        int M1 = M1(j, cVar);
        if (M1 != 0) {
            if (M1 != 1) {
                if (M1 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            D0(j, cVar);
        } else if (p2(cVar)) {
            E0();
        }
    }

    @Override // o.O10
    public void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        long nanoTime;
        long d2 = C3718Ne0.d(j);
        if (d2 < 4611686018427387903L) {
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                nanoTime = abstractC10857y3.b();
            } else {
                nanoTime = System.nanoTime();
            }
            a aVar = new a(d2 + nanoTime, interfaceC8396ny);
            D1(nanoTime, aVar);
            C9375ry.a(interfaceC8396ny, aVar);
        }
    }

    public final void H0() {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a1;
                c7592kj2 = C3718Ne0.h;
                if (P2.a(atomicReferenceFieldUpdater2, this, null, c7592kj2)) {
                    return;
                }
            } else if (!(obj instanceof C9398s31)) {
                c7592kj22 = C3718Ne0.h;
                if (obj != c7592kj22) {
                    C9398s31 c9398s31 = new C9398s31(8, true);
                    C6562gT0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    c9398s31.a((Runnable) obj);
                    if (P2.a(a1, this, obj, c9398s31)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                ((C9398s31) obj).d();
                return;
            }
        }
    }

    @Override // o.AbstractC7762lQ
    public final void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        M0(runnable);
    }

    public final Runnable I0() {
        C7592kj2 c7592kj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C9398s31)) {
                c7592kj2 = C3718Ne0.h;
                if (obj == c7592kj2) {
                    return null;
                }
                if (P2.a(a1, this, obj, null)) {
                    C6562gT0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            } else {
                C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C9398s31 c9398s31 = (C9398s31) obj;
                Object s = c9398s31.s();
                if (s != C9398s31.t) {
                    return (Runnable) s;
                }
                P2.a(a1, this, obj, c9398s31.r());
            }
        }
    }

    public void M0(@NotNull Runnable runnable) {
        O0();
        if (S0(runnable)) {
            E0();
        } else {
            TY.d1.M0(runnable);
        }
    }

    public final int M1(long j, c cVar) {
        if (l()) {
            return 1;
        }
        d dVar = (d) b1.get(this);
        if (dVar == null) {
            P2.a(b1, this, null, new d(j));
            Object obj = b1.get(this);
            C6562gT0.m(obj);
            dVar = (d) obj;
        }
        return cVar.l(j, dVar, this);
    }

    public final void O0() {
        long nanoTime;
        c cVar;
        boolean z;
        d dVar = (d) b1.get(this);
        if (dVar != null && !dVar.i()) {
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                nanoTime = abstractC10857y3.b();
            } else {
                nanoTime = System.nanoTime();
            }
            do {
                synchronized (dVar) {
                    try {
                        c e = dVar.e();
                        cVar = null;
                        if (e != null) {
                            c cVar2 = e;
                            if (cVar2.m(nanoTime)) {
                                z = S0(cVar2);
                            } else {
                                z = false;
                            }
                            if (z) {
                                cVar = dVar.m(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVar != null);
        }
    }

    @NotNull
    public final B40 O1(long j, @NotNull Runnable runnable) {
        long nanoTime;
        long d2 = C3718Ne0.d(j);
        if (d2 < 4611686018427387903L) {
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                nanoTime = abstractC10857y3.b();
            } else {
                nanoTime = System.nanoTime();
            }
            b bVar = new b(d2 + nanoTime, runnable);
            D1(nanoTime, bVar);
            return bVar;
        }
        return C4741Xq1.X;
    }

    public final boolean S0(Runnable runnable) {
        C7592kj2 c7592kj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l()) {
                return false;
            }
            if (obj == null) {
                if (P2.a(a1, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof C9398s31)) {
                c7592kj2 = C3718Ne0.h;
                if (obj == c7592kj2) {
                    return false;
                }
                C9398s31 c9398s31 = new C9398s31(8, true);
                C6562gT0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c9398s31.a((Runnable) obj);
                c9398s31.a(runnable);
                if (P2.a(a1, this, obj, c9398s31)) {
                    return true;
                }
            } else {
                C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C9398s31 c9398s312 = (C9398s31) obj;
                int a2 = c9398s312.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 != 1) {
                    if (a2 == 2) {
                        return false;
                    }
                } else {
                    P2.a(a1, this, obj, c9398s312.r());
                }
            }
        }
    }

    public final /* synthetic */ Object U0() {
        return this._delayed$volatile;
    }

    public final /* synthetic */ int W0() {
        return this._isCompleted$volatile;
    }

    public final void c2(boolean z) {
        c1.set(this, z ? 1 : 0);
    }

    public final /* synthetic */ Object e1() {
        return this._queue$volatile;
    }

    public final /* synthetic */ void i2(Object obj) {
        this._delayed$volatile = obj;
    }

    @Override // o.AbstractC3327Je0
    public long l0() {
        c j;
        long nanoTime;
        C7592kj2 c7592kj2;
        if (super.l0() == 0) {
            return 0L;
        }
        Object obj = a1.get(this);
        if (obj != null) {
            if (!(obj instanceof C9398s31)) {
                c7592kj2 = C3718Ne0.h;
                if (obj != c7592kj2) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            } else if (!((C9398s31) obj).m()) {
                return 0L;
            }
        }
        d dVar = (d) b1.get(this);
        if (dVar == null || (j = dVar.j()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = j.X;
        AbstractC10857y3 abstractC10857y3 = C11100z3.a;
        if (abstractC10857y3 != null) {
            nanoTime = abstractC10857y3.b();
        } else {
            nanoTime = System.nanoTime();
        }
        return C5075aO1.v(j2 - nanoTime, 0L);
    }

    public final /* synthetic */ void l2(int i) {
        this._isCompleted$volatile = i;
    }

    public final /* synthetic */ void n2(Object obj) {
        this._queue$volatile = obj;
    }

    @Override // o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return O10.a.b(this, j, runnable, interfaceC5809dQ);
    }

    @Override // o.AbstractC3327Je0
    public boolean p0() {
        C7592kj2 c7592kj2;
        if (!r0()) {
            return false;
        }
        d dVar = (d) b1.get(this);
        if (dVar != null && !dVar.i()) {
            return false;
        }
        Object obj = a1.get(this);
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof C9398s31)) {
            c7592kj2 = C3718Ne0.h;
            if (obj != c7592kj2) {
                return false;
            }
            return true;
        }
        return ((C9398s31) obj).m();
    }

    public final boolean p2(c cVar) {
        c cVar2;
        d dVar = (d) b1.get(this);
        if (dVar != null) {
            cVar2 = dVar.j();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3327Je0
    public void shutdown() {
        C2472An2.a.c();
        c2(true);
        H0();
        do {
        } while (y0() <= 0);
        x1();
    }

    public final void x1() {
        long nanoTime;
        c o2;
        AbstractC10857y3 abstractC10857y3 = C11100z3.a;
        if (abstractC10857y3 != null) {
            nanoTime = abstractC10857y3.b();
        } else {
            nanoTime = System.nanoTime();
        }
        while (true) {
            d dVar = (d) b1.get(this);
            if (dVar != null && (o2 = dVar.o()) != null) {
                D0(nanoTime, o2);
            } else {
                return;
            }
        }
    }

    @Override // o.AbstractC3327Je0
    public long y0() {
        if (A0()) {
            return 0L;
        }
        O0();
        Runnable I0 = I0();
        if (I0 != null) {
            I0.run();
            return 0L;
        }
        return l0();
    }

    @Override // o.O10
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object z(long j, @NotNull HM<? super C7458kA2> hm) {
        return O10.a.a(this, j, hm);
    }
}
