package o;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

/* renamed from: o.Vm */
/* loaded from: classes4.dex */
public final class C4529Vm<P, R> implements InterfaceC4723Xm<P> {
    public final BiFunction<String, P, R> a;

    public C4529Vm(BiFunction<String, P, R> biFunction) {
        this.a = biFunction;
    }

    public static /* synthetic */ Object b(Map map, String str, Object obj) {
        return map.get(str);
    }

    public static <U, T> C4529Vm<U, T> c(final Map<String, T> map) {
        return d(new BiFunction() { // from class: o.Um
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C4529Vm.b(map, (String) obj, obj2);
            }
        });
    }

    public static <U, T> C4529Vm<U, T> d(BiFunction<String, U, T> biFunction) {
        return new C4529Vm<>(biFunction);
    }

    @Override // o.InterfaceC4723Xm
    public String a(String str, P p) {
        BiFunction<String, P, R> biFunction = this.a;
        if (biFunction == null) {
            return null;
        }
        try {
            return Objects.toString(biFunction.apply(str, p), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        return a(str, null);
    }

    public String toString() {
        return super.toString() + " [function=" + this.a + C6566gU0.g;
    }
}
