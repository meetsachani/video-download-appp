package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.an0 */
/* loaded from: classes4.dex */
public interface InterfaceC5168an0<T, E extends Throwable> {
    public static final InterfaceC5168an0 a = new InterfaceC5168an0() { // from class: o.Zm0
        @Override // o.InterfaceC5168an0
        public final int applyAsInt(Object obj) {
            return InterfaceC5168an0.b(obj);
        }
    };

    static <T, E extends Throwable> InterfaceC5168an0<T, E> a() {
        return a;
    }

    static /* synthetic */ int b(Object obj) {
        return 0;
    }

    int applyAsInt(T t) throws Throwable;
}
