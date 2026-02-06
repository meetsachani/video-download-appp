package o;

import java.io.IOException;
import java.util.Objects;

/* renamed from: o.aK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5058aK0<T> {
    default void K(EJ0<? super T> ej0) throws IOException {
        InterfaceC5301bK0<T> it = iterator();
        Objects.requireNonNull(ej0);
        it.a(ej0);
    }

    default Iterable<T> M() {
        return new C10600wz2(this);
    }

    Iterable<T> e();

    InterfaceC5301bK0<T> iterator();

    default InterfaceC9222rK0<T> spliterator() {
        return C9465sK0.f(new C10600wz2(this).spliterator());
    }
}
