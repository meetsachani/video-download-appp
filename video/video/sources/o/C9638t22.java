package o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: o.t22  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9638t22<E> extends T2<E> {
    private static final long serialVersionUID = 7196982186153478694L;
    public final Set<E> Y;

    /* renamed from: o.t22$a */
    /* loaded from: classes4.dex */
    public static class a<E> extends AbstractC6935i1<E> {
        public final Set<E> Y;
        public E Z;

        public a(Iterator<E> it, Set<E> set) {
            super(it);
            this.Z = null;
            this.Y = set;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        public E next() {
            E e = (E) super.next();
            this.Z = e;
            return e;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.remove(this.Z);
            this.Z = null;
        }
    }

    /* renamed from: o.t22$b */
    /* loaded from: classes4.dex */
    public static class b<E> extends C9631t1<E> {
        public final Set<E> Y;
        public E Z;

        public b(ListIterator<E> listIterator, Set<E> set) {
            super(listIterator);
            this.Z = null;
            this.Y = set;
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void add(E e) {
            if (!this.Y.contains(e)) {
                super.add(e);
                this.Y.add(e);
            }
        }

        @Override // o.C9631t1, java.util.ListIterator, java.util.Iterator
        public E next() {
            E e = (E) super.next();
            this.Z = e;
            return e;
        }

        @Override // o.C9631t1, java.util.ListIterator
        public E previous() {
            E e = (E) super.previous();
            this.Z = e;
            return e;
        }

        @Override // o.C9631t1, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.remove(this.Z);
            this.Z = null;
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("ListIterator does not support set");
        }
    }

    public C9638t22(List<E> list, Set<E> set) {
        super(list);
        if (set != null) {
            this.Y = set;
            return;
        }
        throw new NullPointerException("Set must not be null");
    }

    public static <E> C9638t22<E> j(List<E> list) {
        if (list != null) {
            if (list.isEmpty()) {
                return new C9638t22<>(list, new HashSet());
            }
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            C9638t22<E> c9638t22 = new C9638t22<>(list, new HashSet());
            c9638t22.addAll(arrayList);
            return c9638t22;
        }
        throw new NullPointerException("List must not be null");
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        int size = size();
        add(size(), e);
        return size != size();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        return addAll(size(), collection);
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        super.clear();
        this.Y.clear();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.Y.contains(obj);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, o.InterfaceC2958Fk
    public boolean containsAll(Collection<?> collection) {
        return this.Y.containsAll(collection);
    }

    public Set<E> h() {
        return CB2.h(this.Y);
    }

    public Set<E> i(Set<E> set, List<E> list) {
        if (set.getClass().equals(HashSet.class)) {
            return new HashSet(list.size());
        }
        try {
            return (Set) set.getClass().getDeclaredConstructor(set.getClass()).newInstance(set);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new HashSet();
        }
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a(super.iterator(), this.Y);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator() {
        return new b(super.listIterator(), this.Y);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean remove = this.Y.remove(obj);
        if (remove) {
            super.remove(obj);
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
        boolean removeIf = super.removeIf(predicate);
        this.Y.removeIf(predicate);
        return removeIf;
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.Y.retainAll(collection);
        if (!retainAll) {
            return false;
        }
        if (this.Y.size() == 0) {
            super.clear();
            return retainAll;
        }
        super.retainAll(this.Y);
        return retainAll;
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E set(int i, E e) {
        int indexOf = indexOf(e);
        E e2 = (E) super.set(i, e);
        if (indexOf != -1 && indexOf != i) {
            super.remove(indexOf);
        }
        this.Y.remove(e2);
        this.Y.add(e);
        return e2;
    }

    @Override // o.AbstractC9145r1, java.util.List
    public List<E> subList(int i, int i2) {
        List<E> subList = super.subList(i, i2);
        return C6694h11.x(new C9638t22(subList, i(this.Y, subList)));
    }

    @Override // o.AbstractC9145r1, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (this.Y.add(e)) {
                arrayList.add(e);
            }
        }
        return super.addAll(i, arrayList);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator(int i) {
        return new b(super.listIterator(i), this.Y);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E remove(int i) {
        E e = (E) super.remove(i);
        this.Y.remove(e);
        return e;
    }

    @Override // o.AbstractC9145r1, java.util.List
    public void add(int i, E e) {
        if (this.Y.contains(e)) {
            return;
        }
        this.Y.add(e);
        super.add(i, e);
    }
}
