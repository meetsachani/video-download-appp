package o;

import java.util.Comparator;
import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.nH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8230nH {
    public static <T> boolean a(Iterable<? extends T> iterable, Comparator<T> comparator) {
        C10664xF1.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public static <T> boolean b(Iterable<? extends T> iterable, Comparator<T> comparator) {
        C10664xF1.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public static <T, S extends T> Comparator<Iterable<S>> c(Comparator<T> comparator) {
        return new C10981yZ0((Comparator) C10664xF1.E(comparator));
    }

    public static <T extends Comparable<? super T>> T d(T t, T t2) {
        if (t.compareTo(t2) >= 0) {
            return t;
        }
        return t2;
    }

    @InterfaceC7894ly1
    public static <T> T e(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2, Comparator<T> comparator) {
        if (comparator.compare(t, t2) >= 0) {
            return t;
        }
        return t2;
    }

    public static <T extends Comparable<? super T>> T f(T t, T t2) {
        if (t.compareTo(t2) <= 0) {
            return t;
        }
        return t2;
    }

    @InterfaceC7894ly1
    public static <T> T g(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2, Comparator<T> comparator) {
        if (comparator.compare(t, t2) <= 0) {
            return t;
        }
        return t2;
    }
}
