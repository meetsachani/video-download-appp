package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class WA2<E> extends AbstractC8162n0<E> implements InterfaceC7613kp<E>, QA2 {
    private static final long serialVersionUID = -7112672385450340330L;

    public WA2(InterfaceC7613kp<? extends E> interfaceC7613kp) {
        super(interfaceC7613kp);
    }

    public static <E> InterfaceC7613kp<E> h(Collection<? extends E> collection) {
        if (collection != null) {
            for (int i = 0; i < 1000 && !(collection instanceof InterfaceC7613kp); i++) {
                if (collection instanceof AbstractC8162n0) {
                    collection = ((AbstractC8162n0) collection).d();
                } else if (collection instanceof C3447Kj2) {
                    collection = ((C3447Kj2) collection).d();
                }
            }
            if (collection instanceof InterfaceC7613kp) {
                return new WA2((InterfaceC7613kp) collection);
            }
            throw new IllegalArgumentException("Collection is not a bounded collection.");
        }
        throw new NullPointerException("Collection must not be null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC7613kp<E> i(InterfaceC7613kp<? extends E> interfaceC7613kp) {
        if (interfaceC7613kp instanceof QA2) {
            return interfaceC7613kp;
        }
        return new WA2(interfaceC7613kp);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public InterfaceC7613kp<E> d() {
        return (InterfaceC7613kp) super.d();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(d().iterator());
    }

    @Override // o.InterfaceC7613kp
    public int q() {
        return d().q();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC7613kp
    public boolean s() {
        return d().s();
    }
}
