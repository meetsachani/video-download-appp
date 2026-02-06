package o;

import java.util.NoSuchElementException;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class R2<T> extends AbstractC6237fB2<T> {
    @MB
    public T X;

    public R2(@MB T t) {
        this.X = t;
    }

    @MB
    public abstract T b(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.X;
        if (t != null) {
            this.X = b(t);
            return t;
        }
        throw new NoSuchElementException();
    }
}
