package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.en0 */
/* loaded from: classes4.dex */
public interface InterfaceC6138en0<T, E extends Throwable> {
    public static final InterfaceC6138en0 a = new InterfaceC6138en0() { // from class: o.dn0
        @Override // o.InterfaceC6138en0
        public final long applyAsLong(Object obj) {
            return InterfaceC6138en0.b(obj);
        }
    };

    static <T, E extends Throwable> InterfaceC6138en0<T, E> a() {
        return a;
    }

    static /* synthetic */ long b(Object obj) {
        return 0L;
    }

    long applyAsLong(T t) throws Throwable;
}
