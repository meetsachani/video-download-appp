package o;

import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.iy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7164iy0<T> extends AbstractC2510Ay0 implements Iterator<T> {
    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract Iterator<T> L5();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return L5().hasNext();
    }

    @Override // java.util.Iterator
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public T next() {
        return L5().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        L5().remove();
    }
}
