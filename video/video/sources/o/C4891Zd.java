package o;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n1740#2,3:527\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:527,3\n*E\n"})
/* renamed from: o.Zd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4891Zd<T> implements Collection<T>, GW0 {
    @NotNull
    public final T[] X;
    public final boolean Y;

    public C4891Zd(@NotNull T[] tArr, boolean z) {
        C6562gT0.p(tArr, androidx.lifecycle.p.g);
        this.X = tArr;
        this.Y = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C7330jf.B8(this.X, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.X.length;
    }

    @NotNull
    public final T[] e() {
        return this.X;
    }

    public final boolean f() {
        return this.Y;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (this.X.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return C9046qe.a(this.X);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(this, tArr);
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return C7979mF.h(this.X, this.Y);
    }
}
