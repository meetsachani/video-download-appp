package o;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* renamed from: o.Fd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2933Fd2<E> implements Iterator<E>, AutoCloseable {
    public final Iterator<E> X;
    public final Stream<E> Y;
    public boolean Z;

    public C2933Fd2(Stream<E> stream) {
        Objects.requireNonNull(stream, "stream");
        this.Y = stream;
        this.X = stream.iterator();
    }

    public static <T> C2933Fd2<T> d(Stream<T> stream) {
        return new C2933Fd2<>(stream);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.Z = true;
        this.Y.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Z) {
            return false;
        }
        boolean hasNext = this.X.hasNext();
        if (!hasNext) {
            close();
        }
        return hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        E next = this.X.next();
        if (next == null) {
            close();
        }
        return next;
    }
}
