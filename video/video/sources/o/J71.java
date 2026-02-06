package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class J71<K, V> extends H1<Map.Entry<K, V>, K, V> {
    @NotNull
    public final H71<K, V> X;

    public J71(@NotNull H71<K, V> h71) {
        C6562gT0.p(h71, "backing");
        this.X = h71;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        C6562gT0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        return this.X.r(collection);
    }

    @Override // o.AbstractC8170n2
    public int d() {
        return this.X.size();
    }

    @Override // o.H1
    public boolean f(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, "element");
        return this.X.t(entry);
    }

    @Override // o.H1
    public boolean h(@NotNull Map.Entry<K, V> entry) {
        C6562gT0.p(entry, "element");
        return this.X.P(entry);
    }

    @Override // o.AbstractC8170n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        C6562gT0.p(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.X.x();
    }

    @NotNull
    public final H71<K, V> j() {
        return this.X;
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
