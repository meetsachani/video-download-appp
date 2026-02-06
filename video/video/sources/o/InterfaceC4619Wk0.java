package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Wk0 */
/* loaded from: classes4.dex */
public interface InterfaceC4619Wk0<T, U, E extends Throwable> {
    public static final InterfaceC4619Wk0 a = new InterfaceC4619Wk0() { // from class: o.Uk0
        @Override // o.InterfaceC4619Wk0
        public final void accept(Object obj, Object obj2) {
            InterfaceC4619Wk0.c(obj, obj2);
        }
    };

    static <T, U, E extends Throwable> InterfaceC4619Wk0<T, U, E> a() {
        return a;
    }

    static /* synthetic */ void c(Object obj, Object obj2) {
    }

    static /* synthetic */ void d(InterfaceC4619Wk0 interfaceC4619Wk0, InterfaceC4619Wk0 interfaceC4619Wk02, Object obj, Object obj2) {
        interfaceC4619Wk0.e(interfaceC4619Wk02, obj, obj2);
    }

    void accept(T t, U u) throws Throwable;

    default InterfaceC4619Wk0<T, U, E> b(final InterfaceC4619Wk0<? super T, ? super U, E> interfaceC4619Wk0) {
        Objects.requireNonNull(interfaceC4619Wk0);
        return new InterfaceC4619Wk0() { // from class: o.Vk0
            @Override // o.InterfaceC4619Wk0
            public final void accept(Object obj, Object obj2) {
                InterfaceC4619Wk0.d(InterfaceC4619Wk0.this, interfaceC4619Wk0, obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void e(InterfaceC4619Wk0 interfaceC4619Wk0, Object obj, Object obj2) throws Throwable {
        accept(obj, obj2);
        interfaceC4619Wk0.accept(obj, obj2);
    }
}
