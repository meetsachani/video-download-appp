package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.AbstractC3529Lf2;

@InterfaceC11149zF0
@InterfaceC5601ca0
@InterfaceC4238Sm
/* renamed from: o.Lf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3529Lf2<L> {
    public static final int a = 1024;
    public static final int b = -1;

    /* renamed from: o.Lf2$b */
    /* loaded from: classes3.dex */
    public static class b<L> extends f<L> {
        public final Object[] d;

        @Override // o.AbstractC3529Lf2
        public L j(int i) {
            return (L) this.d[i];
        }

        @Override // o.AbstractC3529Lf2
        public int s() {
            return this.d.length;
        }

        public b(int i, InterfaceC8331nh2<L> interfaceC8331nh2) {
            super(i);
            int i2 = 0;
            C10664xF1.e(i <= 1073741824, "Stripes must be <= 2^30)");
            this.d = new Object[this.c + 1];
            while (true) {
                Object[] objArr = this.d;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = interfaceC8331nh2.get();
                i2++;
            }
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.Lf2$c */
    /* loaded from: classes3.dex */
    public static class c<L> extends f<L> {
        public final ConcurrentMap<Integer, L> d;
        public final InterfaceC8331nh2<L> e;
        public final int f;

        public c(int i, InterfaceC8331nh2<L> interfaceC8331nh2) {
            super(i);
            int i2;
            int i3 = this.c;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f = i2;
            this.e = interfaceC8331nh2;
            this.d = new Y71().m().i();
        }

        @Override // o.AbstractC3529Lf2
        public L j(int i) {
            if (this.f != Integer.MAX_VALUE) {
                C10664xF1.C(i, s());
            }
            L l = this.d.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.e.get();
            return (L) C3743Nk1.a(this.d.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // o.AbstractC3529Lf2
        public int s() {
            return this.f;
        }
    }

    /* renamed from: o.Lf2$d */
    /* loaded from: classes3.dex */
    public static class d extends ReentrantLock {
        public long X;
        public long Y;
        public long Z;

        public d() {
            super(false);
        }
    }

    /* renamed from: o.Lf2$e */
    /* loaded from: classes3.dex */
    public static class e extends Semaphore {
        public long X;
        public long Y;
        public long Z;

        public e(int i) {
            super(i, false);
        }
    }

    /* renamed from: o.Lf2$f */
    /* loaded from: classes3.dex */
    public static abstract class f<L> extends AbstractC3529Lf2<L> {
        public final int c;

        public f(int i) {
            super();
            boolean z;
            int g;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "Stripes must be positive");
            if (i > 1073741824) {
                g = -1;
            } else {
                g = AbstractC3529Lf2.g(i) - 1;
            }
            this.c = g;
        }

        @Override // o.AbstractC3529Lf2
        public final L i(Object obj) {
            return j(k(obj));
        }

        @Override // o.AbstractC3529Lf2
        public final int k(Object obj) {
            return AbstractC3529Lf2.t(obj.hashCode()) & this.c;
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.Lf2$g */
    /* loaded from: classes3.dex */
    public static class g<L> extends f<L> {
        public final AtomicReferenceArray<a<? extends L>> d;
        public final InterfaceC8331nh2<L> e;
        public final int f;
        public final ReferenceQueue<L> g;

        /* renamed from: o.Lf2$g$a */
        /* loaded from: classes3.dex */
        public static final class a<L> extends WeakReference<L> {
            public final int a;

            public a(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.a = i;
            }
        }

        public g(int i, InterfaceC8331nh2<L> interfaceC8331nh2) {
            super(i);
            int i2;
            this.g = new ReferenceQueue<>();
            int i3 = this.c;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f = i2;
            this.d = new AtomicReferenceArray<>(i2);
            this.e = interfaceC8331nh2;
        }

        @Override // o.AbstractC3529Lf2
        public L j(int i) {
            L l;
            L l2;
            if (this.f != Integer.MAX_VALUE) {
                C10664xF1.C(i, s());
            }
            a<? extends L> aVar = this.d.get(i);
            if (aVar == null) {
                l = null;
            } else {
                l = aVar.get();
            }
            if (l != null) {
                return l;
            }
            L l3 = this.e.get();
            a aVar2 = new a(l3, i, this.g);
            while (!C3626Mf2.a(this.d, i, aVar, aVar2)) {
                aVar = this.d.get(i);
                if (aVar == null) {
                    l2 = null;
                    continue;
                } else {
                    l2 = aVar.get();
                    continue;
                }
                if (l2 != null) {
                    return l2;
                }
            }
            u();
            return l3;
        }

        @Override // o.AbstractC3529Lf2
        public int s() {
            return this.f;
        }

        public final void u() {
            while (true) {
                Reference<? extends L> poll = this.g.poll();
                if (poll != null) {
                    a aVar = (a) poll;
                    C3626Mf2.a(this.d, aVar.a, aVar, null);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o.Lf2$h */
    /* loaded from: classes3.dex */
    public static final class h extends Abstractlocks.ConditionC4667Wx0 {
        public final Condition a;
        public final j b;

        public h(Condition condition, j jVar) {
            this.a = condition;
            this.b = jVar;
        }

        @Override // o.Abstractlocks.ConditionC4667Wx0
        public Condition a() {
            return this.a;
        }
    }

    /* renamed from: o.Lf2$i */
    /* loaded from: classes3.dex */
    public static final class i extends Abstractlocks.LockC9619sy0 {
        public final Lock X;
        public final j Y;

        public i(Lock lock, j jVar) {
            this.X = lock;
            this.Y = jVar;
        }

        @Override // o.Abstractlocks.LockC9619sy0
        public Lock a() {
            return this.X;
        }

        @Override // o.Abstractlocks.LockC9619sy0, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new h(this.X.newCondition(), this.Y);
        }
    }

    /* renamed from: o.Lf2$j */
    /* loaded from: classes3.dex */
    public static final class j implements ReadWriteLock {
        public final ReadWriteLock X = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new i(this.X.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new i(this.X.writeLock(), this);
        }
    }

    public static /* synthetic */ Semaphore a(int i2) {
        return new e(i2);
    }

    public static /* synthetic */ Lock b() {
        return new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore c(int i2) {
        return new Semaphore(i2, false);
    }

    public static int g(int i2) {
        return 1 << C9979uR0.p(i2, RoundingMode.CEILING);
    }

    public static <L> AbstractC3529Lf2<L> h(int i2, InterfaceC8331nh2<L> interfaceC8331nh2) {
        return new b(i2, interfaceC8331nh2);
    }

    public static <L> AbstractC3529Lf2<L> l(int i2, InterfaceC8331nh2<L> interfaceC8331nh2) {
        if (i2 < 1024) {
            return new g(i2, interfaceC8331nh2);
        }
        return new c(i2, interfaceC8331nh2);
    }

    public static AbstractC3529Lf2<Lock> m(int i2) {
        return l(i2, new InterfaceC8331nh2() { // from class: o.Jf2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return AbstractC3529Lf2.b();
            }
        });
    }

    public static AbstractC3529Lf2<ReadWriteLock> n(int i2) {
        return l(i2, new InterfaceC8331nh2() { // from class: o.Ff2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return new AbstractC3529Lf2.j();
            }
        });
    }

    public static AbstractC3529Lf2<Semaphore> o(int i2, final int i3) {
        return l(i2, new InterfaceC8331nh2() { // from class: o.If2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return AbstractC3529Lf2.c(i3);
            }
        });
    }

    public static AbstractC3529Lf2<Lock> p(int i2) {
        return h(i2, new InterfaceC8331nh2() { // from class: o.Gf2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return new AbstractC3529Lf2.d();
            }
        });
    }

    public static AbstractC3529Lf2<ReadWriteLock> q(int i2) {
        return h(i2, new InterfaceC8331nh2() { // from class: o.Kf2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static AbstractC3529Lf2<Semaphore> r(int i2, final int i3) {
        return h(i2, new InterfaceC8331nh2() { // from class: o.Hf2
            @Override // o.InterfaceC8331nh2
            public final Object get() {
                return AbstractC3529Lf2.a(i3);
            }
        });
    }

    public static int t(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    public Iterable<L> f(Iterable<? extends Object> iterable) {
        ArrayList r = C10608x11.r(iterable);
        if (r.isEmpty()) {
            return AbstractC5317bO0.L();
        }
        int[] iArr = new int[r.size()];
        for (int i2 = 0; i2 < r.size(); i2++) {
            iArr[i2] = k(r.get(i2));
        }
        Arrays.sort(iArr);
        int i3 = iArr[0];
        r.set(0, j(i3));
        for (int i4 = 1; i4 < r.size(); i4++) {
            int i5 = iArr[i4];
            if (i5 == i3) {
                r.set(i4, r.get(i4 - 1));
            } else {
                r.set(i4, j(i5));
                i3 = i5;
            }
        }
        return Collections.unmodifiableList(r);
    }

    public abstract L i(Object obj);

    public abstract L j(int i2);

    public abstract int k(Object obj);

    public abstract int s();

    public AbstractC3529Lf2() {
    }
}
