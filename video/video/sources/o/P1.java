package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class P1<K, V, V2> implements InterfaceC5884dk0<Map<K, V2>> {
    public final Map<K, InterfaceC6272fK1<V>> a;

    /* loaded from: classes2.dex */
    public static abstract class a<K, V, V2> {
        public final LinkedHashMap<K, InterfaceC6272fK1<V>> a;

        public a(int i) {
            this.a = YT.d(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a<K, V, V2> a(K k, InterfaceC6272fK1<V> interfaceC6272fK1) {
            this.a.put(C10421wF1.c(k, "key"), C10421wF1.c(interfaceC6272fK1, "provider"));
            return this;
        }

        public a<K, V, V2> b(InterfaceC6272fK1<Map<K, V2>> interfaceC6272fK1) {
            if (interfaceC6272fK1 instanceof S10) {
                return b(((S10) interfaceC6272fK1).a());
            }
            this.a.putAll(((P1) interfaceC6272fK1).a);
            return this;
        }
    }

    public P1(Map<K, InterfaceC6272fK1<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public final Map<K, InterfaceC6272fK1<V>> b() {
        return this.a;
    }
}
