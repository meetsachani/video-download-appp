package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Ym0 */
/* loaded from: classes4.dex */
public interface InterfaceC4821Ym0<T, U, E extends Throwable> {
    public static final InterfaceC4821Ym0 a = new InterfaceC4821Ym0() { // from class: o.Xm0
        @Override // o.InterfaceC4821Ym0
        public final int applyAsInt(Object obj, Object obj2) {
            return InterfaceC4821Ym0.b(obj, obj2);
        }
    };

    static <T, U, E extends Throwable> InterfaceC4821Ym0<T, U, E> a() {
        return a;
    }

    static /* synthetic */ int b(Object obj, Object obj2) {
        return 0;
    }

    int applyAsInt(T t, U u) throws Throwable;
}
