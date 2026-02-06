package o;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.InterfaceC8512oQ1;
import o.Q0;

@InterfaceC5601ca0
@InterfaceC8512oQ1(InterfaceC8512oQ1.a.Y)
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.e8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5979e8<OutputT> extends Q0.j<OutputT> {
    public static final b f1;
    public static final Logger g1 = Logger.getLogger(AbstractC5979e8.class.getName());
    @MB
    public volatile Set<Throwable> d1 = null;
    public volatile int e1;

    /* renamed from: o.e8$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public b() {
        }

        public abstract void a(AbstractC5979e8<?> abstractC5979e8, @MB Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(AbstractC5979e8<?> abstractC5979e8);
    }

    /* renamed from: o.e8$c */
    /* loaded from: classes3.dex */
    public static final class c extends b {
        public final AtomicReferenceFieldUpdater<AbstractC5979e8<?>, Set<Throwable>> a;
        public final AtomicIntegerFieldUpdater<AbstractC5979e8<?>> b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // o.AbstractC5979e8.b
        public void a(AbstractC5979e8<?> abstractC5979e8, @MB Set<Throwable> set, Set<Throwable> set2) {
            P2.a(this.a, abstractC5979e8, set, set2);
        }

        @Override // o.AbstractC5979e8.b
        public int b(AbstractC5979e8<?> abstractC5979e8) {
            return this.b.decrementAndGet(abstractC5979e8);
        }
    }

    /* renamed from: o.e8$d */
    /* loaded from: classes3.dex */
    public static final class d extends b {
        public d() {
            super();
        }

        @Override // o.AbstractC5979e8.b
        public void a(AbstractC5979e8<?> abstractC5979e8, @MB Set<Throwable> set, Set<Throwable> set2) {
            synchronized (abstractC5979e8) {
                try {
                    if (abstractC5979e8.d1 == set) {
                        abstractC5979e8.d1 = set2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.AbstractC5979e8.b
        public int b(AbstractC5979e8<?> abstractC5979e8) {
            int H;
            synchronized (abstractC5979e8) {
                H = AbstractC5979e8.H(abstractC5979e8);
            }
            return H;
        }
    }

    static {
        b dVar;
        Throwable th = null;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC5979e8.class, Set.class, "d1"), AtomicIntegerFieldUpdater.newUpdater(AbstractC5979e8.class, "e1"));
        } catch (Throwable th2) {
            dVar = new d();
            th = th2;
        }
        f1 = dVar;
        if (th != null) {
            g1.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public AbstractC5979e8(int i) {
        this.e1 = i;
    }

    public static /* synthetic */ int H(AbstractC5979e8 abstractC5979e8) {
        int i = abstractC5979e8.e1 - 1;
        abstractC5979e8.e1 = i;
        return i;
    }

    public abstract void I(Set<Throwable> set);

    public final void J() {
        this.d1 = null;
    }

    public final int K() {
        return f1.b(this);
    }

    public final Set<Throwable> L() {
        Set<Throwable> set = this.d1;
        if (set == null) {
            Set<Throwable> p = C10856y22.p();
            I(p);
            f1.a(this, null, p);
            Set<Throwable> set2 = this.d1;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }
}
