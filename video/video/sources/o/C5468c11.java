package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: o.c11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5468c11<E> extends V2<E> {
    private static final long serialVersionUID = -228664372470420141L;
    public final List<E> Y;

    /* renamed from: o.c11$b */
    /* loaded from: classes4.dex */
    public static class b<E> extends AbstractC6935i1<E> implements InterfaceC8877pw1<E> {
        public final Collection<E> Y;
        public E Z;

        @Override // o.InterfaceC8877pw1
        public boolean hasPrevious() {
            return ((ListIterator) b()).hasPrevious();
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        public E next() {
            E next = b().next();
            this.Z = next;
            return next;
        }

        @Override // o.InterfaceC8877pw1
        public E previous() {
            E e = (E) ((ListIterator) b()).previous();
            this.Z = e;
            return e;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            this.Y.remove(this.Z);
            b().remove();
            this.Z = null;
        }

        public b(ListIterator<E> listIterator, Collection<E> collection) {
            super(listIterator);
            this.Y = collection;
        }
    }

    public C5468c11() {
        super(new HashSet());
        this.Y = new ArrayList();
    }

    public static <E> C5468c11<E> j(List<E> list) {
        if (list != null) {
            C6748hF.y(list, C6974iA2.b());
            return new C5468c11<>(new HashSet(list), list);
        }
        throw new NullPointerException("List must not be null");
    }

    public static <E> C5468c11<E> k(Set<E> set) {
        return new C5468c11<>(set);
    }

    public static <E> C5468c11<E> l(Set<E> set, List<E> list) {
        if (set != null) {
            if (list != null) {
                if (set.size() <= 0 && list.size() <= 0) {
                    return new C5468c11<>(set, list);
                }
                throw new IllegalArgumentException("Set and List must be empty");
            }
            throw new NullPointerException("List must not be null");
        }
        throw new NullPointerException("Set must not be null");
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        if (d().add(e)) {
            this.Y.add(e);
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        d().clear();
        this.Y.clear();
    }

    public E get(int i) {
        return this.Y.get(i);
    }

    public List<E> h() {
        return C6735hB2.h(this.Y);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public InterfaceC8877pw1<E> iterator() {
        return new b(this.Y.listIterator(), d());
    }

    public int indexOf(Object obj) {
        return this.Y.indexOf(obj);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean remove = d().remove(obj);
        if (remove) {
            this.Y.remove(obj);
        }
        return remove;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        if (predicate == null) {
            return false;
        }
        boolean removeIf = d().removeIf(predicate);
        if (removeIf) {
            this.Y.removeIf(predicate);
        }
        return removeIf;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = d().retainAll(collection);
        if (!retainAll) {
            return false;
        }
        if (d().size() == 0) {
            this.Y.clear();
            return retainAll;
        }
        Iterator<E> it = this.Y.iterator();
        while (it.hasNext()) {
            if (!d().contains(it.next())) {
                it.remove();
            }
        }
        return retainAll;
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return this.Y.toArray();
    }

    @Override // o.AbstractC8162n0
    public String toString() {
        return this.Y.toString();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.Y.toArray(tArr);
    }

    public C5468c11(Set<E> set) {
        super(set);
        this.Y = new ArrayList(set);
    }

    public void add(int i, E e) {
        if (contains(e)) {
            return;
        }
        d().add(e);
        this.Y.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (E e : collection) {
            if (!contains(e)) {
                d().add(e);
                arrayList.add(e);
                z = true;
            }
        }
        if (z) {
            this.Y.addAll(i, arrayList);
        }
        return z;
    }

    public E remove(int i) {
        E remove = this.Y.remove(i);
        remove(remove);
        return remove;
    }

    public C5468c11(Set<E> set, List<E> list) {
        super(set);
        if (list != null) {
            this.Y = list;
            return;
        }
        throw new NullPointerException("List must not be null");
    }
}
