package o;

import java.util.AbstractCollection;
import java.util.Collection;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.k2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7423k2<E> extends AbstractCollection<E> implements Collection<E>, HW0 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }
}
