package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.Gk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3056Gk extends Collection {
    int I(Object obj);

    @Override // java.util.Collection
    boolean add(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    @Override // java.util.Collection, java.lang.Iterable
    Iterator iterator();

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection collection);

    @Override // java.util.Collection
    boolean retainAll(Collection collection);

    @Override // java.util.Collection
    int size();

    boolean v(Object obj, int i);

    boolean x(Object obj, int i);

    Set y();
}
