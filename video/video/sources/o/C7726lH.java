package o;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: o.lH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7726lH {
    public static final Comparator a = VG.a();

    public static Comparator<Boolean> a(boolean z) {
        return C3366Jo.a(z);
    }

    public static <E> Comparator<E> b(Collection<Comparator<E>> collection) {
        return c((Comparator[]) collection.toArray(new Comparator[collection.size()]));
    }

    public static <E> Comparator<E> c(Comparator<E>... comparatorArr) {
        C6756hH c6756hH = new C6756hH();
        for (Comparator<E> comparator : comparatorArr) {
            if (comparator != null) {
                c6756hH.a(comparator);
            } else {
                throw new NullPointerException("Comparator cannot be null");
            }
        }
        return c6756hH;
    }

    public static <E> E d(E e, E e2, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = a;
        }
        if (comparator.compare(e, e2) > 0) {
            return e;
        }
        return e2;
    }

    public static <E> E e(E e, E e2, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = a;
        }
        if (comparator.compare(e, e2) < 0) {
            return e;
        }
        return e2;
    }

    public static <E extends Comparable<? super E>> Comparator<E> f() {
        return a;
    }

    public static <E> Comparator<E> g(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = a;
        }
        return new C5432bs1(comparator, true);
    }

    public static <E> Comparator<E> h(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = a;
        }
        return new C5432bs1(comparator, false);
    }

    public static <E> Comparator<E> i(Comparator<E> comparator) {
        return new C11210zU1(comparator);
    }

    public static <I, O> Comparator<I> j(Comparator<O> comparator, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        if (comparator == null) {
            comparator = a;
        }
        return new C4068Qs2(interfaceC3287Is2, comparator);
    }
}
