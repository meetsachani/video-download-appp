package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Xu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4755Xu0<K, V> implements WT0<K, V>, Serializable, Cloneable {
    private static final long serialVersionUID = -6701087419741928296L;
    public transient int X;
    public transient int Y;
    public transient int Y0;
    public transient int Z;
    public transient K Z0;
    public transient K a1;
    public transient K b1;
    public transient V c1;
    public transient V d1;
    public transient V e1;
    public transient V0<K, V> f1;

    /* renamed from: o.Xu0$a */
    /* loaded from: classes4.dex */
    public static abstract class a<K, V> {
        public final C4755Xu0<K, V> X;
        public int Y = 0;
        public d<K, V> Z = null;

        public a(C4755Xu0<K, V> c4755Xu0) {
            this.X = c4755Xu0;
        }

        public Map.Entry<K, V> b() {
            if (hasNext()) {
                C4755Xu0<K, V> c4755Xu0 = this.X;
                int i = this.Y + 1;
                this.Y = i;
                d<K, V> dVar = new d<>(c4755Xu0, i);
                this.Z = dVar;
                return dVar;
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        public boolean hasNext() {
            if (this.Y < this.X.X) {
                return true;
            }
            return false;
        }

        public void remove() {
            d<K, V> dVar = this.Z;
            if (dVar != null) {
                dVar.a(true);
                this.X.remove(this.Z.getKey());
                this.Y--;
                this.Z = null;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }
    }

    /* renamed from: o.Xu0$b */
    /* loaded from: classes4.dex */
    public static class b<K, V> extends AbstractSet<Map.Entry<K, V>> {
        public final C4755Xu0<K, V> X;

        public b(C4755Xu0<K, V> c4755Xu0) {
            this.X = c4755Xu0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            if (this.X.f1 != null) {
                return this.X.f1.entrySet().iterator();
            }
            if (this.X.size() == 0) {
                return C4579Wa0.b();
            }
            return new c(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Object key = ((Map.Entry) obj).getKey();
            boolean containsKey = this.X.containsKey(key);
            this.X.remove(key);
            return containsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.Xu0$c */
    /* loaded from: classes4.dex */
    public static class c<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>> {
        public c(C4755Xu0<K, V> c4755Xu0) {
            super(c4755Xu0);
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            return b();
        }
    }

    /* renamed from: o.Xu0$d */
    /* loaded from: classes4.dex */
    public static class d<K, V> implements Map.Entry<K, V> {
        public final C4755Xu0<K, V> X;
        public final int Y;
        public volatile boolean Z = false;

        public d(C4755Xu0<K, V> c4755Xu0, int i) {
            this.X = c4755Xu0;
            this.Y = i;
        }

        public void a(boolean z) {
            this.Z = z;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.Z || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K key = getKey();
            V value = getValue();
            if (key != null ? key.equals(entry.getKey()) : entry.getKey() == null) {
                if (value == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return (K) this.X.Z0;
                }
                if (i == 2) {
                    return (K) this.X.a1;
                }
                if (i == 3) {
                    return (K) this.X.b1;
                }
                throw new IllegalStateException("Invalid map index: " + this.Y);
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return (V) this.X.c1;
                }
                if (i == 2) {
                    return (V) this.X.d1;
                }
                if (i == 3) {
                    return (V) this.X.e1;
                }
                throw new IllegalStateException("Invalid map index: " + this.Y);
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (this.Z) {
                return 0;
            }
            K key = getKey();
            V value = getValue();
            if (key == null) {
                hashCode = 0;
            } else {
                hashCode = key.hashCode();
            }
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.Z) {
                V value = getValue();
                int i = this.Y;
                if (i == 1) {
                    this.X.c1 = v;
                    return value;
                } else if (i == 2) {
                    this.X.d1 = v;
                    return value;
                } else if (i == 3) {
                    this.X.e1 = v;
                    return value;
                } else {
                    throw new IllegalStateException("Invalid map index: " + this.Y);
                }
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (!this.Z) {
                return getKey() + "=" + getValue();
            }
            return "";
        }
    }

    /* renamed from: o.Xu0$e */
    /* loaded from: classes4.dex */
    public static class e<K, V> implements U71<K, V>, MS1<K> {
        public final C4755Xu0<K, V> X;
        public int Y = 0;
        public boolean Z = false;

        public e(C4755Xu0<K, V> c4755Xu0) {
            this.X = c4755Xu0;
        }

        @Override // o.U71
        public K getKey() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return (K) this.X.Z0;
                }
                if (i == 2) {
                    return (K) this.X.a1;
                }
                if (i == 3) {
                    return (K) this.X.b1;
                }
                throw new IllegalStateException("Invalid map index: " + this.Y);
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return (V) this.X.c1;
                }
                if (i == 2) {
                    return (V) this.X.d1;
                }
                if (i == 3) {
                    return (V) this.X.e1;
                }
                throw new IllegalStateException("Invalid map index: " + this.Y);
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.X) {
                return true;
            }
            return false;
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            if (hasNext()) {
                this.Z = true;
                this.Y++;
                return getKey();
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            if (this.Z) {
                this.X.remove(getKey());
                this.Y--;
                this.Z = false;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // o.MS1
        public void reset() {
            this.Y = 0;
            this.Z = false;
        }

        @Override // o.U71
        public V setValue(V v) {
            if (this.Z) {
                V value = getValue();
                int i = this.Y;
                if (i == 1) {
                    this.X.c1 = v;
                    return value;
                } else if (i == 2) {
                    this.X.d1 = v;
                    return value;
                } else if (i == 3) {
                    this.X.e1 = v;
                    return value;
                } else {
                    throw new IllegalStateException("Invalid map index: " + this.Y);
                }
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z) {
                return "Iterator[" + getKey() + "=" + getValue() + C6566gU0.g;
            }
            return "Iterator[]";
        }
    }

    /* renamed from: o.Xu0$f */
    /* loaded from: classes4.dex */
    public static class f<K> extends AbstractSet<K> {
        public final C4755Xu0<K, ?> X;

        public f(C4755Xu0<K, ?> c4755Xu0) {
            this.X = c4755Xu0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            if (this.X.f1 != null) {
                return this.X.f1.keySet().iterator();
            }
            if (this.X.size() == 0) {
                return C4579Wa0.b();
            }
            return new g(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean containsKey = this.X.containsKey(obj);
            this.X.remove(obj);
            return containsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.Xu0$g */
    /* loaded from: classes4.dex */
    public static class g<K> extends a<K, Object> implements Iterator<K> {
        public g(C4755Xu0<K, ?> c4755Xu0) {
            super(c4755Xu0);
        }

        @Override // java.util.Iterator
        public K next() {
            return b().getKey();
        }
    }

    /* renamed from: o.Xu0$h */
    /* loaded from: classes4.dex */
    public static class h<V> extends AbstractCollection<V> {
        public final C4755Xu0<?, V> X;

        public h(C4755Xu0<?, V> c4755Xu0) {
            this.X = c4755Xu0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            if (this.X.f1 != null) {
                return this.X.f1.values().iterator();
            }
            if (this.X.size() == 0) {
                return C4579Wa0.b();
            }
            return new i(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.Xu0$i */
    /* loaded from: classes4.dex */
    public static class i<V> extends a<Object, V> implements Iterator<V> {
        public i(C4755Xu0<?, V> c4755Xu0) {
            super(c4755Xu0);
        }

        @Override // java.util.Iterator
        public V next() {
            return b().getValue();
        }
    }

    public C4755Xu0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt > 3) {
            this.f1 = r();
        }
        while (readInt > 0) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
            readInt--;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        U71<K, V> p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            v0.clear();
            this.f1 = null;
            return;
        }
        this.X = 0;
        this.Y0 = 0;
        this.Z = 0;
        this.Y = 0;
        this.b1 = null;
        this.a1 = null;
        this.Z0 = null;
        this.e1 = null;
        this.d1 = null;
        this.c1 = null;
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.containsKey(obj);
        }
        if (obj == null) {
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.b1 == null) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.a1 == null) {
                    return true;
                }
            }
            if (this.Z0 == null) {
                return true;
            }
            return false;
        } else if (this.X > 0) {
            int hashCode = obj.hashCode();
            int i3 = this.X;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.Z == hashCode && obj.equals(this.a1)) {
                    return true;
                }
            }
            if (this.Y == hashCode && obj.equals(this.Z0)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.containsValue(obj);
        }
        if (obj == null) {
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.e1 == null) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.d1 == null) {
                    return true;
                }
            }
            if (this.c1 == null) {
                return true;
            }
            return false;
        }
        int i3 = this.X;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (obj.equals(this.e1)) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            if (obj.equals(this.d1)) {
                return true;
            }
        }
        if (obj.equals(this.c1)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.entrySet();
        }
        return new b(this);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.equals(obj);
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.X != map.size()) {
            return false;
        }
        int i2 = this.X;
        if (i2 > 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (!map.containsKey(this.b1)) {
                            return false;
                        }
                        Object obj2 = map.get(this.b1);
                        V v = this.e1;
                        if (v != null ? !v.equals(obj2) : obj2 != null) {
                            return false;
                        }
                    }
                }
                if (!map.containsKey(this.a1)) {
                    return false;
                }
                Object obj3 = map.get(this.a1);
                V v2 = this.d1;
                if (v2 != null ? !v2.equals(obj3) : obj3 != null) {
                    return false;
                }
            }
            if (!map.containsKey(this.Z0)) {
                return false;
            }
            Object obj4 = map.get(this.Z0);
            V v3 = this.c1;
            if (v3 != null ? !v3.equals(obj4) : obj4 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.get(obj);
        }
        if (obj == null) {
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.b1 == null) {
                            return this.e1;
                        }
                    } else {
                        return null;
                    }
                }
                if (this.a1 == null) {
                    return this.d1;
                }
            }
            if (this.Z0 == null) {
                return this.c1;
            }
            return null;
        } else if (this.X > 0) {
            int hashCode = obj.hashCode();
            int i3 = this.X;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            return this.e1;
                        }
                    } else {
                        return null;
                    }
                }
                if (this.Z == hashCode && obj.equals(this.a1)) {
                    return this.d1;
                }
            }
            if (this.Y == hashCode && obj.equals(this.Z0)) {
                return this.c1;
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int i2;
        int i3;
        int hashCode;
        int hashCode2;
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.hashCode();
        }
        int i4 = this.X;
        int i5 = 0;
        if (i4 == 0) {
            return 0;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    int i6 = this.Y0;
                    V v = this.e1;
                    if (v == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = v.hashCode();
                    }
                    i3 = i6 ^ hashCode2;
                } else {
                    throw new IllegalStateException("Invalid map index: " + this.X);
                }
            } else {
                i3 = 0;
            }
            int i7 = this.Z;
            V v2 = this.d1;
            if (v2 == null) {
                hashCode = 0;
            } else {
                hashCode = v2.hashCode();
            }
            i2 = i3 + (i7 ^ hashCode);
        } else {
            i2 = 0;
        }
        int i8 = this.Y;
        V v3 = this.c1;
        if (v3 != null) {
            i5 = v3.hashCode();
        }
        return i2 + (i5 ^ i8);
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.keySet();
        }
        return new f(this);
    }

    /* renamed from: n */
    public C4755Xu0<K, V> clone() {
        try {
            C4755Xu0<K, V> c4755Xu0 = (C4755Xu0) super.clone();
            V0<K, V> v0 = c4755Xu0.f1;
            if (v0 != null) {
                c4755Xu0.f1 = v0.clone();
            }
            return c4755Xu0;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void o() {
        V0<K, V> r = r();
        this.f1 = r;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        r.put(this.b1, this.e1);
                    } else {
                        throw new IllegalStateException("Invalid map index: " + this.X);
                    }
                }
                this.f1.put(this.a1, this.d1);
            }
            this.f1.put(this.Z0, this.c1);
        }
        this.X = 0;
        this.Y0 = 0;
        this.Z = 0;
        this.Y = 0;
        this.b1 = null;
        this.a1 = null;
        this.Z0 = null;
        this.e1 = null;
        this.d1 = null;
        this.c1 = null;
    }

    @Override // o.VT0
    public U71<K, V> p() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.p();
        }
        if (this.X == 0) {
            return C5605cb0.b();
        }
        return new e(this);
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.put(k, v);
        }
        if (k == null) {
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.b1 == null) {
                            V v2 = this.e1;
                            this.e1 = v;
                            return v2;
                        }
                    }
                }
                if (this.a1 == null) {
                    V v3 = this.d1;
                    this.d1 = v;
                    return v3;
                }
            }
            if (this.Z0 == null) {
                V v4 = this.c1;
                this.c1 = v;
                return v4;
            }
        } else if (this.X > 0) {
            int hashCode = k.hashCode();
            int i3 = this.X;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (this.Y0 == hashCode && k.equals(this.b1)) {
                            V v5 = this.e1;
                            this.e1 = v;
                            return v5;
                        }
                    }
                }
                if (this.Z == hashCode && k.equals(this.a1)) {
                    V v6 = this.d1;
                    this.d1 = v;
                    return v6;
                }
            }
            if (this.Y == hashCode && k.equals(this.Z0)) {
                V v7 = this.c1;
                this.c1 = v;
                return v7;
            }
        }
        int i4 = this.X;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    o();
                    this.f1.put(k, v);
                    return null;
                }
                if (k != null) {
                    i5 = k.hashCode();
                }
                this.Y0 = i5;
                this.b1 = k;
                this.e1 = v;
            } else {
                if (k != null) {
                    i5 = k.hashCode();
                }
                this.Z = i5;
                this.a1 = k;
                this.d1 = v;
            }
        } else {
            if (k != null) {
                i5 = k.hashCode();
            }
            this.Y = i5;
            this.Z0 = k;
            this.c1 = v;
        }
        this.X++;
        return null;
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            V0<K, V> v0 = this.f1;
            if (v0 != null) {
                v0.putAll(map);
            } else if (size < 4) {
                for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                    put(entry.getKey(), entry.getValue());
                }
            } else {
                o();
                this.f1.putAll(map);
            }
        }
    }

    public V0<K, V> r() {
        return new C11153zG0();
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.remove(obj);
        }
        int i2 = this.X;
        if (i2 == 0) {
            return null;
        }
        if (obj == null) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        K k = this.b1;
                        if (k == null) {
                            V v = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v;
                        } else if (this.a1 == null) {
                            V v2 = this.d1;
                            this.Z = this.Y0;
                            this.a1 = k;
                            this.d1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v2;
                        } else if (this.Z0 != null) {
                            return null;
                        } else {
                            V v3 = this.c1;
                            this.Y = this.Y0;
                            this.Z0 = k;
                            this.c1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v3;
                        }
                    }
                } else {
                    K k2 = this.a1;
                    if (k2 == null) {
                        V v4 = this.d1;
                        this.Z = 0;
                        this.a1 = null;
                        this.d1 = null;
                        this.X = 1;
                        return v4;
                    } else if (this.Z0 != null) {
                        return null;
                    } else {
                        V v5 = this.c1;
                        this.Y = this.Z;
                        this.Z0 = k2;
                        this.c1 = this.d1;
                        this.Z = 0;
                        this.a1 = null;
                        this.d1 = null;
                        this.X = 1;
                        return v5;
                    }
                }
            } else if (this.Z0 == null) {
                V v6 = this.c1;
                this.Y = 0;
                this.Z0 = null;
                this.c1 = null;
                this.X = 0;
                return v6;
            }
        } else if (i2 > 0) {
            int hashCode = obj.hashCode();
            int i3 = this.X;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            V v7 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v7;
                        } else if (this.Z == hashCode && obj.equals(this.a1)) {
                            V v8 = this.d1;
                            this.Z = this.Y0;
                            this.a1 = this.b1;
                            this.d1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v8;
                        } else if (this.Y != hashCode || !obj.equals(this.Z0)) {
                            return null;
                        } else {
                            V v9 = this.c1;
                            this.Y = this.Y0;
                            this.Z0 = this.b1;
                            this.c1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return v9;
                        }
                    }
                } else if (this.Z == hashCode && obj.equals(this.a1)) {
                    V v10 = this.d1;
                    this.Z = 0;
                    this.a1 = null;
                    this.d1 = null;
                    this.X = 1;
                    return v10;
                } else if (this.Y != hashCode || !obj.equals(this.Z0)) {
                    return null;
                } else {
                    V v11 = this.c1;
                    this.Y = this.Z;
                    this.Z0 = this.a1;
                    this.c1 = this.d1;
                    this.Z = 0;
                    this.a1 = null;
                    this.d1 = null;
                    this.X = 1;
                    return v11;
                }
            } else if (this.Y == hashCode && obj.equals(this.Z0)) {
                V v12 = this.c1;
                this.Y = 0;
                this.Z0 = null;
                this.c1 = null;
                this.X = 0;
                return v12;
            }
        }
        return null;
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.size();
        }
        return this.X;
    }

    public String toString() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.toString();
        }
        if (this.X == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append('{');
        int i2 = this.X;
        Object obj = "(this Map)";
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    K k = this.b1;
                    if (k == this) {
                        k = "(this Map)";
                    }
                    sb.append(k);
                    sb.append('=');
                    V v = this.e1;
                    if (v == this) {
                        v = "(this Map)";
                    }
                    sb.append(v);
                    sb.append(',');
                } else {
                    throw new IllegalStateException("Invalid map index: " + this.X);
                }
            }
            K k2 = this.a1;
            if (k2 == this) {
                k2 = "(this Map)";
            }
            sb.append(k2);
            sb.append('=');
            V v2 = this.d1;
            if (v2 == this) {
                v2 = "(this Map)";
            }
            sb.append(v2);
            sb.append(',');
        }
        K k3 = this.Z0;
        if (k3 == this) {
            k3 = "(this Map)";
        }
        sb.append(k3);
        sb.append('=');
        V v3 = this.c1;
        if (v3 != this) {
            obj = v3;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map, o.UC0
    public Collection<V> values() {
        V0<K, V> v0 = this.f1;
        if (v0 != null) {
            return v0.values();
        }
        return new h(this);
    }

    public C4755Xu0(Map<? extends K, ? extends V> map) {
        putAll(map);
    }
}
