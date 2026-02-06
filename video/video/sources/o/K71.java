package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class K71<E> extends AbstractC8170n2<E> implements Set<E>, RW0 {
    @NotNull
    public final H71<E, ?> X;

    public K71(@NotNull H71<E, ?> h71) {
        C6562gT0.p(h71, "backing");
        this.X = h71;
    }

    @Override // o.AbstractC8170n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // o.AbstractC8170n2
    public int d() {
        return this.X.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.X.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.X.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.retainAll(collection);
    }
}
