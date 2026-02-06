package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.stream.BaseStream;
import o.InterfaceC6765hJ0;

/* renamed from: o.hJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC6765hJ0<T, S extends InterfaceC6765hJ0<T, S, B>, B extends BaseStream<T, B>> extends Closeable {
    static /* synthetic */ void c5(InterfaceC8973qK0 interfaceC8973qK0) {
        C7086ie0.h(interfaceC8973qK0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S E2(final InterfaceC8973qK0 interfaceC8973qK0) throws IOException {
        return (S) R1(e().onClose(new Runnable() { // from class: o.gJ0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC6765hJ0.c5(InterfaceC8973qK0.this);
            }
        }));
    }

    S R1(B b);

    default BaseStream<T, B> a5() {
        return new C10111uz2(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        e().close();
    }

    B e();

    default boolean isParallel() {
        return e().isParallel();
    }

    default InterfaceC5301bK0<T> iterator() {
        return C5543cK0.d(e().iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S parallel() {
        if (isParallel()) {
            return this;
        }
        return (S) R1(e().parallel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S sequential() {
        if (isParallel()) {
            return (S) R1(e().sequential());
        }
        return this;
    }

    default InterfaceC9222rK0<T> spliterator() {
        return C9465sK0.f(e().spliterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S unordered() {
        return (S) R1(e().unordered());
    }
}
