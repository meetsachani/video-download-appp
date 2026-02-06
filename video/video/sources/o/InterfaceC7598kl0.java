package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.kl0 */
/* loaded from: classes4.dex */
public interface InterfaceC7598kl0<T, E extends Throwable> {
    public static final InterfaceC7598kl0 a = new InterfaceC7598kl0() { // from class: o.il0
        @Override // o.InterfaceC7598kl0
        public final void accept(Object obj) {
            InterfaceC7598kl0.c(obj);
        }
    };

    static <T, E extends Throwable> InterfaceC7598kl0<T, E> a() {
        return a;
    }

    static /* synthetic */ void c(Object obj) {
    }

    static /* synthetic */ void e(InterfaceC7598kl0 interfaceC7598kl0, InterfaceC7598kl0 interfaceC7598kl02, Object obj) {
        interfaceC7598kl0.d(interfaceC7598kl02, obj);
    }

    void accept(T t) throws Throwable;

    default InterfaceC7598kl0<T, E> b(final InterfaceC7598kl0<? super T, E> interfaceC7598kl0) {
        Objects.requireNonNull(interfaceC7598kl0);
        return new InterfaceC7598kl0() { // from class: o.jl0
            @Override // o.InterfaceC7598kl0
            public final void accept(Object obj) {
                InterfaceC7598kl0.e(InterfaceC7598kl0.this, interfaceC7598kl0, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void d(InterfaceC7598kl0 interfaceC7598kl0, Object obj) throws Throwable {
        accept(obj);
        interfaceC7598kl0.accept(obj);
    }
}
