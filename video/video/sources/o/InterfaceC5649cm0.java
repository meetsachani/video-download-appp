package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.cm0 */
/* loaded from: classes4.dex */
public interface InterfaceC5649cm0<E extends Throwable> {
    public static final InterfaceC5649cm0 a = new InterfaceC5649cm0() { // from class: o.bm0
        @Override // o.InterfaceC5649cm0
        public final long applyAsLong(int i) {
            return InterfaceC5649cm0.b(i);
        }
    };

    static <E extends Throwable> InterfaceC5649cm0<E> a() {
        return a;
    }

    static /* synthetic */ long b(int i) {
        return 0L;
    }

    long applyAsLong(int i) throws Throwable;
}
