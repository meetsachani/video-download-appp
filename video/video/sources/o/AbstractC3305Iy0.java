package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Iy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3305Iy0<E> extends AbstractC2804Dy0<E> implements SortedSet<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC4473Ux0
    @InterfaceC4238Sm
    public boolean P5(@MB Object obj) {
        try {
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
        if (AbstractC3109Gy0.Y5(comparator(), tailSet(obj).first(), obj) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC4473Ux0
    @InterfaceC4238Sm
    public boolean S5(@MB Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (AbstractC3109Gy0.Y5(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // o.AbstractC2804Dy0
    /* renamed from: b6 */
    public abstract SortedSet<E> Y5();

    @InterfaceC4238Sm
    public SortedSet<E> c6(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        return tailSet(e).headSet(e2);
    }

    @Override // java.util.SortedSet
    @MB
    public Comparator<? super E> comparator() {
        return Y5().comparator();
    }

    @Override // java.util.SortedSet
    @InterfaceC7894ly1
    public E first() {
        return Y5().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
        return Y5().headSet(e);
    }

    @Override // java.util.SortedSet
    @InterfaceC7894ly1
    public E last() {
        return Y5().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        return Y5().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
        return Y5().tailSet(e);
    }
}
