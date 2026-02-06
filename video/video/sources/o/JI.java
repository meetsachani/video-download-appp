package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public class JI<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 8417515734108306801L;
    public a<E> X;
    public final List<Collection<E>> Y = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a<E> extends Serializable {
        boolean J4(JI<E> ji, List<Collection<E>> list, E e);

        boolean P2(JI<E> ji, List<Collection<E>> list, Object obj);

        boolean t2(JI<E> ji, List<Collection<E>> list, Collection<? extends E> collection);
    }

    public JI() {
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        a<E> aVar = this.X;
        if (aVar != null) {
            return aVar.J4(this, this.Y, e);
        }
        throw new UnsupportedOperationException("add() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        a<E> aVar = this.X;
        if (aVar != null) {
            return aVar.t2(this, this.Y, collection);
        }
        throw new UnsupportedOperationException("addAll() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public void clear() {
        for (Collection<E> collection : this.Y) {
            collection.clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        for (Collection<E> collection : this.Y) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(Collection<E> collection) {
        if (collection != null) {
            this.Y.add(collection);
        }
    }

    public void e(Collection<E> collection, Collection<E> collection2) {
        if (collection != null) {
            this.Y.add(collection);
        }
        if (collection2 != null) {
            this.Y.add(collection2);
        }
    }

    public void f(Collection<E>... collectionArr) {
        for (Collection<E> collection : collectionArr) {
            if (collection != null) {
                this.Y.add(collection);
            }
        }
    }

    public List<Collection<E>> h() {
        return C6735hB2.h(this.Y);
    }

    public a<E> i() {
        return this.X;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        for (Collection<E> collection : this.Y) {
            if (!collection.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.Y.isEmpty()) {
            return C4579Wa0.b();
        }
        C5341bU0 c5341bU0 = new C5341bU0();
        for (Collection<E> collection : this.Y) {
            c5341bU0.b(collection.iterator());
        }
        return c5341bU0;
    }

    public void j(Collection<E> collection) {
        this.Y.remove(collection);
    }

    public void k(a<E> aVar) {
        this.X = aVar;
    }

    public Collection<E> l() {
        return new ArrayList(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        a<E> aVar = this.X;
        if (aVar != null) {
            return aVar.P2(this, this.Y, obj);
        }
        throw new UnsupportedOperationException("remove() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        if (C6748hF.L(collection)) {
            return false;
        }
        for (Collection<E> collection2 : this.Y) {
            z |= collection2.removeAll(collection);
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        boolean z = false;
        if (predicate == null) {
            return false;
        }
        for (Collection<E> collection : this.Y) {
            z |= collection.removeIf(predicate);
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        if (collection != null) {
            for (Collection<E> collection2 : this.Y) {
                z |= collection2.retainAll(collection);
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public int size() {
        int i = 0;
        for (Collection<E> collection : this.Y) {
            i += collection.size();
        }
        return i;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public JI(Collection<E> collection) {
        d(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i = 0;
        for (Collection<E> collection : this.Y) {
            for (E e : collection) {
                tArr[i] = e;
                i++;
            }
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public JI(Collection<E> collection, Collection<E> collection2) {
        e(collection, collection2);
    }

    public JI(Collection<E>... collectionArr) {
        f(collectionArr);
    }
}
