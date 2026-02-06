package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* renamed from: o.Kj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3447Kj2<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    public final Collection<E> X;
    public final Object Y;

    public C3447Kj2(Collection<E> collection) {
        if (collection != null) {
            this.X = collection;
            this.Y = this;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    public static <T> C3447Kj2<T> e(Collection<T> collection) {
        return new C3447Kj2<>(collection);
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        boolean add;
        synchronized (this.Y) {
            add = d().add(e);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.Y) {
            addAll = d().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.Y) {
            d().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.Y) {
            contains = d().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.Y) {
            containsAll = d().containsAll(collection);
        }
        return containsAll;
    }

    public Collection<E> d() {
        return this.X;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        synchronized (this.Y) {
            boolean z = true;
            try {
                if (obj == this) {
                    return true;
                }
                if (obj != this && !d().equals(obj)) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.Y) {
            hashCode = d().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.Y) {
            isEmpty = d().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return d().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.Y) {
            remove = d().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.Y) {
            removeAll = d().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        boolean removeIf;
        synchronized (this.Y) {
            removeIf = d().removeIf(predicate);
        }
        return removeIf;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.Y) {
            retainAll = d().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.Y) {
            size = d().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.Y) {
            array = d().toArray();
        }
        return array;
    }

    public String toString() {
        String obj;
        synchronized (this.Y) {
            obj = d().toString();
        }
        return obj;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.Y) {
            tArr2 = (T[]) d().toArray(tArr);
        }
        return tArr2;
    }

    public C3447Kj2(Collection<E> collection, Object obj) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        if (obj != null) {
            this.X = collection;
            this.Y = obj;
            return;
        }
        throw new NullPointerException("Lock must not be null.");
    }
}
