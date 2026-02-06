package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6696h2<K, V> implements InterfaceC7846lm1<K, V>, Serializable {
    private static final long serialVersionUID = 20150612;
    public final InterfaceC7846lm1<K, V> X;

    public AbstractC6696h2(InterfaceC7846lm1<K, V> interfaceC7846lm1) {
        if (interfaceC7846lm1 != null) {
            this.X = interfaceC7846lm1;
            return;
        }
        throw new NullPointerException("MultiValuedMap must not be null.");
    }

    @Override // o.InterfaceC7846lm1
    public InterfaceC6135em1<K> Q() {
        return a().Q();
    }

    public InterfaceC7846lm1<K, V> a() {
        return this.X;
    }

    @Override // o.InterfaceC7846lm1
    public void clear() {
        a().clear();
    }

    @Override // o.InterfaceC7846lm1
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // o.InterfaceC7846lm1
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // o.InterfaceC7846lm1
    public boolean e0(K k, Iterable<? extends V> iterable) {
        return a().e0(k, iterable);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return a().equals(obj);
    }

    @Override // o.InterfaceC7846lm1
    public boolean f0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        return a().f0(interfaceC7846lm1);
    }

    @Override // o.InterfaceC7846lm1
    public boolean g0(Object obj, Object obj2) {
        return a().g0(obj, obj2);
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> get(K k) {
        return a().get(k);
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // o.InterfaceC7846lm1
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // o.InterfaceC7846lm1
    public Set<K> keySet() {
        return a().keySet();
    }

    @Override // o.InterfaceC7846lm1
    public Map<K, Collection<V>> l() {
        return a().l();
    }

    @Override // o.InterfaceC7846lm1
    public U71<K, V> p() {
        return a().p();
    }

    @Override // o.InterfaceC7846lm1
    public boolean p0(Object obj, Object obj2) {
        return a().p0(obj, obj2);
    }

    @Override // o.InterfaceC7846lm1
    public boolean put(K k, V v) {
        return a().put(k, v);
    }

    @Override // o.InterfaceC7846lm1
    public boolean putAll(Map<? extends K, ? extends V> map) {
        return a().putAll(map);
    }

    @Override // o.InterfaceC7846lm1
    public Collection<Map.Entry<K, V>> r() {
        return a().r();
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> remove(Object obj) {
        return a().remove(obj);
    }

    @Override // o.InterfaceC7846lm1
    public int size() {
        return a().size();
    }

    public String toString() {
        return a().toString();
    }

    @Override // o.InterfaceC7846lm1
    public Collection<V> values() {
        return a().values();
    }
}
