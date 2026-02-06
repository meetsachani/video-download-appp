package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.BiConsumer;

@FunctionalInterface
/* renamed from: o.lJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC7735lJ0<T, U> {
    static <T, U> InterfaceC7735lJ0<T, U> a() {
        return HK.a;
    }

    static /* synthetic */ void e(InterfaceC7735lJ0 interfaceC7735lJ0, Object obj, Object obj2) {
        interfaceC7735lJ0.d(obj, obj2);
    }

    static /* synthetic */ void f(InterfaceC7735lJ0 interfaceC7735lJ0, InterfaceC7735lJ0 interfaceC7735lJ02, Object obj, Object obj2) {
        interfaceC7735lJ0.c(interfaceC7735lJ02, obj, obj2);
    }

    void accept(T t, U u) throws IOException;

    default InterfaceC7735lJ0<T, U> b(final InterfaceC7735lJ0<? super T, ? super U> interfaceC7735lJ0) {
        Objects.requireNonNull(interfaceC7735lJ0);
        return new InterfaceC7735lJ0() { // from class: o.jJ0
            @Override // o.InterfaceC7735lJ0
            public final void accept(Object obj, Object obj2) {
                InterfaceC7735lJ0.f(InterfaceC7735lJ0.this, interfaceC7735lJ0, obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void c(InterfaceC7735lJ0 interfaceC7735lJ0, Object obj, Object obj2) throws IOException {
        accept(obj, obj2);
        interfaceC7735lJ0.accept(obj, obj2);
    }

    /* synthetic */ default void d(Object obj, Object obj2) {
        C8643oy2.a(this, obj, obj2);
    }

    default BiConsumer<T, U> g() {
        return new BiConsumer() { // from class: o.kJ0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                InterfaceC7735lJ0.e(InterfaceC7735lJ0.this, obj, obj2);
            }
        };
    }
}
