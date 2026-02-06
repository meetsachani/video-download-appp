package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.iG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6997iG1<K, V> extends ZF1<K, V> implements SortedMap<K, V> {
    private static final long serialVersionUID = 3359846175935304332L;

    public C6997iG1(SortedMap<K, V> sortedMap, KF1<? super K> kf1, KF1<? super V> kf12) {
        super(sortedMap, kf1, kf12);
    }

    public static <K, V> C6997iG1<K, V> i(SortedMap<K, V> sortedMap, KF1<? super K> kf1, KF1<? super V> kf12) {
        return new C6997iG1<>(sortedMap, kf1, kf12);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return g().firstKey();
    }

    public SortedMap<K, V> g() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new C6997iG1(g().headMap(k), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return g().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new C6997iG1(g().subMap(k, k2), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new C6997iG1(g().tailMap(k), this.Y, this.Z);
    }
}
