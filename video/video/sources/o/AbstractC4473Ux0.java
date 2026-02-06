package o;

import java.util.Collection;
import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Ux0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4473Ux0<E> extends AbstractC2510Ay0 implements Collection<E> {
    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract Collection<E> L5();

    public boolean N5(Collection<? extends E> collection) {
        return C7052iU0.a(this, collection.iterator());
    }

    public void O5() {
        C7052iU0.h(iterator());
    }

    public boolean P5(@MB Object obj) {
        return C7052iU0.q(iterator(), obj);
    }

    public boolean Q5(Collection<?> collection) {
        return C7232jF.b(this, collection);
    }

    public boolean R5() {
        return !iterator().hasNext();
    }

    public boolean S5(@MB Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C2593Bt1.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean T5(Collection<?> collection) {
        return C7052iU0.V(iterator(), collection);
    }

    public boolean U5(Collection<?> collection) {
        return C7052iU0.X(iterator(), collection);
    }

    public Object[] V5() {
        return toArray(new Object[size()]);
    }

    public <T> T[] W5(T[] tArr) {
        return (T[]) C5436bt1.m(this, tArr);
    }

    public String X5() {
        return C7232jF.l(this);
    }

    @InterfaceC6181ey
    public boolean add(@InterfaceC7894ly1 E e) {
        return L5().add(e);
    }

    @InterfaceC6181ey
    public boolean addAll(Collection<? extends E> collection) {
        return L5().addAll(collection);
    }

    public void clear() {
        L5().clear();
    }

    @Override // java.util.Collection
    public boolean contains(@MB Object obj) {
        return L5().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return L5().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return L5().isEmpty();
    }

    public Iterator<E> iterator() {
        return L5().iterator();
    }

    @InterfaceC6181ey
    public boolean remove(@MB Object obj) {
        return L5().remove(obj);
    }

    @InterfaceC6181ey
    public boolean removeAll(Collection<?> collection) {
        return L5().removeAll(collection);
    }

    @InterfaceC6181ey
    public boolean retainAll(Collection<?> collection) {
        return L5().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return L5().size();
    }

    public Object[] toArray() {
        return L5().toArray();
    }

    @InterfaceC6181ey
    public <T> T[] toArray(T[] tArr) {
        return (T[]) L5().toArray(tArr);
    }
}
