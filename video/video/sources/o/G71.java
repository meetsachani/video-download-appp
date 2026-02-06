package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class G71 implements Set, Serializable {
    private static final long serialVersionUID = 6723912213766056587L;
    public final Map X;
    public final Object Y;

    public G71(Map map, Object obj) {
        this.X = map;
        this.Y = obj;
    }

    public static Set d(Map map) {
        return e(map, null);
    }

    public static Set e(Map map, Object obj) {
        if (map != null) {
            return new G71(map, obj);
        }
        throw new IllegalArgumentException("The map must not be null");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        int size = this.X.size();
        this.X.put(obj, this.Y);
        if (this.X.size() != size) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        int size = this.X.size();
        for (Object obj : collection) {
            this.X.put(obj, this.Y);
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
    public boolean containsAll(Collection collection) {
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
    public Iterator iterator() {
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
    public boolean removeAll(Collection collection) {
        return this.X.keySet().removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
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
    public Object[] toArray(Object[] objArr) {
        return this.X.keySet().toArray(objArr);
    }
}
