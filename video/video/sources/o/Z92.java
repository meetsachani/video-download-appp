package o;

import java.util.Comparator;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class Z92 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return AbstractC10587ww1.z();
        }
        return comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C10664xF1.E(comparator);
        C10664xF1.E(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (iterable instanceof Y92) {
            comparator2 = ((Y92) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
