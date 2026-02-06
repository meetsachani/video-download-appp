package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Wm0 */
/* loaded from: classes4.dex */
public interface InterfaceC4627Wm0<T, E extends Throwable> {
    public static final InterfaceC4627Wm0 a = new InterfaceC4627Wm0() { // from class: o.Vm0
        @Override // o.InterfaceC4627Wm0
        public final double applyAsDouble(Object obj) {
            return InterfaceC4627Wm0.b(obj);
        }
    };

    static <T, E extends Throwable> InterfaceC4627Wm0<T, E> a() {
        return a;
    }

    static /* synthetic */ double b(Object obj) {
        return 0.0d;
    }

    double applyAsDouble(T t) throws Throwable;
}
