package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n360#2,7:176\n388#2,7:183\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:176,7\n29#1:183,7\n*E\n"})
@InterfaceC6480g82(version = "1.1")
/* renamed from: o.q1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8896q1<E> extends AbstractC7901m0<E> implements List<E>, GW0 {
    @NotNull
    public static final a X = new a(null);
    public static final int Y = 2147483639;

    /* renamed from: o.q1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final void a(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
        }

        public final void b(int i, int i2) {
            if (i >= 0 && i < i2) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }

        public final void c(int i, int i2) {
            if (i >= 0 && i <= i2) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }

        public final void d(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }

        public final int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 > 0) {
                if (i2 <= 2147483639) {
                    return 2147483639;
                }
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public final boolean f(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            C6562gT0.p(collection, "c");
            C6562gT0.p(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C6562gT0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@NotNull Collection<?> collection) {
            int i;
            C6562gT0.p(collection, "c");
            int i2 = 1;
            for (Object obj : collection) {
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }

        public a() {
        }
    }

    /* renamed from: o.q1$b */
    /* loaded from: classes3.dex */
    public class b implements Iterator<E>, GW0 {
        public int X;

        public b() {
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < AbstractC8896q1.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractC8896q1<E> abstractC8896q1 = AbstractC8896q1.this;
                int i = this.X;
                this.X = i + 1;
                return abstractC8896q1.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.q1$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC8896q1<E>.b implements ListIterator<E>, GW0 {
        public c(int i) {
            super();
            AbstractC8896q1.X.c(i, AbstractC8896q1.this.size());
            c(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (b() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractC8896q1<E> abstractC8896q1 = AbstractC8896q1.this;
                c(b() - 1);
                return abstractC8896q1.get(b());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.q1$d */
    /* loaded from: classes3.dex */
    public static final class d<E> extends AbstractC8896q1<E> implements RandomAccess {
        public final int Y0;
        @NotNull
        public final AbstractC8896q1<E> Z;
        public int Z0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull AbstractC8896q1<? extends E> abstractC8896q1, int i, int i2) {
            C6562gT0.p(abstractC8896q1, "list");
            this.Z = abstractC8896q1;
            this.Y0 = i;
            AbstractC8896q1.X.d(i, i2, abstractC8896q1.size());
            this.Z0 = i2 - i;
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return this.Z0;
        }

        @Override // o.AbstractC8896q1, java.util.List
        public E get(int i) {
            AbstractC8896q1.X.b(i, this.Z0);
            return this.Z.get(this.Y0 + i);
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.AbstractC7901m0
    public abstract int e();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return X.f(this, (Collection) obj);
    }

    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return X.g(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (C6562gT0.g(e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C6562gT0.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
