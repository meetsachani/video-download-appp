package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Ya0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4773Ya0 implements List, Serializable, RandomAccess, GW0 {
    @NotNull
    public static final C4773Ya0 X = new C4773Ya0();
    private static final long serialVersionUID = -7390468764508069838L;

    private final Object readResolve() {
        return X;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return f((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        C6562gT0.p(collection, "elements");
        return collection.isEmpty();
    }

    public void d(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean e(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean f(@NotNull Void r2) {
        C6562gT0.p(r2, "element");
        return false;
    }

    @Override // java.util.List
    @NotNull
    /* renamed from: h */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int i() {
        return 0;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return j((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return C4676Xa0.X;
    }

    public int j(@NotNull Void r2) {
        C6562gT0.p(r2, "element");
        return -1;
    }

    public int k(@NotNull Void r2) {
        C6562gT0.p(r2, "element");
        return -1;
    }

    public Void l(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return k((Void) obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator() {
        return C4676Xa0.X;
    }

    public Void p(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    @NotNull
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C6250fF.a(this);
    }

    @NotNull
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C4676Xa0.X;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(this, tArr);
    }
}
