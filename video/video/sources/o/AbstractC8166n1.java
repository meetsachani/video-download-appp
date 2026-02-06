package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* renamed from: o.n1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8166n1<E> implements List<E> {
    public transient d<E> X;
    public transient int Y;
    public transient int Z;

    /* renamed from: o.n1$a */
    /* loaded from: classes4.dex */
    public static class a<E> implements ListIterator<E>, InterfaceC8877pw1<E> {
        public final AbstractC8166n1<E> X;
        public d<E> Y;
        public d<E> Y0;
        public int Z;
        public int Z0;

        public a(AbstractC8166n1<E> abstractC8166n1, int i) throws IndexOutOfBoundsException {
            this.X = abstractC8166n1;
            this.Z0 = abstractC8166n1.Z;
            this.Y = abstractC8166n1.B(i, true);
            this.Z = i;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            b();
            this.X.i(this.Y, e);
            this.Y0 = null;
            this.Z++;
            this.Z0++;
        }

        public void b() {
            if (this.X.Z == this.Z0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public d<E> c() throws IllegalStateException {
            d<E> dVar = this.Y0;
            if (dVar != null) {
                return dVar;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.Y != this.X.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            if (this.Y.a != this.X.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (hasNext()) {
                E c = this.Y.c();
                d<E> dVar = this.Y;
                this.Y0 = dVar;
                this.Y = dVar.b;
                this.Z++;
                return c;
            }
            throw new NoSuchElementException("No element at index " + this.Z + UE.h);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Z;
        }

        @Override // java.util.ListIterator, o.InterfaceC8877pw1
        public E previous() {
            b();
            if (hasPrevious()) {
                d<E> dVar = this.Y.a;
                this.Y = dVar;
                E c = dVar.c();
                this.Y0 = this.Y;
                this.Z--;
                return c;
            }
            throw new NoSuchElementException("Already at start of list.");
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return nextIndex() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            d<E> dVar = this.Y0;
            d<E> dVar2 = this.Y;
            if (dVar == dVar2) {
                this.Y = dVar2.b;
                this.X.H(c());
            } else {
                this.X.H(c());
                this.Z--;
            }
            this.Y0 = null;
            this.Z0++;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            b();
            c().f(e);
        }
    }

    /* renamed from: o.n1$b */
    /* loaded from: classes4.dex */
    public static class b<E> extends AbstractList<E> {
        public AbstractC8166n1<E> X;
        public int Y;
        public int Y0;
        public int Z;

        public b(AbstractC8166n1<E> abstractC8166n1, int i, int i2) {
            if (i >= 0) {
                if (i2 <= abstractC8166n1.size()) {
                    if (i <= i2) {
                        this.X = abstractC8166n1;
                        this.Y = i;
                        this.Z = i2 - i;
                        this.Y0 = abstractC8166n1.Z;
                        return;
                    }
                    throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + C9811tl1.d);
                }
                throw new IndexOutOfBoundsException("toIndex = " + i2);
            }
            throw new IndexOutOfBoundsException("fromIndex = " + i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            e(i, this.Z + 1);
            d();
            this.X.add(i + this.Y, e);
            this.Y0 = this.X.Z;
            this.Z++;
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            return addAll(this.Z, collection);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            d();
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        public void d() {
            if (this.X.Z == this.Y0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public void e(int i, int i2) {
            if (i >= 0 && i < i2) {
                return;
            }
            throw new IndexOutOfBoundsException("Index '" + i + "' out of bounds for size '" + this.Z + "'");
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            e(i, this.Z);
            d();
            return this.X.get(i + this.Y);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            d();
            return this.X.l(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            e(i, this.Z + 1);
            d();
            return this.X.p(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i) {
            e(i, this.Z);
            d();
            E remove = this.X.remove(i + this.Y);
            this.Y0 = this.X.Z;
            this.Z--;
            ((AbstractList) this).modCount++;
            return remove;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            e(i, this.Z);
            d();
            return this.X.set(i + this.Y, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            d();
            return this.Z;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            AbstractC8166n1<E> abstractC8166n1 = this.X;
            int i3 = this.Y;
            return new b(abstractC8166n1, i + i3, i2 + i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            e(i, this.Z + 1);
            int size = collection.size();
            if (size == 0) {
                return false;
            }
            d();
            this.X.addAll(this.Y + i, collection);
            this.Y0 = this.X.Z;
            this.Z += size;
            ((AbstractList) this).modCount++;
            return true;
        }
    }

    /* renamed from: o.n1$c */
    /* loaded from: classes4.dex */
    public static class c<E> extends a<E> {
        public final b<E> a1;

        public c(b<E> bVar, int i) {
            super(bVar.X, i + bVar.Y);
            this.a1 = bVar;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public void add(E e) {
            super.add(e);
            b<E> bVar = this.a1;
            bVar.Y0 = this.X.Z;
            bVar.Z++;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (nextIndex() < this.a1.Z) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            if (previousIndex() >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.a1.Y;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            b<E> bVar;
            super.remove();
            this.a1.Y0 = this.X.Z;
            bVar.Z--;
        }
    }

    public AbstractC8166n1() {
    }

    public d<E> B(int i, boolean z) throws IndexOutOfBoundsException {
        if (i >= 0) {
            if (!z && i == this.Y) {
                throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i + ") is the size of the list.");
            }
            int i2 = this.Y;
            if (i <= i2) {
                if (i < i2 / 2) {
                    d<E> dVar = this.X.b;
                    for (int i3 = 0; i3 < i; i3++) {
                        dVar = dVar.b;
                    }
                    return dVar;
                }
                d<E> dVar2 = this.X;
                while (i2 > i) {
                    dVar2 = dVar2.a;
                    i2--;
                }
                return dVar2;
            }
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i + ") greater than the size of the list (" + this.Y + ").");
        }
        throw new IndexOutOfBoundsException("Couldn't get the node: index (" + i + ") less than zero.");
    }

    public void D() {
        this.X = j();
    }

    public boolean F(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void G() {
        d<E> dVar = this.X;
        dVar.b = dVar;
        dVar.a = dVar;
        this.Y = 0;
        this.Z++;
    }

    public void H(d<E> dVar) {
        d<E> dVar2 = dVar.a;
        dVar2.b = dVar.b;
        dVar.b.a = dVar2;
        this.Y--;
        this.Z++;
    }

    public void J(d<E> dVar, E e) {
        dVar.f(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        e(e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return addAll(this.Y, collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        G();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean d(E e) {
        h(this.X, e);
        return true;
    }

    public boolean e(E e) {
        i(this.X, e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != size()) {
            return false;
        }
        ListIterator<E> listIterator = listIterator();
        ListIterator<E> listIterator2 = list.listIterator();
        while (listIterator.hasNext() && listIterator2.hasNext()) {
            E next = listIterator.next();
            E next2 = listIterator2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        if (!listIterator.hasNext() && !listIterator2.hasNext()) {
            return true;
        }
        return false;
    }

    public void f(d<E> dVar, d<E> dVar2) {
        dVar.b = dVar2;
        dVar.a = dVar2.a;
        dVar2.a.b = dVar;
        dVar2.a = dVar;
        this.Y++;
        this.Z++;
    }

    @Override // java.util.List
    public E get(int i) {
        return B(i, false).c();
    }

    public E getFirst() {
        d<E> dVar = this.X;
        d<E> dVar2 = dVar.b;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    public E getLast() {
        d<E> dVar = this.X;
        d<E> dVar2 = dVar.a;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    public void h(d<E> dVar, E e) {
        f(k(e), dVar.b);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int hashCode;
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            E next = it.next();
            int i2 = i * 31;
            if (next == null) {
                hashCode = 0;
            } else {
                hashCode = next.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public void i(d<E> dVar, E e) {
        f(k(e), dVar);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        for (d<E> dVar = this.X.b; dVar != this.X; dVar = dVar.b) {
            if (F(dVar.c(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    public d<E> j() {
        return new d<>();
    }

    public d<E> k(E e) {
        return new d<>(e);
    }

    public Iterator<E> l(b<E> bVar) {
        return p(bVar, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.Y - 1;
        d<E> dVar = this.X;
        while (true) {
            dVar = dVar.a;
            if (dVar != this.X) {
                if (F(dVar.c(), obj)) {
                    return i;
                }
                i--;
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    public ListIterator<E> p(b<E> bVar, int i) {
        return new c(bVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        D();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    @Override // java.util.List
    public E remove(int i) {
        d<E> B = B(i, false);
        E c2 = B.c();
        H(B);
        return c2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public E removeFirst() {
        d<E> dVar = this.X;
        d<E> dVar2 = dVar.b;
        if (dVar2 != dVar) {
            E c2 = dVar2.c();
            H(dVar2);
            return c2;
        }
        throw new NoSuchElementException();
    }

    public E removeLast() {
        d<E> dVar = this.X;
        d<E> dVar2 = dVar.a;
        if (dVar2 != dVar) {
            E c2 = dVar2.c();
            H(dVar2);
            return c2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.List
    public E set(int i, E e) {
        d<E> B = B(i, false);
        E c2 = B.c();
        J(B, e);
        return c2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new b(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[this.Y]);
    }

    public String toString() {
        if (size() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(size() * 16);
        sb.append('[');
        Iterator<E> it = iterator();
        boolean hasNext = it.hasNext();
        while (hasNext) {
            Object next = it.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            hasNext = it.hasNext();
            if (hasNext) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public void w(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public AbstractC8166n1(Collection<? extends E> collection) {
        D();
        addAll(collection);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        i(B(i, true), e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        d<E> B = B(i, true);
        for (E e : collection) {
            i(B, e);
        }
        return true;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new a(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.Y) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.Y));
        }
        d<E> dVar = this.X.b;
        int i = 0;
        while (dVar != this.X) {
            tArr[i] = dVar.c();
            dVar = dVar.b;
            i++;
        }
        int length = tArr.length;
        int i2 = this.Y;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    /* renamed from: o.n1$d */
    /* loaded from: classes4.dex */
    public static class d<E> {
        public d<E> a;
        public d<E> b;
        public E c;

        public d() {
            this.a = this;
            this.b = this;
        }

        public d<E> a() {
            return this.b;
        }

        public d<E> b() {
            return this.a;
        }

        public E c() {
            return this.c;
        }

        public void d(d<E> dVar) {
            this.b = dVar;
        }

        public void e(d<E> dVar) {
            this.a = dVar;
        }

        public void f(E e) {
            this.c = e;
        }

        public d(E e) {
            this.c = e;
        }

        public d(d<E> dVar, d<E> dVar2, E e) {
            this.a = dVar;
            this.b = dVar2;
            this.c = e;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        d<E> dVar = this.X;
        do {
            dVar = dVar.b;
            if (dVar == this.X) {
                return false;
            }
        } while (!F(dVar.c(), obj));
        H(dVar);
        return true;
    }
}
