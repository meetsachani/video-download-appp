package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.ol0 */
/* loaded from: classes4.dex */
public interface InterfaceC8589ol0<E extends Throwable> {
    public static final InterfaceC8589ol0 a = new InterfaceC8589ol0() { // from class: o.ml0
        @Override // o.InterfaceC8589ol0
        public final void accept(double d) {
            InterfaceC8589ol0.b(d);
        }
    };

    static <E extends Throwable> InterfaceC8589ol0<E> a() {
        return a;
    }

    static /* synthetic */ void b(double d) {
    }

    static /* synthetic */ void c(InterfaceC8589ol0 interfaceC8589ol0, InterfaceC8589ol0 interfaceC8589ol02, double d) {
        interfaceC8589ol0.d(interfaceC8589ol02, d);
    }

    void accept(double d) throws Throwable;

    /* synthetic */ default void d(InterfaceC8589ol0 interfaceC8589ol0, double d) throws Throwable {
        accept(d);
        interfaceC8589ol0.accept(d);
    }

    default InterfaceC8589ol0<E> e(final InterfaceC8589ol0<E> interfaceC8589ol0) {
        Objects.requireNonNull(interfaceC8589ol0);
        return new InterfaceC8589ol0() { // from class: o.nl0
            @Override // o.InterfaceC8589ol0
            public final void accept(double d) {
                InterfaceC8589ol0.c(InterfaceC8589ol0.this, interfaceC8589ol0, d);
            }
        };
    }
}
