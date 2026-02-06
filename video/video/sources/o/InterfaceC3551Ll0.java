package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Ll0 */
/* loaded from: classes4.dex */
public interface InterfaceC3551Ll0<T, R, E extends Throwable> {
    public static final InterfaceC3551Ll0 a = new InterfaceC3551Ll0() { // from class: o.Il0
        @Override // o.InterfaceC3551Ll0
        public final Object apply(Object obj) {
            return InterfaceC3551Ll0.d(obj);
        }
    };

    static <T, R, E extends Throwable> InterfaceC3551Ll0<T, R, E> a() {
        return a;
    }

    static /* synthetic */ Object d(Object obj) {
        return null;
    }

    static /* synthetic */ Object e(InterfaceC3551Ll0 interfaceC3551Ll0, InterfaceC3551Ll0 interfaceC3551Ll02, Object obj) {
        return interfaceC3551Ll0.h(interfaceC3551Ll02, obj);
    }

    static /* synthetic */ Object g(Object obj) {
        return obj;
    }

    static /* synthetic */ Object i(InterfaceC3551Ll0 interfaceC3551Ll0, InterfaceC3551Ll0 interfaceC3551Ll02, Object obj) {
        return interfaceC3551Ll0.c(interfaceC3551Ll02, obj);
    }

    static <T, E extends Throwable> InterfaceC3551Ll0<T, T, E> identity() {
        return new InterfaceC3551Ll0() { // from class: o.Kl0
            @Override // o.InterfaceC3551Ll0
            public final Object apply(Object obj) {
                return InterfaceC3551Ll0.g(obj);
            }
        };
    }

    R apply(T t) throws Throwable;

    default <V> InterfaceC3551Ll0<T, V, E> b(final InterfaceC3551Ll0<? super R, ? extends V, E> interfaceC3551Ll0) {
        Objects.requireNonNull(interfaceC3551Ll0);
        return new InterfaceC3551Ll0() { // from class: o.Jl0
            @Override // o.InterfaceC3551Ll0
            public final Object apply(Object obj) {
                return InterfaceC3551Ll0.i(InterfaceC3551Ll0.this, interfaceC3551Ll0, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object c(InterfaceC3551Ll0 interfaceC3551Ll0, Object obj) throws Throwable {
        return interfaceC3551Ll0.apply(apply(obj));
    }

    default <V> InterfaceC3551Ll0<V, R, E> f(final InterfaceC3551Ll0<? super V, ? extends T, E> interfaceC3551Ll0) {
        Objects.requireNonNull(interfaceC3551Ll0);
        return new InterfaceC3551Ll0() { // from class: o.Hl0
            @Override // o.InterfaceC3551Ll0
            public final Object apply(Object obj) {
                return InterfaceC3551Ll0.e(InterfaceC3551Ll0.this, interfaceC3551Ll0, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object h(InterfaceC3551Ll0 interfaceC3551Ll0, Object obj) throws Throwable {
        return apply(interfaceC3551Ll0.apply(obj));
    }
}
