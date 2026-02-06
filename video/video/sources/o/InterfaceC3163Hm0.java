package o;

import java.lang.Throwable;

@FunctionalInterface
/* renamed from: o.Hm0 */
/* loaded from: classes4.dex */
public interface InterfaceC3163Hm0<T, E extends Throwable> {
    public static final InterfaceC3163Hm0 a = new InterfaceC3163Hm0() { // from class: o.Gm0
        @Override // o.InterfaceC3163Hm0
        public final void accept(Object obj, int i) {
            InterfaceC3163Hm0.b(obj, i);
        }
    };

    static <T, E extends Throwable> InterfaceC3163Hm0<T, E> a() {
        return a;
    }

    static /* synthetic */ void b(Object obj, int i) {
    }

    void accept(T t, int i) throws Throwable;
}
