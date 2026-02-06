package o;

import java.lang.Comparable;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class L2<C extends Comparable> implements VN1<C> {
    @Override // o.VN1
    public void b(PN1<C> pn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.VN1
    public void c(PN1<C> pn1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.VN1
    public void clear() {
        b(PN1.a());
    }

    @Override // o.VN1
    public boolean e(C c) {
        if (l(c) != null) {
            return true;
        }
        return false;
    }

    @Override // o.VN1
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VN1) {
            return q().equals(((VN1) obj).q());
        }
        return false;
    }

    @Override // o.VN1
    public void f(VN1<C> vn1) {
        h(vn1.q());
    }

    @Override // o.VN1
    public abstract boolean g(PN1<C> pn1);

    @Override // o.VN1
    public void h(Iterable<PN1<C>> iterable) {
        for (PN1<C> pn1 : iterable) {
            c(pn1);
        }
    }

    @Override // o.VN1
    public final int hashCode() {
        return q().hashCode();
    }

    @Override // o.VN1
    public boolean i(VN1<C> vn1) {
        return m(vn1.q());
    }

    @Override // o.VN1
    public boolean isEmpty() {
        return q().isEmpty();
    }

    @Override // o.VN1
    public void j(Iterable<PN1<C>> iterable) {
        for (PN1<C> pn1 : iterable) {
            b(pn1);
        }
    }

    @Override // o.VN1
    @MB
    public abstract PN1<C> l(C c);

    @Override // o.VN1
    public boolean m(Iterable<PN1<C>> iterable) {
        for (PN1<C> pn1 : iterable) {
            if (!g(pn1)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.VN1
    public void n(VN1<C> vn1) {
        j(vn1.q());
    }

    @Override // o.VN1
    public boolean o(PN1<C> pn1) {
        return !k(pn1).isEmpty();
    }

    @Override // o.VN1
    public final String toString() {
        return q().toString();
    }
}
