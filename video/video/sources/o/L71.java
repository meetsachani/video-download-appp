package o;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class L71<V> extends AbstractC7423k2<V> implements Collection<V>, HW0 {
    @NotNull
    public final H71<?, V> X;

    public L71(@NotNull H71<?, V> h71) {
        C6562gT0.p(h71, "backing");
        this.X = h71;
    }

    @Override // o.AbstractC7423k2, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> collection) {
        C6562gT0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // o.AbstractC7423k2
    public int d() {
        return this.X.size();
    }

    @NotNull
    public final H71<?, V> e() {
        return this.X;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return this.X.X();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.X.T(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.retainAll(collection);
    }
}
