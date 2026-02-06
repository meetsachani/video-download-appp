package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Bl0 */
/* loaded from: classes4.dex */
public interface InterfaceC2560Bl0<E extends Throwable> {
    public static final InterfaceC2560Bl0 a = new InterfaceC2560Bl0() { // from class: o.Al0
        @Override // o.InterfaceC2560Bl0
        public final int applyAsLong(double d) {
            return InterfaceC2560Bl0.b(d);
        }
    };

    static <E extends Throwable> InterfaceC2560Bl0<E> a() {
        return a;
    }

    static /* synthetic */ int b(double d) {
        return 0;
    }

    int applyAsLong(double d) throws Throwable;
}
