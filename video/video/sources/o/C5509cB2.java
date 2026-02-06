package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: o.cB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5509cB2<K, V> extends Z2<Map.Entry<K, V>> implements QA2 {
    private static final long serialVersionUID = 1678353579659253473L;

    /* renamed from: o.cB2$a */
    /* loaded from: classes4.dex */
    public class a extends N1<K, V> {
        public a(Map.Entry<K, V> entry) {
            super(entry);
        }

        @Override // o.N1, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.cB2$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC6935i1<Map.Entry<K, V>> {
        public b(Iterator<Map.Entry<K, V>> it) {
            super(it);
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            return new a(b().next());
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5509cB2(Set<Map.Entry<K, V>> set) {
        super(set);
    }

    public static <K, V> Set<Map.Entry<K, V>> i(Set<Map.Entry<K, V>> set) {
        if (set instanceof QA2) {
            return set;
        }
        return new C5509cB2(set);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    /* renamed from: h */
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new b(d().iterator());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super Map.Entry<K, V>> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] array = d().toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new a((Map.Entry) array[i]);
        }
        return array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2 = (T[]) d().toArray(tArr.length > 0 ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 0) : tArr);
        for (int i = 0; i < tArr2.length; i++) {
            tArr2[i] = new a((Map.Entry) tArr2[i]);
        }
        if (tArr2.length > tArr.length) {
            return tArr2;
        }
        System.arraycopy(tArr2, 0, tArr, 0, tArr2.length);
        if (tArr.length > tArr2.length) {
            tArr[tArr2.length] = null;
        }
        return tArr;
    }
}
