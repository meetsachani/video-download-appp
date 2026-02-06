package o;

import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ns2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8375ns2<F, T> implements Iterator<T> {
    public final Iterator<? extends F> X;

    public AbstractC8375ns2(Iterator<? extends F> it) {
        this.X = (Iterator) C10664xF1.E(it);
    }

    @InterfaceC7894ly1
    public abstract T b(@InterfaceC7894ly1 F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    @InterfaceC7894ly1
    public final T next() {
        return b(this.X.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X.remove();
    }
}
