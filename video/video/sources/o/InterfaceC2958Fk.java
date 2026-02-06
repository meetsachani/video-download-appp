package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.Fk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2958Fk<E> extends Collection<E> {
    int I(Object obj);

    @Override // java.util.Collection
    boolean add(E e);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    @Override // java.util.Collection
    int size();

    boolean v(Object obj, int i);

    boolean x(E e, int i);

    Set<E> y();
}
