package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: o.s22  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9395s22 extends U2 {
    public static /* synthetic */ Class Z = null;
    private static final long serialVersionUID = 7196982186153478694L;
    public final Set Y;

    /* renamed from: o.s22$a */
    /* loaded from: classes4.dex */
    public static class a extends C7176j1 {
        public final Set Y;
        public Object Z;

        public a(Iterator it, Set set) {
            super(it);
            this.Z = null;
            this.Y = set;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            Object next = super.next();
            this.Z = next;
            return next;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.remove(this.Z);
            this.Z = null;
        }
    }

    /* renamed from: o.s22$b */
    /* loaded from: classes4.dex */
    public static class b extends C9874u1 {
        public final Set Y;
        public Object Z;

        public b(ListIterator listIterator, Set set) {
            super(listIterator);
            this.Z = null;
            this.Y = set;
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void add(Object obj) {
            if (!this.Y.contains(obj)) {
                super.add(obj);
                this.Y.add(obj);
            }
        }

        @Override // o.C9874u1, java.util.ListIterator, java.util.Iterator
        public Object next() {
            Object next = super.next();
            this.Z = next;
            return next;
        }

        @Override // o.C9874u1, java.util.ListIterator
        public Object previous() {
            Object previous = super.previous();
            this.Z = previous;
            return previous;
        }

        @Override // o.C9874u1, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.remove(this.Z);
            this.Z = null;
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("ListIterator does not support set");
        }
    }

    public C9395s22(List list, Set set) {
        super(list);
        if (set != null) {
            this.Y = set;
            return;
        }
        throw new IllegalArgumentException("Set must not be null");
    }

    public static /* synthetic */ Class h(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static C9395s22 j(List list) {
        if (list != null) {
            if (list.isEmpty()) {
                return new C9395s22(list, new HashSet());
            }
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            C9395s22 c9395s22 = new C9395s22(list, new HashSet());
            c9395s22.addAll(arrayList);
            return c9395s22;
        }
        throw new IllegalArgumentException("List must not be null");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int size = size();
        add(size(), obj);
        return size != size();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        this.Y.clear();
    }

    @Override // o.AbstractC8405o0, java.util.Collection
    public boolean contains(Object obj) {
        return this.Y.contains(obj);
    }

    @Override // o.AbstractC8405o0, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.Y.containsAll(collection);
    }

    public Set f() {
        return DB2.f(this.Y);
    }

    public Set i(Set set, List list) {
        Set hashSet;
        Class<?> cls = set.getClass();
        Class cls2 = Z;
        if (cls2 == null) {
            cls2 = h("java.util.HashSet");
            Z = cls2;
        }
        if (cls.equals(cls2)) {
            hashSet = new HashSet();
        } else {
            try {
                hashSet = (Set) set.getClass().newInstance();
            } catch (IllegalAccessException unused) {
                hashSet = new HashSet();
            } catch (InstantiationException unused2) {
                hashSet = new HashSet();
            }
        }
        hashSet.addAll(list);
        return hashSet;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a(super.iterator(), this.Y);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator() {
        return new b(super.listIterator(), this.Y);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        this.Y.remove(obj);
        return remove;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean removeAll = super.removeAll(collection);
        this.Y.removeAll(collection);
        return removeAll;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean retainAll = super.retainAll(collection);
        this.Y.retainAll(collection);
        return retainAll;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object set(int i, Object obj) {
        int indexOf = indexOf(obj);
        Object obj2 = super.set(i, obj);
        if (indexOf != -1 && indexOf != i) {
            super.remove(indexOf);
        }
        this.Y.remove(obj2);
        this.Y.add(obj);
        return obj2;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public List subList(int i, int i2) {
        List subList = super.subList(i, i2);
        return new C9395s22(subList, i(this.Y, subList));
    }

    @Override // o.AbstractC9388s1, java.util.List
    public boolean addAll(int i, Collection collection) {
        int size = size();
        for (Object obj : collection) {
            int size2 = size();
            add(i, obj);
            if (size2 != size()) {
                i++;
            }
        }
        return size != size();
    }

    @Override // o.AbstractC9388s1, java.util.List
    public ListIterator listIterator(int i) {
        return new b(super.listIterator(i), this.Y);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object remove(int i) {
        Object remove = super.remove(i);
        this.Y.remove(remove);
        return remove;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public void add(int i, Object obj) {
        if (this.Y.contains(obj)) {
            return;
        }
        super.add(i, obj);
        this.Y.add(obj);
    }
}
