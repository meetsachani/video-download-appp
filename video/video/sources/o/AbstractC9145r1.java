package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.r1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9145r1<E> extends AbstractC8162n0<E> implements List<E> {
    private static final long serialVersionUID = 4500739654952315623L;

    public AbstractC9145r1() {
    }

    public void add(int i, E e) {
        d().add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return d().addAll(i, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public List<E> d() {
        return (List) super.d();
    }

    public E get(int i) {
        return d().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return d().hashCode();
    }

    public int indexOf(Object obj) {
        return d().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return d().lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return d().listIterator();
    }

    public E remove(int i) {
        return d().remove(i);
    }

    public E set(int i, E e) {
        return d().set(i, e);
    }

    public List<E> subList(int i, int i2) {
        return d().subList(i, i2);
    }

    public AbstractC9145r1(List<E> list) {
        super(list);
    }

    public ListIterator<E> listIterator(int i) {
        return d().listIterator(i);
    }
}
