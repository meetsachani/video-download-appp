package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.tn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9818tn0 extends HashMap {
    public HashMap X;
    public boolean Y = false;

    /* renamed from: o.tn0$c */
    /* loaded from: classes4.dex */
    public class c extends a implements Set {
        public final /* synthetic */ C9818tn0 Y;

        public c(C9818tn0 c9818tn0) {
            super();
            this.Y = c9818tn0;
        }

        @Override // o.C9818tn0.a
        public Collection e(Map map) {
            return map.keySet();
        }

        @Override // o.C9818tn0.a
        public Object f(Map.Entry entry) {
            return entry.getKey();
        }
    }

    /* renamed from: o.tn0$d */
    /* loaded from: classes4.dex */
    public class d extends a {
        public final /* synthetic */ C9818tn0 Y;

        public d(C9818tn0 c9818tn0) {
            super();
            this.Y = c9818tn0;
        }

        @Override // o.C9818tn0.a
        public Collection e(Map map) {
            return map.values();
        }

        @Override // o.C9818tn0.a
        public Object f(Map.Entry entry) {
            return entry.getValue();
        }
    }

    public C9818tn0() {
        this.X = null;
        this.X = new HashMap();
    }

    public boolean b() {
        return this.Y;
    }

    public void c(boolean z) {
        this.Y = z;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.Y) {
            synchronized (this) {
                this.X = new HashMap();
            }
            return;
        }
        synchronized (this.X) {
            this.X.clear();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        C9818tn0 c9818tn0;
        C9818tn0 c9818tn02;
        if (this.Y) {
            c9818tn02 = new C9818tn0(this.X);
        } else {
            synchronized (this.X) {
                c9818tn0 = new C9818tn0(this.X);
            }
            c9818tn02 = c9818tn0;
        }
        c9818tn02.c(b());
        return c9818tn02;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return new c();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object put;
        Object put2;
        if (this.Y) {
            synchronized (this) {
                HashMap hashMap = (HashMap) this.X.clone();
                put2 = hashMap.put(obj, obj2);
                this.X = hashMap;
            }
            return put2;
        }
        synchronized (this.X) {
            put = this.X.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        if (this.Y) {
            synchronized (this) {
                HashMap hashMap = (HashMap) this.X.clone();
                hashMap.putAll(map);
                this.X = hashMap;
            }
            return;
        }
        synchronized (this.X) {
            this.X.putAll(map);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object remove;
        Object remove2;
        if (this.Y) {
            synchronized (this) {
                HashMap hashMap = (HashMap) this.X.clone();
                remove2 = hashMap.remove(obj);
                this.X = hashMap;
            }
            return remove2;
        }
        synchronized (this.X) {
            remove = this.X.remove(obj);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Collection values() {
        return new d();
    }

    /* renamed from: o.tn0$a */
    /* loaded from: classes4.dex */
    public abstract class a implements Collection {

        /* renamed from: o.tn0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0343a implements Iterator {
            public Map X;
            public Map.Entry Y = null;
            public Iterator Z;

            public C0343a() {
                HashMap hashMap = C9818tn0.this.X;
                this.X = hashMap;
                this.Z = hashMap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.X == C9818tn0.this.X) {
                    return this.Z.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.X == C9818tn0.this.X) {
                    Map.Entry entry = (Map.Entry) this.Z.next();
                    this.Y = entry;
                    return a.this.f(entry);
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.Y != null) {
                    if (C9818tn0.this.Y) {
                        synchronized (C9818tn0.this) {
                            try {
                                if (this.X == C9818tn0.this.X) {
                                    C9818tn0.this.remove(this.Y.getKey());
                                    this.Y = null;
                                    this.X = C9818tn0.this.X;
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
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                synchronized (c9818tn0) {
                    C9818tn0.this.X = new HashMap();
                }
                return;
            }
            synchronized (c9818tn0.X) {
                e(C9818tn0.this.X).clear();
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            boolean contains;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).contains(obj);
            }
            synchronized (c9818tn0.X) {
                contains = e(C9818tn0.this.X).contains(obj);
            }
            return contains;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            boolean containsAll;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).containsAll(collection);
            }
            synchronized (c9818tn0.X) {
                containsAll = e(C9818tn0.this.X).containsAll(collection);
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
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).equals(obj);
            }
            synchronized (c9818tn0.X) {
                equals = e(C9818tn0.this.X).equals(obj);
            }
            return equals;
        }

        public abstract Object f(Map.Entry entry);

        @Override // java.util.Collection
        public int hashCode() {
            int hashCode;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).hashCode();
            }
            synchronized (c9818tn0.X) {
                hashCode = e(C9818tn0.this.X).hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).isEmpty();
            }
            synchronized (c9818tn0.X) {
                isEmpty = e(C9818tn0.this.X).isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0343a();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            boolean remove;
            boolean remove2;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                synchronized (c9818tn0) {
                    HashMap hashMap = (HashMap) C9818tn0.this.X.clone();
                    remove2 = e(hashMap).remove(obj);
                    C9818tn0.this.X = hashMap;
                }
                return remove2;
            }
            synchronized (c9818tn0.X) {
                remove = e(C9818tn0.this.X).remove(obj);
            }
            return remove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            boolean removeAll;
            boolean removeAll2;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                synchronized (c9818tn0) {
                    HashMap hashMap = (HashMap) C9818tn0.this.X.clone();
                    removeAll2 = e(hashMap).removeAll(collection);
                    C9818tn0.this.X = hashMap;
                }
                return removeAll2;
            }
            synchronized (c9818tn0.X) {
                removeAll = e(C9818tn0.this.X).removeAll(collection);
            }
            return removeAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            boolean retainAll;
            boolean retainAll2;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                synchronized (c9818tn0) {
                    HashMap hashMap = (HashMap) C9818tn0.this.X.clone();
                    retainAll2 = e(hashMap).retainAll(collection);
                    C9818tn0.this.X = hashMap;
                }
                return retainAll2;
            }
            synchronized (c9818tn0.X) {
                retainAll = e(C9818tn0.this.X).retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).size();
            }
            synchronized (c9818tn0.X) {
                size = e(C9818tn0.this.X).size();
            }
            return size;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            Object[] array;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).toArray(objArr);
            }
            synchronized (c9818tn0.X) {
                array = e(C9818tn0.this.X).toArray(objArr);
            }
            return array;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Object[] array;
            C9818tn0 c9818tn0 = C9818tn0.this;
            if (c9818tn0.Y) {
                return e(c9818tn0.X).toArray();
            }
            synchronized (c9818tn0.X) {
                array = e(C9818tn0.this.X).toArray();
            }
            return array;
        }
    }

    public C9818tn0(int i) {
        this.X = null;
        this.X = new HashMap(i);
    }

    public C9818tn0(int i, float f) {
        this.X = null;
        this.X = new HashMap(i, f);
    }

    public C9818tn0(Map map) {
        this.X = null;
        this.X = new HashMap(map);
    }

    /* renamed from: o.tn0$b */
    /* loaded from: classes4.dex */
    public class b extends a implements Set {
        public final /* synthetic */ C9818tn0 Y;

        public b(C9818tn0 c9818tn0) {
            super();
            this.Y = c9818tn0;
        }

        @Override // o.C9818tn0.a
        public Collection e(Map map) {
            return map.entrySet();
        }

        @Override // o.C9818tn0.a
        public Object f(Map.Entry entry) {
            return entry;
        }
    }
}
