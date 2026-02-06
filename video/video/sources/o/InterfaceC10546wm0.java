package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.wm0 */
/* loaded from: classes4.dex */
public interface InterfaceC10546wm0<E extends Throwable> {
    public static final InterfaceC10546wm0 a = new InterfaceC10546wm0() { // from class: o.vm0
        @Override // o.InterfaceC10546wm0
        public final double applyAsDouble(long j) {
            return InterfaceC10546wm0.b(j);
        }
    };

    static <E extends Throwable> InterfaceC10546wm0<E> a() {
        return a;
    }

    static /* synthetic */ double b(long j) {
        return 0.0d;
    }

    double applyAsDouble(long j) throws Throwable;
}
