package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.i3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6943i3<K, V> extends AbstractC9392s2<K, V> implements W92<K, V> {
    public AbstractC6943i3(W92<K, V> w92) {
        super(w92);
    }

    @Override // o.W92
    public Comparator<? super V> U() {
        return d().U();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return d().comparator();
    }

    @Override // o.AbstractC9392s2
    /* renamed from: e */
    public W92<K, V> d() {
        return (W92) super.c();
    }

    public SortedMap<K, V> headMap(K k) {
        return d().headMap(k);
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return d().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return d().tailMap(k);
    }

    @Override // o.AbstractC9392s2, o.X, o.InterfaceC4927Zm
    public W92<V, K> h() {
        return d().h();
    }
}
