package o;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/* renamed from: o.oB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8450oB0<V> extends AbstractC9882u3 {
    public final Function<String, V> c;

    public C8450oB0(Function<String, V> function) {
        this.c = function;
    }

    public static <V> C8450oB0<V> g(Map<String, V> map) {
        final Map D = C2730De2.D(map);
        D.getClass();
        return h(new Function() { // from class: o.nB0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return D.get((String) obj);
            }
        });
    }

    public static <R> C8450oB0<R> h(Function<String, R> function) {
        return new C8450oB0<>(function);
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        Function<String, V> function = this.c;
        if (function == null) {
            return null;
        }
        try {
            return Objects.toString(function.apply(str), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public String toString() {
        return super.toString() + " [function=" + this.c + C6566gU0.g;
    }
}
