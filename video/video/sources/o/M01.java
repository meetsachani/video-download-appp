package o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
/* loaded from: classes3.dex */
public final class M01<E> extends AbstractC7666l2<E> implements List<E>, RandomAccess, Serializable, KW0 {
    @NotNull
    public static final b Y0 = new b(null);
    @NotNull
    public static final M01 Z0;
    @NotNull
    public E[] X;
    public int Y;
    public boolean Z;

    /* loaded from: classes3.dex */
    public static final class a<E> extends AbstractC7666l2<E> implements List<E>, RandomAccess, Serializable, KW0 {
        @NotNull
        public E[] X;
        public final int Y;
        @Nullable
        public final a<E> Y0;
        public int Z;
        @NotNull
        public final M01<E> Z0;

        @InterfaceC8303na2({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
        /* renamed from: o.M01$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0203a<E> implements ListIterator<E>, LW0 {
            @NotNull
            public final a<E> X;
            public int Y;
            public int Y0;
            public int Z;

            public C0203a(@NotNull a<E> aVar, int i) {
                C6562gT0.p(aVar, "list");
                this.X = aVar;
                this.Y = i;
                this.Z = -1;
                this.Y0 = ((AbstractList) aVar).modCount;
            }

            private final void b() {
                if (((AbstractList) this.X.Z0).modCount == this.Y0) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public void add(E e) {
                b();
                a<E> aVar = this.X;
                int i = this.Y;
                this.Y = i + 1;
                aVar.add(i, e);
                this.Z = -1;
                this.Y0 = ((AbstractList) this.X).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                if (this.Y < this.X.Z) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                if (this.Y > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                if (this.Y < this.X.Z) {
                    int i = this.Y;
                    this.Y = i + 1;
                    this.Z = i;
                    return (E) this.X.X[this.X.Y + this.Z];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.Y;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i = this.Y;
                if (i > 0) {
                    int i2 = i - 1;
                    this.Y = i2;
                    this.Z = i2;
                    return (E) this.X.X[this.X.Y + this.Z];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.Y - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i = this.Z;
                if (i != -1) {
                    this.X.remove(i);
                    this.Y = this.Z;
                    this.Z = -1;
                    this.Y0 = ((AbstractList) this.X).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            @Override // java.util.ListIterator
            public void set(E e) {
                b();
                int i = this.Z;
                if (i != -1) {
                    this.X.set(i, e);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public a(@NotNull E[] eArr, int i, int i2, @Nullable a<E> aVar, @NotNull M01<E> m01) {
            C6562gT0.p(eArr, "backing");
            C6562gT0.p(m01, "root");
            this.X = eArr;
            this.Y = i;
            this.Z = i2;
            this.Y0 = aVar;
            this.Z0 = m01;
            ((AbstractList) this).modCount = ((AbstractList) m01).modCount;
        }

        private final void F() {
            ((AbstractList) this).modCount++;
        }

        private final Object writeReplace() {
            if (D()) {
                return new C10609x12(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public final boolean B(List<?> list) {
            boolean h;
            h = N01.h(this.X, this.Y, this.Z, list);
            return h;
        }

        public final boolean D() {
            return this.Z0.Z;
        }

        public final E G(int i) {
            E e;
            F();
            a<E> aVar = this.Y0;
            if (aVar == null) {
                e = (E) this.Z0.Q(i);
            } else {
                e = aVar.G(i);
            }
            this.Z--;
            return e;
        }

        public final void H(int i, int i2) {
            if (i2 > 0) {
                F();
            }
            a<E> aVar = this.Y0;
            if (aVar == null) {
                this.Z0.U(i, i2);
            } else {
                aVar.H(i, i2);
            }
            this.Z -= i2;
        }

        public final int J(int i, int i2, Collection<? extends E> collection, boolean z) {
            int X;
            a<E> aVar = this.Y0;
            if (aVar == null) {
                X = this.Z0.X(i, i2, collection, z);
            } else {
                X = aVar.J(i, i2, collection, z);
            }
            if (X > 0) {
                F();
            }
            this.Z -= X;
            return X;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            w();
            r();
            p(this.Y + this.Z, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> collection) {
            C6562gT0.p(collection, "elements");
            w();
            r();
            int size = collection.size();
            l(this.Y + this.Z, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            w();
            r();
            H(this.Y, this.Z);
        }

        @Override // o.AbstractC7666l2
        public int d() {
            r();
            return this.Z;
        }

        @Override // o.AbstractC7666l2
        public E e(int i) {
            w();
            r();
            AbstractC8896q1.X.b(i, this.Z);
            return G(this.Y + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object obj) {
            r();
            if (obj != this) {
                if (!(obj instanceof List) || !B((List) obj)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            r();
            AbstractC8896q1.X.b(i, this.Z);
            return this.X[this.Y + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i;
            r();
            i = N01.i(this.X, this.Y, this.Z);
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            r();
            for (int i = 0; i < this.Z; i++) {
                if (C6562gT0.g(this.X[this.Y + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            r();
            if (this.Z == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void l(int i, Collection<? extends E> collection, int i2) {
            F();
            a<E> aVar = this.Y0;
            if (aVar == null) {
                this.Z0.B(i, collection, i2);
            } else {
                aVar.l(i, collection, i2);
            }
            this.X = (E[]) this.Z0.X;
            this.Z += i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            r();
            for (int i = this.Z - 1; i >= 0; i--) {
                if (C6562gT0.g(this.X[this.Y + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final void p(int i, E e) {
            F();
            a<E> aVar = this.Y0;
            if (aVar == null) {
                this.Z0.D(i, e);
            } else {
                aVar.p(i, e);
            }
            this.X = (E[]) this.Z0.X;
            this.Z++;
        }

        public final void r() {
            if (((AbstractList) this.Z0).modCount == ((AbstractList) this).modCount) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            w();
            r();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            if (indexOf >= 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> collection) {
            C6562gT0.p(collection, "elements");
            w();
            r();
            if (J(this.Y, this.Z, collection, false) <= 0) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> collection) {
            C6562gT0.p(collection, "elements");
            w();
            r();
            if (J(this.Y, this.Z, collection, true) > 0) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            w();
            r();
            AbstractC8896q1.X.b(i, this.Z);
            E[] eArr = this.X;
            int i2 = this.Y;
            E e2 = eArr[i2 + i];
            eArr[i2 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int i, int i2) {
            AbstractC8896q1.X.d(i, i2, this.Z);
            return new a(this.X, this.Y + i, i2 - i, this, this.Z0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] tArr) {
            C6562gT0.p(tArr, "array");
            r();
            int length = tArr.length;
            int i = this.Z;
            if (length < i) {
                E[] eArr = this.X;
                int i2 = this.Y;
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                C6562gT0.o(tArr2, "copyOfRange(...)");
                return tArr2;
            }
            E[] eArr2 = this.X;
            int i3 = this.Y;
            C4788Ye.B0(eArr2, tArr, 0, i3, i + i3);
            return (T[]) C7979mF.n(this.Z, tArr);
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            String j;
            r();
            j = N01.j(this.X, this.Y, this.Z, this);
            return j;
        }

        public final void w() {
            if (!D()) {
                return;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int i) {
            r();
            AbstractC8896q1.X.c(i, this.Z);
            return new C0203a(this, i);
        }

        @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            w();
            r();
            AbstractC8896q1.X.c(i, this.Z);
            p(this.Y + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
            C6562gT0.p(collection, "elements");
            w();
            r();
            AbstractC8896q1.X.c(i, this.Z);
            int size = collection.size();
            l(this.Y + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            r();
            E[] eArr = this.X;
            int i = this.Y;
            return C4788Ye.l1(eArr, i, this.Z + i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    @InterfaceC8303na2({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c<E> implements ListIterator<E>, LW0 {
        @NotNull
        public final M01<E> X;
        public int Y;
        public int Y0;
        public int Z;

        public c(@NotNull M01<E> m01, int i) {
            C6562gT0.p(m01, "list");
            this.X = m01;
            this.Y = i;
            this.Z = -1;
            this.Y0 = ((AbstractList) m01).modCount;
        }

        private final void b() {
            if (((AbstractList) this.X).modCount == this.Y0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            b();
            M01<E> m01 = this.X;
            int i = this.Y;
            this.Y = i + 1;
            m01.add(i, e);
            this.Z = -1;
            this.Y0 = ((AbstractList) this.X).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.Y) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.Y > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.Y < this.X.Y) {
                int i = this.Y;
                this.Y = i + 1;
                this.Z = i;
                return (E) this.X.X[this.Z];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Y;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i = this.Y;
            if (i > 0) {
                int i2 = i - 1;
                this.Y = i2;
                this.Z = i2;
                return (E) this.X.X[this.Z];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.Y - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i = this.Z;
            if (i != -1) {
                this.X.remove(i);
                this.Y = this.Z;
                this.Z = -1;
                this.Y0 = ((AbstractList) this.X).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            b();
            int i = this.Z;
            if (i != -1) {
                this.X.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        M01 m01 = new M01(0);
        m01.Z = true;
        Z0 = m01;
    }

    public M01() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i, Collection<? extends E> collection, int i2) {
        M();
        L(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.X[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i, E e) {
        M();
        L(i, 1);
        this.X[i] = e;
    }

    private final void G() {
        if (!this.Z) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean H(List<?> list) {
        boolean h;
        h = N01.h(this.X, 0, this.Y, list);
        return h;
    }

    private final void M() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E Q(int i) {
        M();
        E[] eArr = this.X;
        E e = eArr[i];
        C4788Ye.B0(eArr, eArr, i, i + 1, this.Y);
        N01.f(this.X, this.Y - 1);
        this.Y--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i, int i2) {
        if (i2 > 0) {
            M();
        }
        E[] eArr = this.X;
        C4788Ye.B0(eArr, eArr, i, i + i2, this.Y);
        E[] eArr2 = this.X;
        int i3 = this.Y;
        N01.g(eArr2, i3 - i2, i3);
        this.Y -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.X[i5]) == z) {
                E[] eArr = this.X;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.X;
        C4788Ye.B0(eArr2, eArr2, i + i4, i2 + i, this.Y);
        E[] eArr3 = this.X;
        int i7 = this.Y;
        N01.g(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            M();
        }
        this.Y -= i6;
        return i6;
    }

    private final Object writeReplace() {
        if (this.Z) {
            return new C10609x12(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @NotNull
    public final List<E> F() {
        G();
        this.Z = true;
        if (this.Y > 0) {
            return this;
        }
        return Z0;
    }

    public final void J(int i) {
        if (i >= 0) {
            E[] eArr = this.X;
            if (i > eArr.length) {
                this.X = (E[]) N01.e(this.X, AbstractC8896q1.X.e(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void K(int i) {
        J(this.Y + i);
    }

    public final void L(int i, int i2) {
        K(i2);
        E[] eArr = this.X;
        C4788Ye.B0(eArr, eArr, i + i2, i, this.Y);
        this.Y += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        G();
        D(this.Y, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        G();
        int size = collection.size();
        B(this.Y, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        G();
        U(0, this.Y);
    }

    @Override // o.AbstractC7666l2
    public int d() {
        return this.Y;
    }

    @Override // o.AbstractC7666l2
    public E e(int i) {
        G();
        AbstractC8896q1.X.b(i, this.Y);
        return Q(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (!(obj instanceof List) || !H((List) obj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC8896q1.X.b(i, this.Y);
        return this.X[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = N01.i(this.X, 0, this.Y);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.Y; i++) {
            if (C6562gT0.g(this.X[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.Y - 1; i >= 0; i--) {
            if (C6562gT0.g(this.X[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        G();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        G();
        if (X(0, this.Y, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        G();
        if (X(0, this.Y, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        G();
        AbstractC8896q1.X.b(i, this.Y);
        E[] eArr = this.X;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        AbstractC8896q1.X.d(i, i2, this.Y);
        return new a(this.X, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        int length = tArr.length;
        int i = this.Y;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.X, 0, i, tArr.getClass());
            C6562gT0.o(tArr2, "copyOfRange(...)");
            return tArr2;
        }
        C4788Ye.B0(this.X, tArr, 0, 0, i);
        return (T[]) C7979mF.n(this.Y, tArr);
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String j;
        j = N01.j(this.X, 0, this.Y, this);
        return j;
    }

    public M01(int i) {
        this.X = (E[]) N01.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        AbstractC8896q1.X.c(i, this.Y);
        return new c(this, i);
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        G();
        AbstractC8896q1.X.c(i, this.Y);
        D(i, e);
    }

    public /* synthetic */ M01(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        G();
        AbstractC8896q1.X.c(i, this.Y);
        int size = collection.size();
        B(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return C4788Ye.l1(this.X, 0, this.Y);
    }
}
