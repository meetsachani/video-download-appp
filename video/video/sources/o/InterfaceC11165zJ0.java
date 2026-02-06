package o;

import java.io.IOException;
import java.util.Comparator;

@FunctionalInterface
/* renamed from: o.zJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC11165zJ0<T> {
    static /* synthetic */ int a(InterfaceC11165zJ0 interfaceC11165zJ0, Object obj, Object obj2) {
        return interfaceC11165zJ0.c(obj, obj2);
    }

    default Comparator<T> b() {
        return new Comparator() { // from class: o.yJ0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return InterfaceC11165zJ0.a(InterfaceC11165zJ0.this, obj, obj2);
            }
        };
    }

    /* synthetic */ default int c(Object obj, Object obj2) {
        return C8643oy2.i(this, obj, obj2);
    }

    int compare(T t, T t2) throws IOException;
}
