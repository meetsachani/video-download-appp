package o;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: o.p2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8657p2<E> extends AbstractC8417o3<E> implements NavigableSet<E> {
    private static final long serialVersionUID = 20150528;

    public AbstractC8657p2() {
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return h().ceiling(e);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return h().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return h().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return h().floor(e);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return h().headSet(e, z);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return h().higher(e);
    }

    @Override // o.AbstractC8417o3
    /* renamed from: i */
    public NavigableSet<E> h() {
        return (NavigableSet) super.f();
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return h().lower(e);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return h().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return h().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return h().subSet(e, z, e2, z2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return h().tailSet(e, z);
    }

    public AbstractC8657p2(NavigableSet<E> navigableSet) {
        super(navigableSet);
    }
}
