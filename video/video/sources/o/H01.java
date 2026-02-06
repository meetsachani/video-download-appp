package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Predicate;
import o.AbstractC8653p1;

/* loaded from: classes4.dex */
public class H01<K, V> extends AbstractC8653p1<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 9077234323521161066L;

    /* loaded from: classes4.dex */
    public static class a<K> extends AbstractList<K> {
        public final H01<K, ?> X;

        public a(H01<K, ?> h01) {
            this.X = h01;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection<?> collection) {
            return this.X.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractList, java.util.List
        public K get(int i) {
            return this.X.R(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            return this.X.T(obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<K> iterator() {
            return C5994eB2.b(this.X.keySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            return this.X.T(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<K> listIterator() {
            return C7462kB2.b(super.listIterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public K remove(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super K> predicate) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<K> subList(int i, int i2) {
            return C6735hB2.h(super.subList(i, i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            return this.X.keySet().toArray();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<K> listIterator(int i) {
            return C7462kB2.b(super.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.X.keySet().toArray(tArr);
        }
    }

    public H01() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        t(objectOutputStream);
    }

    public List<K> P() {
        return new a(this);
    }

    @Override // o.V0
    /* renamed from: Q */
    public H01<K, V> i() {
        return (H01) super.clone();
    }

    public K R(int i) {
        return N(i).getKey();
    }

    public V S(int i) {
        return N(i).getValue();
    }

    public int T(Object obj) {
        Object j = j(obj);
        AbstractC8653p1.c<K, V> cVar = this.o1.a1;
        int i = 0;
        while (cVar != this.o1) {
            if (D(j, cVar.Z)) {
                return i;
            }
            cVar = cVar.a1;
            i++;
        }
        return -1;
    }

    public V W(int i) {
        return remove(R(i));
    }

    public H01(int i) {
        super(i);
    }

    public H01(int i, float f) {
        super(i, f);
    }

    public H01(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
