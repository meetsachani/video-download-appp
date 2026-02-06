package o;

import java.util.ListIterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.qs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9105qs2<F, T> extends AbstractC8375ns2<F, T> implements ListIterator<T> {
    public AbstractC9105qs2(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(@InterfaceC7894ly1 T t) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<? extends F> c() {
        return C7052iU0.f(this.X);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    @InterfaceC7894ly1
    public final T previous() {
        return b(c().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    public void set(@InterfaceC7894ly1 T t) {
        throw new UnsupportedOperationException();
    }
}
