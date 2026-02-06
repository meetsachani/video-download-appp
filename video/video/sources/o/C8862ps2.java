package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.ps2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8862ps2<E> extends C7871ls2<E> implements List<E> {
    private static final long serialVersionUID = 1077193035000013141L;

    /* renamed from: o.ps2$a */
    /* loaded from: classes4.dex */
    public class a extends C9631t1<E> {
        public a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void add(E e) {
            b().add((E) C8862ps2.this.f(e));
        }

        @Override // o.C9631t1, java.util.ListIterator
        public void set(E e) {
            b().set((E) C8862ps2.this.f(e));
        }
    }

    public C8862ps2(List<E> list, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(list, interfaceC3287Is2);
    }

    public static <E> C8862ps2<E> r(List<E> list, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C8862ps2<E> c8862ps2 = new C8862ps2<>(list, interfaceC3287Is2);
        if (list.size() > 0) {
            Object[] array = list.toArray();
            list.clear();
            for (Object obj : array) {
                c8862ps2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c8862ps2;
    }

    public static <E> C8862ps2<E> w(List<E> list, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C8862ps2<>(list, interfaceC3287Is2);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        p().add(i, f(e));
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return p().addAll(i, h(collection));
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
        return p().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return p().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return p().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public List<E> p() {
        return (List) d();
    }

    @Override // java.util.List
    public E remove(int i) {
        return p().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return p().set(i, f(e));
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new C8862ps2(p().subList(i, i2), this.Y);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new a(p().listIterator(i));
    }
}
