package o;

import java.util.Map;
import o.P1;

/* renamed from: o.a81  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5011a81<K, V> extends P1<K, V, InterfaceC6272fK1<V>> implements FY0<Map<K, InterfaceC6272fK1<V>>> {

    /* renamed from: o.a81$b */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends P1.a<K, V, InterfaceC6272fK1<V>> {
        public C5011a81<K, V> c() {
            return new C5011a81<>(this.a);
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
        public b<K, V> b(InterfaceC6272fK1<Map<K, InterfaceC6272fK1<V>>> interfaceC6272fK1) {
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

    @Override // o.InterfaceC6272fK1
    /* renamed from: d */
    public Map<K, InterfaceC6272fK1<V>> get() {
        return b();
    }

    public C5011a81(Map<K, InterfaceC6272fK1<V>> map) {
        super(map);
    }
}
