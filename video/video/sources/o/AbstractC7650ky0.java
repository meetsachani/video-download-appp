package o;

import java.util.ListIterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ky0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7650ky0<E> extends AbstractC7164iy0<E> implements ListIterator<E> {
    @Override // o.AbstractC7164iy0
    /* renamed from: N5 */
    public abstract ListIterator<E> M5();

    @Override // java.util.ListIterator
    public void add(@InterfaceC7894ly1 E e) {
        M5().add(e);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return M5().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return M5().nextIndex();
    }

    @Override // java.util.ListIterator
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E previous() {
        return M5().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return M5().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@InterfaceC7894ly1 E e) {
        M5().set(e);
    }
}
