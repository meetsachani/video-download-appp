package o;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.x20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10611x20<E> extends AbstractC10942yO0<E> {
    public final AbstractC10942yO0<E> c1;

    public C10611x20(AbstractC10942yO0<E> abstractC10942yO0) {
        super(AbstractC10587ww1.h(abstractC10942yO0.comparator()).E());
        this.c1 = abstractC10942yO0;
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0("NavigableSet")
    /* renamed from: B0 */
    public AbstractC6237fB2<E> descendingIterator() {
        return this.c1.iterator();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0("NavigableSet")
    /* renamed from: C0 */
    public AbstractC10942yO0<E> descendingSet() {
        return this.c1;
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> H0(E e, boolean z) {
        return this.c1.tailSet(e, z).descendingSet();
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> Y0(E e, boolean z, E e2, boolean z2) {
        return this.c1.subSet(e2, z2, e, z).descendingSet();
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> b1(E e, boolean z) {
        return this.c1.headSet(e, z).descendingSet();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E ceiling(E e) {
        return this.c1.floor(e);
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return this.c1.contains(obj);
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E floor(E e) {
        return this.c1.ceiling(e);
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E higher(E e) {
        return this.c1.lower(e);
    }

    @Override // o.AbstractC10942yO0
    public int indexOf(@MB Object obj) {
        int indexOf = this.c1.indexOf(obj);
        if (indexOf == -1) {
            return indexOf;
        }
        return (size() - 1) - indexOf;
    }

    @Override // o.TN0
    public boolean j() {
        return this.c1.j();
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return this.c1.descendingIterator();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E lower(E e) {
        return this.c1.higher(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.c1.size();
    }

    @Override // o.AbstractC10942yO0
    @InterfaceC11149zF0("NavigableSet")
    public AbstractC10942yO0<E> z0() {
        throw new AssertionError("should never be called");
    }
}
