package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.cn0 */
/* loaded from: classes4.dex */
public interface InterfaceC5653cn0<T, U, E extends Throwable> {
    public static final InterfaceC5653cn0 a = new InterfaceC5653cn0() { // from class: o.bn0
        @Override // o.InterfaceC5653cn0
        public final long applyAsLong(Object obj, Object obj2) {
            return InterfaceC5653cn0.b(obj, obj2);
        }
    };

    static <T, U, E extends Throwable> InterfaceC5653cn0<T, U, E> a() {
        return a;
    }

    static /* synthetic */ long b(Object obj, Object obj2) {
        return 0L;
    }

    long applyAsLong(T t, U u) throws Throwable;
}
