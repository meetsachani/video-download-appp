package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Jm0 */
/* loaded from: classes4.dex */
public interface InterfaceC3359Jm0<T, E extends Throwable> {
    public static final InterfaceC3359Jm0 a = new InterfaceC3359Jm0() { // from class: o.Im0
        @Override // o.InterfaceC3359Jm0
        public final void accept(Object obj, long j) {
            InterfaceC3359Jm0.b(obj, j);
        }
    };

    static <T, E extends Throwable> InterfaceC3359Jm0<T, E> a() {
        return a;
    }

    static /* synthetic */ void b(Object obj, long j) {
    }

    void accept(T t, long j) throws Throwable;
}
