package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Pl0 */
/* loaded from: classes4.dex */
public interface InterfaceC3941Pl0<E extends Throwable> {
    public static final InterfaceC3941Pl0 a = new InterfaceC3941Pl0() { // from class: o.Ol0
        @Override // o.InterfaceC3941Pl0
        public final void accept(int i) {
            InterfaceC3941Pl0.c(i);
        }
    };

    static <E extends Throwable> InterfaceC3941Pl0<E> a() {
        return a;
    }

    static /* synthetic */ void c(int i) {
    }

    static /* synthetic */ void e(InterfaceC3941Pl0 interfaceC3941Pl0, InterfaceC3941Pl0 interfaceC3941Pl02, int i) {
        interfaceC3941Pl0.d(interfaceC3941Pl02, i);
    }

    void accept(int i) throws Throwable;

    default InterfaceC3941Pl0<E> b(final InterfaceC3941Pl0<E> interfaceC3941Pl0) {
        Objects.requireNonNull(interfaceC3941Pl0);
        return new InterfaceC3941Pl0() { // from class: o.Nl0
            @Override // o.InterfaceC3941Pl0
            public final void accept(int i) {
                InterfaceC3941Pl0.e(InterfaceC3941Pl0.this, interfaceC3941Pl0, i);
            }
        };
    }

    /* synthetic */ default void d(InterfaceC3941Pl0 interfaceC3941Pl0, int i) throws Throwable {
        accept(i);
        interfaceC3941Pl0.accept(i);
    }
}
