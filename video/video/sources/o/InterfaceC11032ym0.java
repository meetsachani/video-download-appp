package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.ym0 */
/* loaded from: classes4.dex */
public interface InterfaceC11032ym0<E extends Throwable> {
    public static final InterfaceC11032ym0 a = new InterfaceC11032ym0() { // from class: o.xm0
        @Override // o.InterfaceC11032ym0
        public final int applyAsInt(long j) {
            return InterfaceC11032ym0.b(j);
        }
    };

    static <E extends Throwable> InterfaceC11032ym0<E> a() {
        return a;
    }

    static /* synthetic */ int b(long j) {
        return 0;
    }

    int applyAsInt(long j) throws Throwable;
}
