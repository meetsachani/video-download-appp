package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.cZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5598cZ0<K, V> extends C5113aZ0<K, V> implements SortedMap<K, V> {
    private static final long serialVersionUID = 2715322183617658933L;

    public C5598cZ0(SortedMap<K, V> sortedMap, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        super(sortedMap, interfaceC5641ck0);
    }

    public static <K, V> C5598cZ0<K, V> f(SortedMap<K, V> sortedMap, InterfaceC5641ck0<? extends V> interfaceC5641ck0) {
        return new C5598cZ0<>(sortedMap, interfaceC5641ck0);
    }

    public static <K, V> C5598cZ0<K, V> g(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        return new C5598cZ0<>(sortedMap, interfaceC3287Is2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return e().comparator();
    }

    public SortedMap<K, V> e() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return e().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new C5598cZ0(e().headMap(k), this.Y);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return e().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new C5598cZ0(e().subMap(k, k2), this.Y);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new C5598cZ0(e().tailMap(k), this.Y);
    }

    public C5598cZ0(SortedMap<K, V> sortedMap, InterfaceC3287Is2<? super K, ? extends V> interfaceC3287Is2) {
        super(sortedMap, interfaceC3287Is2);
    }
}
