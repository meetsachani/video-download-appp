package o;

import java.util.NoSuchElementException;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class Y0<E> extends AbstractC7705lB2<E> {
    public final int X;
    public int Y;

    public Y0(int i) {
        this(i, 0);
    }

    @InterfaceC7894ly1
    public abstract E b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.Y < this.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.Y > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @InterfaceC7894ly1
    public final E next() {
        if (hasNext()) {
            int i = this.Y;
            this.Y = i + 1;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.Y;
    }

    @Override // java.util.ListIterator
    @InterfaceC7894ly1
    public final E previous() {
        if (hasPrevious()) {
            int i = this.Y - 1;
            this.Y = i;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.Y - 1;
    }

    public Y0(int i, int i2) {
        C10664xF1.d0(i2, i);
        this.X = i;
        this.Y = i2;
    }
}
