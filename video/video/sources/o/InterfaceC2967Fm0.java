package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Fm0 */
/* loaded from: classes4.dex */
public interface InterfaceC2967Fm0<T, E extends Throwable> {
    public static final InterfaceC2967Fm0 a = new InterfaceC2967Fm0() { // from class: o.Em0
        @Override // o.InterfaceC2967Fm0
        public final void accept(Object obj, double d) {
            InterfaceC2967Fm0.b(obj, d);
        }
    };

    static <T, E extends Throwable> InterfaceC2967Fm0<T, E> a() {
        return a;
    }

    static /* synthetic */ void b(Object obj, double d) {
    }

    void accept(T t, double d) throws Throwable;
}
