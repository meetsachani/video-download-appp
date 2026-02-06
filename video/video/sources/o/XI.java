package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public class XI<E> implements Set<E>, Serializable {
    private static final long serialVersionUID = 5185069727540378940L;
    public a<E> X;
    public final List<Set<E>> Y = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a<E> extends Serializable {
        boolean M1(XI<E> xi, List<Set<E>> list, Collection<? extends E> collection);

        void V0(XI<E> xi, Set<E> set, Set<E> set2, Collection<E> collection);

        boolean p2(XI<E> xi, List<Set<E>> list, E e);
    }

    public XI() {
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        a<E> aVar = this.X;
        if (aVar != null) {
            return aVar.p2(this, this.Y, e);
        }
        throw new UnsupportedOperationException("add() is not supported on CompositeSet without a SetMutator strategy");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        a<E> aVar = this.X;
        if (aVar != null) {
            return aVar.M1(this, this.Y, collection);
        }
        throw new UnsupportedOperationException("addAll() is not supported on CompositeSet without a SetMutator strategy");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        for (Set<E> set : this.Y) {
            set.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        for (Set<E> set : this.Y) {
            if (set.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
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

    public synchronized void d(Set<E> set) {
        if (set != null) {
            try {
                for (Set<E> set2 : i()) {
                    Collection<E> K = C6748hF.K(set2, set);
                    if (K.size() > 0) {
                        if (this.X != null) {
                            h().V0(this, set2, set, K);
                            if (C6748hF.K(set2, set).size() > 0) {
                                throw new IllegalArgumentException("Attempt to add illegal entry unresolved by SetMutator.resolveCollision()");
                            }
                        } else {
                            throw new UnsupportedOperationException("Collision adding composited set with no SetMutator set");
                        }
                    }
                }
                this.Y.add(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Set<E> set, Set<E> set2) {
        d(set);
        d(set2);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (set.size() == size() && set.containsAll(this)) {
                return true;
            }
        }
        return false;
    }

    public void f(Set<E>... setArr) {
        if (setArr != null) {
            for (Set<E> set : setArr) {
                d(set);
            }
        }
    }

    public a<E> h() {
        return this.X;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int hashCode;
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            if (next == null) {
                hashCode = 0;
            } else {
                hashCode = next.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public List<Set<E>> i() {
        return C6735hB2.h(this.Y);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        for (Set<E> set : this.Y) {
            if (!set.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.Y.isEmpty()) {
            return C4579Wa0.b();
        }
        C5341bU0 c5341bU0 = new C5341bU0();
        for (Set<E> set : this.Y) {
            c5341bU0.b(set.iterator());
        }
        return c5341bU0;
    }

    public void j(Set<E> set) {
        this.Y.remove(set);
    }

    public void k(a<E> aVar) {
        this.X = aVar;
    }

    public Set<E> l() {
        return new HashSet(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        for (Set<E> set : i()) {
            if (set.contains(obj)) {
                return set.remove(obj);
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        if (C6748hF.L(collection)) {
            return false;
        }
        for (Set<E> set : this.Y) {
            z |= set.removeAll(collection);
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        boolean z = false;
        if (predicate == null) {
            return false;
        }
        for (Set<E> set : this.Y) {
            z |= set.removeIf(predicate);
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (Set<E> set : this.Y) {
            z |= set.retainAll(collection);
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        int i = 0;
        for (Set<E> set : this.Y) {
            i += set.size();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
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

    public XI(Set<E> set) {
        d(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i = 0;
        for (Set<E> set : this.Y) {
            for (E e : set) {
                tArr[i] = e;
                i++;
            }
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public XI(Set<E>... setArr) {
        f(setArr);
    }
}
