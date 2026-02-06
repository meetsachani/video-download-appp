package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.Jj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3349Jj2 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    public final Collection X;
    public final Object Y;

    public C3349Jj2(Collection collection) {
        if (collection != null) {
            this.X = collection;
            this.Y = this;
            return;
        }
        throw new IllegalArgumentException("Collection must not be null");
    }

    public static Collection d(Collection collection) {
        return new C3349Jj2(collection);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean add;
        synchronized (this.Y) {
            add = this.X.add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.Y) {
            addAll = this.X.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.Y) {
            this.X.clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.Y) {
            contains = this.X.contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.Y) {
            containsAll = this.X.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        synchronized (this.Y) {
            try {
                if (obj == this) {
                    return true;
                }
                return this.X.equals(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.Y) {
            hashCode = this.X.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.Y) {
            isEmpty = this.X.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.X.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.Y) {
            remove = this.X.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.Y) {
            removeAll = this.X.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.Y) {
            retainAll = this.X.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.Y) {
            size = this.X.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.Y) {
            array = this.X.toArray();
        }
        return array;
    }

    public String toString() {
        String obj;
        synchronized (this.Y) {
            obj = this.X.toString();
        }
        return obj;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.Y) {
            array = this.X.toArray(objArr);
        }
        return array;
    }

    public C3349Jj2(Collection collection, Object obj) {
        if (collection != null) {
            this.X = collection;
            this.Y = obj;
            return;
        }
        throw new IllegalArgumentException("Collection must not be null");
    }
}
