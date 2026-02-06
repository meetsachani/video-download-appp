package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: o.l3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7670l3<K, V> extends I1<K, V> implements YT0<K, V> {

    /* renamed from: o.l3$a */
    /* loaded from: classes4.dex */
    public static class a<K, V> extends C2724Dd0<K, V> implements InterfaceC9855tw1<K, V> {
        public a(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            return ((ListIterator) this.Y).hasPrevious();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            this.Z = (Map.Entry) ((ListIterator) this.Y).previous();
            return getKey();
        }

        @Override // o.C2724Dd0, o.MS1
        public synchronized void reset() {
            super.reset();
            this.Y = new T01(this.Y);
        }
    }

    public AbstractC7670l3() {
    }

    @Override // o.I1
    /* renamed from: c */
    public SortedMap<K, V> b() {
        return (SortedMap) super.b();
    }

    public Comparator<? super K> comparator() {
        return b().comparator();
    }

    public K firstKey() {
        return b().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return b().headMap(k);
    }

    public K j0(K k) {
        SortedMap<K, V> headMap = headMap(k);
        if (headMap.isEmpty()) {
            return null;
        }
        return headMap.lastKey();
    }

    public K lastKey() {
        return b().lastKey();
    }

    public K n0(K k) {
        Iterator<K> it = tailMap(k).keySet().iterator();
        it.next();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return b().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return b().tailMap(k);
    }

    public AbstractC7670l3(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }

    @Override // o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return new a(entrySet());
    }
}
