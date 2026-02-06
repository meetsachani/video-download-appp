package o;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: o.cG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5528cG1<E> extends C7481kG1<E> implements NavigableSet<E> {
    private static final long serialVersionUID = 20150528;

    public C5528cG1(NavigableSet<E> navigableSet, KF1<? super E> kf1) {
        super(navigableSet, kf1);
    }

    public static <E> C5528cG1<E> B(NavigableSet<E> navigableSet, KF1<? super E> kf1) {
        return new C5528cG1<>(navigableSet, kf1);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return p().ceiling(e);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return p().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return B(p().descendingSet(), this.Y);
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return p().floor(e);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return B(p().headSet(e, z), this.Y);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return p().higher(e);
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return p().lower(e);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return p().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return p().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return B(p().subSet(e, z, e2, z2), this.Y);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return B(p().tailSet(e, z), this.Y);
    }

    @Override // o.C7481kG1
    /* renamed from: w */
    public NavigableSet<E> p() {
        return (NavigableSet) super.k();
    }
}
