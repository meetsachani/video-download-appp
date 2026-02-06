package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Rl0 */
/* loaded from: classes4.dex */
public interface InterfaceC4135Rl0<R, E extends Throwable> {
    public static final InterfaceC4135Rl0 a = new InterfaceC4135Rl0() { // from class: o.Ql0
        @Override // o.InterfaceC4135Rl0
        public final Object apply(int i) {
            return InterfaceC4135Rl0.b(i);
        }
    };

    static <R, E extends Throwable> InterfaceC4135Rl0<R, E> a() {
        return a;
    }

    static /* synthetic */ Object b(int i) {
        return null;
    }

    R apply(int i) throws Throwable;
}
