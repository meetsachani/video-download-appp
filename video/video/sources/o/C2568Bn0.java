package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.Bn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2568Bn0 extends TreeMap {
    public TreeMap X;
    public boolean Y = false;

    /* renamed from: o.Bn0$c */
    /* loaded from: classes4.dex */
    public class c extends a implements Set {
        public final /* synthetic */ C2568Bn0 Y;

        public c(C2568Bn0 c2568Bn0) {
            super();
            this.Y = c2568Bn0;
        }

        @Override // o.C2568Bn0.a
        public Collection e(Map map) {
            return map.keySet();
        }

        @Override // o.C2568Bn0.a
        public Object f(Map.Entry entry) {
            return entry.getKey();
        }
    }

    /* renamed from: o.Bn0$d */
    /* loaded from: classes4.dex */
    public class d extends a {
        public final /* synthetic */ C2568Bn0 Y;

        public d(C2568Bn0 c2568Bn0) {
            super();
            this.Y = c2568Bn0;
        }

        @Override // o.C2568Bn0.a
        public Collection e(Map map) {
            return map.values();
        }

        @Override // o.C2568Bn0.a
        public Object f(Map.Entry entry) {
            return entry.getValue();
        }
    }

    public C2568Bn0() {
        this.X = null;
        this.X = new TreeMap();
    }

    public boolean b() {
        return this.Y;
    }

    public void c(boolean z) {
        this.Y = z;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.Y) {
            synchronized (this) {
                this.X = new TreeMap();
            }
            return;
        }
        synchronized (this.X) {
            this.X.clear();
        }
    }

    @Override // java.util.TreeMap, java.util.AbstractMap
    public Object clone() {
        C2568Bn0 c2568Bn0;
        C2568Bn0 c2568Bn02;
        if (this.Y) {
            c2568Bn02 = new C2568Bn0((SortedMap) this.X);
        } else {
            synchronized (this.X) {
                c2568Bn0 = new C2568Bn0((SortedMap) this.X);
            }
            c2568Bn02 = c2568Bn0;
        }
        c2568Bn02.c(b());
        return c2568Bn02;
    }

    @Override // java.util.TreeMap, java.util.SortedMap
    public Comparator comparator() {
        Comparator comparator;
        if (this.Y) {
            return this.X.comparator();
        }
        synchronized (this.X) {
            comparator = this.X.comparator();
        }
        return comparator;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        boolean containsKey;
        if (this.Y) {
            return this.X.containsKey(obj);
        }
        synchronized (this.X) {
            containsKey = this.X.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean containsValue;
        if (this.Y) {
            return this.X.containsValue(obj);
        }
        synchronized (this.X) {
            containsValue = this.X.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set entrySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.Y) {
            if (map.size() != this.X.size()) {
                return false;
            }
            for (Map.Entry entry : this.X.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    if (map.get(key) != null || !map.containsKey(key)) {
                        return false;
                    }
                } else if (!value.equals(map.get(key))) {
                    return false;
                }
            }
            return true;
        }
        synchronized (this.X) {
            try {
                if (map.size() != this.X.size()) {
                    return false;
                }
                for (Map.Entry entry2 : this.X.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        if (map.get(key2) != null || !map.containsKey(key2)) {
                            return false;
                        }
                    } else if (!value2.equals(map.get(key2))) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.TreeMap, java.util.SortedMap
    public Object firstKey() {
        Object firstKey;
        if (this.Y) {
            return this.X.firstKey();
        }
        synchronized (this.X) {
            firstKey = this.X.firstKey();
        }
        return firstKey;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        if (this.Y) {
            return this.X.get(obj);
        }
        synchronized (this.X) {
            obj2 = this.X.get(obj);
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = 0;
        if (this.Y) {
            for (Object obj : this.X.entrySet()) {
                i += obj.hashCode();
            }
            return i;
        }
        synchronized (this.X) {
            try {
                for (Object obj2 : this.X.entrySet()) {
                    i += obj2.hashCode();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.util.TreeMap, java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        SortedMap headMap;
        if (this.Y) {
            return this.X.headMap(obj);
        }
        synchronized (this.X) {
            headMap = this.X.headMap(obj);
        }
        return headMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return new c();
    }

    @Override // java.util.TreeMap, java.util.SortedMap
    public Object lastKey() {
        Object lastKey;
        if (this.Y) {
            return this.X.lastKey();
        }
        synchronized (this.X) {
            lastKey = this.X.lastKey();
        }
        return lastKey;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object put;
        Object put2;
        if (this.Y) {
            synchronized (this) {
                TreeMap treeMap = (TreeMap) this.X.clone();
                put2 = treeMap.put(obj, obj2);
                this.X = treeMap;
            }
            return put2;
        }
        synchronized (this.X) {
            put = this.X.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        if (this.Y) {
            synchronized (this) {
                TreeMap treeMap = (TreeMap) this.X.clone();
                treeMap.putAll(map);
                this.X = treeMap;
            }
            return;
        }
        synchronized (this.X) {
            this.X.putAll(map);
        }
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object remove;
        Object remove2;
        if (this.Y) {
            synchronized (this) {
                TreeMap treeMap = (TreeMap) this.X.clone();
                remove2 = treeMap.remove(obj);
                this.X = treeMap;
            }
            return remove2;
        }
        synchronized (this.X) {
            remove = this.X.remove(obj);
        }
        return remove;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.TreeMap, java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        SortedMap subMap;
        if (this.Y) {
            return this.X.subMap(obj, obj2);
        }
        synchronized (this.X) {
            subMap = this.X.subMap(obj, obj2);
        }
        return subMap;
    }

    @Override // java.util.TreeMap, java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        SortedMap tailMap;
        if (this.Y) {
            return this.X.tailMap(obj);
        }
        synchronized (this.X) {
            tailMap = this.X.tailMap(obj);
        }
        return tailMap;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Collection values() {
        return new d();
    }

    /* renamed from: o.Bn0$a */
    /* loaded from: classes4.dex */
    public abstract class a implements Collection {

        /* renamed from: o.Bn0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0165a implements Iterator {
            public Map X;
            public Map.Entry Y = null;
            public Iterator Z;

            public C0165a() {
                TreeMap treeMap = C2568Bn0.this.X;
                this.X = treeMap;
                this.Z = treeMap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.X == C2568Bn0.this.X) {
                    return this.Z.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.X == C2568Bn0.this.X) {
                    Map.Entry entry = (Map.Entry) this.Z.next();
                    this.Y = entry;
                    return a.this.f(entry);
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.Y != null) {
                    if (C2568Bn0.this.Y) {
                        synchronized (C2568Bn0.this) {
                            try {
                                if (this.X == C2568Bn0.this.X) {
                                    C2568Bn0.this.remove(this.Y.getKey());
                                    this.Y = null;
                                    this.X = C2568Bn0.this.X;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    this.Z.remove();
                    this.Y = null;
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public a() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                synchronized (c2568Bn0) {
                    C2568Bn0.this.X = new TreeMap();
                }
                return;
            }
            synchronized (c2568Bn0.X) {
                e(C2568Bn0.this.X).clear();
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            boolean contains;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).contains(obj);
            }
            synchronized (c2568Bn0.X) {
                contains = e(C2568Bn0.this.X).contains(obj);
            }
            return contains;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            boolean containsAll;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).containsAll(collection);
            }
            synchronized (c2568Bn0.X) {
                containsAll = e(C2568Bn0.this.X).containsAll(collection);
            }
            return containsAll;
        }

        public abstract Collection e(Map map);

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).equals(obj);
            }
            synchronized (c2568Bn0.X) {
                equals = e(C2568Bn0.this.X).equals(obj);
            }
            return equals;
        }

        public abstract Object f(Map.Entry entry);

        @Override // java.util.Collection
        public int hashCode() {
            int hashCode;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).hashCode();
            }
            synchronized (c2568Bn0.X) {
                hashCode = e(C2568Bn0.this.X).hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).isEmpty();
            }
            synchronized (c2568Bn0.X) {
                isEmpty = e(C2568Bn0.this.X).isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0165a();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            boolean remove;
            boolean remove2;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                synchronized (c2568Bn0) {
                    TreeMap treeMap = (TreeMap) C2568Bn0.this.X.clone();
                    remove2 = e(treeMap).remove(obj);
                    C2568Bn0.this.X = treeMap;
                }
                return remove2;
            }
            synchronized (c2568Bn0.X) {
                remove = e(C2568Bn0.this.X).remove(obj);
            }
            return remove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            boolean removeAll;
            boolean removeAll2;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                synchronized (c2568Bn0) {
                    TreeMap treeMap = (TreeMap) C2568Bn0.this.X.clone();
                    removeAll2 = e(treeMap).removeAll(collection);
                    C2568Bn0.this.X = treeMap;
                }
                return removeAll2;
            }
            synchronized (c2568Bn0.X) {
                removeAll = e(C2568Bn0.this.X).removeAll(collection);
            }
            return removeAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            boolean retainAll;
            boolean retainAll2;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                synchronized (c2568Bn0) {
                    TreeMap treeMap = (TreeMap) C2568Bn0.this.X.clone();
                    retainAll2 = e(treeMap).retainAll(collection);
                    C2568Bn0.this.X = treeMap;
                }
                return retainAll2;
            }
            synchronized (c2568Bn0.X) {
                retainAll = e(C2568Bn0.this.X).retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).size();
            }
            synchronized (c2568Bn0.X) {
                size = e(C2568Bn0.this.X).size();
            }
            return size;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            Object[] array;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).toArray(objArr);
            }
            synchronized (c2568Bn0.X) {
                array = e(C2568Bn0.this.X).toArray(objArr);
            }
            return array;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Object[] array;
            C2568Bn0 c2568Bn0 = C2568Bn0.this;
            if (c2568Bn0.Y) {
                return e(c2568Bn0.X).toArray();
            }
            synchronized (c2568Bn0.X) {
                array = e(C2568Bn0.this.X).toArray();
            }
            return array;
        }
    }

    public C2568Bn0(Comparator comparator) {
        this.X = null;
        this.X = new TreeMap(comparator);
    }

    public C2568Bn0(Map map) {
        this.X = null;
        this.X = new TreeMap(map);
    }

    public C2568Bn0(SortedMap sortedMap) {
        this.X = null;
        this.X = new TreeMap(sortedMap);
    }

    /* renamed from: o.Bn0$b */
    /* loaded from: classes4.dex */
    public class b extends a implements Set {
        public final /* synthetic */ C2568Bn0 Y;

        public b(C2568Bn0 c2568Bn0) {
            super();
            this.Y = c2568Bn0;
        }

        @Override // o.C2568Bn0.a
        public Collection e(Map map) {
            return map.entrySet();
        }

        @Override // o.C2568Bn0.a
        public Object f(Map.Entry entry) {
            return entry;
        }
    }
}
