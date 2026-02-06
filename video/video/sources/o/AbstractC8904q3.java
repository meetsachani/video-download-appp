package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import o.F1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.q3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8904q3<K, V> extends AbstractC5232b3<K, V> implements InterfaceC6829ha2<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public AbstractC8904q3(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // o.AbstractC5232b3, o.F1
    public Collection<V> D(@InterfaceC7894ly1 K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new F1.m(k, (NavigableSet) collection, null);
        }
        return new F1.o(k, (SortedSet) collection, null);
    }

    @Override // o.AbstractC5232b3, o.F1
    /* renamed from: I */
    public abstract SortedSet<V> t();

    @Override // o.AbstractC5232b3, o.F1
    /* renamed from: J */
    public SortedSet<V> x() {
        return (SortedSet<V>) C(t());
    }

    @Override // o.AbstractC5232b3, o.F1
    /* renamed from: K */
    public <E> SortedSet<E> C(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return C10856y22.O((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC8904q3<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC8904q3<K, V>) obj, iterable);
    }

    @Override // o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Map<K, Collection<V>> l() {
        return super.l();
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    public Collection<V> values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set get(@InterfaceC7894ly1 Object obj) {
        return get((AbstractC8904q3<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Set j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((AbstractC8904q3<K, V>) obj, iterable);
    }

    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public SortedSet<V> get(@InterfaceC7894ly1 K k) {
        return (SortedSet) super.get((AbstractC8904q3<K, V>) k);
    }

    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public SortedSet<V> i(@MB Object obj) {
        return (SortedSet) super.i(obj);
    }

    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public SortedSet<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.j((AbstractC8904q3<K, V>) k, (Iterable) iterable);
    }
}
