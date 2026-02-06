package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.zu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11307zu0 extends U2 implements InterfaceC7856lp {
    private static final long serialVersionUID = -2218010673611160319L;

    /* renamed from: o.zu0$a */
    /* loaded from: classes4.dex */
    public static class a extends C9874u1 {
        public a(ListIterator listIterator) {
            super(listIterator);
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("List is fixed size");
        }

        @Override // o.C9874u1, java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("List is fixed size");
        }
    }

    public C11307zu0(List list) {
        super(list);
    }

    public static List f(List list) {
        return new C11307zu0(list);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object get(int i) {
        return e().get(i);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public int indexOf(Object obj) {
        return e().indexOf(obj);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return C5752dB2.b(d().iterator());
    }

    @Override // o.AbstractC9388s1, java.util.List
    public int lastIndexOf(Object obj) {
        return e().lastIndexOf(obj);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator() {
        return new a(e().listIterator(0));
    }

    @Override // o.InterfaceC7856lp
    public int q() {
        return size();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.InterfaceC7856lp
    public boolean s() {
        return true;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object set(int i, Object obj) {
        return e().set(i, obj);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public List subList(int i, int i2) {
        return new C11307zu0(e().subList(i, i2));
    }

    @Override // o.AbstractC9388s1, java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC9388s1, java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator(int i) {
        return new a(e().listIterator(i));
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("List is fixed size");
    }
}
