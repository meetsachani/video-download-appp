package o;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1761#2,3:51\n1740#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
@InterfaceC6480g82(version = "1.1")
/* renamed from: o.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7901m0<E> implements Collection<E>, GW0 {
    public static final CharSequence f(AbstractC7901m0 abstractC7901m0, Object obj) {
        if (obj == abstractC7901m0) {
            return "(this Collection)";
        }
        return String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (E e : this) {
            if (C6562gT0.g(e, obj)) {
                return true;
            }
        }
        return false;
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

    public abstract int e();

    @Override // java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public abstract Iterator<E> iterator();

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
        return e();
    }

    @Override // java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return C6250fF.a(this);
    }

    @NotNull
    public String toString() {
        return C10662xF.p3(this, C6566gU0.h, C6566gU0.f, C6566gU0.g, 0, null, new HA0() { // from class: o.l0
            {
                AbstractC7901m0.this = this;
            }

            @Override // o.HA0
            public final Object invoke(Object obj) {
                CharSequence f;
                f = AbstractC7901m0.f(AbstractC7901m0.this, obj);
                return f;
            }
        }, 24, null);
    }

    @Override // java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(this, tArr);
    }
}
