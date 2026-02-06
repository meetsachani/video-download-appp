package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.on0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8597on0 extends ArrayList {
    public ArrayList X;
    public boolean Y = false;

    /* renamed from: o.on0$a */
    /* loaded from: classes4.dex */
    public class a implements ListIterator {
        public List X;
        public ListIterator Y;
        public int Z = -1;

        public a(int i) {
            this.X = C8597on0.this.X;
            this.Y = c().listIterator(i);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            int nextIndex = nextIndex();
            c().add(nextIndex, obj);
            this.X = C8597on0.this.X;
            this.Y = c().listIterator(nextIndex + 1);
            this.Z = -1;
        }

        public final void b() {
            if (C8597on0.this.X == this.X) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public List c() {
            return this.X;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.Y.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            this.Z = this.Y.nextIndex();
            return this.Y.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Y.nextIndex();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            this.Z = this.Y.previousIndex();
            return this.Y.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.Y.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            if (this.Z >= 0) {
                c().remove(this.Z);
                this.X = C8597on0.this.X;
                this.Y = c().listIterator(this.Z);
                this.Z = -1;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            if (this.Z >= 0) {
                c().set(this.Z, obj);
                this.X = C8597on0.this.X;
                this.Y = c().listIterator(previousIndex() + 1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.on0$b */
    /* loaded from: classes4.dex */
    public class b implements List {
        public int X;
        public int Y;
        public List Z;

        /* renamed from: o.on0$b$a */
        /* loaded from: classes4.dex */
        public class a implements ListIterator {
            public List X;
            public ListIterator Y;
            public int Z = -1;

            public a(int i) {
                ArrayList arrayList = C8597on0.this.X;
                this.X = arrayList;
                this.Y = b.this.i(arrayList).listIterator(i);
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                b();
                int nextIndex = nextIndex();
                c().add(nextIndex, obj);
                b.f(b.this);
                this.X = C8597on0.this.X;
                this.Y = c().listIterator(nextIndex + 1);
                this.Z = -1;
            }

            public final void b() {
                if (C8597on0.this.X == this.X) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            public List c() {
                return b.this.i(this.X);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                b();
                return this.Y.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                b();
                return this.Y.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                b();
                this.Z = this.Y.nextIndex();
                return this.Y.next();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                b();
                return this.Y.nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                b();
                this.Z = this.Y.previousIndex();
                return this.Y.previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                b();
                return this.Y.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                if (this.Z >= 0) {
                    c().remove(this.Z);
                    b.h(b.this);
                    this.X = C8597on0.this.X;
                    this.Y = c().listIterator(this.Z);
                    this.Z = -1;
                    return;
                }
                throw new IllegalStateException();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                b();
                if (this.Z >= 0) {
                    c().set(this.Z, obj);
                    this.X = C8597on0.this.X;
                    this.Y = c().listIterator(previousIndex() + 1);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public b(int i, int i2) {
            this.X = i;
            this.Y = i2;
            this.Z = C8597on0.this.X;
        }

        public static /* synthetic */ int f(b bVar) {
            int i = bVar.Y;
            bVar.Y = i + 1;
            return i;
        }

        public static /* synthetic */ int h(b bVar) {
            int i = bVar.Y;
            bVar.Y = i - 1;
            return i;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            boolean add;
            boolean add2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        add2 = i(arrayList).add(obj);
                        if (add2) {
                            this.Y++;
                        }
                        C8597on0.this.X = arrayList;
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return add2;
            }
            synchronized (c8597on0.X) {
                add = i(this.Z).add(obj);
            }
            return add;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            boolean addAll;
            boolean addAll2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        addAll2 = i(arrayList).addAll(collection);
                        if (addAll2) {
                            this.Y += collection.size();
                        }
                        C8597on0.this.X = arrayList;
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return addAll2;
            }
            synchronized (c8597on0.X) {
                addAll = i(this.Z).addAll(collection);
            }
            return addAll;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                    i(arrayList).clear();
                    this.Y = this.X;
                    C8597on0.this.X = arrayList;
                    this.Z = arrayList;
                }
                return;
            }
            synchronized (c8597on0.X) {
                i(this.Z).clear();
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            boolean contains;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).contains(obj);
            }
            synchronized (c8597on0.X) {
                contains = i(this.Z).contains(obj);
            }
            return contains;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            boolean containsAll;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).containsAll(collection);
            }
            synchronized (c8597on0.X) {
                containsAll = i(this.Z).containsAll(collection);
            }
            return containsAll;
        }

        @Override // java.util.List, java.util.Collection
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).equals(obj);
            }
            synchronized (c8597on0.X) {
                equals = i(this.Z).equals(obj);
            }
            return equals;
        }

        @Override // java.util.List
        public Object get(int i) {
            Object obj;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).get(i);
            }
            synchronized (c8597on0.X) {
                obj = i(this.Z).get(i);
            }
            return obj;
        }

        @Override // java.util.List, java.util.Collection
        public int hashCode() {
            int hashCode;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).hashCode();
            }
            synchronized (c8597on0.X) {
                hashCode = i(this.Z).hashCode();
            }
            return hashCode;
        }

        public final List i(List list) {
            if (C8597on0.this.X == this.Z) {
                return list.subList(this.X, this.Y);
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int indexOf;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).indexOf(obj);
            }
            synchronized (c8597on0.X) {
                indexOf = i(this.Z).indexOf(obj);
            }
            return indexOf;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).isEmpty();
            }
            synchronized (c8597on0.X) {
                isEmpty = i(this.Z).isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).lastIndexOf(obj);
            }
            synchronized (c8597on0.X) {
                lastIndexOf = i(this.Z).lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new a(0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            boolean remove;
            boolean remove2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        remove2 = i(arrayList).remove(obj);
                        if (remove2) {
                            this.Y--;
                        }
                        C8597on0.this.X = arrayList;
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return remove2;
            }
            synchronized (c8597on0.X) {
                remove = i(this.Z).remove(obj);
            }
            return remove;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            boolean removeAll;
            boolean removeAll2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        List i = i(arrayList);
                        removeAll2 = i.removeAll(collection);
                        if (removeAll2) {
                            this.Y = this.X + i.size();
                        }
                        C8597on0.this.X = arrayList;
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return removeAll2;
            }
            synchronized (c8597on0.X) {
                removeAll = i(this.Z).removeAll(collection);
            }
            return removeAll;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            boolean retainAll;
            boolean retainAll2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        List i = i(arrayList);
                        retainAll2 = i.retainAll(collection);
                        if (retainAll2) {
                            this.Y = this.X + i.size();
                        }
                        C8597on0.this.X = arrayList;
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return retainAll2;
            }
            synchronized (c8597on0.X) {
                retainAll = i(this.Z).retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            Object obj2;
            Object obj3;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                    obj3 = i(arrayList).set(i, obj);
                    C8597on0.this.X = arrayList;
                    this.Z = arrayList;
                }
                return obj3;
            }
            synchronized (c8597on0.X) {
                obj2 = i(this.Z).set(i, obj);
            }
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public int size() {
            int size;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).size();
            }
            synchronized (c8597on0.X) {
                size = i(this.Z).size();
            }
            return size;
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.X == this.Z) {
                return new b(this.X + i, i + i2);
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            Object[] array;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).toArray(objArr);
            }
            synchronized (c8597on0.X) {
                array = i(this.Z).toArray(objArr);
            }
            return array;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new a(i);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            Object[] array;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                return i(this.Z).toArray();
            }
            synchronized (c8597on0.X) {
                array = i(this.Z).toArray();
            }
            return array;
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                    i(arrayList).add(i, obj);
                    this.Y++;
                    C8597on0.this.X = arrayList;
                    this.Z = arrayList;
                }
                return;
            }
            synchronized (c8597on0.X) {
                i(this.Z).add(i, obj);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            boolean addAll;
            boolean addAll2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    try {
                        ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                        addAll2 = i(arrayList).addAll(i, collection);
                        C8597on0.this.X = arrayList;
                        if (addAll2) {
                            this.Y += collection.size();
                        }
                        this.Z = arrayList;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return addAll2;
            }
            synchronized (c8597on0.X) {
                addAll = i(this.Z).addAll(i, collection);
            }
            return addAll;
        }

        @Override // java.util.List
        public Object remove(int i) {
            Object remove;
            Object remove2;
            C8597on0 c8597on0 = C8597on0.this;
            if (c8597on0.Y) {
                synchronized (c8597on0) {
                    ArrayList arrayList = (ArrayList) C8597on0.this.X.clone();
                    remove2 = i(arrayList).remove(i);
                    this.Y--;
                    C8597on0.this.X = arrayList;
                    this.Z = arrayList;
                }
                return remove2;
            }
            synchronized (c8597on0.X) {
                remove = i(this.Z).remove(i);
            }
            return remove;
        }
    }

    public C8597on0() {
        this.X = null;
        this.X = new ArrayList();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        boolean add;
        boolean add2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                add2 = arrayList.add(obj);
                this.X = arrayList;
            }
            return add2;
        }
        synchronized (this.X) {
            add = this.X.add(obj);
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        boolean addAll;
        boolean addAll2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                addAll2 = arrayList.addAll(collection);
                this.X = arrayList;
            }
            return addAll2;
        }
        synchronized (this.X) {
            addAll = this.X.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                arrayList.clear();
                this.X = arrayList;
            }
            return;
        }
        synchronized (this.X) {
            this.X.clear();
        }
    }

    @Override // java.util.ArrayList
    public Object clone() {
        C8597on0 c8597on0;
        C8597on0 c8597on02;
        if (this.Y) {
            c8597on02 = new C8597on0(this.X);
        } else {
            synchronized (this.X) {
                c8597on0 = new C8597on0(this.X);
            }
            c8597on02 = c8597on0;
        }
        c8597on02.e(d());
        return c8597on02;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        boolean contains;
        if (this.Y) {
            return this.X.contains(obj);
        }
        synchronized (this.X) {
            contains = this.X.contains(obj);
        }
        return contains;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        boolean containsAll;
        if (this.Y) {
            return this.X.containsAll(collection);
        }
        synchronized (this.X) {
            containsAll = this.X.containsAll(collection);
        }
        return containsAll;
    }

    public boolean d() {
        return this.Y;
    }

    public void e(boolean z) {
        this.Y = z;
    }

    @Override // java.util.ArrayList
    public void ensureCapacity(int i) {
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                arrayList.ensureCapacity(i);
                this.X = arrayList;
            }
            return;
        }
        synchronized (this.X) {
            this.X.ensureCapacity(i);
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (this.Y) {
            ListIterator listIterator = this.X.listIterator();
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
        synchronized (this.X) {
            try {
                ListIterator listIterator3 = this.X.listIterator();
                ListIterator listIterator4 = list.listIterator();
                while (listIterator3.hasNext() && listIterator4.hasNext()) {
                    Object next3 = listIterator3.next();
                    Object next4 = listIterator4.next();
                    if (next3 == null) {
                        if (next4 != null) {
                            return false;
                        }
                    } else if (!next3.equals(next4)) {
                        return false;
                    }
                }
                if (listIterator3.hasNext() || listIterator4.hasNext()) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object get(int i) {
        Object obj;
        if (this.Y) {
            return this.X.get(i);
        }
        synchronized (this.X) {
            obj = this.X.get(i);
        }
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1;
        if (this.Y) {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i * 31;
                if (next == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = next.hashCode();
                }
                i = i2 + hashCode2;
            }
            return i;
        }
        synchronized (this.X) {
            try {
                Iterator it2 = this.X.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i3 = i * 31;
                    if (next2 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = next2.hashCode();
                    }
                    i = i3 + hashCode;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int indexOf;
        if (this.Y) {
            return this.X.indexOf(obj);
        }
        synchronized (this.X) {
            indexOf = this.X.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        boolean isEmpty;
        if (this.Y) {
            return this.X.isEmpty();
        }
        synchronized (this.X) {
            isEmpty = this.X.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        if (this.Y) {
            return new a(0);
        }
        return this.X.iterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndexOf;
        if (this.Y) {
            return this.X.lastIndexOf(obj);
        }
        synchronized (this.X) {
            lastIndexOf = this.X.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        if (this.Y) {
            return new a(0);
        }
        return this.X.listIterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object remove;
        Object remove2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                remove2 = arrayList.remove(i);
                this.X = arrayList;
            }
            return remove2;
        }
        synchronized (this.X) {
            remove = this.X.remove(i);
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        boolean removeAll;
        boolean removeAll2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                removeAll2 = arrayList.removeAll(collection);
                this.X = arrayList;
            }
            return removeAll2;
        }
        synchronized (this.X) {
            removeAll = this.X.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        boolean retainAll;
        boolean retainAll2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                retainAll2 = arrayList.retainAll(collection);
                this.X = arrayList;
            }
            return retainAll2;
        }
        synchronized (this.X) {
            retainAll = this.X.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Object obj2;
        if (this.Y) {
            return this.X.set(i, obj);
        }
        synchronized (this.X) {
            obj2 = this.X.set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int size;
        if (this.Y) {
            return this.X.size();
        }
        synchronized (this.X) {
            size = this.X.size();
        }
        return size;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        if (this.Y) {
            return new b(i, i2);
        }
        return this.X.subList(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] array;
        if (this.Y) {
            return this.X.toArray();
        }
        synchronized (this.X) {
            array = this.X.toArray();
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("FastArrayList[");
        stringBuffer.append(this.X.toString());
        stringBuffer.append(C6566gU0.g);
        return stringBuffer.toString();
    }

    @Override // java.util.ArrayList
    public void trimToSize() {
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                arrayList.trimToSize();
                this.X = arrayList;
            }
            return;
        }
        synchronized (this.X) {
            this.X.trimToSize();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        if (this.Y) {
            return new a(i);
        }
        return this.X.listIterator(i);
    }

    public C8597on0(int i) {
        this.X = null;
        this.X = new ArrayList(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        if (this.Y) {
            return this.X.toArray(objArr);
        }
        synchronized (this.X) {
            array = this.X.toArray(objArr);
        }
        return array;
    }

    public C8597on0(Collection collection) {
        this.X = null;
        this.X = new ArrayList(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                arrayList.add(i, obj);
                this.X = arrayList;
            }
            return;
        }
        synchronized (this.X) {
            this.X.add(i, obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        boolean addAll;
        boolean addAll2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                addAll2 = arrayList.addAll(i, collection);
                this.X = arrayList;
            }
            return addAll2;
        }
        synchronized (this.X) {
            addAll = this.X.addAll(i, collection);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean remove;
        boolean remove2;
        if (this.Y) {
            synchronized (this) {
                ArrayList arrayList = (ArrayList) this.X.clone();
                remove2 = arrayList.remove(obj);
                this.X = arrayList;
            }
            return remove2;
        }
        synchronized (this.X) {
            remove = this.X.remove(obj);
        }
        return remove;
    }
}
