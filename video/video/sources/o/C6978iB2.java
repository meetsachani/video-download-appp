package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.iB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6978iB2 extends U2 implements RA2 {
    private static final long serialVersionUID = 6595182819922443652L;

    public C6978iB2(List list) {
        super(list);
    }

    public static List f(List list) {
        if (list instanceof RA2) {
            return list;
        }
        return new C6978iB2(list);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return C5752dB2.b(d().iterator());
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator() {
        return C7219jB2.b(e().listIterator());
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public List subList(int i, int i2) {
        return new C6978iB2(e().subList(i, i2));
    }

    @Override // o.AbstractC9388s1, java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator(int i) {
        return C7219jB2.b(e().listIterator(i));
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }
}
