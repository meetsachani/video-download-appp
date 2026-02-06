package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.nb0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8305nb0 implements Set, Serializable, GW0 {
    @NotNull
    public static final C8305nb0 X = new C8305nb0();
    private static final long serialVersionUID = 3406603774387020532L;

    private final Object readResolve() {
        return X;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return e((Void) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        C6562gT0.p(collection, "elements");
        return collection.isEmpty();
    }

    public boolean d(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean e(@NotNull Void r2) {
        C6562gT0.p(r2, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof Set) && ((Set) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    public int f() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return C4676Xa0.X;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C6250fF.a(this);
    }

    @NotNull
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(this, tArr);
    }
}
