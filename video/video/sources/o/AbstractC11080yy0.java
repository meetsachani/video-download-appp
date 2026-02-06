package o;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import o.C10856y22;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.yy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11080yy0<E> extends AbstractC3305Iy0<E> implements NavigableSet<E> {

    @InterfaceC4238Sm
    /* renamed from: o.yy0$a */
    /* loaded from: classes3.dex */
    public class a extends C10856y22.g<E> {
        public a(AbstractC11080yy0 abstractC11080yy0) {
            super(abstractC11080yy0);
        }
    }

    @Override // o.AbstractC3305Iy0
    public SortedSet<E> c6(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        return subSet(e, true, e2, false);
    }

    @MB
    public E ceiling(@InterfaceC7894ly1 E e) {
        return b6().ceiling(e);
    }

    @Override // o.AbstractC3305Iy0
    /* renamed from: d6 */
    public abstract NavigableSet<E> b6();

    public Iterator<E> descendingIterator() {
        return b6().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return b6().descendingSet();
    }

    @MB
    public E e6(@InterfaceC7894ly1 E e) {
        return (E) C7052iU0.J(tailSet(e, true).iterator(), null);
    }

    @InterfaceC7894ly1
    public E f6() {
        return iterator().next();
    }

    @MB
    public E floor(@InterfaceC7894ly1 E e) {
        return b6().floor(e);
    }

    @MB
    public E g6(@InterfaceC7894ly1 E e) {
        return (E) C7052iU0.J(headSet(e, true).descendingIterator(), null);
    }

    public SortedSet<E> h6(@InterfaceC7894ly1 E e) {
        return headSet(e, false);
    }

    public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
        return b6().headSet(e, z);
    }

    @MB
    public E higher(@InterfaceC7894ly1 E e) {
        return b6().higher(e);
    }

    @MB
    public E i6(@InterfaceC7894ly1 E e) {
        return (E) C7052iU0.J(tailSet(e, false).iterator(), null);
    }

    @InterfaceC7894ly1
    public E j6() {
        return descendingIterator().next();
    }

    @MB
    public E k6(@InterfaceC7894ly1 E e) {
        return (E) C7052iU0.J(headSet(e, false).descendingIterator(), null);
    }

    @MB
    public E l6() {
        return (E) C7052iU0.U(iterator());
    }

    @MB
    public E lower(@InterfaceC7894ly1 E e) {
        return b6().lower(e);
    }

    @MB
    public E m6() {
        return (E) C7052iU0.U(descendingIterator());
    }

    @InterfaceC4238Sm
    public NavigableSet<E> n6(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
        return tailSet(e, z).headSet(e2, z2);
    }

    public SortedSet<E> o6(@InterfaceC7894ly1 E e) {
        return tailSet(e, true);
    }

    @MB
    public E pollFirst() {
        return b6().pollFirst();
    }

    @MB
    public E pollLast() {
        return b6().pollLast();
    }

    public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
        return b6().subSet(e, z, e2, z2);
    }

    public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
        return b6().tailSet(e, z);
    }
}
