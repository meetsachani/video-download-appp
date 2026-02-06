package o;

import java.util.function.UnaryOperator;

@FunctionalInterface
/* renamed from: o.eL0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6032eL0<T> extends RJ0<T, T> {
    static <T> InterfaceC6032eL0<T> identity() {
        return new InterfaceC6032eL0() { // from class: o.dL0
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return InterfaceC6032eL0.z(obj);
            }
        };
    }

    static /* synthetic */ Object z(Object obj) {
        return obj;
    }

    default UnaryOperator<T> k() {
        return new UnaryOperator() { // from class: o.cL0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object u;
                u = InterfaceC6032eL0.this.u(obj);
                return u;
            }
        };
    }

    /* synthetic */ default Object u(Object obj) {
        return C8643oy2.f(this, obj);
    }
}
