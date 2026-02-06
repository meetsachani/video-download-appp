package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class YF1<E> extends VF1<E> implements List<E> {
    private static final long serialVersionUID = -5722039223898659102L;

    /* loaded from: classes4.dex */
    public class a extends C9631t1<E> {
        public a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void add(E e) {
            YF1.this.j(e);
            b().add(e);
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void set(E e) {
            YF1.this.j(e);
            b().set(e);
        }
    }

    public YF1(List<E> list, KF1<? super E> kf1) {
        super(list, kf1);
    }

    public static <T> YF1<T> r(List<T> list, KF1<? super T> kf1) {
        return new YF1<>(list, kf1);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        j(e);
        d().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        for (E e : collection) {
            j(e);
        }
        return d().addAll(i, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public E get(int i) {
        return d().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC8162n0
    /* renamed from: p */
    public List<E> d() {
        return (List) super.d();
    }

    @Override // java.util.List
    public E remove(int i) {
        return d().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        j(e);
        return d().set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new YF1(d().subList(i, i2), this.Y);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new a(d().listIterator(i));
    }
}
