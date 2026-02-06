package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.lm0 */
/* loaded from: classes4.dex */
public interface InterfaceC7845lm0<E extends Throwable> {
    public static final InterfaceC7845lm0 a = new InterfaceC7845lm0() { // from class: o.jm0
        @Override // o.InterfaceC7845lm0
        public final void accept(long j) {
            InterfaceC7845lm0.e(j);
        }
    };

    static <E extends Throwable> InterfaceC7845lm0<E> a() {
        return a;
    }

    static /* synthetic */ void d(InterfaceC7845lm0 interfaceC7845lm0, InterfaceC7845lm0 interfaceC7845lm02, long j) {
        interfaceC7845lm0.b(interfaceC7845lm02, j);
    }

    static /* synthetic */ void e(long j) {
    }

    void accept(long j) throws Throwable;

    /* synthetic */ default void b(InterfaceC7845lm0 interfaceC7845lm0, long j) throws Throwable {
        accept(j);
        interfaceC7845lm0.accept(j);
    }

    default InterfaceC7845lm0<E> c(final InterfaceC7845lm0<E> interfaceC7845lm0) {
        Objects.requireNonNull(interfaceC7845lm0);
        return new InterfaceC7845lm0() { // from class: o.km0
            @Override // o.InterfaceC7845lm0
            public final void accept(long j) {
                InterfaceC7845lm0.d(InterfaceC7845lm0.this, interfaceC7845lm0, j);
            }
        };
    }
}
