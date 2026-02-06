package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/* renamed from: o.Au0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2498Au0<E> extends T2<E> implements InterfaceC7613kp<E> {
    private static final long serialVersionUID = -2218010673611160319L;

    /* renamed from: o.Au0$a */
    /* loaded from: classes4.dex */
    public class a extends C9631t1<E> {
        public a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void add(Object obj) {
            throw C2498Au0.h();
        }

        @Override // o.C9631t1, java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw C2498Au0.h();
        }
    }

    public C2498Au0(List<E> list) {
        super(list);
    }

    public static /* synthetic */ UnsupportedOperationException h() {
        return j();
    }

    public static <E> C2498Au0<E> i(List<E> list) {
        return new C2498Au0<>(list);
    }

    public static UnsupportedOperationException j() {
        return new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        throw j();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        throw j();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw j();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E get(int i) {
        return d().get(i);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public int indexOf(Object obj) {
        return d().indexOf(obj);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(d().iterator());
    }

    @Override // o.AbstractC9145r1, java.util.List
    public int lastIndexOf(Object obj) {
        return d().lastIndexOf(obj);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator() {
        return new a(d().listIterator(0));
    }

    @Override // o.InterfaceC7613kp
    public int q() {
        return size();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E remove(int i) {
        throw j();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw j();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw j();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw j();
    }

    @Override // o.InterfaceC7613kp
    public boolean s() {
        return true;
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E set(int i, E e) {
        return d().set(i, e);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public List<E> subList(int i, int i2) {
        return new C2498Au0(d().subList(i, i2));
    }

    @Override // o.AbstractC9145r1, java.util.List
    public void add(int i, E e) {
        throw j();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw j();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator(int i) {
        return new a(d().listIterator(i));
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw j();
    }
}
