package o;

import java.io.Serializable;
import java.util.Iterator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class EU1 extends AbstractC10587ww1<Comparable<?>> implements Serializable {
    public static final EU1 Z = new EU1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return Z;
    }

    @Override // o.AbstractC10587ww1
    public <S extends Comparable<?>> AbstractC10587ww1<S> E() {
        return AbstractC10587ww1.z();
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    /* renamed from: H */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C10664xF1.E(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: I */
    public <E extends Comparable<?>> E s(E e, E e2) {
        return (E) C2671Co1.Z0.w(e, e2);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: J */
    public <E extends Comparable<?>> E t(E e, E e2, E e3, E... eArr) {
        return (E) C2671Co1.Z0.x(e, e2, e3, eArr);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: K */
    public <E extends Comparable<?>> E r(Iterable<E> iterable) {
        return (E) C2671Co1.Z0.v(iterable);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: L */
    public <E extends Comparable<?>> E u(Iterator<E> it) {
        return (E) C2671Co1.Z0.y(it);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: M */
    public <E extends Comparable<?>> E w(E e, E e2) {
        return (E) C2671Co1.Z0.s(e, e2);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: N */
    public <E extends Comparable<?>> E x(E e, E e2, E e3, E... eArr) {
        return (E) C2671Co1.Z0.t(e, e2, e3, eArr);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: O */
    public <E extends Comparable<?>> E v(Iterable<E> iterable) {
        return (E) C2671Co1.Z0.r(iterable);
    }

    @Override // o.AbstractC10587ww1
    /* renamed from: P */
    public <E extends Comparable<?>> E y(Iterator<E> it) {
        return (E) C2671Co1.Z0.u(it);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
