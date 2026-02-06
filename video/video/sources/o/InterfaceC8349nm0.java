package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.nm0 */
/* loaded from: classes4.dex */
public interface InterfaceC8349nm0<R, E extends Throwable> {
    public static final InterfaceC8349nm0 a = new InterfaceC8349nm0() { // from class: o.mm0
        @Override // o.InterfaceC8349nm0
        public final Object apply(long j) {
            return InterfaceC8349nm0.b(j);
        }
    };

    static <R, E extends Throwable> InterfaceC8349nm0<R, E> a() {
        return a;
    }

    static /* synthetic */ Object b(long j) {
        return null;
    }

    R apply(long j) throws Throwable;
}
