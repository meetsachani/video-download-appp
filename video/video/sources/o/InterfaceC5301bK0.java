package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: o.bK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5301bK0<E> {
    static <E> InterfaceC5301bK0<E> b(Iterator<E> it) {
        return C5543cK0.d(it);
    }

    static <E> InterfaceC5301bK0<E> c(Iterable<E> iterable) {
        return C5543cK0.d(iterable.iterator());
    }

    default void a(EJ0<? super E> ej0) throws IOException {
        Objects.requireNonNull(ej0);
        while (hasNext()) {
            ej0.accept(next());
        }
    }

    default Iterator<E> asIterator() {
        return new Az2(this);
    }

    Iterator<E> e();

    boolean hasNext() throws IOException;

    E next() throws IOException;

    default void remove() throws IOException {
        e().remove();
    }
}
