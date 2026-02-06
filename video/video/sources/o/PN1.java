package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class PN1<C extends Comparable> extends SN1 implements IF1<C>, Serializable {
    public static final PN1<Comparable> Z = new PN1<>(PT.h(), PT.e());
    private static final long serialVersionUID = 0;
    public final PT<C> X;
    public final PT<C> Y;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6886hp.values().length];
            a = iArr;
            try {
                iArr[EnumC6886hp.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC6886hp.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements YA0<PN1, PT> {
        public static final b X = new b();

        @Override // o.YA0
        /* renamed from: a */
        public PT apply(PN1 pn1) {
            return pn1.X;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends AbstractC10587ww1<PN1<?>> implements Serializable {
        public static final AbstractC10587ww1<PN1<?>> Z = new c();
        private static final long serialVersionUID = 0;

        @Override // o.AbstractC10587ww1, java.util.Comparator
        /* renamed from: H */
        public int compare(PN1<?> pn1, PN1<?> pn12) {
            return AbstractC9452sH.n().i(pn1.X, pn12.X).i(pn1.Y, pn12.Y).m();
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements YA0<PN1, PT> {
        public static final d X = new d();

        @Override // o.YA0
        /* renamed from: a */
        public PT apply(PN1 pn1) {
            return pn1.Y;
        }
    }

    public PN1(PT<C> pt, PT<C> pt2) {
        String str;
        this.X = (PT) C10664xF1.E(pt);
        this.Y = (PT) C10664xF1.E(pt2);
        if (pt.compareTo(pt2) <= 0 && pt != PT.e() && pt2 != PT.h()) {
            return;
        }
        String valueOf = String.valueOf(F(pt, pt2));
        if (valueOf.length() != 0) {
            str = "Invalid range: ".concat(valueOf);
        } else {
            str = new String("Invalid range: ");
        }
        throw new IllegalArgumentException(str);
    }

    public static <C extends Comparable<?>> PN1<C> A(C c2, C c3) {
        return k(PT.g(c2), PT.g(c3));
    }

    public static <C extends Comparable<?>> PN1<C> B(C c2, EnumC6886hp enumC6886hp, C c3, EnumC6886hp enumC6886hp2) {
        PT i;
        PT g;
        C10664xF1.E(enumC6886hp);
        C10664xF1.E(enumC6886hp2);
        EnumC6886hp enumC6886hp3 = EnumC6886hp.OPEN;
        if (enumC6886hp == enumC6886hp3) {
            i = PT.g(c2);
        } else {
            i = PT.i(c2);
        }
        if (enumC6886hp2 == enumC6886hp3) {
            g = PT.i(c3);
        } else {
            g = PT.g(c3);
        }
        return k(i, g);
    }

    public static <C extends Comparable<?>> AbstractC10587ww1<PN1<C>> C() {
        return (AbstractC10587ww1<PN1<C>>) c.Z;
    }

    public static <C extends Comparable<?>> PN1<C> D(C c2) {
        return f(c2, c2);
    }

    public static String F(PT<?> pt, PT<?> pt2) {
        StringBuilder sb = new StringBuilder(16);
        pt.m(sb);
        sb.append("..");
        pt2.n(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> PN1<C> G(C c2, EnumC6886hp enumC6886hp) {
        int i = a.a[enumC6886hp.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return d(c2);
            }
            throw new AssertionError();
        }
        return v(c2);
    }

    public static <C extends Comparable<?>> YA0<PN1<C>, PT<C>> H() {
        return d.X;
    }

    public static <C extends Comparable<?>> PN1<C> a() {
        return (PN1<C>) Z;
    }

    public static <C extends Comparable<?>> PN1<C> c(C c2) {
        return k(PT.i(c2), PT.e());
    }

    public static <C extends Comparable<?>> PN1<C> d(C c2) {
        return k(PT.h(), PT.g(c2));
    }

    public static <C extends Comparable<?>> PN1<C> f(C c2, C c3) {
        return k(PT.i(c2), PT.g(c3));
    }

    public static <C extends Comparable<?>> PN1<C> g(C c2, C c3) {
        return k(PT.i(c2), PT.i(c3));
    }

    public static int h(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> PN1<C> k(PT<C> pt, PT<C> pt2) {
        return new PN1<>(pt, pt2);
    }

    public static <C extends Comparable<?>> PN1<C> l(C c2, EnumC6886hp enumC6886hp) {
        int i = a.a[enumC6886hp.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c(c2);
            }
            throw new AssertionError();
        }
        return p(c2);
    }

    public static <C extends Comparable<?>> PN1<C> m(Iterable<C> iterable) {
        C10664xF1.E(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (AbstractC10587ww1.z().equals(comparator) || comparator == null) {
                return f((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) C10664xF1.E(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) C10664xF1.E(it.next());
            comparable = (Comparable) AbstractC10587ww1.z().w(comparable, comparable3);
            comparable2 = (Comparable) AbstractC10587ww1.z().s(comparable2, comparable3);
        }
        return f(comparable, comparable2);
    }

    public static <C extends Comparable<?>> PN1<C> p(C c2) {
        return k(PT.g(c2), PT.e());
    }

    public static <C extends Comparable<?>> PN1<C> v(C c2) {
        return k(PT.h(), PT.i(c2));
    }

    public static <C extends Comparable<?>> YA0<PN1<C>, PT<C>> w() {
        return b.X;
    }

    public static <C extends Comparable<?>> PN1<C> z(C c2, C c3) {
        return k(PT.g(c2), PT.i(c3));
    }

    public PN1<C> E(PN1<C> pn1) {
        PT<C> pt;
        PT<C> pt2;
        int compareTo = this.X.compareTo(pn1.X);
        int compareTo2 = this.Y.compareTo(pn1.Y);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return pn1;
        }
        if (compareTo <= 0) {
            pt = this.X;
        } else {
            pt = pn1.X;
        }
        if (compareTo2 >= 0) {
            pt2 = this.Y;
        } else {
            pt2 = pn1.Y;
        }
        return k(pt, pt2);
    }

    public EnumC6886hp I() {
        return this.Y.t();
    }

    public C J() {
        return this.Y.o();
    }

    @Override // o.IF1
    @Deprecated
    /* renamed from: b */
    public boolean apply(C c2) {
        return i(c2);
    }

    public PN1<C> e(W30<C> w30) {
        C10664xF1.E(w30);
        PT<C> j = this.X.j(w30);
        PT<C> j2 = this.Y.j(w30);
        if (j == this.X && j2 == this.Y) {
            return this;
        }
        return k(j, j2);
    }

    @Override // o.IF1
    public boolean equals(@MB Object obj) {
        if (obj instanceof PN1) {
            PN1 pn1 = (PN1) obj;
            if (this.X.equals(pn1.X) && this.Y.equals(pn1.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.X.hashCode() * 31) + this.Y.hashCode();
    }

    public boolean i(C c2) {
        C10664xF1.E(c2);
        if (this.X.q(c2) && !this.Y.q(c2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean j(Iterable<? extends C> iterable) {
        if (C5098aU0.C(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (AbstractC10587ww1.z().equals(comparator) || comparator == null) {
                if (i((Comparable) sortedSet.first()) && i((Comparable) sortedSet.last())) {
                    return true;
                }
                return false;
            }
        }
        for (C c2 : iterable) {
            if (!i(c2)) {
                return false;
            }
        }
        return true;
    }

    public boolean n(PN1<C> pn1) {
        if (this.X.compareTo(pn1.X) <= 0 && this.Y.compareTo(pn1.Y) >= 0) {
            return true;
        }
        return false;
    }

    public PN1<C> o(PN1<C> pn1) {
        boolean z;
        PN1<C> pn12;
        if (this.X.compareTo(pn1.Y) < 0 && pn1.X.compareTo(this.Y) < 0) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(pn1);
            StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length());
            sb.append("Ranges have a nonempty intersection: ");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.X.compareTo(pn1.X) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pn12 = this;
        } else {
            pn12 = pn1;
        }
        if (!z) {
            pn1 = this;
        }
        return k(pn12.Y, pn1.X);
    }

    public boolean q() {
        if (this.X != PT.h()) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (this.Y != PT.e()) {
            return true;
        }
        return false;
    }

    public Object readResolve() {
        if (equals(Z)) {
            return a();
        }
        return this;
    }

    public PN1<C> s(PN1<C> pn1) {
        PT<C> pt;
        PT<C> pt2;
        boolean z;
        int compareTo = this.X.compareTo(pn1.X);
        int compareTo2 = this.Y.compareTo(pn1.Y);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return pn1;
        }
        if (compareTo >= 0) {
            pt = this.X;
        } else {
            pt = pn1.X;
        }
        if (compareTo2 <= 0) {
            pt2 = this.Y;
        } else {
            pt2 = pn1.Y;
        }
        if (pt.compareTo(pt2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.y(z, "intersection is undefined for disconnected ranges %s and %s", this, pn1);
        return k(pt, pt2);
    }

    public boolean t(PN1<C> pn1) {
        if (this.X.compareTo(pn1.Y) <= 0 && pn1.X.compareTo(this.Y) <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return F(this.X, this.Y);
    }

    public boolean u() {
        return this.X.equals(this.Y);
    }

    public EnumC6886hp x() {
        return this.X.s();
    }

    public C y() {
        return this.X.o();
    }
}
