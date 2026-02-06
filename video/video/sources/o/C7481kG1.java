package o;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: o.kG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7481kG1<E> extends C6013eG1<E> implements SortedSet<E> {
    private static final long serialVersionUID = -9110948148132275052L;

    public C7481kG1(SortedSet<E> sortedSet, KF1<? super E> kf1) {
        super(sortedSet, kf1);
    }

    public static <E> C7481kG1<E> r(SortedSet<E> sortedSet, KF1<? super E> kf1) {
        return new C7481kG1<>(sortedSet, kf1);
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return k().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return k().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return new C7481kG1(k().headSet(e), this.Y);
    }

    @Override // java.util.SortedSet
    public E last() {
        return k().last();
    }

    @Override // o.C6013eG1
    /* renamed from: p */
    public SortedSet<E> k() {
        return (SortedSet) super.d();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return new C7481kG1(k().subSet(e, e2), this.Y);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return new C7481kG1(k().tailSet(e), this.Y);
    }
}
