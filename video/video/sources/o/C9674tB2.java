package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.tB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9674tB2<K, V> extends AbstractC6696h2<K, V> implements QA2 {
    private static final long serialVersionUID = 20150612;

    public C9674tB2(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        super(interfaceC7846lm1);
    }

    public static <K, V> C9674tB2<K, V> b(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        if (interfaceC7846lm1 instanceof QA2) {
            return (C9674tB2) interfaceC7846lm1;
        }
        return new C9674tB2<>(interfaceC7846lm1);
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public InterfaceC6135em1<K> Q() {
        return C9431sB2.h(a().Q());
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean e0(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean f0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> get(K k) {
        return ZA2.f(a().get(k));
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public Set<K> keySet() {
        return CB2.h(a().keySet());
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public Map<K, Collection<V>> l() {
        return C7966mB2.c(a().l());
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public U71<K, V> p() {
        return C8939qB2.b(a().p());
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean p0(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public boolean putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public Collection<Map.Entry<K, V>> r() {
        return ZA2.f(a().r());
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6696h2, o.InterfaceC7846lm1
    public Collection<V> values() {
        return ZA2.f(a().values());
    }
}
