package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface XK0<T> {
    default Supplier<T> a() {
        return new Supplier() { // from class: o.WK0
            @Override // java.util.function.Supplier
            public final Object get() {
                return XK0.this.b();
            }
        };
    }

    default T b() throws UncheckedIOException {
        return (T) C8643oy2.j(this);
    }

    T get() throws IOException;
}
