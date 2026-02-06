package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.P1;

/* loaded from: classes2.dex */
public final class P71<K, V> extends P1<K, V, V> {
    public static final InterfaceC6272fK1<Map<Object, Object>> b = C10464wQ0.a(Collections.EMPTY_MAP);

    /* loaded from: classes2.dex */
    public static final class b<K, V> extends P1.a<K, V, V> {
        public P71<K, V> c() {
            return new P71<>(this.a);
        }

        @Override // o.P1.a
        /* renamed from: d */
        public b<K, V> a(K k, InterfaceC6272fK1<V> interfaceC6272fK1) {
            super.a(k, interfaceC6272fK1);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.P1.a
        /* renamed from: e */
        public b<K, V> b(InterfaceC6272fK1<Map<K, V>> interfaceC6272fK1) {
            super.b(interfaceC6272fK1);
            return this;
        }

        public b(int i) {
            super(i);
        }
    }

    public static <K, V> b<K, V> c(int i) {
        return new b<>(i);
    }

    public static <K, V> InterfaceC6272fK1<Map<K, V>> d() {
        return (InterfaceC6272fK1<Map<K, V>>) b;
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = YT.d(b().size());
        for (Map.Entry<K, InterfaceC6272fK1<V>> entry : b().entrySet()) {
            d.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d);
    }

    public P71(Map<K, InterfaceC6272fK1<V>> map) {
        super(map);
    }
}
