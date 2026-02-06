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

/* renamed from: o.m1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7905m1 implements List {
    public transient d X;
    public transient int Y;
    public transient int Z;

    /* renamed from: o.m1$a */
    /* loaded from: classes4.dex */
    public static class a implements ListIterator, InterfaceC9127qw1 {
        public final AbstractC7905m1 X;
        public d Y;
        public d Y0;
        public int Z;
        public int Z0;

        public a(AbstractC7905m1 abstractC7905m1, int i) throws IndexOutOfBoundsException {
            this.X = abstractC7905m1;
            this.Z0 = abstractC7905m1.Z;
            this.Y = abstractC7905m1.B(i, true);
            this.Z = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            this.X.i(this.Y, obj);
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

        public d c() throws IllegalStateException {
            d dVar = this.Y0;
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

        @Override // java.util.ListIterator, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (this.Y.a != this.X.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (hasNext()) {
                Object c = this.Y.c();
                d dVar = this.Y;
                this.Y0 = dVar;
                this.Y = dVar.b;
                this.Z++;
                return c;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No element at index ");
            stringBuffer.append(this.Z);
            stringBuffer.append(UE.h);
            throw new NoSuchElementException(stringBuffer.toString());
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Z;
        }

        @Override // java.util.ListIterator, o.InterfaceC9127qw1
        public Object previous() {
            b();
            if (hasPrevious()) {
                d dVar = this.Y.a;
                this.Y = dVar;
                Object c = dVar.c();
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
            d dVar = this.Y0;
            d dVar2 = this.Y;
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
        public void set(Object obj) {
            b();
            c().f(obj);
        }
    }

    /* renamed from: o.m1$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractList {
        public AbstractC7905m1 X;
        public int Y;
        public int Y0;
        public int Z;

        public b(AbstractC7905m1 abstractC7905m1, int i, int i2) {
            if (i >= 0) {
                if (i2 <= abstractC7905m1.size()) {
                    if (i <= i2) {
                        this.X = abstractC7905m1;
                        this.Y = i;
                        this.Z = i2 - i;
                        this.Y0 = abstractC7905m1.Z;
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("fromIndex(");
                    stringBuffer.append(i);
                    stringBuffer.append(") > toIndex(");
                    stringBuffer.append(i2);
                    stringBuffer.append(C9811tl1.d);
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("toIndex = ");
                stringBuffer2.append(i2);
                throw new IndexOutOfBoundsException(stringBuffer2.toString());
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("fromIndex = ");
            stringBuffer3.append(i);
            throw new IndexOutOfBoundsException(stringBuffer3.toString());
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            e(i, this.Z + 1);
            d();
            this.X.add(i + this.Y, obj);
            this.Y0 = this.X.Z;
            this.Z++;
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            return addAll(this.Z, collection);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            d();
            Iterator it = iterator();
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
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Index '");
            stringBuffer.append(i);
            stringBuffer.append("' out of bounds for size '");
            stringBuffer.append(this.Z);
            stringBuffer.append("'");
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            e(i, this.Z);
            d();
            return this.X.get(i + this.Y);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            d();
            return this.X.l(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            e(i, this.Z + 1);
            d();
            return this.X.p(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            e(i, this.Z);
            d();
            Object remove = this.X.remove(i + this.Y);
            this.Y0 = this.X.Z;
            this.Z--;
            ((AbstractList) this).modCount++;
            return remove;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            e(i, this.Z);
            d();
            return this.X.set(i + this.Y, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            d();
            return this.Z;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            AbstractC7905m1 abstractC7905m1 = this.X;
            int i3 = this.Y;
            return new b(abstractC7905m1, i + i3, i2 + i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection collection) {
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

    /* renamed from: o.m1$c */
    /* loaded from: classes4.dex */
    public static class c extends a {
        public final b a1;

        public c(b bVar, int i) {
            super(bVar.X, i + bVar.Y);
            this.a1 = bVar;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator
        public void add(Object obj) {
            super.add(obj);
            b bVar = this.a1;
            bVar.Y0 = this.X.Z;
            bVar.Z++;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (nextIndex() < this.a1.Z) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (previousIndex() >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.a1.Y;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            b bVar;
            super.remove();
            this.a1.Y0 = this.X.Z;
            bVar.Z--;
        }
    }

    public AbstractC7905m1() {
    }

    public d B(int i, boolean z) throws IndexOutOfBoundsException {
        if (i >= 0) {
            if (!z && i == this.Y) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Couldn't get the node: index (");
                stringBuffer.append(i);
                stringBuffer.append(") is the size of the list.");
                throw new IndexOutOfBoundsException(stringBuffer.toString());
            }
            int i2 = this.Y;
            if (i <= i2) {
                if (i < i2 / 2) {
                    d dVar = this.X.b;
                    for (int i3 = 0; i3 < i; i3++) {
                        dVar = dVar.b;
                    }
                    return dVar;
                }
                d dVar2 = this.X;
                while (i2 > i) {
                    dVar2 = dVar2.a;
                    i2--;
                }
                return dVar2;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Couldn't get the node: index (");
            stringBuffer2.append(i);
            stringBuffer2.append(") greater than the size of the ");
            stringBuffer2.append("list (");
            stringBuffer2.append(this.Y);
            stringBuffer2.append(").");
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("Couldn't get the node: index (");
        stringBuffer3.append(i);
        stringBuffer3.append(") less than zero.");
        throw new IndexOutOfBoundsException(stringBuffer3.toString());
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
        d dVar = this.X;
        dVar.b = dVar;
        dVar.a = dVar;
        this.Y = 0;
        this.Z++;
    }

    public void H(d dVar) {
        d dVar2 = dVar.a;
        dVar2.b = dVar.b;
        dVar.b.a = dVar2;
        this.Y--;
        this.Z++;
    }

    public void J(d dVar, Object obj) {
        dVar.f(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        e(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
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
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean d(Object obj) {
        h(this.X, obj);
        return true;
    }

    public boolean e(Object obj) {
        i(this.X, obj);
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
        ListIterator listIterator = listIterator();
        ListIterator listIterator2 = list.listIterator();
        while (listIterator.hasNext() && listIterator2.hasNext()) {
            Object next = listIterator.next();
            Object next2 = listIterator2.next();
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

    public void f(d dVar, d dVar2) {
        dVar.b = dVar2;
        dVar.a = dVar2.a;
        dVar2.a.b = dVar;
        dVar2.a = dVar;
        this.Y++;
        this.Z++;
    }

    @Override // java.util.List
    public Object get(int i) {
        return B(i, false).c();
    }

    public Object getFirst() {
        d dVar = this.X;
        d dVar2 = dVar.b;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    public Object getLast() {
        d dVar = this.X;
        d dVar2 = dVar.a;
        if (dVar2 != dVar) {
            return dVar2.c();
        }
        throw new NoSuchElementException();
    }

    public void h(d dVar, Object obj) {
        f(k(obj), dVar.b);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int hashCode;
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
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

    public void i(d dVar, Object obj) {
        f(k(obj), dVar);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        for (d dVar = this.X.b; dVar != this.X; dVar = dVar.b) {
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
    public Iterator iterator() {
        return listIterator();
    }

    public d j() {
        return new d();
    }

    public d k(Object obj) {
        return new d(obj);
    }

    public Iterator l(b bVar) {
        return p(bVar, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.Y - 1;
        d dVar = this.X;
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
    public ListIterator listIterator() {
        return new a(this, 0);
    }

    public ListIterator p(b bVar, int i) {
        return new c(bVar, i);
    }

    public void r(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        D();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    @Override // java.util.List
    public Object remove(int i) {
        d B = B(i, false);
        Object c2 = B.c();
        H(B);
        return c2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public Object removeFirst() {
        d dVar = this.X;
        d dVar2 = dVar.b;
        if (dVar2 != dVar) {
            Object c2 = dVar2.c();
            H(dVar2);
            return c2;
        }
        throw new NoSuchElementException();
    }

    public Object removeLast() {
        d dVar = this.X;
        d dVar2 = dVar.a;
        if (dVar2 != dVar) {
            Object c2 = dVar2.c();
            H(dVar2);
            return c2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        Iterator it = iterator();
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
    public Object set(int i, Object obj) {
        d B = B(i, false);
        Object c2 = B.c();
        J(B, obj);
        return c2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
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
        StringBuffer stringBuffer = new StringBuffer(size() * 16);
        stringBuffer.append(C6566gU0.f);
        Iterator it = iterator();
        boolean hasNext = it.hasNext();
        while (hasNext) {
            Object next = it.next();
            if (next == this) {
                next = "(this Collection)";
            }
            stringBuffer.append(next);
            hasNext = it.hasNext();
            if (hasNext) {
                stringBuffer.append(C6566gU0.h);
            }
        }
        stringBuffer.append(C6566gU0.g);
        return stringBuffer.toString();
    }

    public void w(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public AbstractC7905m1(Collection collection) {
        D();
        addAll(collection);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        i(B(i, true), obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        d B = B(i, true);
        for (Object obj : collection) {
            i(B, obj);
        }
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new a(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.Y) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.Y);
        }
        d dVar = this.X.b;
        int i = 0;
        while (dVar != this.X) {
            objArr[i] = dVar.c();
            dVar = dVar.b;
            i++;
        }
        int length = objArr.length;
        int i2 = this.Y;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    /* renamed from: o.m1$d */
    /* loaded from: classes4.dex */
    public static class d {
        public d a;
        public d b;
        public Object c;

        public d() {
            this.a = this;
            this.b = this;
        }

        public d a() {
            return this.b;
        }

        public d b() {
            return this.a;
        }

        public Object c() {
            return this.c;
        }

        public void d(d dVar) {
            this.b = dVar;
        }

        public void e(d dVar) {
            this.a = dVar;
        }

        public void f(Object obj) {
            this.c = obj;
        }

        public d(Object obj) {
            this.c = obj;
        }

        public d(d dVar, d dVar2, Object obj) {
            this.a = dVar;
            this.b = dVar2;
            this.c = obj;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        d dVar = this.X;
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
