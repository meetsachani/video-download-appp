package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.zl0 */
/* loaded from: classes4.dex */
public interface InterfaceC11271zl0<E extends Throwable> {
    public static final InterfaceC11271zl0 a = new InterfaceC11271zl0() { // from class: o.yl0
        @Override // o.InterfaceC11271zl0
        public final int applyAsInt(double d) {
            return InterfaceC11271zl0.b(d);
        }
    };

    static <E extends Throwable> InterfaceC11271zl0<E> a() {
        return a;
    }

    static /* synthetic */ int b(double d) {
        return 0;
    }

    int applyAsInt(double d) throws Throwable;
}
