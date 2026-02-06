package o;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class O<E> extends AbstractC8162n0<E> implements InterfaceC2958Fk<E> {
    private static final long serialVersionUID = -3768146017343785417L;

    public O() {
    }

    @Override // o.InterfaceC2958Fk
    public int I(Object obj) {
        return d().I(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public InterfaceC2958Fk<E> d() {
        return (InterfaceC2958Fk) super.d();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return d().hashCode();
    }

    public boolean v(Object obj, int i) {
        return d().v(obj, i);
    }

    public boolean x(E e, int i) {
        return d().x(e, i);
    }

    public Set<E> y() {
        return d().y();
    }

    public O(InterfaceC2958Fk<E> interfaceC2958Fk) {
        super(interfaceC2958Fk);
    }
}
