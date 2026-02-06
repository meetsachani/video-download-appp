package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.z0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC11088z0 implements InterfaceC5167an {
    public final transient Map[] X;
    public transient InterfaceC5167an Y;
    public transient Collection Y0;
    public transient Set Z;
    public transient Set Z0;

    /* renamed from: o.z0$a */
    /* loaded from: classes4.dex */
    public static class a implements V71, NS1 {
        public final AbstractC11088z0 X;
        public Iterator Y;
        public Map.Entry Z = null;
        public boolean Y0 = false;

        public a(AbstractC11088z0 abstractC11088z0) {
            this.X = abstractC11088z0;
            this.Y = abstractC11088z0.X[0].entrySet().iterator();
        }

        @Override // o.V71
        public Object getKey() {
            Map.Entry entry = this.Z;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            Map.Entry entry = this.Z;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // o.V71, java.util.Iterator
        public Object next() {
            Map.Entry entry = (Map.Entry) this.Y.next();
            this.Z = entry;
            this.Y0 = true;
            return entry.getKey();
        }

        @Override // o.V71, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                Object value = this.Z.getValue();
                this.Y.remove();
                this.X.X[1].remove(value);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }

        @Override // o.NS1
        public void reset() {
            this.Y = this.X.X[0].entrySet().iterator();
            this.Z = null;
            this.Y0 = false;
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            if (this.Z != null) {
                if (this.X.X[1].containsKey(obj) && this.X.X[1].get(obj) != this.Z.getKey()) {
                    throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
                }
                return this.X.put(this.Z.getKey(), obj);
            }
            throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("MapIterator[");
                stringBuffer.append(getKey());
                stringBuffer.append("=");
                stringBuffer.append(getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "MapIterator[]";
        }
    }

    /* renamed from: o.z0$b */
    /* loaded from: classes4.dex */
    public static class b extends i implements Set {
        public b(AbstractC11088z0 abstractC11088z0) {
            super(abstractC11088z0.X[0].entrySet(), abstractC11088z0);
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.Y.b(super.iterator());
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (this.Y.containsKey(key)) {
                Object obj2 = this.Y.X[0].get(key);
                Object value = entry.getValue();
                if (obj2 != null ? obj2.equals(value) : value == null) {
                    this.Y.X[0].remove(key);
                    this.Y.X[1].remove(obj2);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o.z0$c */
    /* loaded from: classes4.dex */
    public static class c extends C7176j1 {
        public final AbstractC11088z0 Y;
        public boolean Y0;
        public Map.Entry Z;

        public c(Iterator it, AbstractC11088z0 abstractC11088z0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = abstractC11088z0;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            f fVar = new f((Map.Entry) super.next(), this.Y);
            this.Z = fVar;
            this.Y0 = true;
            return fVar;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                Object value = this.Z.getValue();
                super.remove();
                this.Y.X[1].remove(value);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* renamed from: o.z0$d */
    /* loaded from: classes4.dex */
    public static class d extends i implements Set {
        public d(AbstractC11088z0 abstractC11088z0) {
            super(abstractC11088z0.X[0].keySet(), abstractC11088z0);
        }

        @Override // o.AbstractC8405o0, java.util.Collection
        public boolean contains(Object obj) {
            return this.Y.X[0].containsKey(obj);
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.Y.c(super.iterator());
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.Y.X[0].containsKey(obj)) {
                return false;
            }
            this.Y.X[1].remove(this.Y.X[0].remove(obj));
            return true;
        }
    }

    /* renamed from: o.z0$e */
    /* loaded from: classes4.dex */
    public static class e extends C7176j1 {
        public final AbstractC11088z0 Y;
        public boolean Y0;
        public Object Z;

        public e(Iterator it, AbstractC11088z0 abstractC11088z0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = abstractC11088z0;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            Object next = super.next();
            this.Z = next;
            this.Y0 = true;
            return next;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                Object obj = this.Y.X[0].get(this.Z);
                super.remove();
                this.Y.X[1].remove(obj);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* renamed from: o.z0$f */
    /* loaded from: classes4.dex */
    public static class f extends O1 {
        public final AbstractC11088z0 Y;

        public f(Map.Entry entry, AbstractC11088z0 abstractC11088z0) {
            super(entry);
            this.Y = abstractC11088z0;
        }

        @Override // o.O1, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object key = getKey();
            if (this.Y.X[1].containsKey(obj) && this.Y.X[1].get(obj) != key) {
                throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
            }
            this.Y.put(key, obj);
            return super.setValue(obj);
        }
    }

    /* renamed from: o.z0$g */
    /* loaded from: classes4.dex */
    public static class g extends i implements Set {
        public g(AbstractC11088z0 abstractC11088z0) {
            super(abstractC11088z0.X[0].values(), abstractC11088z0);
        }

        @Override // o.AbstractC8405o0, java.util.Collection
        public boolean contains(Object obj) {
            return this.Y.X[1].containsKey(obj);
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.Y.e(super.iterator());
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.Y.X[1].containsKey(obj)) {
                return false;
            }
            this.Y.X[0].remove(this.Y.X[1].remove(obj));
            return true;
        }
    }

    /* renamed from: o.z0$h */
    /* loaded from: classes4.dex */
    public static class h extends C7176j1 {
        public final AbstractC11088z0 Y;
        public boolean Y0;
        public Object Z;

        public h(Iterator it, AbstractC11088z0 abstractC11088z0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = abstractC11088z0;
        }

        @Override // o.C7176j1, java.util.Iterator
        public Object next() {
            Object next = super.next();
            this.Z = next;
            this.Y0 = true;
            return next;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                super.remove();
                this.Y.X[1].remove(this.Z);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* renamed from: o.z0$i */
    /* loaded from: classes4.dex */
    public static abstract class i extends AbstractC8405o0 {
        public final AbstractC11088z0 Y;

        public i(Collection collection, AbstractC11088z0 abstractC11088z0) {
            super(collection);
            this.Y = abstractC11088z0;
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public void clear() {
            this.Y.clear();
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            boolean z = false;
            if (!this.Y.isEmpty() && !collection.isEmpty()) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }

        @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            boolean z = false;
            if (this.Y.isEmpty()) {
                return false;
            }
            if (collection.isEmpty()) {
                this.Y.clear();
                return true;
            }
            Iterator it = iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public AbstractC11088z0() {
        this.X = r0;
        this.Y = null;
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        Map[] mapArr = {d(), d()};
    }

    public abstract InterfaceC5167an a(Map map, Map map2, InterfaceC5167an interfaceC5167an);

    public Iterator b(Iterator it) {
        return new c(it, this);
    }

    @Override // o.InterfaceC5167an
    public Object b0(Object obj) {
        return this.X[1].get(obj);
    }

    public Iterator c(Iterator it) {
        return new e(it, this);
    }

    @Override // java.util.Map
    public void clear() {
        this.X[0].clear();
        this.X[1].clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.X[0].containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.X[1].containsKey(obj);
    }

    public Map d() {
        return null;
    }

    public Iterator e(Iterator it) {
        return new h(it, this);
    }

    @Override // java.util.Map
    public Set entrySet() {
        if (this.Z0 == null) {
            this.Z0 = new b(this);
        }
        return this.Z0;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.X[0].equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.X[0].get(obj);
    }

    @Override // o.InterfaceC5167an, o.InterfaceC8634ow1, o.X92
    public InterfaceC5167an h() {
        if (this.Y == null) {
            Map[] mapArr = this.X;
            this.Y = a(mapArr[1], mapArr[0], this);
        }
        return this.Y;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.X[0].hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.X[0].isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        if (this.Z == null) {
            this.Z = new d(this);
        }
        return this.Z;
    }

    @Override // o.InterfaceC5167an
    public Object l0(Object obj) {
        if (this.X[1].containsKey(obj)) {
            Object remove = this.X[1].remove(obj);
            this.X[0].remove(remove);
            return remove;
        }
        return null;
    }

    @Override // o.InterfaceC5167an, o.XT0
    public V71 p() {
        return new a(this);
    }

    @Override // o.InterfaceC5167an, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (this.X[0].containsKey(obj)) {
            Map[] mapArr = this.X;
            mapArr[1].remove(mapArr[0].get(obj));
        }
        if (this.X[1].containsKey(obj2)) {
            Map[] mapArr2 = this.X;
            mapArr2[0].remove(mapArr2[1].get(obj2));
        }
        Object put = this.X[0].put(obj, obj2);
        this.X[1].put(obj2, obj);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        if (this.X[0].containsKey(obj)) {
            Object remove = this.X[0].remove(obj);
            this.X[1].remove(remove);
            return remove;
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.X[0].size();
    }

    public String toString() {
        return this.X[0].toString();
    }

    @Override // java.util.Map
    public Collection values() {
        if (this.Y0 == null) {
            this.Y0 = new g(this);
        }
        return this.Y0;
    }

    public AbstractC11088z0(Map map, Map map2) {
        this.X = r0;
        this.Y = null;
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        Map[] mapArr = {map, map2};
    }

    public AbstractC11088z0(Map map, Map map2, InterfaceC5167an interfaceC5167an) {
        this.X = r0;
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        Map[] mapArr = {map, map2};
        this.Y = interfaceC5167an;
    }
}
