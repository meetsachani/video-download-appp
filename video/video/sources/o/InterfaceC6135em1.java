package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.em1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6135em1<E> extends Collection<E> {

    /* renamed from: o.em1$a */
    /* loaded from: classes4.dex */
    public interface a<E> {
        E a();

        boolean equals(Object obj);

        int getCount();

        int hashCode();
    }

    int I(Object obj);

    int R(E e, int i);

    @Override // java.util.Collection, o.InterfaceC6135em1
    boolean add(E e);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<a<E>> entrySet();

    @Override // o.InterfaceC6135em1
    boolean equals(Object obj);

    @Override // o.InterfaceC6135em1
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, o.InterfaceC6135em1
    Iterator<E> iterator();

    @Override // java.util.Collection, o.InterfaceC6135em1
    boolean remove(Object obj);

    @Override // java.util.Collection, o.InterfaceC6135em1
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    @Override // java.util.Collection, o.InterfaceC6135em1
    int size();

    int v(Object obj, int i);

    int x(E e, int i);

    Set<E> y();
}
