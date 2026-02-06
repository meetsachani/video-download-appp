package o;

import java.util.AbstractList;
import java.util.List;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.l2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7666l2<E> extends AbstractList<E> implements List<E>, KW0 {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int d();

    public abstract E e(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return e(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
