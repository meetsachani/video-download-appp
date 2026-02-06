package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.C5128ad0;
import o.C6126ek0;
import o.FE1;
import o.ZV;

/* renamed from: o.Wc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4587Wc0<R> implements ZV.b<R>, C6126ek0.f {
    public static final c u1 = new c();
    public final e X;
    public final AbstractC2428Ac2 Y;
    public final FE1.a<C4587Wc0<?>> Y0;
    public final C5128ad0.a Z;
    public final c Z0;
    public final InterfaceC4684Xc0 a1;
    public final UD0 b1;
    public final UD0 c1;
    public final UD0 d1;
    public final UD0 e1;
    public final AtomicInteger f1;
    public InterfaceC6575gX0 g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public InterfaceC5580cT1<?> l1;
    public GU m1;
    public boolean n1;
    public TD0 o1;
    public boolean p1;
    public C5128ad0<?> q1;
    public ZV<R> r1;
    public volatile boolean s1;
    public boolean t1;

    /* renamed from: o.Wc0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final InterfaceC6806hT1 X;

        public a(InterfaceC6806hT1 interfaceC6806hT1) {
            this.X = interfaceC6806hT1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.X.f()) {
                synchronized (C4587Wc0.this) {
                    if (C4587Wc0.this.X.e(this.X)) {
                        C4587Wc0.this.f(this.X);
                    }
                    C4587Wc0.this.i();
                }
            }
        }
    }

    /* renamed from: o.Wc0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final InterfaceC6806hT1 X;

        public b(InterfaceC6806hT1 interfaceC6806hT1) {
            this.X = interfaceC6806hT1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.X.f()) {
                synchronized (C4587Wc0.this) {
                    if (C4587Wc0.this.X.e(this.X)) {
                        C4587Wc0.this.q1.b();
                        C4587Wc0.this.g(this.X);
                        C4587Wc0.this.s(this.X);
                    }
                    C4587Wc0.this.i();
                }
            }
        }
    }

    /* renamed from: o.Wc0$c */
    /* loaded from: classes.dex */
    public static class c {
        public <R> C5128ad0<R> a(InterfaceC5580cT1<R> interfaceC5580cT1, boolean z, InterfaceC6575gX0 interfaceC6575gX0, C5128ad0.a aVar) {
            return new C5128ad0<>(interfaceC5580cT1, z, true, interfaceC6575gX0, aVar);
        }
    }

    /* renamed from: o.Wc0$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final InterfaceC6806hT1 a;
        public final Executor b;

        public d(InterfaceC6806hT1 interfaceC6806hT1, Executor executor) {
            this.a = interfaceC6806hT1;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: o.Wc0$e */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {
        public final List<d> X;

        public e() {
            this(new ArrayList(2));
        }

        public static d h(InterfaceC6806hT1 interfaceC6806hT1) {
            return new d(interfaceC6806hT1, C8325ng0.a());
        }

        public void clear() {
            this.X.clear();
        }

        public void d(InterfaceC6806hT1 interfaceC6806hT1, Executor executor) {
            this.X.add(new d(interfaceC6806hT1, executor));
        }

        public boolean e(InterfaceC6806hT1 interfaceC6806hT1) {
            return this.X.contains(h(interfaceC6806hT1));
        }

        public e f() {
            return new e(new ArrayList(this.X));
        }

        public void i(InterfaceC6806hT1 interfaceC6806hT1) {
            this.X.remove(h(interfaceC6806hT1));
        }

        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.X.iterator();
        }

        public int size() {
            return this.X.size();
        }

        public e(List<d> list) {
            this.X = list;
        }
    }

    public C4587Wc0(UD0 ud0, UD0 ud02, UD0 ud03, UD0 ud04, InterfaceC4684Xc0 interfaceC4684Xc0, C5128ad0.a aVar, FE1.a<C4587Wc0<?>> aVar2) {
        this(ud0, ud02, ud03, ud04, interfaceC4684Xc0, aVar, aVar2, u1);
    }

    private synchronized void r() {
        if (this.g1 != null) {
            this.X.clear();
            this.g1 = null;
            this.q1 = null;
            this.l1 = null;
            this.p1 = false;
            this.s1 = false;
            this.n1 = false;
            this.t1 = false;
            this.r1.C(false);
            this.r1 = null;
            this.o1 = null;
            this.m1 = null;
            this.Y0.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(InterfaceC6806hT1 interfaceC6806hT1, Executor executor) {
        try {
            this.Y.c();
            this.X.d(interfaceC6806hT1, executor);
            if (this.n1) {
                k(1);
                executor.execute(new b(interfaceC6806hT1));
            } else if (this.p1) {
                k(1);
                executor.execute(new a(interfaceC6806hT1));
            } else {
                C10175vF1.b(!this.s1, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ZV.b
    public void b(InterfaceC5580cT1<R> interfaceC5580cT1, GU gu, boolean z) {
        synchronized (this) {
            this.l1 = interfaceC5580cT1;
            this.m1 = gu;
            this.t1 = z;
        }
        p();
    }

    @Override // o.ZV.b
    public void c(TD0 td0) {
        synchronized (this) {
            this.o1 = td0;
        }
        o();
    }

    @Override // o.ZV.b
    public void d(ZV<?> zv) {
        j().execute(zv);
    }

    @Override // o.C6126ek0.f
    public AbstractC2428Ac2 e() {
        return this.Y;
    }

    public void f(InterfaceC6806hT1 interfaceC6806hT1) {
        try {
            interfaceC6806hT1.c(this.o1);
        } catch (Throwable th) {
            throw new C3484Kt(th);
        }
    }

    public void g(InterfaceC6806hT1 interfaceC6806hT1) {
        try {
            interfaceC6806hT1.b(this.q1, this.m1, this.t1);
        } catch (Throwable th) {
            throw new C3484Kt(th);
        }
    }

    public void h() {
        if (n()) {
            return;
        }
        this.s1 = true;
        this.r1.j();
        this.a1.c(this, this.g1);
    }

    public void i() {
        boolean z;
        C5128ad0<?> c5128ad0;
        synchronized (this) {
            try {
                this.Y.c();
                C10175vF1.b(n(), "Not yet complete!");
                int decrementAndGet = this.f1.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C10175vF1.b(z, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    c5128ad0 = this.q1;
                    r();
                } else {
                    c5128ad0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5128ad0 != null) {
            c5128ad0.e();
        }
    }

    public final UD0 j() {
        if (this.i1) {
            return this.d1;
        }
        if (this.j1) {
            return this.e1;
        }
        return this.c1;
    }

    public synchronized void k(int i) {
        C5128ad0<?> c5128ad0;
        C10175vF1.b(n(), "Not yet complete!");
        if (this.f1.getAndAdd(i) == 0 && (c5128ad0 = this.q1) != null) {
            c5128ad0.b();
        }
    }

    public synchronized C4587Wc0<R> l(InterfaceC6575gX0 interfaceC6575gX0, boolean z, boolean z2, boolean z3, boolean z4) {
        this.g1 = interfaceC6575gX0;
        this.h1 = z;
        this.i1 = z2;
        this.j1 = z3;
        this.k1 = z4;
        return this;
    }

    public synchronized boolean m() {
        return this.s1;
    }

    public final boolean n() {
        if (!this.p1 && !this.n1 && !this.s1) {
            return false;
        }
        return true;
    }

    public void o() {
        synchronized (this) {
            try {
                this.Y.c();
                if (this.s1) {
                    r();
                } else if (!this.X.isEmpty()) {
                    if (!this.p1) {
                        this.p1 = true;
                        InterfaceC6575gX0 interfaceC6575gX0 = this.g1;
                        e f = this.X.f();
                        k(f.size() + 1);
                        this.a1.d(this, interfaceC6575gX0, null);
                        Iterator<d> it = f.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.b.execute(new a(next.a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p() {
        synchronized (this) {
            try {
                this.Y.c();
                if (this.s1) {
                    this.l1.a();
                    r();
                } else if (!this.X.isEmpty()) {
                    if (!this.n1) {
                        this.q1 = this.Z0.a(this.l1, this.h1, this.g1, this.Z);
                        this.n1 = true;
                        e f = this.X.f();
                        k(f.size() + 1);
                        this.a1.d(this, this.g1, this.q1);
                        Iterator<d> it = f.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.b.execute(new b(next.a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q() {
        return this.k1;
    }

    public synchronized void s(InterfaceC6806hT1 interfaceC6806hT1) {
        try {
            this.Y.c();
            this.X.i(interfaceC6806hT1);
            if (this.X.isEmpty()) {
                h();
                if (!this.n1) {
                    if (this.p1) {
                    }
                }
                if (this.f1.get() == 0) {
                    r();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(ZV<R> zv) {
        UD0 j;
        try {
            this.r1 = zv;
            if (zv.K()) {
                j = this.b1;
            } else {
                j = j();
            }
            j.execute(zv);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4587Wc0(UD0 ud0, UD0 ud02, UD0 ud03, UD0 ud04, InterfaceC4684Xc0 interfaceC4684Xc0, C5128ad0.a aVar, FE1.a<C4587Wc0<?>> aVar2, c cVar) {
        this.X = new e();
        this.Y = AbstractC2428Ac2.a();
        this.f1 = new AtomicInteger();
        this.b1 = ud0;
        this.c1 = ud02;
        this.d1 = ud03;
        this.e1 = ud04;
        this.a1 = interfaceC4684Xc0;
        this.Z = aVar;
        this.Y0 = aVar2;
        this.Z0 = cVar;
    }
}
