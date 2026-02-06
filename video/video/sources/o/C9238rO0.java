package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import o.AbstractC5317bO0;
import o.C5118aa2;

@InterfaceC11149zF0
@InterfaceC6329fa0
@InterfaceC4238Sm
/* renamed from: o.rO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9238rO0<C extends Comparable> extends L2<C> implements Serializable {
    public final transient AbstractC5317bO0<PN1<C>> X;
    @MB
    @SY0
    public transient C9238rO0<C> Y;
    public static final C9238rO0<Comparable<?>> Z = new C9238rO0<>(AbstractC5317bO0.L());
    public static final C9238rO0<Comparable<?>> Y0 = new C9238rO0<>(AbstractC5317bO0.M(PN1.a()));

    /* renamed from: o.rO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC5317bO0<PN1<C>> {
        public final /* synthetic */ int Y0;
        public final /* synthetic */ int Z;
        public final /* synthetic */ PN1 Z0;

        public a(int i, int i2, PN1 pn1) {
            this.Z = i;
            this.Y0 = i2;
            this.Z0 = pn1;
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.List
        /* renamed from: p0 */
        public PN1<C> get(int i) {
            C10664xF1.C(i, this.Z);
            if (i != 0 && i != this.Z - 1) {
                return (PN1) C9238rO0.this.X.get(i + this.Y0);
            }
            return ((PN1) C9238rO0.this.X.get(i + this.Y0)).s(this.Z0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z;
        }
    }

    /* renamed from: o.rO0$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC10942yO0<C> {
        public final W30<C> c1;
        @MB
        public transient Integer d1;

        /* renamed from: o.rO0$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<C> {
            public Iterator<C> Y0 = C7052iU0.u();
            public final Iterator<PN1<C>> Z;

            public a() {
                this.Z = C9238rO0.this.X.iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public C b() {
                while (!this.Y0.hasNext()) {
                    if (this.Z.hasNext()) {
                        this.Y0 = GM.j1(this.Z.next(), b.this.c1).iterator();
                    } else {
                        return (C) c();
                    }
                }
                return this.Y0.next();
            }
        }

        /* renamed from: o.rO0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0335b extends AbstractC6437g1<C> {
            public Iterator<C> Y0 = C7052iU0.u();
            public final Iterator<PN1<C>> Z;

            public C0335b() {
                this.Z = C9238rO0.this.X.j0().iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public C b() {
                while (!this.Y0.hasNext()) {
                    if (this.Z.hasNext()) {
                        this.Y0 = GM.j1(this.Z.next(), b.this.c1).descendingIterator();
                    } else {
                        return (C) c();
                    }
                }
                return this.Y0.next();
            }
        }

        public b(W30<C> w30) {
            super(AbstractC10587ww1.z());
            this.c1 = w30;
        }

        @Override // o.AbstractC10942yO0, java.util.NavigableSet
        @InterfaceC11149zF0("NavigableSet")
        /* renamed from: B0 */
        public AbstractC6237fB2<C> descendingIterator() {
            return new C0335b();
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return C9238rO0.this.e((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // o.AbstractC10942yO0
        /* renamed from: f1 */
        public AbstractC10942yO0<C> H0(C c, boolean z) {
            return g1(PN1.G(c, EnumC6886hp.g(z)));
        }

        public AbstractC10942yO0<C> g1(PN1<C> pn1) {
            return C9238rO0.this.k(pn1).v(this.c1);
        }

        @Override // o.AbstractC10942yO0
        /* renamed from: i1 */
        public AbstractC10942yO0<C> Y0(C c, boolean z, C c2, boolean z2) {
            if (!z && !z2 && PN1.h(c, c2) == 0) {
                return AbstractC10942yO0.J0();
            }
            return g1(PN1.B(c, EnumC6886hp.g(z), c2, EnumC6886hp.g(z2)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC10942yO0
        public int indexOf(@MB Object obj) {
            if (contains(obj)) {
                Objects.requireNonNull(obj);
                Comparable comparable = (Comparable) obj;
                AbstractC6237fB2 it = C9238rO0.this.X.iterator();
                long j = 0;
                while (it.hasNext()) {
                    PN1 pn1 = (PN1) it.next();
                    if (pn1.i(comparable)) {
                        return C7775lT0.x(j + GM.j1(pn1, this.c1).indexOf(comparable));
                    }
                    j += GM.j1(pn1, this.c1).size();
                }
                throw new AssertionError("impossible");
            }
            return -1;
        }

        @Override // o.TN0
        public boolean j() {
            return C9238rO0.this.X.j();
        }

        @Override // o.AbstractC10942yO0
        /* renamed from: j1 */
        public AbstractC10942yO0<C> b1(C c, boolean z) {
            return g1(PN1.l(c, EnumC6886hp.g(z)));
        }

        @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<C> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer num = this.d1;
            if (num == null) {
                AbstractC6237fB2 it = C9238rO0.this.X.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += GM.j1((PN1) it.next(), this.c1).size();
                    if (j >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(C7775lT0.x(j));
                this.d1 = num;
            }
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return C9238rO0.this.X.toString();
        }

        @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0
        public Object writeReplace() {
            return new c(C9238rO0.this.X, this.c1);
        }

        @Override // o.AbstractC10942yO0
        public AbstractC10942yO0<C> z0() {
            return new C10611x20(this);
        }
    }

    /* renamed from: o.rO0$c */
    /* loaded from: classes3.dex */
    public static class c<C extends Comparable> implements Serializable {
        public final AbstractC5317bO0<PN1<C>> X;
        public final W30<C> Y;

        public c(AbstractC5317bO0<PN1<C>> abstractC5317bO0, W30<C> w30) {
            this.X = abstractC5317bO0;
            this.Y = w30;
        }

        public Object readResolve() {
            return new C9238rO0(this.X).v(this.Y);
        }
    }

    /* renamed from: o.rO0$d */
    /* loaded from: classes3.dex */
    public static class d<C extends Comparable<?>> {
        public final List<PN1<C>> a = C10608x11.q();

        @InterfaceC6181ey
        public d<C> a(PN1<C> pn1) {
            C10664xF1.u(!pn1.u(), "range must not be empty, but was %s", pn1);
            this.a.add(pn1);
            return this;
        }

        @InterfaceC6181ey
        public d<C> b(Iterable<PN1<C>> iterable) {
            for (PN1<C> pn1 : iterable) {
                a(pn1);
            }
            return this;
        }

        @InterfaceC6181ey
        public d<C> c(VN1<C> vn1) {
            return b(vn1.q());
        }

        public C9238rO0<C> d() {
            AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(this.a.size());
            Collections.sort(this.a, PN1.C());
            InterfaceC8699pC1 S = C7052iU0.S(this.a.iterator());
            while (S.hasNext()) {
                PN1 pn1 = (PN1) S.next();
                while (S.hasNext()) {
                    PN1<C> pn12 = (PN1) S.peek();
                    if (pn1.t(pn12)) {
                        C10664xF1.y(pn1.s(pn12).u(), "Overlapping ranges not permitted but found %s overlapping %s", pn1, pn12);
                        pn1 = pn1.E((PN1) S.next());
                    }
                }
                aVar.g(pn1);
            }
            AbstractC5317bO0 e = aVar.e();
            if (e.isEmpty()) {
                return C9238rO0.E();
            }
            if (e.size() == 1 && ((PN1) C5098aU0.z(e)).equals(PN1.a())) {
                return C9238rO0.s();
            }
            return new C9238rO0<>(e);
        }

        @InterfaceC6181ey
        public d<C> e(d<C> dVar) {
            b(dVar.a);
            return this;
        }
    }

    /* renamed from: o.rO0$e */
    /* loaded from: classes3.dex */
    public final class e extends AbstractC5317bO0<PN1<C>> {
        public final boolean Y0;
        public final boolean Z;
        public final int Z0;

        public e() {
            boolean q = ((PN1) C9238rO0.this.X.get(0)).q();
            this.Z = q;
            boolean r = ((PN1) C5098aU0.w(C9238rO0.this.X)).r();
            this.Y0 = r;
            int size = C9238rO0.this.X.size();
            size = q ? size : size - 1;
            this.Z0 = r ? size + 1 : size;
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.List
        /* renamed from: p0 */
        public PN1<C> get(int i) {
            PT<C> pt;
            PT<C> pt2;
            C10664xF1.C(i, this.Z0);
            if (this.Z) {
                if (i == 0) {
                    pt = PT.h();
                } else {
                    pt = ((PN1) C9238rO0.this.X.get(i - 1)).Y;
                }
            } else {
                pt = ((PN1) C9238rO0.this.X.get(i)).Y;
            }
            if (this.Y0 && i == this.Z0 - 1) {
                pt2 = PT.e();
            } else {
                pt2 = ((PN1) C9238rO0.this.X.get(i + (!this.Z ? 1 : 0))).X;
            }
            return PN1.k(pt, pt2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z0;
        }
    }

    /* renamed from: o.rO0$f */
    /* loaded from: classes3.dex */
    public static final class f<C extends Comparable> implements Serializable {
        public final AbstractC5317bO0<PN1<C>> X;

        public f(AbstractC5317bO0<PN1<C>> abstractC5317bO0) {
            this.X = abstractC5317bO0;
        }

        public Object readResolve() {
            if (this.X.isEmpty()) {
                return C9238rO0.E();
            }
            if (this.X.equals(AbstractC5317bO0.M(PN1.a()))) {
                return C9238rO0.s();
            }
            return new C9238rO0(this.X);
        }
    }

    public C9238rO0(AbstractC5317bO0<PN1<C>> abstractC5317bO0) {
        this.X = abstractC5317bO0;
    }

    public static <C extends Comparable> C9238rO0<C> E() {
        return Z;
    }

    public static <C extends Comparable> C9238rO0<C> F(PN1<C> pn1) {
        C10664xF1.E(pn1);
        if (pn1.u()) {
            return E();
        }
        if (pn1.equals(PN1.a())) {
            return s();
        }
        return new C9238rO0<>(AbstractC5317bO0.M(pn1));
    }

    public static <C extends Comparable<?>> C9238rO0<C> I(Iterable<PN1<C>> iterable) {
        return z(C8627ou2.t(iterable));
    }

    public static <C extends Comparable> C9238rO0<C> s() {
        return Y0;
    }

    public static <C extends Comparable<?>> d<C> w() {
        return new d<>();
    }

    public static <C extends Comparable<?>> C9238rO0<C> y(Iterable<PN1<C>> iterable) {
        return new d().b(iterable).d();
    }

    public static <C extends Comparable> C9238rO0<C> z(VN1<C> vn1) {
        C10664xF1.E(vn1);
        if (vn1.isEmpty()) {
            return E();
        }
        if (vn1.g(PN1.a())) {
            return s();
        }
        if (vn1 instanceof C9238rO0) {
            C9238rO0<C> c9238rO0 = (C9238rO0) vn1;
            if (!c9238rO0.D()) {
                return c9238rO0;
            }
        }
        return new C9238rO0<>(AbstractC5317bO0.F(vn1.q()));
    }

    public C9238rO0<C> A(VN1<C> vn1) {
        C8627ou2 u = C8627ou2.u(this);
        u.n(vn1);
        return z(u);
    }

    public final AbstractC5317bO0<PN1<C>> B(PN1<C> pn1) {
        int i;
        int size;
        if (!this.X.isEmpty() && !pn1.u()) {
            if (pn1.n(a())) {
                return this.X;
            }
            if (pn1.q()) {
                i = C5118aa2.c(this.X, PN1.H(), pn1.X, C5118aa2.c.Y0, C5118aa2.b.Y);
            } else {
                i = 0;
            }
            if (pn1.r()) {
                size = C5118aa2.c(this.X, PN1.w(), pn1.Y, C5118aa2.c.Z, C5118aa2.b.Y);
            } else {
                size = this.X.size();
            }
            int i2 = size - i;
            if (i2 == 0) {
                return AbstractC5317bO0.L();
            }
            return new a(i2, i, pn1);
        }
        return AbstractC5317bO0.L();
    }

    public C9238rO0<C> C(VN1<C> vn1) {
        C8627ou2 u = C8627ou2.u(this);
        u.n(vn1.d());
        return z(u);
    }

    public boolean D() {
        return this.X.j();
    }

    @Override // o.VN1
    /* renamed from: G */
    public C9238rO0<C> k(PN1<C> pn1) {
        if (!isEmpty()) {
            PN1<C> a2 = a();
            if (pn1.n(a2)) {
                return this;
            }
            if (pn1.t(a2)) {
                return new C9238rO0<>(B(pn1));
            }
        }
        return E();
    }

    public C9238rO0<C> H(VN1<C> vn1) {
        return I(C5098aU0.f(q(), vn1.q()));
    }

    @Override // o.VN1
    public PN1<C> a() {
        if (!this.X.isEmpty()) {
            PT<C> pt = this.X.get(0).X;
            AbstractC5317bO0<PN1<C>> abstractC5317bO0 = this.X;
            return PN1.k(pt, abstractC5317bO0.get(abstractC5317bO0.size() - 1).Y);
        }
        throw new NoSuchElementException();
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void b(PN1<C> pn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void c(PN1<C> pn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return super.e(comparable);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void f(VN1<C> vn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    public boolean g(PN1<C> pn1) {
        int d2 = C5118aa2.d(this.X, PN1.w(), pn1.X, AbstractC10587ww1.z(), C5118aa2.c.X, C5118aa2.b.X);
        if (d2 != -1 && this.X.get(d2).n(pn1)) {
            return true;
        }
        return false;
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void h(Iterable<PN1<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean i(VN1 vn1) {
        return super.i(vn1);
    }

    @Override // o.L2, o.VN1
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void j(Iterable<PN1<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    @MB
    public PN1<C> l(C c2) {
        int d2 = C5118aa2.d(this.X, PN1.w(), PT.i(c2), AbstractC10587ww1.z(), C5118aa2.c.X, C5118aa2.b.X);
        if (d2 != -1) {
            PN1<C> pn1 = this.X.get(d2);
            if (pn1.i(c2)) {
                return pn1;
            }
        }
        return null;
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean m(Iterable iterable) {
        return super.m(iterable);
    }

    @Override // o.L2, o.VN1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void n(VN1<C> vn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.L2, o.VN1
    public boolean o(PN1<C> pn1) {
        int d2 = C5118aa2.d(this.X, PN1.w(), pn1.X, AbstractC10587ww1.z(), C5118aa2.c.X, C5118aa2.b.Y);
        if (d2 < this.X.size() && this.X.get(d2).t(pn1) && !this.X.get(d2).s(pn1).u()) {
            return true;
        }
        if (d2 > 0) {
            int i = d2 - 1;
            if (this.X.get(i).t(pn1) && !this.X.get(i).s(pn1).u()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.VN1
    /* renamed from: t */
    public AbstractC9481sO0<PN1<C>> p() {
        if (this.X.isEmpty()) {
            return AbstractC9481sO0.M();
        }
        return new UQ1(this.X.j0(), PN1.C().E());
    }

    @Override // o.VN1
    /* renamed from: u */
    public AbstractC9481sO0<PN1<C>> q() {
        if (this.X.isEmpty()) {
            return AbstractC9481sO0.M();
        }
        return new UQ1(this.X, PN1.C());
    }

    public AbstractC10942yO0<C> v(W30<C> w30) {
        C10664xF1.E(w30);
        if (isEmpty()) {
            return AbstractC10942yO0.J0();
        }
        PN1<C> e2 = a().e(w30);
        if (e2.q()) {
            if (!e2.r()) {
                try {
                    w30.e();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new b(w30);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    public Object writeReplace() {
        return new f(this.X);
    }

    @Override // o.VN1
    /* renamed from: x */
    public C9238rO0<C> d() {
        C9238rO0<C> c9238rO0 = this.Y;
        if (c9238rO0 != null) {
            return c9238rO0;
        }
        if (this.X.isEmpty()) {
            C9238rO0<C> s = s();
            this.Y = s;
            return s;
        } else if (this.X.size() == 1 && this.X.get(0).equals(PN1.a())) {
            C9238rO0<C> E = E();
            this.Y = E;
            return E;
        } else {
            C9238rO0<C> c9238rO02 = new C9238rO0<>(new e(), this);
            this.Y = c9238rO02;
            return c9238rO02;
        }
    }

    public C9238rO0(AbstractC5317bO0<PN1<C>> abstractC5317bO0, C9238rO0<C> c9238rO0) {
        this.X = abstractC5317bO0;
        this.Y = c9238rO0;
    }
}
