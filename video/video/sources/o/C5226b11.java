package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.b11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5226b11 extends W2 implements Set {
    private static final long serialVersionUID = -228664372470420141L;
    public final List Y;

    /* renamed from: o.b11$a */
    /* loaded from: classes4.dex */
    public static class a extends C7176j1 {
        public final Collection Y;
        public Object Z;

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            Object next = this.X.next();
            this.Z = next;
            return next;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            this.Y.remove(this.Z);
            this.X.remove();
            this.Z = null;
        }

        public a(Iterator it, Collection collection) {
            super(it);
            this.Y = collection;
        }
    }

    public C5226b11() {
        super(new HashSet());
        this.Y = new ArrayList();
    }

    public static C5226b11 h(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet(list);
            list.retainAll(hashSet);
            return new C5226b11(hashSet, list);
        }
        throw new IllegalArgumentException("List must not be null");
    }

    public static C5226b11 i(Set set) {
        return new C5226b11(set);
    }

    public static C5226b11 j(Set set, List list) {
        if (set != null) {
            if (list != null) {
                if (set.size() <= 0 && list.size() <= 0) {
                    return new C5226b11(set, list);
                }
                throw new IllegalArgumentException("Set and List must be empty");
            }
            throw new IllegalArgumentException("List must not be null");
        }
        throw new IllegalArgumentException("Set must not be null");
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.X.contains(obj)) {
            return this.X.add(obj);
        }
        boolean add = this.X.add(obj);
        this.Y.add(obj);
        return add;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
        this.Y.clear();
    }

    public List f() {
        return C6978iB2.f(this.Y);
    }

    public Object get(int i) {
        return this.Y.get(i);
    }

    public int indexOf(Object obj) {
        return this.Y.indexOf(obj);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a(this.Y.iterator(), this.X);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean remove = this.X.remove(obj);
        this.Y.remove(obj);
        return remove;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean retainAll = this.X.retainAll(collection);
        if (!retainAll) {
            return false;
        }
        if (this.X.size() == 0) {
            this.Y.clear();
            return retainAll;
        }
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            if (!this.X.contains(it.next())) {
                it.remove();
            }
        }
        return retainAll;
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return this.Y.toArray();
    }

    @Override // o.AbstractC8405o0
    public String toString() {
        return this.Y.toString();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return this.Y.toArray(objArr);
    }

    public C5226b11(Set set) {
        super(set);
        this.Y = new ArrayList(set);
    }

    public Object remove(int i) {
        Object remove = this.Y.remove(i);
        remove(remove);
        return remove;
    }

    public boolean addAll(int i, Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (!contains(obj)) {
                this.X.add(obj);
                this.Y.add(i, obj);
                i++;
                z = true;
            }
        }
        return z;
    }

    public C5226b11(Set set, List list) {
        super(set);
        if (list != null) {
            this.Y = list;
            return;
        }
        throw new IllegalArgumentException("List must not be null");
    }

    public void add(int i, Object obj) {
        if (contains(obj)) {
            return;
        }
        this.X.add(obj);
        this.Y.add(i, obj);
    }
}
