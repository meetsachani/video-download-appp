package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
/* renamed from: o.jN2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7267jN2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C7267jN2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C7267jN2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C7267jN2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C7267jN2.class, "blockingTasksInBuffer$volatile");
    @NotNull
    public final AtomicReferenceArray<AbstractRunnableC3650Ml2> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static /* synthetic */ AbstractRunnableC3650Ml2 b(C7267jN2 c7267jN2, AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c7267jN2.a(abstractRunnableC3650Ml2, z);
    }

    public final AbstractRunnableC3650Ml2 A(int i, boolean z) {
        int i2 = i & 127;
        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2 = this.a.get(i2);
        if (abstractRunnableC3650Ml2 == null || abstractRunnableC3650Ml2.Y != z || !C3626Mf2.a(this.a, i2, abstractRunnableC3650Ml2, null)) {
            return null;
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return abstractRunnableC3650Ml2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(int i, @NotNull RP1.h<AbstractRunnableC3650Ml2> hVar) {
        T t;
        if (i == 3) {
            t = r();
        } else {
            t = z(i);
        }
        if (t != 0) {
            hVar.X = t;
            return -1L;
        }
        return C(i, hVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, o.Ml2, java.lang.Object] */
    public final long C(int i, RP1.h<AbstractRunnableC3650Ml2> hVar) {
        ?? r0;
        int i2;
        do {
            r0 = (AbstractRunnableC3650Ml2) b.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (r0.Y) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2L;
            }
            long a = C4528Vl2.f.a() - r0.X;
            long j = C4528Vl2.b;
            if (a < j) {
                return j - a;
            }
        } while (!P2.a(b, this, r0, null));
        hVar.X = r0;
        return -1L;
    }

    @Nullable
    public final AbstractRunnableC3650Ml2 a(@NotNull AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2, boolean z) {
        if (z) {
            return c(abstractRunnableC3650Ml2);
        }
        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml22 = (AbstractRunnableC3650Ml2) b.getAndSet(this, abstractRunnableC3650Ml2);
        if (abstractRunnableC3650Ml22 == null) {
            return null;
        }
        return c(abstractRunnableC3650Ml22);
    }

    public final AbstractRunnableC3650Ml2 c(AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
        if (g() == 127) {
            return abstractRunnableC3650Ml2;
        }
        if (abstractRunnableC3650Ml2.Y) {
            e.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, abstractRunnableC3650Ml2);
        c.incrementAndGet(this);
        return null;
    }

    public final void d(AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
        if (abstractRunnableC3650Ml2 != null && abstractRunnableC3650Ml2.Y) {
            e.decrementAndGet(this);
        }
    }

    public final /* synthetic */ int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    public final int g() {
        return c.get(this) - d.get(this);
    }

    public final /* synthetic */ int h() {
        return this.consumerIndex$volatile;
    }

    public final /* synthetic */ Object j() {
        return this.lastScheduledTask$volatile;
    }

    public final /* synthetic */ int l() {
        return this.producerIndex$volatile;
    }

    public final int n() {
        if (b.get(this) != null) {
            return g() + 1;
        }
        return g();
    }

    public final void o(@NotNull C6247fE0 c6247fE0) {
        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2 = (AbstractRunnableC3650Ml2) b.getAndSet(this, null);
        if (abstractRunnableC3650Ml2 != null) {
            c6247fE0.a(abstractRunnableC3650Ml2);
        }
        do {
        } while (t(c6247fE0));
    }

    @Nullable
    public final AbstractRunnableC3650Ml2 p() {
        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2 = (AbstractRunnableC3650Ml2) b.getAndSet(this, null);
        if (abstractRunnableC3650Ml2 == null) {
            return r();
        }
        return abstractRunnableC3650Ml2;
    }

    @Nullable
    public final AbstractRunnableC3650Ml2 q() {
        return u(true);
    }

    public final AbstractRunnableC3650Ml2 r() {
        AbstractRunnableC3650Ml2 andSet;
        while (true) {
            int i = d.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    @Nullable
    public final AbstractRunnableC3650Ml2 s() {
        return u(false);
    }

    public final boolean t(C6247fE0 c6247fE0) {
        AbstractRunnableC3650Ml2 r = r();
        if (r == null) {
            return false;
        }
        c6247fE0.a(r);
        return true;
    }

    public final AbstractRunnableC3650Ml2 u(boolean z) {
        AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2;
        do {
            abstractRunnableC3650Ml2 = (AbstractRunnableC3650Ml2) b.get(this);
            if (abstractRunnableC3650Ml2 == null || abstractRunnableC3650Ml2.Y != z) {
                int i = d.get(this);
                int i2 = c.get(this);
                while (i != i2) {
                    if (z && e.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    AbstractRunnableC3650Ml2 A = A(i2, z);
                    if (A != null) {
                        return A;
                    }
                }
                return null;
            }
        } while (!P2.a(b, this, abstractRunnableC3650Ml2, null));
        return abstractRunnableC3650Ml2;
    }

    public final /* synthetic */ void v(int i) {
        this.blockingTasksInBuffer$volatile = i;
    }

    public final /* synthetic */ void w(int i) {
        this.consumerIndex$volatile = i;
    }

    public final /* synthetic */ void x(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    public final /* synthetic */ void y(int i) {
        this.producerIndex$volatile = i;
    }

    public final AbstractRunnableC3650Ml2 z(int i) {
        int i2 = d.get(this);
        int i3 = c.get(this);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        while (i2 != i3) {
            if (z && e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            AbstractRunnableC3650Ml2 A = A(i2, z);
            if (A == null) {
                i2 = i4;
            } else {
                return A;
            }
        }
        return null;
    }
}
