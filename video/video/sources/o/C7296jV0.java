package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.jV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7296jV0 {
    public final Map<InterfaceC6575gX0, C4587Wc0<?>> a = new HashMap();
    public final Map<InterfaceC6575gX0, C4587Wc0<?>> b = new HashMap();

    public C4587Wc0<?> a(InterfaceC6575gX0 interfaceC6575gX0, boolean z) {
        return c(z).get(interfaceC6575gX0);
    }

    public Map<InterfaceC6575gX0, C4587Wc0<?>> b() {
        return Collections.unmodifiableMap(this.a);
    }

    public final Map<InterfaceC6575gX0, C4587Wc0<?>> c(boolean z) {
        if (z) {
            return this.b;
        }
        return this.a;
    }

    public void d(InterfaceC6575gX0 interfaceC6575gX0, C4587Wc0<?> c4587Wc0) {
        c(c4587Wc0.q()).put(interfaceC6575gX0, c4587Wc0);
    }

    public void e(InterfaceC6575gX0 interfaceC6575gX0, C4587Wc0<?> c4587Wc0) {
        Map<InterfaceC6575gX0, C4587Wc0<?>> c = c(c4587Wc0.q());
        if (c4587Wc0.equals(c.get(interfaceC6575gX0))) {
            c.remove(interfaceC6575gX0);
        }
    }
}
