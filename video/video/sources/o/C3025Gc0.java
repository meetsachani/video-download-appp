package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Gc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3025Gc0 {
    public final List<a<?>> a = new ArrayList();

    /* renamed from: o.Gc0$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final Class<T> a;
        public final InterfaceC2422Ab0<T> b;

        public a(Class<T> cls, InterfaceC2422Ab0<T> interfaceC2422Ab0) {
            this.a = cls;
            this.b = interfaceC2422Ab0;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, InterfaceC2422Ab0<T> interfaceC2422Ab0) {
        this.a.add(new a<>(cls, interfaceC2422Ab0));
    }

    public synchronized <T> InterfaceC2422Ab0<T> b(Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (InterfaceC2422Ab0<T>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <T> void c(Class<T> cls, InterfaceC2422Ab0<T> interfaceC2422Ab0) {
        this.a.add(0, new a<>(cls, interfaceC2422Ab0));
    }
}
