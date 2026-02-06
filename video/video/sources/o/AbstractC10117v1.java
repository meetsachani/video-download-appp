package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.v1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10117v1<K, V> extends F1<K, V> implements V01<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC10117v1(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // o.F1
    public <E> Collection<E> C(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // o.F1
    public Collection<V> D(@InterfaceC7894ly1 K k, Collection<V> collection) {
        return E(k, (List) collection, null);
    }

    @Override // o.F1
    /* renamed from: F */
    public abstract List<V> t();

    @Override // o.F1
    /* renamed from: H */
    public List<V> x() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC10117v1<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC10117v1<K, V>) obj, iterable);
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
    public List<V> get(@InterfaceC7894ly1 K k) {
        return (List) super.get((AbstractC10117v1<K, V>) k);
    }

    @Override // o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> i(@MB Object obj) {
        return (List) super.i(obj);
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (List) super.j((AbstractC10117v1<K, V>) k, (Iterable) iterable);
    }
}
