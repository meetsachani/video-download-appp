package o;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.k3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7427k3<K, V> extends AbstractC8904q3<K, V> {
    public AbstractC7427k3(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: L */
    public SortedMap<K, Collection<V>> l() {
        return (SortedMap) super.l();
    }

    @Override // o.F1
    /* renamed from: M */
    public SortedMap<K, Collection<V>> s() {
        return (SortedMap) super.s();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: N */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // o.F1, o.AbstractC6939i2
    public Set<K> c() {
        return w();
    }
}
