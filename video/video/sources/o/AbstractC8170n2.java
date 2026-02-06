package o;

import java.util.AbstractSet;
import java.util.Set;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.n2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8170n2<E> extends AbstractSet<E> implements Set<E>, RW0 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
