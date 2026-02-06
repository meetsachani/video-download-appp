package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.jy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7407jy0<E> extends AbstractC4473Ux0<E> implements List<E> {
    @Override // o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public abstract List<E> M5();

    public boolean Z5(@InterfaceC7894ly1 E e) {
        add(size(), e);
        return true;
    }

    public boolean a6(int i, Iterable<? extends E> iterable) {
        return C10608x11.a(this, i, iterable);
    }

    public void add(int i, @InterfaceC7894ly1 E e) {
        M5().add(i, e);
    }

    @InterfaceC6181ey
    public boolean addAll(int i, Collection<? extends E> collection) {
        return M5().addAll(i, collection);
    }

    @InterfaceC4238Sm
    public boolean b6(@MB Object obj) {
        return C10608x11.j(this, obj);
    }

    @InterfaceC4238Sm
    public int c6() {
        return C10608x11.k(this);
    }

    public int d6(@MB Object obj) {
        return C10608x11.l(this, obj);
    }

    public Iterator<E> e6() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@MB Object obj) {
        if (obj != this && !M5().equals(obj)) {
            return false;
        }
        return true;
    }

    public int f6(@MB Object obj) {
        return C10608x11.n(this, obj);
    }

    public ListIterator<E> g6() {
        return listIterator(0);
    }

    @Override // java.util.List
    @InterfaceC7894ly1
    public E get(int i) {
        return M5().get(i);
    }

    @InterfaceC4238Sm
    public ListIterator<E> h6(int i) {
        return C10608x11.p(this, i);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return M5().hashCode();
    }

    @InterfaceC4238Sm
    public List<E> i6(int i, int i2) {
        return C10608x11.C(this, i, i2);
    }

    @Override // java.util.List
    public int indexOf(@MB Object obj) {
        return M5().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@MB Object obj) {
        return M5().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return M5().listIterator();
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E remove(int i) {
        return M5().remove(i);
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E set(int i, @InterfaceC7894ly1 E e) {
        return M5().set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return M5().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return M5().listIterator(i);
    }
}
