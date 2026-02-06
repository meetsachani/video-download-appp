package o;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import o.C7935m81;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Gy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3109Gy0<K, V> extends AbstractC9862ty0<K, V> implements SortedMap<K, V> {

    @InterfaceC4238Sm
    /* renamed from: o.Gy0$a */
    /* loaded from: classes3.dex */
    public class a extends C7935m81.G<K, V> {
        public a(AbstractC3109Gy0 abstractC3109Gy0) {
            super(abstractC3109Gy0);
        }
    }

    public static int Y5(@MB Comparator<?> comparator, @MB Object obj, @MB Object obj2) {
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9862ty0
    @InterfaceC4238Sm
    public boolean O5(@MB Object obj) {
        try {
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
        if (Y5(comparator(), tailMap(obj).firstKey(), obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC9862ty0
    /* renamed from: W5 */
    public abstract SortedMap<K, V> M5();

    @InterfaceC4238Sm
    public SortedMap<K, V> X5(K k, K k2) {
        boolean z;
        if (Y5(comparator(), k, k2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    @Override // java.util.SortedMap
    @MB
    public Comparator<? super K> comparator() {
        return M5().comparator();
    }

    @Override // java.util.SortedMap
    @InterfaceC7894ly1
    public K firstKey() {
        return M5().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
        return M5().headMap(k);
    }

    @Override // java.util.SortedMap
    @InterfaceC7894ly1
    public K lastKey() {
        return M5().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
        return M5().subMap(k, k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
        return M5().tailMap(k);
    }
}
