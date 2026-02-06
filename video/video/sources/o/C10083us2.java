package o;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: o.us2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10083us2<E> extends C2884Es2<E> implements NavigableSet<E> {
    private static final long serialVersionUID = 20150528;

    public C10083us2(NavigableSet<E> navigableSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(navigableSet, interfaceC3287Is2);
    }

    public static <E> C10083us2<E> D(NavigableSet<E> navigableSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C10083us2<E> c10083us2 = new C10083us2<>(navigableSet, interfaceC3287Is2);
        if (navigableSet.size() > 0) {
            Object[] array = navigableSet.toArray();
            navigableSet.clear();
            for (Object obj : array) {
                c10083us2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c10083us2;
    }

    public static <E> C10083us2<E> F(NavigableSet<E> navigableSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C10083us2<>(navigableSet, interfaceC3287Is2);
    }

    @Override // o.AbstractC8162n0
    /* renamed from: B */
    public NavigableSet<E> d() {
        return (NavigableSet) super.d();
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return d().ceiling(e);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return d().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return F(d().descendingSet(), this.Y);
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return d().floor(e);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return F(d().headSet(e, z), this.Y);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return d().higher(e);
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return d().lower(e);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return d().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return d().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return F(d().subSet(e, z, e2, z2), this.Y);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return F(d().tailSet(e, z), this.Y);
    }
}
