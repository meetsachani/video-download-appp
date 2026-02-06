package o;

import java.util.Objects;
import java.util.Spliterator;

/* renamed from: o.rK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC9222rK0<T> {
    static <E> InterfaceC9222rK0<E> c(Spliterator<E> spliterator) {
        return C9465sK0.f(spliterator);
    }

    default void a(EJ0<? super T> ej0) {
        do {
        } while (b(ej0));
    }

    default boolean b(EJ0<? super T> ej0) {
        Spliterator<T> e = e();
        Objects.requireNonNull(ej0, "action");
        return e.tryAdvance(ej0.b());
    }

    default int characteristics() {
        return e().characteristics();
    }

    default Spliterator<T> d() {
        return new Fz2(this);
    }

    Spliterator<T> e();

    default long estimateSize() {
        return e().estimateSize();
    }

    default InterfaceC11165zJ0<? super T> getComparator() {
        return (InterfaceC11165zJ0) e().getComparator();
    }

    default long getExactSizeIfKnown() {
        return e().getExactSizeIfKnown();
    }

    default boolean hasCharacteristics(int i) {
        return e().hasCharacteristics(i);
    }

    default InterfaceC9222rK0<T> trySplit() {
        return c(e().trySplit());
    }
}
