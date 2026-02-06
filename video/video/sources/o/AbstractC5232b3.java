package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import o.F1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.b3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5232b3<K, V> extends F1<K, V> implements InterfaceC8660p22<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractC5232b3(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // o.F1
    public <E> Collection<E> C(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // o.F1
    public Collection<V> D(@InterfaceC7894ly1 K k, Collection<V> collection) {
        return new F1.n(k, (Set) collection);
    }

    @Override // o.F1
    /* renamed from: F */
    public abstract Set<V> t();

    @Override // o.F1
    /* renamed from: H */
    public Set<V> x() {
        return Collections.EMPTY_SET;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC5232b3<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC5232b3<K, V>) obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Map<K, Collection<V>> l() {
        return super.l();
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return super.put(k, v);
    }

    @Override // o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<V> get(@InterfaceC7894ly1 K k) {
        return (Set) super.get((AbstractC5232b3<K, V>) k);
    }

    @Override // o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Set<V> i(@MB Object obj) {
        return (Set) super.i(obj);
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (Set) super.j((AbstractC5232b3<K, V>) k, (Iterable) iterable);
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<Map.Entry<K, V>> r() {
        return (Set) super.r();
    }
}
