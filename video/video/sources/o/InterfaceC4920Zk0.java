package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Zk0 */
/* loaded from: classes4.dex */
public interface InterfaceC4920Zk0<T, U, R, E extends Throwable> {
    public static final InterfaceC4920Zk0 a = new InterfaceC4920Zk0() { // from class: o.Xk0
        @Override // o.InterfaceC4920Zk0
        public final Object apply(Object obj, Object obj2) {
            return InterfaceC4920Zk0.c(obj, obj2);
        }
    };

    static <T, U, R, E extends Throwable> InterfaceC4920Zk0<T, U, R, E> a() {
        return a;
    }

    static /* synthetic */ Object c(Object obj, Object obj2) {
        return null;
    }

    R apply(T t, U u) throws Throwable;

    default <V> InterfaceC4920Zk0<T, U, V, E> b(final InterfaceC3551Ll0<? super R, ? extends V, E> interfaceC3551Ll0) {
        Objects.requireNonNull(interfaceC3551Ll0);
        return new InterfaceC4920Zk0() { // from class: o.Yk0
            @Override // o.InterfaceC4920Zk0
            public final Object apply(Object obj, Object obj2) {
                Object d;
                d = InterfaceC4920Zk0.this.d(interfaceC3551Ll0, obj, obj2);
                return d;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object d(InterfaceC3551Ll0 interfaceC3551Ll0, Object obj, Object obj2) throws Throwable {
        return interfaceC3551Ll0.apply(apply(obj, obj2));
    }
}
