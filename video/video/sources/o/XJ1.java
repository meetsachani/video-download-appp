package o;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class XJ1 {
    public static final XJ1 c = new XJ1();
    public final ConcurrentMap<Class<?>, InterfaceC9026qY1<?>> b = new ConcurrentHashMap();
    public final InterfaceC9275rY1 a = new C71();

    public static XJ1 a() {
        return c;
    }

    public int b() {
        int i = 0;
        for (InterfaceC9026qY1<?> interfaceC9026qY1 : this.b.values()) {
            if (interfaceC9026qY1 instanceof C3833Oi1) {
                i += ((C3833Oi1) interfaceC9026qY1).x();
            }
        }
        return i;
    }

    public <T> boolean c(T t) {
        return j(t).e(t);
    }

    public <T> void d(T t) {
        j(t).d(t);
    }

    public <T> void e(T t, EO1 eo1) throws IOException {
        f(t, eo1, C3151Hj0.d());
    }

    public <T> void f(T t, EO1 eo1, C3151Hj0 c3151Hj0) throws IOException {
        j(t).i(t, eo1, c3151Hj0);
    }

    public InterfaceC9026qY1<?> g(Class<?> cls, InterfaceC9026qY1<?> interfaceC9026qY1) {
        C9740tS0.e(cls, "messageType");
        C9740tS0.e(interfaceC9026qY1, "schema");
        return this.b.putIfAbsent(cls, interfaceC9026qY1);
    }

    public InterfaceC9026qY1<?> h(Class<?> cls, InterfaceC9026qY1<?> interfaceC9026qY1) {
        C9740tS0.e(cls, "messageType");
        C9740tS0.e(interfaceC9026qY1, "schema");
        return this.b.put(cls, interfaceC9026qY1);
    }

    public <T> InterfaceC9026qY1<T> i(Class<T> cls) {
        C9740tS0.e(cls, "messageType");
        InterfaceC9026qY1<T> interfaceC9026qY1 = (InterfaceC9026qY1<T>) this.b.get(cls);
        if (interfaceC9026qY1 == null) {
            interfaceC9026qY1 = this.a.a(cls);
            InterfaceC9026qY1<T> interfaceC9026qY12 = (InterfaceC9026qY1<T>) g(cls, interfaceC9026qY1);
            if (interfaceC9026qY12 != null) {
                return interfaceC9026qY12;
            }
        }
        return interfaceC9026qY1;
    }

    public <T> InterfaceC9026qY1<T> j(T t) {
        return i(t.getClass());
    }

    public <T> void k(T t, NN2 nn2) throws IOException {
        j(t).f(t, nn2);
    }
}
