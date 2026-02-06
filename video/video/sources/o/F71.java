package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class F71<E, V> implements Set<E>, Serializable {
    private static final long serialVersionUID = 6723912213766056587L;
    public final Map<E, ? super V> X;
    public final V Y;

    public F71(Map<E, ? super V> map, V v) {
        if (map != null) {
            this.X = map;
            this.Y = v;
            return;
        }
        throw new NullPointerException("The map must not be null");
    }

    public static <E, V> F71<E, V> d(Map<E, ? super V> map) {
        return e(map, null);
    }

    public static <E, V> F71<E, V> e(Map<E, ? super V> map, V v) {
        return new F71<>(map, v);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        int size = this.X.size();
        this.X.put(e, (V) this.Y);
        if (this.X.size() != size) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = this.X.size();
        for (E e : collection) {
            this.X.put(e, (V) this.Y);
        }
        if (this.X.size() != size) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.X.keySet().containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return this.X.keySet().equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.X.keySet().hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.X.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int size = this.X.size();
        this.X.remove(obj);
        if (this.X.size() != size) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.X.keySet().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        return this.X.keySet().removeIf(predicate);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.X.keySet().retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.X.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.X.keySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.X.keySet().toArray(tArr);
    }
}
