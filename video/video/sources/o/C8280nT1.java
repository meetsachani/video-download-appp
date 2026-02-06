package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.nT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8280nT1 {
    public final List<a<?>> a = new ArrayList();

    /* renamed from: o.nT1$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final Class<T> a;
        public final InterfaceC8037mT1<T> b;

        public a(Class<T> cls, InterfaceC8037mT1<T> interfaceC8037mT1) {
            this.a = cls;
            this.b = interfaceC8037mT1;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, InterfaceC8037mT1<Z> interfaceC8037mT1) {
        this.a.add(new a<>(cls, interfaceC8037mT1));
    }

    public synchronized <Z> InterfaceC8037mT1<Z> b(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (InterfaceC8037mT1<Z>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(Class<Z> cls, InterfaceC8037mT1<Z> interfaceC8037mT1) {
        this.a.add(0, new a<>(cls, interfaceC8037mT1));
    }
}
