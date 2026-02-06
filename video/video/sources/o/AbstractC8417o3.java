package o;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: o.o3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8417o3<E> extends Z2<E> implements SortedSet<E> {
    private static final long serialVersionUID = -3462240946294214398L;

    public AbstractC8417o3() {
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return f().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return f().first();
    }

    @Override // o.Z2
    /* renamed from: h */
    public SortedSet<E> f() {
        return (SortedSet) super.d();
    }

    public SortedSet<E> headSet(E e) {
        return f().headSet(e);
    }

    @Override // java.util.SortedSet
    public E last() {
        return f().last();
    }

    public SortedSet<E> subSet(E e, E e2) {
        return f().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return f().tailSet(e);
    }

    public AbstractC8417o3(Set<E> set) {
        super(set);
    }
}
