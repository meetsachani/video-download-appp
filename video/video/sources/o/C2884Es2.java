package o;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: o.Es2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2884Es2<E> extends C11058ys2<E> implements SortedSet<E> {
    private static final long serialVersionUID = -1675486811351124386L;

    public C2884Es2(SortedSet<E> sortedSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(sortedSet, interfaceC3287Is2);
    }

    public static <E> C2884Es2<E> r(SortedSet<E> sortedSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C2884Es2<E> c2884Es2 = new C2884Es2<>(sortedSet, interfaceC3287Is2);
        if (sortedSet.size() > 0) {
            Object[] array = sortedSet.toArray();
            sortedSet.clear();
            for (Object obj : array) {
                c2884Es2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c2884Es2;
    }

    public static <E> C2884Es2<E> w(SortedSet<E> sortedSet, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C2884Es2<>(sortedSet, interfaceC3287Is2);
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return p().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return p().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return new C2884Es2(p().headSet(e), this.Y);
    }

    @Override // java.util.SortedSet
    public E last() {
        return p().last();
    }

    public SortedSet<E> p() {
        return (SortedSet) d();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return new C2884Es2(p().subSet(e, e2), this.Y);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return new C2884Es2(p().tailSet(e), this.Y);
    }
}
