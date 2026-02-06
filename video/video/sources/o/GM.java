package o;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;
import o.AbstractC10942yO0;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class GM<C extends Comparable> extends AbstractC10942yO0<C> {
    public final W30<C> c1;

    public GM(W30<C> w30) {
        super(AbstractC10587ww1.z());
        this.c1 = w30;
    }

    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> AbstractC10942yO0.a<E> d0() {
        throw new UnsupportedOperationException();
    }

    @InterfaceC4238Sm
    public static GM<Integer> e1(int i, int i2) {
        return j1(PN1.f(Integer.valueOf(i), Integer.valueOf(i2)), W30.c());
    }

    @InterfaceC4238Sm
    public static GM<Long> f1(long j, long j2) {
        return j1(PN1.f(Long.valueOf(j), Long.valueOf(j2)), W30.d());
    }

    @InterfaceC4238Sm
    public static GM<Integer> g1(int i, int i2) {
        return j1(PN1.g(Integer.valueOf(i), Integer.valueOf(i2)), W30.c());
    }

    @InterfaceC4238Sm
    public static GM<Long> i1(long j, long j2) {
        return j1(PN1.g(Long.valueOf(j), Long.valueOf(j2)), W30.d());
    }

    public static <C extends Comparable> GM<C> j1(PN1<C> pn1, W30<C> w30) {
        PN1<C> pn12;
        C10664xF1.E(pn1);
        C10664xF1.E(w30);
        try {
            if (!pn1.q()) {
                pn12 = pn1.s(PN1.c(w30.f()));
            } else {
                pn12 = pn1;
            }
            if (!pn1.r()) {
                pn12 = pn12.s(PN1.d(w30.e()));
            }
            if (!pn12.u()) {
                C r = pn1.X.r(w30);
                Objects.requireNonNull(r);
                C p = pn1.Y.p(w30);
                Objects.requireNonNull(p);
                if (PN1.h(r, p) <= 0) {
                    return new MQ1(pn12, w30);
                }
            }
            return new C3800Oa0(w30);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10942yO0, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: k1 */
    public GM<C> headSet(C c) {
        return H0((Comparable) C10664xF1.E(c), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: l1 */
    public GM<C> headSet(C c, boolean z) {
        return H0((Comparable) C10664xF1.E(c), z);
    }

    @Override // o.AbstractC10942yO0
    /* renamed from: n1 */
    public abstract GM<C> H0(C c, boolean z);

    public abstract GM<C> o1(GM<C> gm);

    public abstract PN1<C> p1();

    public abstract PN1<C> q1(EnumC6886hp enumC6886hp, EnumC6886hp enumC6886hp2);

    @Override // o.AbstractC10942yO0, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: r1 */
    public GM<C> subSet(C c, C c2) {
        boolean z;
        C10664xF1.E(c);
        C10664xF1.E(c2);
        if (comparator().compare(c, c2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return Y0(c, true, c2, false);
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: s1 */
    public GM<C> subSet(C c, boolean z, C c2, boolean z2) {
        boolean z3;
        C10664xF1.E(c);
        C10664xF1.E(c2);
        if (comparator().compare(c, c2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.d(z3);
        return Y0(c, z, c2, z2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return p1().toString();
    }

    @Override // o.AbstractC10942yO0
    /* renamed from: u1 */
    public abstract GM<C> Y0(C c, boolean z, C c2, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10942yO0, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: v1 */
    public GM<C> tailSet(C c) {
        return b1((Comparable) C10664xF1.E(c), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: w1 */
    public GM<C> tailSet(C c, boolean z) {
        return b1((Comparable) C10664xF1.E(c), z);
    }

    @Override // o.AbstractC10942yO0
    /* renamed from: x1 */
    public abstract GM<C> b1(C c, boolean z);

    @Override // o.AbstractC10942yO0
    @InterfaceC11149zF0
    public AbstractC10942yO0<C> z0() {
        return new C10611x20(this);
    }
}
