package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Um0 */
/* loaded from: classes4.dex */
public interface InterfaceC4433Um0<T, U, E extends Throwable> {
    public static final InterfaceC4433Um0 a = new InterfaceC4433Um0() { // from class: o.Tm0
        @Override // o.InterfaceC4433Um0
        public final double applyAsDouble(Object obj, Object obj2) {
            return InterfaceC4433Um0.b(obj, obj2);
        }
    };

    static <T, U, E extends Throwable> InterfaceC4433Um0<T, U, E> a() {
        return a;
    }

    static /* synthetic */ double b(Object obj, Object obj2) {
        return 0.0d;
    }

    double applyAsDouble(T t, U u) throws Throwable;
}
