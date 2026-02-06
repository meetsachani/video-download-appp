package o;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: o.Cs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2688Cs2<K, V> extends C9354rs2<K, V> implements SortedMap<K, V> {
    private static final long serialVersionUID = -8751771676410385778L;

    public C2688Cs2(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        super(sortedMap, interfaceC3287Is2, interfaceC3287Is22);
    }

    public static <K, V> C2688Cs2<K, V> l(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        C2688Cs2<K, V> c2688Cs2 = new C2688Cs2<>(sortedMap, interfaceC3287Is2, interfaceC3287Is22);
        if (sortedMap.size() > 0) {
            Map<K, V> f = c2688Cs2.f(sortedMap);
            c2688Cs2.clear();
            c2688Cs2.b().putAll(f);
        }
        return c2688Cs2;
    }

    public static <K, V> C2688Cs2<K, V> m(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends K> interfaceC3287Is2, InterfaceC3287Is2<? super V, ? extends V> interfaceC3287Is22) {
        return new C2688Cs2<>(sortedMap, interfaceC3287Is2, interfaceC3287Is22);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return k().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return k().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new C2688Cs2(k().headMap(k), this.Y, this.Z);
    }

    public SortedMap<K, V> k() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return k().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new C2688Cs2(k().subMap(k, k2), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new C2688Cs2(k().tailMap(k), this.Y, this.Z);
    }
}
