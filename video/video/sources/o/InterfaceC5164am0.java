package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.am0 */
/* loaded from: classes4.dex */
public interface InterfaceC5164am0<E extends Throwable> {
    public static final InterfaceC5164am0 a = new InterfaceC5164am0() { // from class: o.Zl0
        @Override // o.InterfaceC5164am0
        public final double applyAsDouble(int i) {
            return InterfaceC5164am0.b(i);
        }
    };

    static <E extends Throwable> InterfaceC5164am0<E> a() {
        return a;
    }

    static /* synthetic */ double b(int i) {
        return 0.0d;
    }

    double applyAsDouble(int i) throws Throwable;
}
