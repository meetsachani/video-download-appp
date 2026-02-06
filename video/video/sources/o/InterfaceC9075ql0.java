package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.ql0 */
/* loaded from: classes4.dex */
public interface InterfaceC9075ql0<R, E extends Throwable> {
    public static final InterfaceC9075ql0 a = new InterfaceC9075ql0() { // from class: o.pl0
        @Override // o.InterfaceC9075ql0
        public final Object apply(double d) {
            return InterfaceC9075ql0.b(d);
        }
    };

    static <R, E extends Throwable> InterfaceC9075ql0<R, E> a() {
        return a;
    }

    static /* synthetic */ Object b(double d) {
        return null;
    }

    R apply(double d) throws Throwable;
}
