package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class MQ1<C extends Comparable> extends GM<C> {
    private static final long serialVersionUID = 0;
    public final PN1<C> d1;

    /* loaded from: classes3.dex */
    public class a extends R2<C> {
        public final C Y;

        public a(Comparable comparable) {
            super(comparable);
            this.Y = (C) MQ1.this.last();
        }

        @Override // o.R2
        @MB
        /* renamed from: c */
        public C b(C c) {
            if (MQ1.z1(c, this.Y)) {
                return null;
            }
            return MQ1.this.c1.g(c);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends R2<C> {
        public final C Y;

        public b(Comparable comparable) {
            super(comparable);
            this.Y = (C) MQ1.this.first();
        }

        @Override // o.R2
        @MB
        /* renamed from: c */
        public C b(C c) {
            if (MQ1.z1(c, this.Y)) {
                return null;
            }
            return MQ1.this.c1.i(c);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends QN0<C> {
        public c() {
        }

        @Override // o.QN0
        /* renamed from: r0 */
        public AbstractC10942yO0<C> p0() {
            return MQ1.this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: s0 */
        public C get(int i) {
            C10664xF1.C(i, size());
            MQ1 mq1 = MQ1.this;
            return (C) mq1.c1.h(mq1.first(), i);
        }
    }

    @InterfaceC11149zF0
    /* loaded from: classes3.dex */
    public static final class d<C extends Comparable> implements Serializable {
        public final PN1<C> X;
        public final W30<C> Y;

        public /* synthetic */ d(PN1 pn1, W30 w30, a aVar) {
            this(pn1, w30);
        }

        private Object readResolve() {
            return new MQ1(this.X, this.Y);
        }

        public d(PN1<C> pn1, W30<C> w30) {
            this.X = pn1;
            this.Y = w30;
        }
    }

    public MQ1(PN1<C> pn1, W30<C> w30) {
        super(w30);
        this.d1 = pn1;
    }

    public static boolean z1(Comparable<?> comparable, @MB Comparable<?> comparable2) {
        if (comparable2 != null && PN1.h(comparable, comparable2) == 0) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    /* renamed from: A1 */
    public C first() {
        C r = this.d1.X.r(this.c1);
        Objects.requireNonNull(r);
        return r;
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: B0 */
    public AbstractC6237fB2<C> descendingIterator() {
        return new b(last());
    }

    public final GM<C> B1(PN1<C> pn1) {
        if (this.d1.t(pn1)) {
            return GM.j1(this.d1.s(pn1), this.c1);
        }
        return new C3800Oa0(this.c1);
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    /* renamed from: E1 */
    public C last() {
        C p = this.d1.Y.p(this.c1);
        Objects.requireNonNull(p);
        return p;
    }

    @Override // o.AbstractC9481sO0
    public AbstractC5317bO0<C> K() {
        if (this.c1.X) {
            return new c();
        }
        return super.K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.d1.i((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return C7232jF.b(this, collection);
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MQ1) {
            MQ1 mq1 = (MQ1) obj;
            if (this.c1.equals(mq1.c1)) {
                if (first().equals(mq1.first()) && last().equals(mq1.last())) {
                    return true;
                }
                return false;
            }
        }
        return super.equals(obj);
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return C10856y22.k(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10942yO0
    @InterfaceC11149zF0
    public int indexOf(@MB Object obj) {
        if (contains(obj)) {
            C first = first();
            Objects.requireNonNull(obj);
            return (int) this.c1.b(first, (Comparable) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<C> iterator() {
        return new a(first());
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: n1 */
    public GM<C> H0(C c2, boolean z) {
        return B1(PN1.G(c2, EnumC6886hp.g(z)));
    }

    @Override // o.GM
    public GM<C> o1(GM<C> gm) {
        C10664xF1.E(gm);
        C10664xF1.d(this.c1.equals(gm.c1));
        if (gm.isEmpty()) {
            return gm;
        }
        Comparable comparable = (Comparable) AbstractC10587ww1.z().s(first(), (Comparable) gm.first());
        Comparable comparable2 = (Comparable) AbstractC10587ww1.z().w(last(), (Comparable) gm.last());
        if (comparable.compareTo(comparable2) <= 0) {
            return GM.j1(PN1.f(comparable, comparable2), this.c1);
        }
        return new C3800Oa0(this.c1);
    }

    @Override // o.GM
    public PN1<C> p1() {
        EnumC6886hp enumC6886hp = EnumC6886hp.CLOSED;
        return q1(enumC6886hp, enumC6886hp);
    }

    @Override // o.GM
    public PN1<C> q1(EnumC6886hp enumC6886hp, EnumC6886hp enumC6886hp2) {
        return PN1.k(this.d1.X.u(enumC6886hp, this.c1), this.d1.Y.v(enumC6886hp2, this.c1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long b2 = this.c1.b(first(), last());
        if (b2 >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) b2) + 1;
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: u1 */
    public GM<C> Y0(C c2, boolean z, C c3, boolean z2) {
        if (c2.compareTo(c3) == 0 && !z && !z2) {
            return new C3800Oa0(this.c1);
        }
        return B1(PN1.B(c2, EnumC6886hp.g(z), c3, EnumC6886hp.g(z2)));
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new d(this.d1, this.c1, null);
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: x1 */
    public GM<C> b1(C c2, boolean z) {
        return B1(PN1.l(c2, EnumC6886hp.g(z)));
    }
}
